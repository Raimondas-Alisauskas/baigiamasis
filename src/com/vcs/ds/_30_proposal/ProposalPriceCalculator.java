package com.vcs.ds._30_proposal;


import com.vcs.ds._10_model.input.ProducerInput;

public class ProposalPriceCalculator {

    /*
     * public double material ; //  = materialCost (ProducerInput)* mass (MassCalculator)
     * <p>
     * public double programing; //= programingTime (AvailabilityCalculator)* programmingRate (ProducerInput)
     * <p>
     * public double production; //= processingTime (AvailabilityCalculator)* machineUsageRate (ProducerInput)
     * <p>
     * public double handling;// ProducerInput
     * <p>
     * public double delivering;// ProducerInput
     * <p>
     * public double price;  // = material + programming + production + handling + delivering
     */


    private double programingPrice; //todo? kaip aprasyti skaiciavimus?
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


 /* Todo?  Ar taip gerai?
    private double materialCost = new ProducerInput().getMaterialCost();
    private double mass = new ProductInput().getMass();
    private double materialPrice = materialCost * mass;

    private double programingTime = new AvailabilityCalculator().getProgramingTime();
    private double programmingRate = new ProducerInput().getProgrammingRate();
    private double programingPrice = programingTime * programmingRate;

    private double processingTime = new AvailabilityCalculator().getProcessingTime();
    private double machineUsageRate = new ProducerInput().getMachineUsageRate();
    private double productionPrice = processingTime * machineUsageRate;

    private double handlingCost = new ProducerInput().getHandlingCost();
    private double deliveringCost = new ProducerInput().getDeliveringCost();
    private double orderPrice = materialPrice + programingPrice + productionPrice + handlingCost + deliveringCost;
*/

}






