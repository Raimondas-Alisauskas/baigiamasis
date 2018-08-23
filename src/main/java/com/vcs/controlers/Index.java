package com.vcs.controlers;



import com.vcs.vehicles.VehicleCreatorInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")

public class Index {
    @Autowired
    public VehicleCreatorInt vehicleCreatorInt;

    @RequestMapping("/")
    public String create() {

        vehicleCreatorInt.addCars();


        return "For clients go to clients, for admins, go to admin";
    }

}
