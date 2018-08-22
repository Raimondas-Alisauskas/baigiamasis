package com.vcs.ds._30_proposal;

import java.time.LocalDateTime;

public class Proposal {

    //id
    private String proposalId;
    private String requestId;
    private String producerName;

    //time
    private LocalDateTime availableStart; // TODO: Stage1.1 - to list of dates availableTime;
    private LocalDateTime availableFinish;
    private LocalDateTime earlyFinish;


    public Proposal(String proposalId, String requestId, String producerName, LocalDateTime availableStart, LocalDateTime availableFinish, LocalDateTime earlyFinish) {
        this.proposalId = proposalId;
        this.requestId = requestId;
        this.producerName = producerName;
        this.availableStart = availableStart;
        this.availableFinish = availableFinish;
        this.earlyFinish = earlyFinish;
    }

}
// TODO: 18.8.18 Stage2
////price
//private double proposalPrice;
//
//    //score
//    private int score;