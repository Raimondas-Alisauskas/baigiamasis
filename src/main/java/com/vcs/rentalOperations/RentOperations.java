package com.vcs.rentalOperations;

import com.vcs.vehicles.Vehicle;

import java.util.ArrayList;

public abstract class RentOperations extends ReturnOperations {


    @Override
    public String rent(int id, int startDate, int endDate) {


        if (checkIfVehIsAvl(id, startDate, endDate)) {
            Vehicle vehicle = rentAVehicle(id, startDate, endDate);
            return "The Vehicle is rented to you." + "Model: " + vehicle.getModel() + ". ID: " + vehicle.getVehicleId() + ".";
        } else {
            return "Vehicle with ID: " + id + " is rented during your selected dates";
        }

    }

    private Vehicle rentAVehicle(int id, int startDate, int endDate) {

        Vehicle vehicle = selectVehicle(id);

        for (int i = startDate; i <= endDate; i++) {
            if (!keepsVehicles.rentedList.containsKey(i)) {
                keepsVehicles.rentedList.put(i, new ArrayList<Vehicle>());

            }
            keepsVehicles.rentedList.get(i).add(vehicle);

        }
        return vehicle;
    }

    private boolean checkIfVehIsAvl(int id, int startDate, int endDate) {

        for (int a = startDate; a <= endDate; a++) {
            if (keepsVehicles.rentedList.containsKey(a)) {
                for (Vehicle vehicle : keepsVehicles.rentedList.get(a)) {
                    if (vehicle.getVehicleId() == id) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}



