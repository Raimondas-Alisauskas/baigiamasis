package com.vcs.bogdan.Beans;

import com.vcs.bogdan.Beans.Enums.JobEvenType;
import com.vcs.bogdan.Beans.Enums.SalaryCalcType;

public class Employee extends Person {

    private JobEvenType jobEventType;
    private SalaryCalcType salaryCalcType;
    private long date;
    private double dayHours;
    private double wage;
    private boolean isMainWorkPlace; // the main workplace
    private double socialInsurance;
    private double tax;
    private double pnpd;

    public Employee() {
    }

    public Employee(String id, String name, String surname,
                    JobEvenType jobEventType, SalaryCalcType salaryCalcType, long date, double dayHours, double wage, boolean isMainWorkPlace, double socialInsurance, double tax, double pnpd) {
        super(id, name, surname);
        this.jobEventType = jobEventType;
        this.salaryCalcType = salaryCalcType;
        this.date = date;
        this.dayHours = dayHours;
        this.wage = wage;
        this.isMainWorkPlace = isMainWorkPlace;
        this.socialInsurance = socialInsurance;
        this.tax = tax;
        this.pnpd = pnpd;
    }

    public JobEvenType getJobEventType() {
        return jobEventType;
    }

    public void setJobEventType(JobEvenType jobEventType) {
        this.jobEventType = jobEventType;
    }

    public SalaryCalcType getSalaryCalcType() {
        return salaryCalcType;
    }

    public void setSalaryCalcType(SalaryCalcType salaryCalcType) {
        this.salaryCalcType = salaryCalcType;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public double getDayHours() {
        return dayHours;
    }

    public void setDayHours(double dayHours) {
        this.dayHours = dayHours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public boolean isMainWorkPlace() {
        return isMainWorkPlace;
    }

    public void setMainWorkPlace(boolean mainWorkPlace) {
        isMainWorkPlace = mainWorkPlace;
    }

    public double getSocialInsurance() {
        return socialInsurance;
    }

    public void setSocialInsurance(double socialInsurance) {
        this.socialInsurance = socialInsurance;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPnpd() {
        return pnpd;
    }

    public void setPnpd(double pnpd) {
        this.pnpd = pnpd;
    }
}
