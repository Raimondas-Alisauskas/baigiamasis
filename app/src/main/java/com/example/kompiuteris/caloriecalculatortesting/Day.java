package com.example.kompiuteris.caloriecalculatortesting;

import java.sql.Date;

public class Day {

    private int mDayId;
    private Date mDate;

    public Day(int dayId, Date date) {
        mDayId = dayId;
        mDate = date;
    }

    public int getDayId() {
        return mDayId;
    }

    public void setDayId(int mDayId) {
        this.mDayId = mDayId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }
}
