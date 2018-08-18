package com.vcs.ds._30_proposal;

import com.vcs.ds._20_client.Client;
import com.vcs.ds._20_request.Request;
import com.vcs.ds._40_producer.Producer;
import com.vcs.ds._50_General.IdGenerator;

import java.time.Duration;
import java.time.LocalDate;

public class Proposal {
    //id
    private String proposalId;
    private String clientName;
    private String requestId;
    private String producerId;
    
//    //scope todo trinti?
//    private double productVolume;
    
    //time
    private Duration productionDuration;
    private LocalDate availableStart; // TODO: 18.8.17 V pateikti availability List 
    private LocalDate availableFinish;
    
    //price
    private double proposalPrice;
    
    //score
    private int score;
    
        
   //constructor
   public Proposal(String requestId, String producerId){
  //      proposalId = new IdGenerator().generateIdKey("Pr "); todo trinti?
         this.requestId = requestId;
        this.producerId = producerId;
        
    }
    
   
    //set get
    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProducerId() {
        return producerId;
    }

    public void setProducerId(String producerId) {
        this.producerId = producerId;
    }

//    public double getProductMass() { todo trinti?
//        return productVolume;
//    }
//
//    public void setProductMass(double productMass) {
//        this.productVolume = productMass;
//    }

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

    public double getProposalPrice() {
        return proposalPrice;
    }

    public void setProposalPrice(double proposalPrice) {
        this.proposalPrice = proposalPrice;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
