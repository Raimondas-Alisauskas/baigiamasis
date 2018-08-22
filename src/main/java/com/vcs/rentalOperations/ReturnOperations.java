package com.vcs.rentalOperations;

import com.vcs.operators.Client;
import com.vcs.operators.RentalShop;
import com.vcs.vehicles.Vehicle;

public abstract class ReturnOperations {

    public void returnVehicle(int id, int startDate, int endDate, int returnDate){

        Vehicle vehicle=selectVehicle(id);
            returnAVehicle(id,startDate,endDate);
            if (returnDate>endDate){
                double toPay=(returnDate-endDate)*vehicle.getVehPrice();
                System.out.println("You have exceeded your rent period, please pay additional sum of "+toPay+" EUR.");
            }

    }

    private void returnAVehicle(int id, int startDate, int endDate) {

        Vehicle vehicle=selectVehicle(id);

        for (int i=startDate; i<=endDate; i++){
            if (RentalShop.rentedList.containsKey(i)){
                RentalShop.rentedList.get(i).remove(vehicle);
            }
            if (RentalShop.rentedList.get(i).isEmpty()){
                RentalShop.rentedList.remove(i);
            }
        }
    }




    private Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : RentalShop.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }







}
