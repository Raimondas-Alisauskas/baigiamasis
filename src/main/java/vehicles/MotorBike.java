package vehicles;

public class MotorBike extends Vehicle {

    private boolean sideSeat;

    public MotorBike(){
        this (2, "Honda", "Unleaded", "Red", false, true, "1000", 2017);
    }

    public MotorBike (int noOfSeats, String model, String fuelType, String colour, boolean autoGearBox, boolean sideSeat, String power, int productionYear){

        setNoOfSeats(noOfSeats);
        setModel(model);
        setFuelType(fuelType);
        setColour(colour);
        setAutoGearBox(autoGearBox);
        this.sideSeat=sideSeat;
        setPower(power);
        setProductionYear(productionYear);
        setTypeOfVehicle(TypeOfVehicle.MOTORBIKE);
        setVehicleId();
    }

    public boolean isSideSeat() {
        return sideSeat;
    }

    public void setSideSeat(boolean sideSeat) {
        this.sideSeat = sideSeat;
    }
}
