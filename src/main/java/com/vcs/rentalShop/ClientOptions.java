package com.vcs.rentalShop;


import com.vcs.rentalOperations.ClientOps;
import com.vcs.rentalOperations.InfoOperationsForClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class Implementation {
    @Autowired
    public InfoOperationsForClient forClient;

    @RequestMapping("/a")
    public String aa(){
        return "aa";
    }

//    @RequestMapping(value="/{start}", method= RequestMethod.GET)
//    public String showCar (){
//        forClient.showAvailableCarsByDate(@PathVariable("start") int start, 17);
//       return "opa" ;
//    }
}
//    RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> carGet(@PathVariable("id") int id) {
