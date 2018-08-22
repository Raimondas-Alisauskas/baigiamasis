package com.vcs.rentalOperations;

import com.vcs.vehicles.TypeOfVehicle;
import com.vcs.vehicles.Vehicle;

import java.util.List;
import java.util.Map;

public interface InfoOperationsForAdmin {

    public Map<Vehicle,List<Integer>> showWhatIsRented ();

    public Vehicle addNewVehicle(TypeOfVehicle type);

    public List<Vehicle> howManyCarsWePosses();
}

