package com.vcs.vehicles;

import com.vcs.operators.KeepsVehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.vcs.vehicles.TypesOfVehicle.*;

@Service
public class VehicleCreator implements VehicleCreatorInt {


    @Autowired
    @Qualifier("keepsVehicles")
    KeepsVehicles shop;


    @Override
    public void addCars() {
        if (shop.getGeneralList().isEmpty()) {

            for (int i = 0; i < 3; i++) {

                shop.getGeneralList().add(new Vehicle(JEEP));
                shop.getGeneralList().add(new Vehicle(MOTORBIKE));
                shop.getGeneralList().add(new Vehicle(HATCHBACK));
                shop.getGeneralList().add(new Vehicle(SEDAN));
            }
        }
    }


}
