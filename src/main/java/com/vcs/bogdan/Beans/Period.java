package com.vcs.bogdan.Beans;

public class Period {

    private Month month;
    private Tax tax;
    private Insurance insurance;

    public Period(){}

    public Period(Month month, Tax tax, Insurance insurance) {
        this.month = month;
        this.tax = tax;
        this.insurance = insurance;
    }

    public String getId(){
        return this.getMonth().getId();
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
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
