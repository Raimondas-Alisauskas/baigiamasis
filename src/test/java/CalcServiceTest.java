import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Service.CalcService;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.vcs.bogdan.Beans.Enums.CalcType.HOUR;
import static com.vcs.bogdan.Beans.Enums.EvenType.START;
import static junit.framework.Assert.assertEquals;

public class CalcServiceTest {

    private CalcService service;

    @Before
    public void init(){
//        service = new CalcServiceImpl(); pas mane ne implementuota klase
        service = new CalcService();
    }

    @Test(expected = RuntimeException.class)
    public void getIncomeWageTest(){
        Employee employee = new Employee("114", 20180415, START, HOUR, 8, 21.15, true, 4, 15, 0);

        Period period = new Period(null,new Tax(),new Insurance());
        service.getIncomeWage(employee, new ArrayList<TimeList>(),new Period());
    }

    @Test
    public void getIncomeTaxText(){
        service.getIncomeTax(0.0,new Employee(),new Tax());


      //  assertEquals(1,2);
    }
}
