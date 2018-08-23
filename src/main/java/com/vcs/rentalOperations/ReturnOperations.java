package com.vcs.rentalOperations;

import com.vcs.operators.Client;
import com.vcs.operators.RentalShop;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class ReturnOperations {

    @Autowired
    @Qualifier("rentalShop")
    protected RentalShop rentalShop;

    public String returnVehicle(int id, int startDate, int endDate, int returnDate){

        Vehicle vehicle=selectVehicle(id);
            returnAVehicle(id,startDate,endDate);
            if (returnDate>endDate){
                double toPay=(returnDate-endDate)*vehicle.getVehPrice();
                return "You have exceeded your rent period, please pay additional sum of "+toPay+" EUR.";
            }
        return "The vehicle has been accepted.";
    }

    private void returnAVehicle(int id, int startDate, int endDate) {

        Vehicle vehicle=selectVehicle(id);

        for (int i=startDate; i<=endDate; i++){
            if (rentalShop.rentedList.containsKey(i)){
                rentalShop.rentedList.get(i).remove(vehicle);
            }
            if (rentalShop.rentedList.get(i).isEmpty()){
                rentalShop.rentedList.remove(i);
            }
        }
    }




    private Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : rentalShop.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }







}
