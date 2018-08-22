package com.vcs.ds.TMP.toDelete;

public class DateToInteger {
    String month;
    String day;

    public DateToInteger() {
        this.month = month;
        this.day = day;
    }

    public int stringToIntegerCalc (String month, String day){
        return (Integer.valueOf(month)-1) * 30 + Integer.valueOf(day);
    }


}
