package com.vcs.toptags.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CheckTime {

    public String getTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

       return sdf.format(new Date());
    }
}


