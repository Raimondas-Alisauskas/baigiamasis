package com.vcs.bogdan.Beans;

public class Insurance {

    private double healthFromEmployee;
    private double healthFromNewEmployee;
    private double healthFromEmployer;
    private double socialFromEmployee;
    private double socialFromEmployer;
    private double guaranteeFund;
    private int sickPayDay;
    private double sickPayCoefficient;

    public Insurance(double healthFromEmployee, double healthFromNewEmployee, double healthFromEmployer, double socialFromEmployee, double socialFromEmployer, double guaranteeFund, int sickPayDay, double sickPayCoefficient) {
        this.healthFromEmployee = healthFromEmployee;
        this.healthFromNewEmployee = healthFromNewEmployee;
        this.healthFromEmployer = healthFromEmployer;
        this.socialFromEmployee = socialFromEmployee;
        this.socialFromEmployer = socialFromEmployer;
        this.guaranteeFund = guaranteeFund;
        this.sickPayDay = sickPayDay;
        this.sickPayCoefficient = sickPayCoefficient;
    }

    public double getHealthFromEmployee() {
        return healthFromEmployee;
    }

    public void setHealthFromEmployee(double healthFromEmployee) {
        this.healthFromEmployee = healthFromEmployee;
    }

    public double getHealthFromNewEmployee() {
        return healthFromNewEmployee;
    }

    public void setHealthFromNewEmployee(double healthFromNewEmployee) {
        this.healthFromNewEmployee = healthFromNewEmployee;
    }

    public double getHealthFromEmployer() {
        return healthFromEmployer;
    }

    public void setHealthFromEmployer(double healthFromEmployer) {
        this.healthFromEmployer = healthFromEmployer;
    }

    public double getSocialFromEmployee() {
        return socialFromEmployee;
    }

    public void setSocialFromEmployee(double socialFromEmployee) {
        this.socialFromEmployee = socialFromEmployee;
    }

    public double getSocialFromEmployer() {
        return socialFromEmployer;
    }

    public void setSocialFromEmployer(double socialFromEmployer) {
        this.socialFromEmployer = socialFromEmployer;
    }

    public double getGuaranteeFund() {
        return guaranteeFund;
    }

    public void setGuaranteeFund(double guaranteeFund) {
        this.guaranteeFund = guaranteeFund;
    }

    public int getSickPayDay() {
        return sickPayDay;
    }

    public void setSickPayDay(int sickPayDay) {
        this.sickPayDay = sickPayDay;
    }

    public double getSickPayCoefficient() {
        return sickPayCoefficient;
    }

    public void setSickPayCoefficient(double sickPayCoefficient) {
        this.sickPayCoefficient = sickPayCoefficient;
    }
}
