package com.vcs.bogdan.Beans;

public class Tax extends Id {

    private double taxFree;
    private double coefficient;
    private double base;
    private double percent;
    private double pnpd;

    public Tax() {
    }

    public Tax(double taxFree, double coefficient, double base, double percent, double pnpd) {
        this.taxFree = taxFree;
        this.coefficient = coefficient;
        this.base = base;
        this.percent = percent;
        this.pnpd = pnpd;
    }

    public Tax(String id, double taxFree, double coefficient, double base, double percent, double pnpd) {
        super(id);
        this.taxFree = taxFree;
        this.coefficient = coefficient;
        this.base = base;
        this.percent = percent;
        this.pnpd = pnpd;
    }

    public double getTaxFree() {
        return taxFree;
    }

    public void setTaxFree(double taxFree) {
        this.taxFree = taxFree;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getPnpd() {
        return pnpd;
    }

    public void setPnpd(double pnpd) {
        this.pnpd = pnpd;
    }


}
