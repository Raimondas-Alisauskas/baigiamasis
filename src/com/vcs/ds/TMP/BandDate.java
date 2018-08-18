package com.vcs.ds.TMP;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BandDate {
    public static void main(String[] args) {

//DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//   //     LocalDateTime availableStart = LocalDateTime.parse("2008-11-12", (DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//   //     LocalDateTime availableStart = LocalDateTime.parse("2008-12-13", (DateTimeFormatter.ISO_LOCAL_DATE));
//        LocalDateTime availableStart = LocalDateTime.parse("2008-12-13", a);
//
//       System.out.println(availableStart);
        String str1 = "1986-04-08 12:30";
        String str2 = "1986-04-09";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str1, formatter);
        System.out.println(dateTime);


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime2 = LocalDate.parse(str2, formatter2);
        System.out.println(dateTime2);

        LocalDateTime date = dateTime2.atStartOfDay();

    }
}
