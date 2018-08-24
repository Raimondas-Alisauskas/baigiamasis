package com.vcs.rentalOperations;


import com.vcs.vehicles.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vcs.vehicles.TypesOfVehicle.*;


@Service
@Qualifier("admin")
public class AdminOperations extends ClientOperations implements InfoOperationsForAdmin {



    @Override
    public Map<Vehicle, List<Integer>> showWhatIsRented() {
        Map<Vehicle, List<Integer>> rentedVehicles = new HashMap<>();
        for (int i = 0; i <= DAYS_IN_YEAR; i++) {
            if (keepsVehicles.rentedList.containsKey(i)) {
                for (Vehicle vehicle : keepsVehicles.rentedList.get(i)) {
                    rentedVehicles.putIfAbsent(vehicle, new ArrayList<>());
                    rentedVehicles.get(vehicle).add(i);
                }
            }
        }
        return rentedVehicles;


    }

    @Override
    public List<Vehicle> howManyCarsWePosses() {
        return keepsVehicles.generalList;


    }

    @Override
    public String addNewVehicle(TypesOfVehicle type) {
        switch (type) {
            case HATCHBACK:
                keepsVehicles.generalList.add(new Vehicle(HATCHBACK));
                return "Hatchback created";
            case JEEP:
                keepsVehicles.generalList.add(new Vehicle(JEEP));
                return "Jeep created";
            case MOTORBIKE:
                keepsVehicles.generalList.add(new Vehicle(MOTORBIKE));
                return "Motorbike created";
            case SEDAN:
                keepsVehicles.generalList.add(new Vehicle(SEDAN));
                return "Sedan created";
        }
        return "Acceptable types are only HATCHBACK, JEEP, MOTORBIKE, SEDAN.";

    }
}
