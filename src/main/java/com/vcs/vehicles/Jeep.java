package vehicles;

import operators.RentalShop;

import static vehicles.TypeOfVehicle.JEEP;

public class Jeep extends Vehicle {

    private boolean offRoad;

    public  Jeep (){
        this (4, "Jeep", "Diesel", "Black", false, true, "3,5L", 2015);
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
        RentalShop.generalList.add(Jeep.this);
        setVehPrice(50);


    }

    public boolean isOffRoad() {
        return offRoad;
    }

    public void setOffRoad(boolean offRoad) {
        this.offRoad = offRoad;
    }
}
