package com.vcs.rentalOperations;

import com.vcs.vehicles.TypeOfVehicle;
import com.vcs.vehicles.Vehicle;

import java.util.List;

public interface InfoOperationsForClient {
    public List<Vehicle> showAvailableCarsByDate(int startDate, int endDate);

    public List<Vehicle> showIfTheVehrIsAvailable (TypeOfVehicle type, int startDate, int endDate);

    public List<Vehicle> getListOfBusyVehicles (int startDate, int endDate);



}
