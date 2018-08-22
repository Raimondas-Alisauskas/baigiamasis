package com.vcs.rentalShop;



import com.vcs.operators.RentalShop;
import com.vcs.vehicles.Vc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")

public class Index {
    @Autowired
    public Vc vc;

    @RequestMapping("/")
    public String create() {

        vc.addCars();


        return "For clients go to clients, for admins, go to admin";
    }

}
