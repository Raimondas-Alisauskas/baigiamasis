package com.vcs.vehicles;

import com.vcs.operators.KeepsVehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



import static com.vcs.vehicles.TypeOfVehicle.SEDAN;

public class Vehicle {
private final int SEDAN_PRICE=40;
    private final int HATCHBACK_PRICE=30;
    private final int MOTORBIKE_PRICE=20;
    private final int JEEP_PRICE=50;
    @Autowired
    @Qualifier("keepsVehicles")
    protected KeepsVehicles keepsVehicles;


    private String model;


    private int vehicleId;

    private TypeOfVehicle typeOfVehicle;

    private static int counter = 0;


    private double VehPrice;

    public Vehicle(){
        this(SEDAN);
    }

    public Vehicle (TypeOfVehicle type){
        setModel("Rover");
        setVehicleId();
        setTypeOfVehicle(type);
        setVehPrice(determinePrice(type));
    }



    private int determinePrice (TypeOfVehicle type){
        switch (type) {
            case HATCHBACK:
                return HATCHBACK_PRICE;
            case SEDAN:
                return SEDAN_PRICE;
            case JEEP:
                return JEEP_PRICE;
            case MOTORBIKE:
                return MOTORBIKE_PRICE;
                default:
                    return 0;

        }
    }



    public void setModel(String model) {
        this.model = model;
    }


    public String getModel() {
        return model;
    }


    public TypeOfVehicle getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(TypeOfVehicle typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }


    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId() {
        counter++;
        this.vehicleId = counter;
    }

    public double getVehPrice() {
        return VehPrice;
    }

    protected void setVehPrice(double vehPrice) {
        VehPrice = vehPrice;
    }


}
