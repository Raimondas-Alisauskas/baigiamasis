package com.vcs.operators;


import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Qualifier("keepsVehicles")
public class KeepsVehicles {


    public List<Vehicle> generalList = new ArrayList<>();


    public Map<Integer, List<Vehicle>> rentedList = new HashMap();


}




