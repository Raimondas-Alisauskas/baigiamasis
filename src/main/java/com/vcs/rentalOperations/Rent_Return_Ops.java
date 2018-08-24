package com.vcs.rentalOperations;

import com.vcs.vehicles.Vehicle;

public interface Rent_Return_Ops {

    public Vehicle selectVehicle(int ID);

    public String returnVehicle(int id, int startDate, int endDate, int returnDate);

    public String rent(int id, int startDate, int endDate);
}
