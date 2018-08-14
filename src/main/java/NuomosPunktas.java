import vehicles.*;

public class NuomosPunktas {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Hatchback hatchback = new Hatchback();
        garage.addToAvailablesList(hatchback);
        garage.addToGeneralList(hatchback);
        garage.howManyCarsAreAvailable();
        garage.rentVehicle(112);
        garage.acceptReturnedCar(112);
        garage.printVehicleInfo(112);
        garage.showHowManyVehiclesByTypeAreAvailabl(TypeOfVehicle.HATCHBACK);



    }
}
