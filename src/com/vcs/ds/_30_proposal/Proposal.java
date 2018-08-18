package com.vcs.ds._30_proposal;

import java.time.Duration;
import java.time.LocalDate;

public class Proposal {

    //id
    private String proposalId;
    private String clientName;
    private String requestId;
    private String producerName;
    
    //time
    private Duration productionDuration;
    private LocalDate availableStart; // TODO: 18.8.18 availability to Dates Stage1.1 - to list of dates
    private LocalDate availableFinish;

    public Proposal(String proposalId, String clientName, String requestId, String producerName, Duration productionDuration, LocalDate availableStart, LocalDate availableFinish) {
        this.proposalId = proposalId;
        this.clientName = clientName;
        this.requestId = requestId;
        this.producerName = producerName;
        this.productionDuration = productionDuration;
        this.availableStart = availableStart;
        this.availableFinish = availableFinish;
    }

   //getset


    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public Duration getProductionDuration() {
        return productionDuration;
    }

    public void setProductionDuration(Duration productionDuration) {
        this.productionDuration = productionDuration;
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
}
// TODO: 18.8.18 Stage2
//    //scope todo trinti?
//    private double productVolume;
////price
//private double proposalPrice;
//
//    //score
//    private int score;

