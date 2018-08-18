package vehicles;


import operators.RentalShop;

public class Sedan extends Vehicle {

    public Sedan() {

        this (4, "Rover", "Unleaded", "Grey", false,"1,2L", 2013);

    }

    public Sedan (int noOfSeats, String model, String fuelType, String colour, boolean autoGearBox, String power, int productionYear ) {
        setNoOfSeats(noOfSeats);
        setModel(model);
        setFuelType(fuelType);
        setColour(colour);
        setAutoGearBox(autoGearBox);
        setPower(power);
        setProductionYear(productionYear);
        setTypeOfVehicle(TypeOfVehicle.SEDAN);
        setVehicleId();
        RentalShop.generalList.add(Sedan.this);
    }


}
