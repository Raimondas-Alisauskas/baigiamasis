package com.vcs.bogdan.Service;

import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Beans.Enums.DeductionType;
import com.vcs.bogdan.Beans.ListData.TimeList;

public class CalcSalary {

    public double getIncomeWage(Employee employee, TimeList timeList, Period period) {
        return Math.max(calcIncomeWage(employee, timeList, period), period.getMinMonthlyWage());
    }

    public double getIncomeTax(double incomeWage, Employee employee, Tax tax) {
        double taxFree = roundTo00(getTaxFree(incomeWage, employee, tax));
        return roundTo00((incomeWage - taxFree) * tax.getPercent() / 100);
    }

    public double getSocialInsuranceDeductionFromEmployee(double incomeWage, Employee employee, Period period) {
        return getCalculatePercentageFromNumber(incomeWage, getActualPercentValue(employee, period, DeductionType.SIFEE));
    }

    public double getHealthInsuranceDeductionFromEmployee(double incomeWage, Insurance insurance) {
        return getCalculatePercentageFromNumber(incomeWage, insurance.getHealthFromEmployee());
    }

    public double getGuaranteeFundDeductionSum(double incomeWage, Insurance insurance) {
        return getCalculatePercentageFromNumber(incomeWage, insurance.getGuaranteeFund());
    }

    private double getActualPercentValue(Employee employee, Period period, DeductionType type) {
        switch (type) {
            case TAX:
                return 0;
            case SIFEE:
                return Math.max(period.getInsurance().getSocialFromEmployee(), employee.getSocialInsurance());
            case SIFNEE:
                return 0;
            case SIFER:
                return 0;
            case HIFEE:
                return 0;
            case HIFER:
                return 0;
            case GFI:
                return 0;
            default:
                return 0;
        }
    }

    private double calcIncomeWage(Employee employee, TimeList timeList, Period period) {
        switch (employee.getSalaryCalcType().getIndex()) {
            case 0:
                return getMultiply(timeList.getHoursAmount(employee.getId(), period.getId()), employee.getWage());
            case 1:
                return getMultiply(timeList.getDaysAmount(employee.getId(), period.getId()), employee.getWage());
            case 2:
                return getMultiply(1, employee.getWage());
            default:
                return 0;
        }
    }

    private double getCalculatePercentageFromNumber(double incomeWage, double percent) {
        return roundTo00(incomeWage * percent / 100);
    }

    private double roundTo00(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    private double getTaxFree(double incomeWage, Employee employee, Tax tax) {
        double result = tax.getTaxFree() + employee.getPnpd();
        if (employee.isMainWorkPlace()) {
            if (incomeWage >= tax.getBase()) {
                result = result - (incomeWage - tax.getBase()) * tax.getCoefficient();
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
