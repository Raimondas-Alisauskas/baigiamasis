package com.vcs.rentalOperations;

import com.vcs.operators.KeepsVehicles;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class ReturnOperations implements Rent_Return_Ops {

    @Autowired
    @Qualifier("keepsVehicles")
    protected KeepsVehicles keepsVehicles;

    @Override
    public String returnVehicle(int id, int startDate, int endDate, int returnDate) {

        Vehicle vehicle = selectVehicle(id);
        returnAVehicle(id, startDate, endDate);
        if (returnDate > endDate) {
            double toPay = (returnDate - endDate) * vehicle.getVehPrice();
            return "You have exceeded your rent period, please pay additional sum of " + toPay + " EUR.";
        }
        return "The vehicle has been accepted.";
    }

    private void returnAVehicle(int id, int startDate, int endDate) {

        Vehicle vehicle = selectVehicle(id);

        for (int i = startDate; i <= endDate; i++) {
            if (keepsVehicles.rentedList.containsKey(i)) {
                keepsVehicles.rentedList.get(i).remove(vehicle);
            }
            if (keepsVehicles.rentedList.get(i).isEmpty()) {
                keepsVehicles.rentedList.remove(i);
            }
        }
    }


    @Override
    public Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : keepsVehicles.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }


}
