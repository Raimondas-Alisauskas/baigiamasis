package com.vcs.ds._10_model.input;

public class RequestInput {

    //id
    private String clientName;
    private String maxDimensionMM;
    private String volumeCM3;
    //time
    private String deadline;


    public RequestInput() {
        clientName = "ClName";
        maxDimensionMM = "100";
        volumeCM3 = "10";
        deadline = "2018-09-15";
    }

    //getset
    public String getClientName() {
        return clientName;
    }

    public String getMaxDimensionMM() {
        return maxDimensionMM;
    }

    public String getVolumeCM3() {
        return volumeCM3;
    }

    public String getDeadline() {
        return deadline;
    }

}

// TODO: 18.8.18 Stage 2
//    //price
//    private String maxPrice;
//
//    //priorities
//    private String timePriority;
//    private String pricePriority;

//        maxPrice = "200";
////        timePriority = "30";
////        pricePriority = "70";