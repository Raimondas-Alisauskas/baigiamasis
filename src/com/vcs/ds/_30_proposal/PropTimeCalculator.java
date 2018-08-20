package com.vcs.ds._30_proposal;

import java.time.Duration;
import java.time.LocalDateTime;

public class PropTimeCalculator {

    //id
    private String requestId;
    private String producerName;

    //time
    private LocalDateTime availableStart; // TODO: Stage1.1 - to list of dates availableTime;
    private LocalDateTime availableFinish;
    private Duration productionDuration;
    private LocalDateTime earlyFinish;


//    public PropTimeCalculator(String requestId, String producerName) {
//        this.requestId = requestId;
//        this.producerName = producerName;
//
//    }

    public Duration calculateProductionDuration(Duration programingTime, long processingSpeedUnitpH, long volumeUnit) {

        long processingTimeH =  volumeUnit/processingSpeedUnitpH;

        return productionDuration = programingTime.plus(Duration.ofHours(processingTimeH));
    }


    public boolean checkAvailability(LocalDateTime availableStart, LocalDateTime availableFinish, Duration productionDuration) {

        return availableStart.plus(productionDuration).isBefore(availableFinish);
    }


    public LocalDateTime calculateEarlyFinish(LocalDateTime availableStart, Duration productionDuration, Duration deliveringTime) {

        return earlyFinish = availableStart.plus(productionDuration).plus(deliveringTime);
    }


//getset



}

