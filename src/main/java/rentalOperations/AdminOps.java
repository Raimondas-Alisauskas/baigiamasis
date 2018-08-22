package rentalOperations;

import operators.RentalShop;
import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AdminOps extends ClientOps implements InfoOperationsForAdmin {
    @Override
    public void showWhatIsRented (){
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
    @Override
    public void howManyCarsWePosses() {
        System.out.println("We have " + RentalShop.generalList.size() + " vehicles");
        System.out.println("List of vehicles:");
        for (int i = 0; i < RentalShop.generalList.size(); i++) {
            System.out.println("Model: " + RentalShop.generalList.get(i).getModel() + " ID: " + RentalShop.generalList.get(i).getVehicleId());
        }


    }
}
