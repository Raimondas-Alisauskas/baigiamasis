package com.vcs.ds.Stage2.toDevelop;


public class ProposalPriceCalculator {

    /*
     * public double material ; //  = materialCost (ProducerInput)* mass (MassCalculator)
     * <p>
     * public double programing; //= programingTime (ProposalTimeCalculator)* programmingRate (ProducerInput)
     * <p>
     * public double production; //= processingTime (ProposalTimeCalculator)* machineUsageRate (ProducerInput)
     * <p>
     * public double handling;// ProducerInput
     * <p>
     * public double delivering;// ProducerInput
     * <p>
     * public double price;  // = material + programming + production + handling + delivering
     */


    private double programingPrice;
    private double productionPrice;
    private double orderPrice;


    private void materialPrice(double materialCost, double mass) {

        double materialPrice = materialCost * mass;
    }

    private double programingPrice(double programingTime, double programmingRate) {

        return programingPrice = programingTime * programmingRate;
    }

    private double productionPrice(double processingTime, double machineUsageRate) {

        return processingTime * machineUsageRate;
    }

    private double orderPrice(double material, double programming, double production, double handling, double delivering) {

        return material + programming + production + handling + delivering;
    }

}








