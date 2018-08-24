package com.vcs.toptags.io;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {

    public String getTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        return sdf.format(new Date());
    }
}


