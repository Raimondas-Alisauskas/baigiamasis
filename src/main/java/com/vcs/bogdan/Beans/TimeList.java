package com.vcs.bogdan.Beans;

public class TimeList {

    private String id;
    private long date;
    private String personId;
    private String name;
    private double value;

    public TimeList() {
    }

    public TimeList(long date, String personId, String eventName, double value) {
        this.date = date;
        this.personId = personId;
        this.name = eventName;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String eventName) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
