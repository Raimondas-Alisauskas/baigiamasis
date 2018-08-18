package vehicles;

import vehicles.TypeOfVehicle;

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

    public static int vehicleId;

    protected TypeOfVehicle typeOfVehicle;

    public static int counter = vehicleId +1;

    protected double pricePerDay;

    protected int ClientId;




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

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getClientId() {
        return ClientId;
    }

    public void setClientId(int clientId) {
        ClientId = clientId;
    }
}
