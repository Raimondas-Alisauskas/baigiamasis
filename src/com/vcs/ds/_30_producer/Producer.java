package com.vcs.ds._30_producer;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Producer {

    //id
    private String producerName;
    //time
    private Duration programingTimeH;
    private LocalDateTime availableStart; // TODO: 18.8.18 Stage1.1 availability to list of dates
    private LocalDateTime availableFinish;
    private int processingSpeedCM3pH;
  private Duration deliveringTimeH;


    public Producer(String producerName, String programingTimeH, String availableStart, String availableFinish, String processingSpeedCM3pH, String deliveringTimeH) {
        this.producerName = producerName;
        this.programingTimeH = Duration.ofHours(Long.parseLong(programingTimeH));
        this.availableStart = LocalDateTime.of(LocalDate.parse(availableStart), LocalTime.MIDNIGHT);
        this.availableFinish = LocalDateTime.of(LocalDate.parse(availableFinish), LocalTime.MIDNIGHT);
        this.processingSpeedCM3pH = Integer.valueOf(processingSpeedCM3pH);
        this.deliveringTimeH = Duration.ofHours(Long.parseLong(deliveringTimeH));
    }


    //getset

    public String getProducerName() {
        return producerName;
    }

    public Duration getProgramingTimeH() {
        return programingTimeH;
    }

    public LocalDateTime getAvailableStart() {
        return availableStart;
    }

    public LocalDateTime getAvailableFinish() {
        return availableFinish;
    }

    public int getProcessingSpeedCM3pH() {
        return processingSpeedCM3pH;
    }

    public Duration getDeliveringTimeH() {
        return deliveringTimeH;
    }
}

// TODO: 18.8.18 Stage2
//    // id
//    private static int producerId; ??

//    //scope
//    private String maxDimensionsMM;

//    //price
//    private double materialCost; //
//    private double programmingRate; //
//    private double machineUsageRate; //
//    private double handlingCost; //
//    private double deliveringCost;  //
