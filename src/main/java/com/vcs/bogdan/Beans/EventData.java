package com.vcs.bogdan.Beans;

import java.util.ArrayList;
import java.util.List;

public class EventData {

    private long date;
    private String employeeId;
    private String name;
    private double value;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public EventData(long date, String employeeId, String name, double value) {
        this.date = date;
        this.employeeId = employeeId;
        this.name = name;
        this.value = value;
    }
}
