package com.vcs.ds._40_producer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Producer {

    //id
    private String producerName;
    //time
    private double programingTimeH;
    private LocalDateTime availableStart; // TODO: 18.8.18 availability to Dates Stage1.1 - to list of dates
    private LocalDateTime availableFinish;
    private int processingSpeedCM3pH;
//    private LocalDateTime handlingTimeH;// TODO: 18.8.19 add at Stage 1.1
//    private LocalDateTime deliveringTimeH; // TODO: 18.8.19 add at Stage 1.1


    public Producer(String producerName, String programingTimeH, String availableStart, String availableFinish, String processingSpeedCM3pH) {
        this.producerName = producerName;
        this.programingTimeH = Double.parseDouble(programingTimeH);
        this.availableStart = LocalDateTime.of(LocalDate.parse(availableStart), LocalTime.MIDNIGHT);
        this.availableFinish = LocalDateTime.of(LocalDate.parse(availableFinish), LocalTime.MIDNIGHT);
        this.processingSpeedCM3pH = Integer.valueOf(processingSpeedCM3pH);
    }


    //getset
    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getProgramingTime() {
        return programingTimeH;
    }

    public void setProgramingTime(double programingTime) {
        this.programingTimeH = programingTime;
    }

    public LocalDateTime getAvailableStart() {
        return availableStart;
    }

    public void setAvailableStart(LocalDateTime availableStart) {
        this.availableStart = availableStart;
    }

    public LocalDateTime getAvailableFinish() {
        return availableFinish;
    }

    public void setAvailableFinish(LocalDateTime availableFinish) {
        this.availableFinish = availableFinish;
    }

    public int getProcessingSpeedCM3pH() {
        return processingSpeedCM3pH;
    }

    public void setProcessingSpeedCM3pH(int processingSpeedCM3pH) {
        this.processingSpeedCM3pH = processingSpeedCM3pH;
    }
}

// TODO: 18.8.18 Stage2
//    // id
//    private static int producerId; ??

//    //scope
//    private String maxDimensionsMM;

//    //price
//    private double materialCost; //
//
//    private double programmingRate; //
//
//    private double machineUsageRate; //
//
//    private double handlingCost; //
//
//    private double deliveringCost;  //
