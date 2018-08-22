package com.vcs.vehicles;

import com.vcs.operators.RentalShop;

public class Hatchback extends Vehicle {

    private int doorNo;

    private boolean sunroof;

    public Hatchback() {

        this (4, "Rover", "Unleaded", "Grey", false, false, 2, "1,2L", 2013);

    }

    public Hatchback (int noOfSeats, String model, String fuelType, String colour, boolean autoGearBox, boolean sunRoof, int doorNo, String power, int productionYear ) {
        setNoOfSeats(noOfSeats);
        setModel(model);
        setFuelType(fuelType);
        setColour(colour);
        setAutoGearBox(autoGearBox);
        this.sunroof=sunRoof;
        this.doorNo=doorNo;
        setPower(power);
        setProductionYear(productionYear);
        setTypeOfVehicle(TypeOfVehicle.HATCHBACK);
        setVehPrice(30);
        setVehicleId();
        RentalShop.generalList.add(Hatchback.this);
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
