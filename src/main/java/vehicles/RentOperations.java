package vehicles;

public abstract class RentOperations {

    public void rentVehicle(int ID) {


        Vehicle vehicleToRent= selectVehicle(ID);
        int vehicleID = vehicleToRent.getVehicleId();
        Garage.availablesList.remove(vehicleToRent);
        Garage.rentedList.add(vehicleToRent);
    }

    public void acceptReturnedCar(int ID) {
        Vehicle returnedFromRent= selectVehicle(ID);
        int vehicleID = returnedFromRent.getVehicleId();
        Garage.rentedList.remove(returnedFromRent);
        Garage.availablesList.add(returnedFromRent);
    }

    public Vehicle selectVehicle(int ID) {

        for (Vehicle vehicle : Garage.availablesList) {

            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }

        for (Vehicle vehicle : Garage.rentedList) {

            if (vehicle.getVehicleId() == ID) {
                return vehicle;
            }
        }

        return null;
    }


}

/*
* car id
* search by id or other property
* show vehicle info
* select vahicle?
* */

