package com.vcs.ds.TMP;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class BandTime {

    public static void main(String[] args) {



     //   PropTimeCalculator kint = new PropTimeCalculator();

     //   System.out.println( kint.productionTime(0, 5));

        Long a1=Long.parseLong("1");
        Long a2= Long.valueOf("1");


        Duration programingTimeH = Duration.ofHours(Long.parseLong("1"));
 //       Duration programingTimeH2 = Duration.ofHours(Long.getLong("10"));
        Long maxDimensionsMM = Long.valueOf("1");

                LocalDateTime deadline = LocalDateTime.of(LocalDate.parse("2018-09-18"), LocalTime.MIDNIGHT);

        LocalDateTime aa = LocalDateTime.of(2018, Month.APRIL, 13, 12, 0);
        LocalDateTime bb = LocalDateTime.of(2018, Month.APRIL, 26, 17, 0);

        Duration dur = Duration.between(aa, bb);

        Duration dd = Duration.ofHours(345);

        System.out.println("+ " + dur.toHours());
        System.out.println("+ " + dd.toHours());

        DayOfWeek ee = DayOfWeek.of(2);
        System.out.println("+ " + ee);

        String availableFinish = "2008-01-02";


       LocalDate c2 = LocalDate.parse(availableFinish, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        LocalDateTime c3 = LocalDateTime.of(LocalDate.parse(availableFinish), LocalTime.of(00,00));

        String str1 = "1986-04-08 12:30";
        String str2 = "1986-04-09";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDateTime.parse(str1, formatter);
        System.out.println(dateTime);


        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateTime2 = LocalDate.parse(str2, formatter2);
        System.out.println(dateTime2);



        LocalDateTime date = dateTime2.atStartOfDay();



        //   long processingTime;
        long productionTime;

        //   long processingTime = new PropTimeCalculator().processingTime(ProducerInput)

        ///  Duration productionDuration = Duration.ofHours(productionDuration(processingTime, productionTime));

        //private Duration productionDuration2 = new Duration( ).toHours()
    }

    private BandTime () {

    }
}
