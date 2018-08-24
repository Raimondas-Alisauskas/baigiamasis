package com.vcs.bogdan.Service;

import com.vcs.bogdan.Beans.*;

import java.util.ArrayList;
import java.util.List;

public class CalcService {

    public List<PayRoll> getAllPayRolls(String periodId) {

        List<PayRoll> result = new ArrayList<>();

        Period period = new PeriodService().get(periodId);

        TimeListService timeListService = new TimeListService();
        List<TimeList> timeLists = timeListService.getAll();

        ContractService contractService = new ContractService();
        for (Contract c : contractService.getAll()) {
            Contract contract = contractService.getContractWithEarlyValidDate(periodId, c.getPersonId());
            result.add(setPayRoll(period, contract, timeLists));
        }
        return result;
    }

    private PayRoll setPayRoll(Period period, Contract contract, List<TimeList> timeLists) {

        PayRoll result = new PayRoll();

        result.setPeriodId(period.getId());
        if (contract.getDate() != 0) {
            Person person = new PersonService().get(contract.getPersonId());
            result.setId("");
            result.setPeriodId(period.getId());
            result.setNameSurname(person.getName() + " " + person.getSurname());
            result.setIncome(getIncome(period, contract, timeLists));
            result.setTax(getIncomeTax(period, contract, result.getIncome()));
            double deductInsurance = getSocialInsuranceDeductionFromEmployee(period, contract, result.getIncome()) +
                    getHealthInsuranceDeductionFromEmployee(period.getHealthEmployee(), result.getIncome()) +
                    getGuaranteeFundDeductionSum(period.getGuaranteeFund(), result.getIncome());
            result.setInsurance(deductInsurance);
            result.setOut(result.getIncome() - result.getTax() - result.getInsurance());
            new PayRollService().add(result);
        }
        return result;
    }

    private double getIncome(Period period, Contract contract, List<TimeList> timeLists) {
        return Math.max(calcIncomeWage(period, contract, timeLists), period.getMin());
    }

    private double getIncomeTax(Period period, Contract contract, double incomeWage) {
        double taxFree = round(getCalcTaxFree(incomeWage, contract, period), 2);
        return round((incomeWage - taxFree) * period.getPercent() / 100, 2);
    }

    private double getSocialInsuranceDeductionFromEmployee(Period period, Contract contract, double incomeWage) {
        return getCalculatePercentageFromNumber(incomeWage, period.getSocialEmployee());
    }

    private double getHealthInsuranceDeductionFromEmployee(double healthEmploye, double incomeWage) {
        return getCalculatePercentageFromNumber(incomeWage, healthEmploye);
    }

    public double getGuaranteeFundDeductionSum(double guaranteeFund, double incomeWage) {
        return getCalculatePercentageFromNumber(incomeWage, guaranteeFund);
    }

    private double calcIncomeWage(Period period, Contract contract, List<TimeList> timeLists) {

        switch (contract.getType()) {
            case DAY:
                return getMultiply(new TimeListService().getHours(timeLists, contract.getPersonId(), period.getId()), contract.getWage());
            case HOUR:
                return getMultiply(new TimeListService().getDays(timeLists, contract.getPersonId(), period.getId()), contract.getWage());
            case MONTH:
                return getMultiply(1, contract.getWage());
            default:
                return 0;
        }
    }

    private double getCalculatePercentageFromNumber(double incomeWage, double percent) {
        return round(incomeWage * percent / 100, 2);
    }

    private double round(double number, int decPlace) {
        double dP = Math.pow(10, decPlace);
        return Math.floor(number * dP + 0.5) / dP;
    }

    private double getCalcTaxFree(double incomeWage, Contract contract, Period period) {
        double result = period.getTaxFree();
        if (contract.isMain()) {
            if (incomeWage >= period.getBase()) {
                result = result - (incomeWage - period.getBase()) * period.getCoefficient();
            }
        } else {
            result = 0;
        }
        return result;
    }

    private double getMultiply(double data, double wage) {
        return data * wage;
    }

}
