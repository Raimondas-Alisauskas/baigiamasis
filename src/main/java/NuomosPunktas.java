import operators.Administrator;
import operators.Client;
import operators.RentalShop;
import vehicles.Hatchback;

public class NuomosPunktas {

    public static void main(String[] args) {

        RentalShop garage = new RentalShop();
        Hatchback hatchback= new Hatchback();
        Hatchback ht = new Hatchback();

//        RentalShop.generalList.add(hatchback);
        Client client1 = new Client(true, true);
        Client client2 = new Client(true, true);

        Administrator administrator = new Administrator();

        garage.howManyCarsWePosses();

        client1.showAvailableCarsByDate(12,14);




    }
}
