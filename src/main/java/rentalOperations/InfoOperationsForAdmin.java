package rentalOperations;

import operators.RentalShop;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InfoOperationsForAdmin extends InfoOperationsForClient {

    protected void showWhatIsRented (){
        Map<Vehicle,List<Integer>> rentedVehicles = new HashMap<>();
        for (int i=0; i<=365;i++){
            if(RentalShop.rentedList.containsKey(i)){
                for (Vehicle vehicle: RentalShop.rentedList.get(i)
                ) { rentedVehicles.putIfAbsent(vehicle,new ArrayList<>());
                    rentedVehicles.get(vehicle).add(i);

                }
                }
            }


        for (Vehicle vehicle: rentedVehicles.keySet()
             ) { System.out.println("Model: "+ vehicle.getModel());
                System.out.println("Vehicle ID: " + vehicle.getVehicleId());
                System.out.println("Rent days:");

            for (Integer integer:rentedVehicles.get(vehicle)
                 ) {

                System.out.println(integer+";");

            }
            System.out.println();


        }



        }
    }

