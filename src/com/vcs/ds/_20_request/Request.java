package com.vcs.ds._20_request;

import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_General.IdGenerator;

import java.time.LocalDate;

public class Request {

    //id
    private String requestId;
    private String clientName; // TODO: Stage2  Sukurti atpazinima ar tai senas ar naujas klientas. Deti i ClientsDatabase jei naujas
    //scope
    private long maxDimensionsMM; // TODO: Stage2 Validumo Tikrinimas.
    private long volumeCM3; // TODO: Stage2 Validumo Tikrinimas.
    //time
    private LocalDate deadline;


    public Request(String clientName, String maxDimensionsMM, String volumeCM3, String deadline) {
        requestId = new IdGenerator().generateIdKey("Rk ");
        this.clientName = clientName;
        this.maxDimensionsMM = Long.valueOf(maxDimensionsMM);
        this.volumeCM3 = Long.valueOf(volumeCM3);
        this.deadline = LocalDate.parse(deadline);
    }


    //getset
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

    public long getMaxDimensionsMM() {
        return maxDimensionsMM;
    }

    public void setMaxDimensionsMM(long maxDimensionsMM) {
        this.maxDimensionsMM = maxDimensionsMM;
    }

    public long getVolumeCM3() {
        return volumeCM3;
    }

    public void setVolumeCM3(long volumeCM3) {
        this.volumeCM3 = volumeCM3;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }


}


//    todo  Stage2
//    //price
//    private double maxPrice; //
//
//    //priorities
//    private double prioritiesTime; //
//    private double prioritiesPrice;  //
//
//        maxPrice = Double.parseDouble(requestInput.getMaxPrice());
//
//        prioritiesTime = Double.parseDouble(requestInput.getTimePriority());
//
//        prioritiesPrice = Double.parseDouble(requestInput.getPricePriority());



