package com.vcs.operators;


import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
@Qualifier("keepsVehicles")
public class KeepsVehicles {


    private List<Vehicle> generalList = new ArrayList<>();


    private Map<Integer, List<Vehicle>> rentedList = new HashMap();

    public List<Vehicle> getGeneralList() {
        return generalList;
    }

    public void setGeneralList(List<Vehicle> generalList) {
        this.generalList = generalList;
    }

    public Map<Integer, List<Vehicle>> getRentedList() {
        return rentedList;
    }

    public void setRentedList(Map<Integer, List<Vehicle>> rentedList) {
        this.rentedList = rentedList;
    }
}




