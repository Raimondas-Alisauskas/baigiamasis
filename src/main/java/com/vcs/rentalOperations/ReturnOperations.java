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
            if (keepsVehicles.getRentedList().containsKey(i)) {
                keepsVehicles.getRentedList().get(i).remove(vehicle);
            }
            if (keepsVehicles.getRentedList().get(i).isEmpty()) {
                keepsVehicles.getRentedList().remove(i);
            }
        }
    }


    @Override
    public Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : keepsVehicles.getGeneralList()) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }


}
