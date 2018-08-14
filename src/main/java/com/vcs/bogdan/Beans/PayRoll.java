package com.vcs.bogdan.Beans;

public class PayRoll {

    private long month;
    private String employeeName;
    private double income;
    private double deductTax;
    private double deductInsurance;
    private double out;

    public long getMonth() {
        return month;
    }

    public void setMonth(long month) {
        this.month = month;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getDeductTax() {
        return deductTax;
    }

    public void setDeductTax(double deductTax) {
        this.deductTax = deductTax;
    }

    public double getDeductInsurance() {
        return deductInsurance;
    }

    public void setDeductInsurance(double deductInsurance) {
        this.deductInsurance = deductInsurance;
    }

    public double getOut() {
        return out;
    }

    public void setOut(double out) {
        this.out = out;
    }
}
