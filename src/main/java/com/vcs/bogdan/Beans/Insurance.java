package com.vcs.bogdan.Beans;

public class Insurance extends Id {

    private double healthEmployee;
    private double healthNewEmployee;
    private double healthEmployer;
    private double socialEmployee;
    private double socialEmployer;
    private double guaranteeFund;
    private int sickPayDay;
    private double sickPayCoefficient;

    public Insurance() {
    }

    public Insurance(double healthEmployee, double healthNewEmployee, double healthEmployer, double socialEmployee, double socialEmployer, double guaranteeFund, int sickPayDay, double sickPayCoefficient) {
        this.healthEmployee = healthEmployee;
        this.healthNewEmployee = healthNewEmployee;
        this.healthEmployer = healthEmployer;
        this.socialEmployee = socialEmployee;
        this.socialEmployer = socialEmployer;
        this.guaranteeFund = guaranteeFund;
        this.sickPayDay = sickPayDay;
        this.sickPayCoefficient = sickPayCoefficient;
    }

    public Insurance(String id, Insurance insurance) {
        super(id);
        new Insurance(healthEmployee,healthNewEmployee,healthEmployer,socialEmployee,socialEmployer,guaranteeFund,sickPayDay, sickPayCoefficient);
    }

    public double getHealthEmployee() {
        return healthEmployee;
    }

    public void setHealthEmployee(double healthEmployee) {
        this.healthEmployee = healthEmployee;
    }

    public double getHealthNewEmployee() {
        return healthNewEmployee;
    }

    public void setHealthNewEmployee(double healthNewEmployee) {
        this.healthNewEmployee = healthNewEmployee;
    }

    public double getHealthEmployer() {
        return healthEmployer;
    }

    public void setHealthEmployer(double healthEmployer) {
        this.healthEmployer = healthEmployer;
    }

    public double getSocialEmployee() {
        return socialEmployee;
    }

    public void setSocialEmployee(double socialEmployee) {
        this.socialEmployee = socialEmployee;
    }

    public double getSocialEmployer() {
        return socialEmployer;
    }

    public void setSocialEmployer(double socialEmployer) {
        this.socialEmployer = socialEmployer;
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
