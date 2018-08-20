package com.vcs.ds._10_model.input;

public class ProducerInput {

    //id
    private String producerName;

    //time
    private String programingTimeH;
    private String availableStart;
    private String availableFinish;
    private String processingSpeedCM3pH;
    private String handlingTimeH;
    private String deliveringTimeH;

    public ProducerInput() {
        producerName = "P2";
        programingTimeH = "2";
        availableStart = "2018-09-15";
        availableFinish = "2018-09-21";
        processingSpeedCM3pH = "1";
         deliveringTimeH = "24";
    }
}
// TODO: 18.8.18 Stage2
//    //scope
//    private String maxDimensionsMM;
// //   private String maxPrecision;

//    //price
//    private String materialCost;
//    private String programmingRate;
//    private String machineUsageRate;
//    private String handlingCost;
//    private String deliveringCost;
//    //time
//      handlingTimeH = "1";