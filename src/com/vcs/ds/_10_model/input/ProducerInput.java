package com.vcs.ds._10_model.input;

public class ProducerInput {

    //id
    private String producerName;
    //scope
    private String maxDimensionsMM;
 //   private String maxPrecision;
    //time
    private String programingTime;
    private String availableStart;
    private String availableFinish;
    private String processingSpeedCM3pHour;
    //price
    private String materialCost;
    private String programmingRate;
    private String machineUsageRate;
    private String handlingCost;
    private String deliveringCost;

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getMaxDimensionsMM() {
        return maxDimensionsMM;
    }

    public void setMaxDimensionsMM(String maxDimensionsMM) {
        this.maxDimensionsMM = maxDimensionsMM;
    }

    public String getProgramingTime() {
        return programingTime;
    }

    public void setProgramingTime(String programingTime) {
        this.programingTime = programingTime;
    }

    public String getAvailableStart() {
        return availableStart;
    }

    public void setAvailableStart(String availableStart) {
        this.availableStart = availableStart;
    }

    public String getAvailableFinish() {
        return availableFinish;
    }

    public void setAvailableFinish(String availableFinish) {
        this.availableFinish = availableFinish;
    }

    public String getProcessingSpeedCM3pHour() {
        return processingSpeedCM3pHour;
    }

    public void setProcessingSpeedCM3pHour(String processingSpeedCM3pHour) {
        this.processingSpeedCM3pHour = processingSpeedCM3pHour;
    }

    public String getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(String materialCost) {
        this.materialCost = materialCost;
    }

    public String getProgrammingRate() {
        return programmingRate;
    }

    public void setProgrammingRate(String programmingRate) {
        this.programmingRate = programmingRate;
    }

    public String getMachineUsageRate() {
        return machineUsageRate;
    }

    public void setMachineUsageRate(String machineUsageRate) {
        this.machineUsageRate = machineUsageRate;
    }

    public String getHandlingCost() {
        return handlingCost;
    }

    public void setHandlingCost(String handlingCost) {
        this.handlingCost = handlingCost;
    }

    public String getDeliveringCost() {
        return deliveringCost;
    }

    public void setDeliveringCost(String deliveringCost) {
        this.deliveringCost = deliveringCost;
    }
}
