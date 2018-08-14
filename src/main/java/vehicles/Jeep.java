package vehicles;

import static vehicles.TypeOfVehicle.JEEP;

public class Jeep extends Vehicle {

    private boolean offRoad;

    public  Jeep (){
        this (4, "vehicles.Jeep", "Diesel", "Black", false, true, "3,5L", 2015);
    }

    public Jeep(int noOfSeats, String model, String fuelType, String colour, boolean autoGearBox, boolean offRoad, String power, int productionYear){

        setNoOfSeats(noOfSeats);
        setModel(model);
        setFuelType(fuelType);
        setColour(colour);
        setAutoGearBox(autoGearBox);
        this.offRoad=offRoad;
        setPower(power);
        setProductionYear(productionYear);
        setTypeOfVehicle(JEEP);
        setVehicleId();



    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }
}
