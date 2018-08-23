package com.vcs.bogdan.Beans;

import com.vcs.bogdan.Beans.Enums.CalcType;
import com.vcs.bogdan.Beans.Enums.WorkEvent;

public class Contract {

    private String id;
    private String personId;
    private long date;
    private WorkEvent event;
    private CalcType type;
    private double dayHours;
    private double wage;
    private boolean isMain;

    public Contract() {
    }

    public Contract(String personId, long date, WorkEvent event, CalcType type, double dayHours, double wage, boolean isMain) {
        this.personId = personId;
        this.date = date;
        this.event = event;
        this.type = type;
        this.dayHours = dayHours;
        this.wage = wage;
        this.isMain = isMain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public WorkEvent getEvent() {
        return event;
    }

    public void setEvent(WorkEvent event) {
        this.event = event;
    }

    public void setEvent(String str) {
        this.event =  WorkEvent.valueOf(str);
    }

    public CalcType getType() {
        return type;
    }

    public void setType(CalcType type) {
        this.type = type;
    }

    public void setType(String type) {
        this.type = CalcType.valueOf(type);
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

    public void setMain(boolean main) {
        isMain = main;
    }

}
