package com.vcs.rentalOperations;

import com.vcs.operators.Client;
import com.vcs.operators.RentalShop;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class RentOperations extends ReturnOperations {

    @Autowired
    @Qualifier("client")
    Client client;


    public String rent(int id, int startDate, int endDate) {

        if (client.isCreditCardValidity() && client.isDriverLicense(true) && client.getAge() > 17) {
            if (checkIfVehIsAvl(id, startDate, endDate)) {
                Vehicle vehicle = rentAVehicle(id, startDate, endDate, client);
                return "The Vehicle is rented to you." + "Model: " + vehicle.getModel() + ". ID: " + vehicle.getVehicleId() + ".";
            } else {
                return "Vehicle with ID: " + id + " is rented during your selected dates";
            }
        } else {
            return "Sorry, you do not meet the requirements and can not be rented a vehicle.";
        }
    }

    private Vehicle rentAVehicle(int id, int startDate, int endDate, Client client) {

        Vehicle vehicle = selectVehicle(id);

        for (int i = startDate; i <= endDate; i++) {
            if (!rentalShop.rentedList.containsKey(i)) {
                rentalShop.rentedList.put(i, new ArrayList<Vehicle>());

            }
            rentalShop.rentedList.get(i).add(vehicle);

        }
        return vehicle;
    }

    private boolean checkIfVehIsAvl(int id, int startDate, int endDate) {

        for (int a = startDate; a <= endDate; a++) {
            if (rentalShop.rentedList.containsKey(a)) {
                for (Vehicle vehicle : rentalShop.rentedList.get(a)) {
                    if (vehicle.getVehicleId() == id) {
                        System.out.println("Vehicle is not available during your selected period");
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : rentalShop.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }


}



