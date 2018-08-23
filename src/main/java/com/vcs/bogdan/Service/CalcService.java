package com.vcs.bogdan.Service;

import com.vcs.bogdan.Beans.*;

import java.util.ArrayList;
import java.util.List;


public class CalcService {


    public List<PayRoll> getPayRoll(Period period, List<Person> persons, List<TimeList> timeLists) {

        List<PayRoll> result = new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            PayRoll payRoll = new PayRoll();
            payRoll.setPeriodId(period.getId());
            payRoll.setNameSurname(persons.get(i).getName() + " " + persons.get(i).getSurname());
            ContractService contractService = new ContractService();
            Contract contract = contractService.getContractWithEarlyValidDate(period.getId(), persons.get(i).getId());
            payRoll.setIncome(getIncome(period, contract, timeLists));
            payRoll.setTax(getIncomeTax(period, contract, payRoll.getIncome()));
            double deductInsurance = getSocialInsuranceDeductionFromEmployee(period, contract, payRoll.getIncome()) +
                    getHealthInsuranceDeductionFromEmployee(period.getHealthEmployee(), payRoll.getIncome()) +
                    getGuaranteeFundDeductionSum(period.getGuaranteeFund(), payRoll.getIncome());
            payRoll.setInsurance(deductInsurance);
            payRoll.setOut(payRoll.getIncome() - payRoll.getTax() - payRoll.getInsurance());
            new PayRollService().add(payRoll);
            result.add(payRoll);
        }
        return result;
    }


    public double getIncome(Period period, Contract contract, List<TimeList> timeLists) {
        return Math.max(calcIncomeWage(period, contract, timeLists), period.getMin());
    }

    public double getIncomeTax(Period period, Contract contract, double incomeWage) {
        double taxFree = round(getCalcTaxFree(incomeWage, contract, period), 2);
        return round((incomeWage - taxFree) * period.getPercent() / 100, 2);
    }

    public double getSocialInsuranceDeductionFromEmployee(Period period, Contract contract, double incomeWage) {
        return getCalculatePercentageFromNumber(incomeWage, period.getSocialEmployee());
    }

    public double getHealthInsuranceDeductionFromEmployee(double healthEmploye, double incomeWage) {
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
