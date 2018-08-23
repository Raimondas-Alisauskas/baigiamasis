import com.vcs.bogdan.Beans.*;
import com.vcs.bogdan.Service.CalcService;
import com.vcs.bogdan.Service.TimeListService;
import org.junit.Before;
import org.junit.Test;

import static com.vcs.bogdan.Beans.Enums.CalcType.HOUR;
import static com.vcs.bogdan.Beans.Enums.WorkEvent.START;
import static junit.framework.Assert.assertEquals;

public class CalcServiceTest {

    private CalcService service;

    @Before
    public void init() {
        service = new CalcService();
    }

    @Test(expected = RuntimeException.class)
    public void getIncomeTaxText() {
        Contract contract = new Contract("114", 20180415, START, HOUR, 8, 21.15, true);
        Period period = new Period("201802", 18, 140, 420, 4, .25, 1.5,
                2, 380, 0.5, 400, 3,
                3, 3, 6, 27.98, 0.2, 2, 2, 0.8);
        TimeListService timeListService = new TimeListService();

//        service.getIncome(contract, timeListService.getAll(),period);
    }

    @Test
    public void getIncomeWage() {
    }

    @Test
    public void getIncomeTax() {
        service.getIncomeTax(new Period(), new Contract(), 0.0);
    }

    @Test
    public void getSocialInsuranceDeductionFromEmployee() {
    }

    @Test
    public void getHealthInsuranceDeductionFromEmployee() {
    }

    @Test
    public void getGuaranteeFundDeductionSum() {
        service.getGuaranteeFundDeductionSum(100, 100);
    }
}
