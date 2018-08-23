package com.vcs.rentalOperations;

import com.vcs.vehicles.TypeOfVehicle;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("clientOps")
public class ClientOps extends RentOperations implements InfoOperationsForClient {


    @Override
    public List<Vehicle> showAvailableCarsByDate(int startDate, int endDate) {

        List<Vehicle> busyVehicles = getListOfBusyVehicles(startDate, endDate);
        List<Vehicle> availableVeh = new ArrayList<>();
        if (busyVehicles.isEmpty()) {
            return rentalShop.generalList;
        }
        for (Vehicle fvehicle : rentalShop.generalList) {
            for (Vehicle bvehicle : busyVehicles) {
                if (fvehicle.getVehicleId() != bvehicle.getVehicleId()) {
                    availableVeh.add(fvehicle);
                }
            }

        }
        return availableVeh;
    }


    @Override
    public List<Vehicle> showIfTheVehrIsAvailable(TypeOfVehicle type, int startDate, int endDate) {

        List<Vehicle> busyVehicles = getListOfBusyVehicles(startDate, endDate);
        List<Vehicle> availableVeh = new ArrayList<>();
        System.out.println("List of available vehicle of specific type during your selected dates:");
        for (Vehicle fvehicle : rentalShop.generalList
        ) {
            for (Vehicle bvehicle : busyVehicles
            ) {
                if (fvehicle.getTypeOfVehicle() != bvehicle.getTypeOfVehicle() && fvehicle.getTypeOfVehicle() == type) {
                    availableVeh.add(fvehicle);
                }
            }
        }
        return availableVeh;
    }


    @Override
    public List<Vehicle> getListOfBusyVehicles(int startDate, int endDate) {
        List<Vehicle> busyVehicles = new ArrayList<>();
        for (int i = startDate; i <= endDate; i++) {
            if (rentalShop.rentedList.containsKey(i)) {
                for (Vehicle vehicle : rentalShop.rentedList.get(i)
                ) {
                    if (!busyVehicles.contains(vehicle)) {
                        busyVehicles.add(vehicle);
                    }
                }
            }
        }
        return busyVehicles;
    }


}
