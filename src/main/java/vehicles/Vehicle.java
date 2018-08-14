package vehicles;

import java.util.Random;

public abstract class Vehicle {

// TODO static counter for vehicle ID

    protected String colour;

    protected String power;

    protected String model;

    protected String fuelType;

    protected int productionYear;

    protected int noOfSeats;

    protected boolean autoGearBox;

    protected boolean availableOrNot;

    protected int vehicleId=111;

    protected  TypeOfVehicle typeOfVehicle;

    Random rand = new Random();

    public int counter = this.vehicleId +1;


    public boolean isAvailableOrNot() {
        return availableOrNot;
    }

    public void setAvailableOrNot(boolean availableOrNot) {
        this.availableOrNot = availableOrNot;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public void setAutoGearBox(boolean autoGearBox) {
        this.autoGearBox = autoGearBox;
    }

    public String getColour() {
        return colour;
    }

    public String getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public boolean isAutoGearBox() {
        return autoGearBox;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId() {
        this.vehicleId = counter;
    }

    public TypeOfVehicle getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(TypeOfVehicle typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
}
