package rentalOperations;

import operators.Client;
import operators.RentalShop;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class ReturnOperations {

    public void rent(int id, int startDate, int endDate, Client client, int returnDate){

        Vehicle vehicle=selectVehicle(id);
            returnAVehicle(id,startDate,endDate,client);
            if (returnDate>endDate){
                double toPay=(returnDate-endDate)*vehicle.getVehPrice();
                System.out.println("You have exceeded your rent period, please pay additional sum of "+toPay+" EUR.");
            }

    }

    private void returnAVehicle(int id, int startDate, int endDate, Client client) {

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

    private boolean checkIfVehIsAvl(int id, int startDate, int endDate) {

        for (int a=startDate; a<=endDate; a++){
            if(RentalShop.rentedList.containsKey(a)){
                for (Vehicle vehicle: RentalShop.rentedList.get(a)){
                    if (vehicle.getVehicleId()==id){
                        System.out.println("vehicles.Vehicle is not available during your selected period");
                        return false;
                    }
                }
            }
        }
        return true;
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
