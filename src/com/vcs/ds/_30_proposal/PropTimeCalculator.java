package com.vcs.ds._30_proposal;

import com.vcs.ds.Main;
import com.vcs.ds._10_model.database.ProducersDatabase;
import com.vcs.ds._40_producer.Producer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class PropTimeCalculator {

    //id
    private String requestId;
    private String producerName;

    //time
    private boolean ProducerAvailable;

    private LocalDateTime availableStart; // TODO: Stage1.1 - to list of dates availableTime;
    private LocalDateTime availableFinish;
    private Duration productionDuration;

    private LocalDateTime earlyFinish;


    public PropTimeCalculator(String requestId, String producerName) {
        this.requestId = requestId;
        this.producerName = producerName;
        this.ProducerAvailable = checkAvailability();
//        if (this.ProducerAvailable) {
//            this.earlyFinish = calculateEarlyFinish(ProducersDatabase.ProducersList.get(0).getAvailableStart(), ProducersDatabase.getProducersList().get(0).getAvailableFinish(), productionDuration);// TODO: 18.8.19
//
//        } else {
//            return;
//        }

    }

    private boolean checkAvailability() {
        // TODO: 18.8.19 Stage1
        List<Producer> a;
        return true;
    }

    private LocalDateTime calculateEarlyFinish(LocalDateTime availableStart, LocalDateTime availableFinish, Duration productionDuration) {
        // TODO: 18.8.19 Stage1

        return null;
    }


//getset


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

    public boolean isProducerAvailable() {
        return ProducerAvailable;
    }

    public void setProducerAvailable(boolean producerAvailable) {
        ProducerAvailable = producerAvailable;
    }

    public LocalDateTime getEarlyFinish() {
        return earlyFinish;
    }

    public void setEarlyFinish(LocalDateTime earlyFinish) {
        this.earlyFinish = earlyFinish;
    }
}

