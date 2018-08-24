package com.vcs.rentalOperations;

import com.vcs.vehicles.TypesOfVehicle;
import com.vcs.vehicles.Vehicle;

import java.util.List;
import java.util.Map;

public interface InfoOperationsForAdmin {

    public Map<Vehicle, List<Integer>> showWhatIsRented();

    public String addNewVehicle(TypesOfVehicle type);

    public List<Vehicle> howManyCarsWePosses();
}

