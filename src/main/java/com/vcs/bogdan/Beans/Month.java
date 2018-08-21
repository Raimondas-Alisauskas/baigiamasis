package com.vcs.bogdan.Beans;

public class Month extends Id {

    private int workDays;
    private int workHours;
    private double min;
    private double hourlyMin;
    private double moreTimeCoefficient;
    private double redDayCoefficient;

    public Month(){}

    public Month(int workDays, int workHours, double min, double hourlyMin, double moreTimeCoefficient, double redDayCoefficient) {
        this.workDays = workDays;
        this.workHours = workHours;
        this.min = min;
        this.hourlyMin = hourlyMin;
        this.moreTimeCoefficient = moreTimeCoefficient;
        this.redDayCoefficient = redDayCoefficient;
    }

    public Month(String id, int workDays, int workHours, double min, double HourlyMin, double moreTimeCoefficient, double redDayCoefficient) {
        super(id);
        this.workDays = workDays;
        this.workHours = workHours;
        this.min = min;
        this.hourlyMin = HourlyMin;
        this.moreTimeCoefficient = moreTimeCoefficient;
        this.redDayCoefficient = redDayCoefficient;
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
}
