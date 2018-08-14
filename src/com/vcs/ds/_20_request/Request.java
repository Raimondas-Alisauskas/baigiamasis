package com.vcs.ds._20_request;

public class Request {
    //id
    private int clientId; // TODO: 18.8.13 Sukurti atpazinima ar tai senas ar naujas klientas. Priskirti nauja arba sena ID
    private int requestId; // TODO: 18.8.13  Sukurti ir priskirti unikalu Request ID

    //scope
    private double maxDimensionsMM; // TODO: 18.8.13 Imti is Input. Validumo Tikrinimas. String to double konvertavimas.
    private double volumeM3; // TODO: 18.8.13 Imti is Input. Validumo Tikrinimas. String to double konvertavimas.

    //time
    private String deadline; // TODO?: 18.8.13 Koks turi buti formatas?

    //price
    private double maxPrice; // TODO: 18.8.13 Imti is Input. Validumo Tikrinimas. String to double konvertavimas.

    //priorities
    private double time; // TODO: 18.8.13 Imti is Input. Validumo Tikrinimas. String to double konvertavimas.
    private double price;  // TODO: 18.8.13 Imti is Input. Validumo Tikrinimas. String to double konvertavimas.

    // todo Sudeti i lista
}
