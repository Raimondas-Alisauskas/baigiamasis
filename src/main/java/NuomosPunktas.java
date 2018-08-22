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

        administrator.howManyCarsWePosses();

        client1.showAvailableCarsByDate(12,14);

//        client1.rent(1,12,14,client1);
//        client2.rent(2, 19,20,client2);
//        client1.rent(1,17,19,client1);

       // administrator.showWhatIsRented();




    }
}
