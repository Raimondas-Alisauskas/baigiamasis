package com.vcs.operators;


import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Qualifier("rentalShop")
public class RentalShop{



    public static List<Vehicle> generalList = new ArrayList<>();



    public static Map<Integer, List<Vehicle>> rentedList = new HashMap();




}




