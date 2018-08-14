package vehicles;

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
        setVehicleId();

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
