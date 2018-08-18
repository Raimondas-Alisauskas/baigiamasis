package com.vcs.ds._40_producer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Producer {

    //id
    private String producerName;
     //time
    private double programingTime;
    private LocalDate availableStart; // TODO: 18.8.18 availability to Dates Stage1.1 - to list of dates
    private LocalDate availableFinish;
    private int processingSpeed;


    public Producer(String producerName, String programingTime, String availableStart, String availableFinish, String processingSpeed) {
        this.producerName = producerName;
        this.programingTime = Double.parseDouble(programingTime);
        this.availableStart = LocalDate.parse(availableStart, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.availableFinish = LocalDate.parse(availableFinish, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.processingSpeed = Integer.valueOf(processingSpeed);
    }


 //getset
    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getProgramingTime() {
        return programingTime;
    }

    public void setProgramingTime(double programingTime) {
        this.programingTime = programingTime;
    }

    public LocalDate getAvailableStart() {
        return availableStart;
    }

    public void setAvailableStart(LocalDate availableStart) {
        this.availableStart = availableStart;
    }

    public LocalDate getAvailableFinish() {
        return availableFinish;
    }

    public void setAvailableFinish(LocalDate availableFinish) {
        this.availableFinish = availableFinish;
    }

    public int getProcessingSpeed() {
        return processingSpeed;
    }

    public void setProcessingSpeed(int processingSpeed) {
        this.processingSpeed = processingSpeed;
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
