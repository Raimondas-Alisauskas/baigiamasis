package operators;

import rentalOperations.RentOperations;
import vehicles.*;

import java.util.*;

public class RentalShop{



    public static List<Vehicle> generalList = new ArrayList<>();



    public static Map<Integer, List<Vehicle>> rentedList = new HashMap();








    private Vehicle getCarById(int ID) {

        Vehicle selectedVeh = null;

        for (Vehicle vehicle : generalList) {

            if (ID == vehicle.getVehicleId()) {
                selectedVeh = vehicle;
            }
        }

        return selectedVeh;

    }

//    public void printVehicleInfo(int Id) {
//        vehicles.Vehicle vehicleToPrint = getCarById(Id);
//        if (vehicleToPrint.getTypeOfVehicle() == TypeOfVehicle.HATCHBACK) {
//            Hatchback hatchback = (vehicle.Hatchback) vehicleToPrint;
//            System.out.println("Unique Features of the " + hatchback.getModel());
//            System.out.println("Power: " + hatchback.getPower());
//            System.out.println("Fuel type: " + hatchback.getFuelType());
//            System.out.println("Number of doors: " + hatchback.getDoorNo());
//            String sunroof = hatchback.isSunroof() ? "Yes" : "No";
//            System.out.println("Sunroof: " + sunroof);
//        }
//        if (vehicleToPrint.getTypeOfVehicle() == TypeOfVehicle.JEEP) {
//            Jeep jeep = (Jeep) vehicleToPrint;
//            System.out.println("Unique Features of the " + jeep.getModel());
//            System.out.println("Power: " + jeep.getPower());
//            System.out.println("Fuel type: " + jeep.getFuelType());
//            String offRoad = jeep.isOffRoad() ? "Yes" : "No";
//            System.out.println("Offroad: " + offRoad);
//        }
//        if (vehicleToPrint.getTypeOfVehicle() == TypeOfVehicle.MOTORBIKE) {
//            MotorBike motorBike = (MotorBike) vehicleToPrint;
//            System.out.println("Unique Features of the " + motorBike.getModel());
//            System.out.println("Power: " + motorBike.getPower());
//            System.out.println("Fuel type: " + motorBike.getFuelType());
//            String sideSeat = motorBike.isSideSeat() ? "Yes" : "No";
//            System.out.println("Side seat: " + sideSeat);
//        }
//        if (vehicleToPrint.getTypeOfVehicle() == TypeOfVehicle.SEDAN) {
//            Sedan sedan = (Sedan) vehicleToPrint;
//            System.out.println("Unique Features of the " + sedan.getModel());
//            System.out.println("Power: " + sedan.getPower());
//            System.out.println("Fuel type: " + sedan.getFuelType());
//
//        }
//
//    }



    public void addToGeneralList(Vehicle vehicle) {
        generalList.add(vehicle);
    }



    public List<Vehicle> getGeneralList() {
        return generalList;
    }


    public void setGeneralList(List<Vehicle> generalList) {
        this.generalList = generalList;
    }

}




