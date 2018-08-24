package com.vcs.controlers;

import com.vcs.rentalOperations.AdminOperations;
import com.vcs.vehicles.TypesOfVehicle;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminOptions extends ClientOptions {

    @Autowired
    @Qualifier("admin")
    AdminOperations forAdmin;

    @RequestMapping(value = "/addNewCar/{type}", method = RequestMethod.GET)
    public String addNewCar(@PathVariable("type") TypesOfVehicle type) {
        return forAdmin.addNewVehicle(type);
    }

    @RequestMapping(value = "/ownedVehicles", method = RequestMethod.GET)
    public List<Vehicle> showAllVehicles() {
        return forAdmin.howManyCarsWePosses();
    }


    @RequestMapping(value = "/rentedVehicles", method = RequestMethod.GET)
    public Map<Vehicle, List<Integer>> rentedVehicles() {
        return forAdmin.showWhatIsRented();
    }


}
