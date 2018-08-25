package rentalOperations;


import com.vcs.operators.KeepsVehicles;
import com.vcs.rentalOperations.ClientOperations;

import com.vcs.vehicles.Vehicle;
import com.vcs.vehicles.VehicleCreator;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;


public class ClientOperationsTest {
    private KeepsVehicles garage;
    private VehicleCreator creator;
    private ClientOperations cOps;
    private Vehicle vehicle;

//    @Before
//    public void init() {
//
//        cOps = new ClientOperations();
//
//
//    }
//
//    @Test
//    public void parseSucess() {
//
//        List<Vehicle> vehicles = cOps.showAvailableCarsByDate(1, 365);
//
//    }
//
//    @Test(expected = RuntimeException.class)
//    public void parseFails() {
//        cOps.showAvailableCarsByDate(100, 33);
//
//    }
}
