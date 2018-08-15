package com.vcs.ds._20_request;

import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_General.IdGenerator;

import java.time.LocalDate;

public class Request {
    //id
    private String clientId; // TODO: V  Sukurti atpazinima ar tai senas ar naujas klientas. Priskirti nauja arba sena ID

    private String requestId;

    //scope
    private double maxDimensionsMM; // TODO: V Validumo Tikrinimas.

    private double volumeCM3; // TODO: V Validumo Tikrinimas.

    //time
    private LocalDate deadline;

    //price
    private double maxPrice; // TODO: V Validumo Tikrinimas.

    //priorities
    private double prioritiesTime; // TODO: V Validumo Tikrinimas.

    private double prioritiesPrice;  // TODO: V Validumo Tikrinimas.

    public Request( ) {

        clientId = IdGenerator.generateIdKey("Cl ");

        requestId = IdGenerator.generateIdKey("Rk ");

        maxDimensionsMM = Double.parseDouble(new RequestInput().getMaxDimensionMM());//todo? kodel kvieciame su kabutem ir new?

        volumeCM3 = Double.parseDouble(new RequestInput().getVolumeCM3());

        deadline = LocalDate.parse(new RequestInput().getDeadline());

        maxPrice = Double.parseDouble(new RequestInput().getMaxPrice());

        prioritiesTime = Double.parseDouble(new RequestInput().getTimePriority());

        prioritiesPrice = Double.parseDouble(new RequestInput().getPricePriority());
    }




}
