package rentalOperations;

import operators.RentalShop;
import vehicles.TypeOfVehicle;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public abstract class InfoOperationsForClient {
    public void showAvailableCarsByDate (int startDate, int endDate){

        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);

        System.out.println("List of available vehicle during your selected dates:");
        for (Vehicle fvehicle:RentalShop.generalList
             ) {
            for (Vehicle bvehicle:busyVehicles
                 ) {if (fvehicle.getVehicleId()!=bvehicle.getVehicleId()){
                System.out.println(fvehicle.getModel());
                System.out.println(fvehicle.getTypeOfVehicle());
                System.out.println(fvehicle.getVehicleId());
                System.out.println();
            }

            }

        }
    }

    public void showIfTheVehrIsAvailable (TypeOfVehicle type, int startDate, int endDate){


        List<Vehicle> busyVehicles=getListOfBusyVehicles(startDate, endDate);

        System.out.println("List of available vehicle of specific type during your selected dates:");
        for (Vehicle fvehicle:RentalShop.generalList
        ) {
            for (Vehicle bvehicle:busyVehicles
            ) {if (fvehicle.getTypeOfVehicle()!=bvehicle.getTypeOfVehicle()&& fvehicle.getTypeOfVehicle()==type){
                System.out.println(fvehicle.getModel());
                System.out.println(fvehicle.getTypeOfVehicle());
                System.out.println(fvehicle.getVehicleId());
                System.out.println();
            }

            }

        }


    }

    private List<Vehicle> getListOfBusyVehicles (int startDate, int endDate){
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
        return busyVehicles;
    }


}
