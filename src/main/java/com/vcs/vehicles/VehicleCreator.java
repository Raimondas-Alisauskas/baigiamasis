package vehicles;

import operators.RentalShop;
import org.springframework.stereotype.Service;

@Service
public class VehicleCreator implements Vc {



    @Override
    public void addCars(){
        RentalShop rentalShop=new RentalShop();
        for(int i=0; i<4; i++){

        RentalShop.generalList.add(new Hatchback());
        RentalShop.generalList.add(new Jeep());
        RentalShop.generalList.add(new Sedan());
        RentalShop.generalList.add(new MotorBike());
    }}
}
