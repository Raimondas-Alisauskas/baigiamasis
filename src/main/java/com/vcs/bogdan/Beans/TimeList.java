package com.vcs.bogdan.Beans;

public class TimeList {

    private long date;
    private String employeeId;
    private String eventName;
    private double value;

    public TimeList() {
    }

    public TimeList(long date) {
        this.date = date;
    }

    public TimeList(long date, String employeeId, String eventName, double value) {
        this.date = date;
        this.employeeId = employeeId;
        this.eventName = eventName;
        this.value = value;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
