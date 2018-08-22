package rentalOperations;

import operators.Client;
import operators.RentalShop;
import vehicles.Hatchback;
import vehicles.TypeOfVehicle;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class ClientOps extends ReturnOperations implements InfoOperationsForClient{
    @Override
    public void showAvailableCarsByDate (int startDate, int endDate){

        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);

        System.out.println("List of available vehicle during your selected dates:");
        for (Vehicle fvehicle: RentalShop.generalList
        ) {
            for (Vehicle bvehicle:busyVehicles
            ) {if (fvehicle.getVehicleId()!=bvehicle.getVehicleId()||busyVehicles==null){
                System.out.println("Model: "+fvehicle.getModel());
                System.out.println("Type: "+fvehicle.getTypeOfVehicle());
                System.out.println("ID: "+fvehicle.getVehicleId());
                System.out.println("Price per day: "+fvehicle.getVehPrice());
                System.out.println();
            }

            }

        }
    }
    @Override
    public void showIfTheVehrIsAvailable (TypeOfVehicle type, int startDate, int endDate){


        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);

        System.out.println("List of available vehicle of specific type during your selected dates:");
        for (Vehicle fvehicle:RentalShop.generalList
        ) {
            for (Vehicle bvehicle:busyVehicles
            ) {if (fvehicle.getTypeOfVehicle()!=bvehicle.getTypeOfVehicle()&& fvehicle.getTypeOfVehicle()==type){
                System.out.println("Model: "+fvehicle.getModel());
                System.out.println("Type: "+fvehicle.getTypeOfVehicle());
                System.out.println("ID: "+fvehicle.getVehicleId());
                System.out.println("Price per day: "+fvehicle.getVehPrice());
                System.out.println();
            }

            }

        }


    }
    @Override
    public List<Vehicle> getListOfBusyVehicles(int startDate, int endDate){
        List<Vehicle> busyVehicles = new ArrayList<>();
        for (int i=startDate; i<=endDate;i++){
            if(RentalShop.rentedList.containsKey(i)){
                for (Vehicle vehicle: RentalShop.rentedList.get(i)
                ) { if (!busyVehicles.contains(vehicle.getVehicleId())){
                    busyVehicles.add(vehicle);
                }
                }
            }
        }
        if (busyVehicles.size()==0){
            busyVehicles.add(new Hatchback());
        }
        return busyVehicles;
    }

    public void rent(int id, int startDate, int endDate, Client client){
        if (client.isCreditCardValidity()&& client.isDriverLicense(true)&& client.getAge()>17){
            if(checkIfVehIsAvl(id, startDate, endDate)){
                rentAVehicle(id, startDate, endDate, client);
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
                        System.out.println("Vehicle is not available during your selected period");
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void removeFromList (int id, int startDate, int endDate, HashMap<Integer,List<Vehicle>> list){
        for (int a=startDate; a<=endDate; a++){
            if(list.containsKey(a)){
                for (Vehicle vehicle: RentalShop.rentedList.get(a)){
                    if (vehicle.getVehicleId()==id){
                        System.out.println("Vehicle is not available during your selected period");

                    }
                }
            }
        }
    }



    public Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : RentalShop.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }
}
