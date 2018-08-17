package com.vcs.ds._20_request;

import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_General.IdGenerator;
import java.time.LocalDate;

public class Request {

    //id
    private String requestId;
    private String clientName; // TODO: V  Sukurti atpazinima ar tai senas ar naujas klientas. Priskirti nauja arba sena ID

    //scope
    private double maxDimensionsMM; // TODO: V Validumo Tikrinimas.
    private double volumeCM3; // TODO: V Validumo Tikrinimas.

    //time
    private int deadline;

    //price
    private double maxPrice; // TODO: V Validumo Tikrinimas.

    //priorities
    private double prioritiesTime; // TODO: V Validumo Tikrinimas.
    private double prioritiesPrice;  // TODO: V Validumo Tikrinimas.


    public Request( RequestInput requestInput) {

        requestId = new IdGenerator().generateIdKey("Rk ");

        clientName = requestInput.getClientName();

        maxDimensionsMM = Double.parseDouble( requestInput.getMaxDimensionMM());

        volumeCM3 = Double.parseDouble(requestInput.getVolumeCM3());

  //      deadline = LocalDate.parse(requestInput.getDeadline()); // TODO: 18.8.17  padaryti paketima i integer

        maxPrice = Double.parseDouble(requestInput.getMaxPrice());

        prioritiesTime = Double.parseDouble(requestInput.getTimePriority());

        prioritiesPrice = Double.parseDouble(requestInput.getPricePriority());
 }



    //get-set

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

    public double getMaxDimensionsMM() {
        return maxDimensionsMM;
    }

    public void setMaxDimensionsMM(double maxDimensionsMM) {
        this.maxDimensionsMM = maxDimensionsMM;
    }

    public double getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(double volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getPrioritiesTime() {
        return prioritiesTime;
    }

    public void setPrioritiesTime(double prioritiesTime) {
        this.prioritiesTime = prioritiesTime;
    }

    public double getPrioritiesPrice() {
        return prioritiesPrice;
    }

    public void setPrioritiesPrice(double prioritiesPrice) {
        this.prioritiesPrice = prioritiesPrice;
    }

    //    //id
//    private String requestId;
//    private String clientName; // TODO: V  Sukurti atpazinima ar tai senas ar naujas klientas. Priskirti nauja arba sena ID
//
//    //scope
//    private double maxDimensionsMM; // TODO: V Validumo Tikrinimas.
//    private double volumeCM3; // TODO: V Validumo Tikrinimas.
//
//    //time
//    private int deadline;
//
//    //price
//    private double maxPrice; // TODO: V Validumo Tikrinimas.
//
//    //priorities
//    private double prioritiesTime; // TODO: V Validumo Tikrinimas.
//    private double prioritiesPrice;  // TODO: V Validumo Tikrinimas.
//
//    public Request(String requestId, String clientName, double maxDimensionsMM, double volumeCM3, int deadline, double maxPrice, double prioritiesTime, double prioritiesPrice) {
//        this.requestId = requestId;
//        this.clientName = clientName;
//        this.maxDimensionsMM = maxDimensionsMM;
//        this.volumeCM3 = volumeCM3;
//        this.deadline = deadline;
//        this.maxPrice = maxPrice;
//        this.prioritiesTime = prioritiesTime;
//        this.prioritiesPrice = prioritiesPrice;
//    }





}





