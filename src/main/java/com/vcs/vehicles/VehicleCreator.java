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

    public VehicleCreator() {

    }


    @Override
    public void addCars() {
        if (shop.generalList.isEmpty()) {

            for (int i = 0; i < 3; i++) {

                shop.generalList.add(new Vehicle(JEEP));
                shop.generalList.add(new Vehicle(MOTORBIKE));
                shop.generalList.add(new Vehicle(HATCHBACK));
                shop.generalList.add(new Vehicle(SEDAN));
            }
        }
    }
}
