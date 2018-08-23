package com.vcs.rentalOperations;


import com.vcs.vehicles.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.vcs.vehicles.TypeOfVehicle.*;


@Service
@Qualifier("admin")
public class AdminOps extends ClientOps implements InfoOperationsForAdmin {


    @Override
    public Map<Vehicle, List<Integer>> showWhatIsRented() {
        Map<Vehicle, List<Integer>> rentedVehicles = new HashMap<>();
        for (int i = 0; i <= 365; i++) {
            if (rentalShop.rentedList.containsKey(i)) {
                for (Vehicle vehicle : rentalShop.rentedList.get(i)) {
                    rentedVehicles.putIfAbsent(vehicle, new ArrayList<>());
                    rentedVehicles.get(vehicle).add(i);
                }
            }
        }


        for (Vehicle vehicle : rentedVehicles.keySet()) {
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Vehicle ID: " + vehicle.getVehicleId());
            System.out.println("Rent days:");

            for (Integer integer : rentedVehicles.get(vehicle)) {

                System.out.println(integer + ";");

            }
            System.out.println();


        }
        return rentedVehicles;


    }

    @Override
    public List<Vehicle> howManyCarsWePosses() {
        return rentalShop.generalList;


    }

    @Override
    public Vehicle addNewVehicle(TypeOfVehicle type) {
        switch (type) {
            case HATCHBACK:

                return new Vehicle(HATCHBACK);
            case JEEP:

                return new Vehicle(JEEP);
            case MOTORBIKE:

                return new Vehicle(MOTORBIKE);
            case SEDAN:

                return new Vehicle(SEDAN);
        }
        return null;

    }
}
