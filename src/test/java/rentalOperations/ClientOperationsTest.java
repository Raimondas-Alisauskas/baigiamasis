package rentalOperations;

import com.vcs.operators.KeepsVehicles;
import com.vcs.rentalOperations.ClientOperations;
import com.vcs.rentalOperations.InfoOperationsForClient;
import com.vcs.vehicles.TypesOfVehicle;
import com.vcs.vehicles.Vehicle;
import com.vcs.vehicles.VehicleCreator;
import com.vcs.vehicles.VehicleCreatorInt;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;

public class ClientOperationsTest {

    private ClientOperations cOps;
    private InfoOperationsForClient service;
    private KeepsVehicles vehicles;
    private VehicleCreator creator;

    @Before
    public void init() {
        creator = mock(VehicleCreator.class);

        cOps = mock(ClientOperations.class);


    }

    @Test
    public void parseSucess() throws RuntimeException {

        cOps.showAvailableCarsByDate(1, 365);

    }

//    @Test(expected = RuntimeException.class)
//    public void parseFails() throws RuntimeException{
//        cOps.showAvailableCarsByDate(100, 33);
//
//
//    }
}
