package com.vcs.bogdan.Beans;

public class Period extends Month {

    private Tax tax;
    private Insurance insurance;

    public Period(long id, int workDays, int workHours, double minMonthlyWage, double minHourlyWage, double moreTimeCoefficient, double redDayCoefficient, Tax tax, Insurance insurance) {
        super(id, workDays, workHours, minMonthlyWage, minHourlyWage, moreTimeCoefficient, redDayCoefficient);
        this.tax = tax;
        this.insurance = insurance;
    }

    public Period(Month month, Tax tax, Insurance insurance) {
        super(month);
        this.tax = tax;
        this.insurance = insurance;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }
}
