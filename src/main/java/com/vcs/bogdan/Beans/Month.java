package com.vcs.bogdan.Beans;

import javax.naming.Name;

public class Month {

    private long id;
    private int workDays;
    private int workHours;
    private double minMonthlyWage;
    private double minHourlyWage;
    private double moreTimeCoefficient;
    private double redDayCoefficient;

    public Month(){}

    public Month(Month month){
        this.setId(month.getId());
        this.setWorkDays(month.getWorkDays());
        this.setWorkHours(month.getWorkHours());
        this.setMinMonthlyWage(month.getMinMonthlyWage());
        this.setMinHourlyWage(month.getMinHourlyWage());
        this.setMoreTimeCoefficient(month.getMoreTimeCoefficient());
        this.setRedDayCoefficient(month.getRedDayCoefficient());
    }

    public Month(long id, int workDays, int workHours, double minMonthlyWage, double minHourlyWage, double moreTimeCoefficient, double redDayCoefficient) {
        this.id = id;
        this.workDays = workDays;
        this.workHours = workHours;
        this.minMonthlyWage = minMonthlyWage;
        this.minHourlyWage = minHourlyWage;
        this.moreTimeCoefficient = moreTimeCoefficient;
        this.redDayCoefficient = redDayCoefficient;
    }

    public String toString(){
        return "month";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public double getMinMonthlyWage() {
        return minMonthlyWage;
    }

    public void setMinMonthlyWage(double minMonthlyWage) {
        this.minMonthlyWage = minMonthlyWage;
    }

    public double getMinHourlyWage() {
        return minHourlyWage;
    }

    public void setMinHourlyWage(double minHourlyWage) {
        this.minHourlyWage = minHourlyWage;
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


}
