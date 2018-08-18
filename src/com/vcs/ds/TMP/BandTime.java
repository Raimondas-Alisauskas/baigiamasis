package com.vcs.ds.TMP;

import com.vcs.ds._30_proposal.AvailabilityCalculator;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class BandTime {

    public static void main(String[] args) {



        AvailabilityCalculator kint = new AvailabilityCalculator();

        System.out.println( kint.productionTime(0, 5));

        LocalDateTime aa = LocalDateTime.of(2018, Month.APRIL, 13, 12, 0);
        LocalDateTime bb = LocalDateTime.of(2018, Month.APRIL, 26, 17, 0);

        Duration dur = Duration.between(aa, bb);

        Duration dd = Duration.ofHours(345);

        System.out.println("+ " + dur.toHours());
        System.out.println("+ " + dd.toHours());

        DayOfWeek ee = DayOfWeek.of(2);
        System.out.println("+ " + ee);


        //   long processingTime;
        long productionTime;

        //   long processingTime = new AvailabilityCalculator().processingTime(ProducerInput)

        ///  Duration productionDuration = Duration.ofHours(productionDuration(processingTime, productionTime));

        //private Duration productionDuration2 = new Duration( ).toHours()
    }

    private BandTime () {

    }
}
