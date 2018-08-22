package com.vcs.rentalShop;


import com.vcs.operators.RentalShop;
import com.vcs.rentalOperations.ClientOps;
import com.vcs.rentalOperations.InfoOperationsForClient;
import com.vcs.vehicles.TypeOfVehicle;
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
    public ClientOps forClient;

    @RequestMapping("/")
    public String commandLines(){
        return "aa" +
                "bb";
    }

    @RequestMapping(value="/showCar/{start}/{end}", method= RequestMethod.GET)
    public List<Vehicle> showCar (@PathVariable("start") int start, @PathVariable("end") int end){
       return forClient.showAvailableCarsByDate(start, end);
    }

    @RequestMapping(value="/showCarByType/{type}/{start}/{end}", method= RequestMethod.GET)
    public List<Vehicle> showCarByType (@PathVariable("type") TypeOfVehicle type,@PathVariable("start") int start, @PathVariable("end") int end){
        return forClient.showIfTheVehrIsAvailable(type, start, end);
    }

    @RequestMapping(value="/rent/{id}/{start}/{end}", method= RequestMethod.GET)
    public String showCarByType (@PathVariable("id") int id,@PathVariable("start") int start, @PathVariable("end") int end){
        return forClient.rent(id, start, end);
    }


}

