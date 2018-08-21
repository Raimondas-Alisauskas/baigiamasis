package com.vcs.bogdan.Beans;

import com.vcs.bogdan.Beans.Enums.CalcType;
import com.vcs.bogdan.Beans.Enums.EvenType;

public class Employee extends Person {

    private long date;
    private EvenType eventType;
    private CalcType calcType;
    private double dayHours;
    private double wage;
    private boolean isMain; // the main workplace
    private double socialInsurance;
    private double tax;
    private double pnpd;

    public Employee() {
    }

    public Employee(String id, long date, EvenType eventType, CalcType calcType, double dayHours, double wage, boolean isMain, double socialInsurance, double tax, double pnpd) {
        super(id);
        this.date = date;
        this.eventType = eventType;
        this.calcType = calcType;
        this.dayHours = dayHours;
        this.wage = wage;
        this.isMain = isMain;
        this.socialInsurance = socialInsurance;
        this.tax = tax;
        this.pnpd = pnpd;
    }

    public EvenType getEventType() {
        return eventType;
    }

    public void setEventType(EvenType jobEventType) {
        this.eventType = eventType;
    }

    public void setEventType(String str) {
        this.eventType = EvenType.valueOf(str);
    }

    public CalcType getCalcType() {
        return calcType;
    }

    public void setCalcType(CalcType salaryCalcType) {
        this.calcType = calcType;
    }

    public void setCalcType(String str) {
        this.calcType = CalcType.valueOf(str);
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

    public boolean isMain() {
        return isMain;
    }

    public void setMain(boolean isMain) {
        isMain = isMain;
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
