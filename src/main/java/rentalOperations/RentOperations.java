package rentalOperations;

import operators.Client;
import operators.RentalShop;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class RentOperations extends ReturnOperations{


    public void rent(int id, int startDate, int endDate, Client client){
        if (client.isCreditCardValidity()&& client.isDriverLicense()&& client.getAge()>17){
        if(checkIfVehIsAvl(id, startDate, endDate)){
            rentAVehicle(id, startDate, endDate, client);
            int days=endDate-startDate+1;
            double pricePerDay=selectVehicle(id).getVehPrice()*days;
            System.out.println("Your selected vehicle was rented to you. You have been charged "+pricePerDay+" EUR.");
        } else {System.out.println("Vehicle with ID: "+ id+" is rented during your selected dates");}} else{
            System.out.println("Sorry, you do not meet the requirements and can not be rented a vehicle.");
        }
    }

    private void rentAVehicle(int id, int startDate, int endDate, Client client) {

        Vehicle vehicle=selectVehicle(id);
        vehicle.setClientId(client.getClientId());
        for (int i=startDate; i<=endDate; i++){
            if (!RentalShop.rentedList.containsKey(i)){
                RentalShop.rentedList.put(i, new ArrayList<>());
            }
            RentalShop.rentedList.get(i).add(vehicle);
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

    private void removeFromList (int id, int startDate, int endDate, HashMap <Integer,List<Vehicle>> list){
        for (int a=startDate; a<=endDate; a++){
            if(list.containsKey(a)){
                for (Vehicle vehicle: RentalShop.rentedList.get(a)){
                    if (vehicle.getVehicleId()==id){
                        System.out.println("vehicles.Vehicle is not available during your selected period");

                    }
                }
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



