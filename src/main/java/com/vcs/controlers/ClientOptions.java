package com.vcs.controlers;


import com.vcs.rentalOperations.ClientOperations;
import com.vcs.vehicles.TypesOfVehicle;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientOptions {
    @Autowired
    @Qualifier("clientOps")
    public ClientOperations forClient;

    @RequestMapping("/")
    public String commandLines() {
        return "Available functions: " +
                "showCar, " +
                "showCarByType, " +
                "rent, " +
                "return. ";
    }

    @RequestMapping(value = "/showCar/{start}/{end}", method = RequestMethod.GET)
    public List<Vehicle> showCar(@PathVariable("start") int start, @PathVariable("end") int end) {
        return forClient.showAvailableCarsByDate(start, end);

    }

    @RequestMapping(value = "/showCarByType/{type}/{start}/{end}", method = RequestMethod.GET)
    public List<Vehicle> showCarByType(@PathVariable("type") TypesOfVehicle type, @PathVariable("start") int start, @PathVariable("end") int end) {
        return forClient.showIfTheVehrIsAvailable(type, start, end);
    }

    @RequestMapping(value = "/rent/{id}/{start}/{end}", method = RequestMethod.GET)
    public String showCarByType(@PathVariable("id") int id, @PathVariable("start") int start, @PathVariable("end") int end) {
        return forClient.rent(id, start, end);
    }

    @RequestMapping(value = "/return/{id}/{start}/{end}/{rDate}", method = RequestMethod.GET)
    public String showCarByType(@PathVariable("id") int id, @PathVariable("start") int start, @PathVariable("end") int end, @PathVariable("rDate") int rDate) {
        return forClient.returnVehicle(id, start, end, rDate);
    }


}

