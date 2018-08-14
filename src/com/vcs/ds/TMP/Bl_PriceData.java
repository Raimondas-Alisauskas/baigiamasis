package com.vcs.ds.TMP;

public class Bl_PriceData {
    private double material ; // TODO = materialCost (ProducerInput)* mass (Productn)

    private double programing; //TODO= programingTime (ProducerInput)* programmingRate (ProducerInput)

    private double production; //TODO= productionTime (AvailabilityCalculator)* usageRate (ProducerInput)

    private double handling;// TODO handlingCost Producer Input?

    private double delivering;// TODO dieliveringCost?











    public double getMaterial() {
        return material;
    }

    public void setMaterial(double material) {
        this.material = material;
    }

    public double getPrograming() {
        return programing;
    }

    public void setPrograming(double programing) {
        this.programing = programing;
    }

    public double getProduction() {
        return production;
    }

    public void setProduction(double production) {
        this.production = production;
    }

    public double getHandling() {
        return handling;
    }

    public void setHandling(double handling) {
        this.handling = handling;
    }

    public double getDelivering() {
        return delivering;
    }

    public void setDelivering(double delivering) {
        this.delivering = delivering;
    }


}
