package rentalOperations;

import vehicles.TypeOfVehicle;
import vehicles.Vehicle;

import java.util.List;

public interface InfoOperationsForClient {
    public void showAvailableCarsByDate(int startDate, int endDate);

    public void showIfTheVehrIsAvailable (TypeOfVehicle type, int startDate, int endDate);

    public List<Vehicle> getListOfBusyVehicles (int startDate, int endDate);



}
