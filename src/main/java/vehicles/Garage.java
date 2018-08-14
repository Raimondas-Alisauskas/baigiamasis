package vehicles;

import java.util.ArrayList;
import java.util.List;

public class Garage extends vehicles.RentOperations {

    //padaryti map'us. pagal tipus, kad ieskant butu galima pasirinkti kokios masinos nori


    public  static List<Vehicle> generalList= new ArrayList<>();

    public  static List<Vehicle> availablesList = new ArrayList<>();

    public  static List<Vehicle> rentedList= new ArrayList<>();





    public void howManyCarsAreAvailable() {
        System.out.println("There are available "+ availablesList.size() +" vehicles");
        System.out.println("List of available vehicles:");
        for (int i=0; i<availablesList.size(); i++){
            System.out.println("Model: "+availablesList.get(i).getModel() + " ID: "+availablesList.get(i).getVehicleId());
        }
    }

    public void howManyCarsWePosses() {
        System.out.println("We have "+ generalList.size() +" vehicles");
        System.out.println("List of vehicles:");
        for (int i=0; i<generalList.size(); i++){
            System.out.println("Model: "+generalList.get(i).getModel() + " ID: "+generalList.get(i).getVehicleId());
        }


    }

    public void howManyCarsAreRented() {
        System.out.println("Currently there are "+ rentedList.size() +" vehicles rented");
        System.out.println("List of vehicles:");
        for (int i=0; i<rentedList.size(); i++){
            System.out.println("Model: "+rentedList.get(i).getModel() + " ID: "+rentedList.get(i).getVehicleId());
        }
    }

    private Vehicle getCarById (int ID){

        Vehicle selectedVeh = null;

        for (Vehicle vehicle: generalList) {

            if (ID == vehicle.getVehicleId()){
                selectedVeh=vehicle;
            }
        }

        return selectedVeh;

    }

    public void printVehicleInfo(int Id){
        Vehicle vehicleToPrint = getCarById(Id);
        if (vehicleToPrint.getTypeOfVehicle()==TypeOfVehicle.HATCHBACK){
            Hatchback hatchback = (Hatchback) vehicleToPrint;
            System.out.println("Unique Features of the " + hatchback.getModel());
            System.out.println("Power: "+hatchback.getPower());
            System.out.println("Fuel type: "+ hatchback.getFuelType());
            System.out.println("Number of doors: "+ hatchback.getDoorNo());
            String sunroof= hatchback.isSunroof()?"Yes":"No";
            System.out.println("Sunroof: "+ sunroof);
        }
        if (vehicleToPrint.getTypeOfVehicle()==TypeOfVehicle.JEEP){
            Jeep jeep = (Jeep) vehicleToPrint;
            System.out.println("Unique Features of the " + jeep.getModel());
            System.out.println("Power: "+jeep.getPower());
            System.out.println("Fuel type: "+ jeep.getFuelType());
            String offRoad= jeep.isOffRoad()?"Yes":"No";
            System.out.println("Offroad: "+ offRoad);
        }
        if (vehicleToPrint.getTypeOfVehicle()==TypeOfVehicle.MOTORBIKE){
            MotorBike motorBike = (MotorBike) vehicleToPrint;
            System.out.println("Unique Features of the " + motorBike.getModel());
            System.out.println("Power: "+motorBike.getPower());
            System.out.println("Fuel type: "+ motorBike.getFuelType());
            String sideSeat= motorBike.isSideSeat()?"Yes":"No";
            System.out.println("Side seat: "+ sideSeat);
        }
        if (vehicleToPrint.getTypeOfVehicle()==TypeOfVehicle.SEDAN){
            Sedan sedan = (Sedan) vehicleToPrint;
            System.out.println("Unique Features of the " + sedan.getModel());
            System.out.println("Power: "+sedan.getPower());
            System.out.println("Fuel type: "+ sedan.getFuelType());

        }

    }

    public void showHowManyVehiclesByTypeAreAvailabl (TypeOfVehicle type){
        int qttyVehicles = 0;
        for (Vehicle vehicle: generalList
             ) {
            if (vehicle.getTypeOfVehicle()==type){
                qttyVehicles++;
            }


        }
        System.out.println("There are available " + qttyVehicles+" "+type+"(s).");
    }

    public void addToGeneralList(Vehicle vehicle) {
        generalList.add(vehicle);
    }

    public void addToAvailablesList(Vehicle vehicle) {
       availablesList.add(vehicle);
    }

    public void addToRentedList(Vehicle vehicle) {
        rentedList.add(vehicle);
    }


    public List<Vehicle> getGeneralList() {
        return generalList;
    }


    public List<Vehicle> getAvailablesList() {
        return availablesList;
    }


    public List<Vehicle> getRentedList() {
        return rentedList;
    }

    public void setGeneralList(List<Vehicle> generalList) {
        this.generalList = generalList;
    }

    public void setAvailablesList(List<Vehicle> availablesList) {
        this.availablesList = availablesList;
    }

    public void setRentedList(List<Vehicle> rentedList) {
        this.rentedList = rentedList;
    }
}
