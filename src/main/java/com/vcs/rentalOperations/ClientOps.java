package com.vcs.rentalOperations;

import com.vcs.operators.Client;
import com.vcs.operators.RentalShop;
import com.vcs.vehicles.Hatchback;
import com.vcs.vehicles.TypeOfVehicle;
import com.vcs.vehicles.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Qualifier("clientOps")
public class ClientOps extends ReturnOperations implements InfoOperationsForClient{

    @Autowired
    @Qualifier("client")
    Client client;

    @Override
    public List<Vehicle> showAvailableCarsByDate (int startDate, int endDate){

        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);
        List<Vehicle> availableVeh=new ArrayList<>();
        if (busyVehicles.isEmpty()){
            return RentalShop.generalList;
        }
        for (Vehicle fvehicle: RentalShop.generalList
        ) {
            for (Vehicle bvehicle:busyVehicles
            ) {if (fvehicle.getVehicleId()!=bvehicle.getVehicleId()||busyVehicles==null){
                availableVeh.add(fvehicle);
            }
            }

        }
        return availableVeh;
    }
    @Override
    public List<Vehicle> showIfTheVehrIsAvailable (TypeOfVehicle type, int startDate, int endDate){


        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);
        List<Vehicle> availableVeh=new ArrayList<>();
        System.out.println("List of available vehicle of specific type during your selected dates:");
        for (Vehicle fvehicle:RentalShop.generalList
        ) {
            for (Vehicle bvehicle:busyVehicles
            ) {if (fvehicle.getTypeOfVehicle()!=bvehicle.getTypeOfVehicle()&& fvehicle.getTypeOfVehicle()==type){
                availableVeh.add(fvehicle);
            }

            }

        }
        return availableVeh;


    }
    @Override
    public List<Vehicle> getListOfBusyVehicles(int startDate, int endDate){
        List<Vehicle> busyVehicles = new ArrayList<>();
        for (int i=startDate; i<=endDate;i++){
            if(RentalShop.rentedList.containsKey(i)){
                for (Vehicle vehicle: RentalShop.rentedList.get(i)
                ) { if (!busyVehicles.contains(vehicle)){
                    busyVehicles.add(vehicle);
                }
                }
            }
        }

        return busyVehicles;
    }

    public String rent(int id, int startDate, int endDate){

        if (client.isCreditCardValidity()&& client.isDriverLicense(true)&& client.getAge()>17){
            if(checkIfVehIsAvl(id, startDate, endDate)){
                Vehicle vehicle =rentAVehicle(id, startDate, endDate, client);
                return "The Vehicle is rented to you."+"Model: "+vehicle.getModel()+". ID: "+vehicle.getVehicleId()+".";
            } else {return "Vehicle with ID: "+ id+" is rented during your selected dates";}} else{
            return "Sorry, you do not meet the requirements and can not be rented a vehicle.";
        }
    }

    private Vehicle rentAVehicle(int id, int startDate, int endDate, Client client) {

        Vehicle vehicle=selectVehicle(id);
        vehicle.setClientId(client.getClientId());
        for (int i=startDate; i<=endDate; i++){
            if (!RentalShop.rentedList.containsKey(i)){
                RentalShop.rentedList.put(i, new ArrayList<Vehicle>());

            }
            RentalShop.rentedList.get(i).add(vehicle);

        }
        return vehicle;
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





    public Vehicle selectVehicle(int ID) {
        for (Vehicle vehicle : RentalShop.generalList) {
            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }
        return null;
    }
}
