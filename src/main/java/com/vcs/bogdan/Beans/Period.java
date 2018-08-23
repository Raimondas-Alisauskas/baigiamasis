package com.vcs.bogdan.Beans;

public class Period {

    private String id;
    private int workDays;
    private int workHours;
    private double min;
    private double hourlyMin;
    private double moreTimeCoefficient;
    private double redDayCoefficient;
    private double taxFree;
    private double coefficient;
    private double base;
    private double percent;
    private double pnpd;
    private double healthEmployee;
    private double healthNewEmployee;
    private double healthEmployer;
    private double socialEmployee;
    private double socialEmployer;
    private double guaranteeFund;
    private int sickPayDay;
    private double sickPayCoefficient;

    public Period() {
    }

    public Period(String id, int workDays, int workHours, double min, double hourlyMin, double moreTimeCoefficient, double redDayCoefficient, double taxFree, double coefficient, double base, double percent, double pnpd, double healthEmployee, double healthNewEmployee, double healthEmployer, double socialEmployee, double socialEmployer, double guaranteeFund, int sickPayDay, double sickPayCoefficient) {
        this.id = id;
        this.workDays = workDays;
        this.workHours = workHours;
        this.min = min;
        this.hourlyMin = hourlyMin;
        this.moreTimeCoefficient = moreTimeCoefficient;
        this.redDayCoefficient = redDayCoefficient;
        this.taxFree = taxFree;
        this.coefficient = coefficient;
        this.base = base;
        this.percent = percent;
        this.pnpd = pnpd;
        this.healthEmployee = healthEmployee;
        this.healthNewEmployee = healthNewEmployee;
        this.healthEmployer = healthEmployer;
        this.socialEmployee = socialEmployee;
        this.socialEmployer = socialEmployer;
        this.guaranteeFund = guaranteeFund;
        this.sickPayDay = sickPayDay;
        this.sickPayCoefficient = sickPayCoefficient;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getHourlyMin() {
        return hourlyMin;
    }

    public void setHourlyMin(double hourlyMin) {
        this.hourlyMin = hourlyMin;
    }

    public double getMoreTimeCoefficient() {
        return moreTimeCoefficient;
    }

    public void setMoreTimeCoefficient(double moreTimeCoefficient) {
        this.moreTimeCoefficient = moreTimeCoefficient;
    }

    public double getRedDayCoefficient() {
        return redDayCoefficient;
    }

    public void setRedDayCoefficient(double redDayCoefficient) {
        this.redDayCoefficient = redDayCoefficient;
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
