package com.vcs.ds._30_proposal;

import com.vcs.ds._50_General.IdGenerator;

import java.time.LocalDateTime;

public class Proposal {

    //id
    private String proposalId;
    private String requestId;
    private String producerName;

    //time
    private boolean producerIsAvailable;
    private LocalDateTime availableStart; // TODO: Stage1.1 - to list of dates availableTime;
    private LocalDateTime availableFinish;
    private LocalDateTime earlyFinish;


    public Proposal(String requestId, String producerName) {
        proposalId = new IdGenerator().generateIdKey("Pr ");
        this.requestId = requestId;
        this.producerName = producerName;

        PropTimeCalculator propTimeCalculator = new PropTimeCalculator(requestId, producerName);
        this.producerIsAvailable = propTimeCalculator.isProducerAvailable();
        if (producerIsAvailable) {

            availableStart = propTimeCalculator.getAvailableStart();
            availableFinish = propTimeCalculator.getAvailableFinish();

        } else {

            System.out.println(producerIsAvailable);
        }
    }


    //getset


}

// TODO: 18.8.18 Stage2
//    //scope todo trinti?
//    private double productVolume;
////price
//private double proposalPrice;
//
//    //score
//    private int score;

