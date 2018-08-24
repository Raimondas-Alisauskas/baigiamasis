import com.vcs.hplc.AverageCalculator;
import com.vcs.hplc.AvgData;
import com.vcs.hplc.RawData;

import org.junit.Assert;
import org.junit.Test;


public class CalculatorTest {

    private AverageCalculator calculator;


    @Test
    public void testCalculator (){

        //Assert.assertArrayEquals();

        RawData rd1= new RawData();
        
        RawData rd2= new RawData();
        
        RawData rd3= new RawData();
        
        RawData [] rds = new RawData[3];
        rds[0] = rd1;
        rds[1] = rd2;
        rds[3] = rd3;

        AvgData result = calculator.calculateAverage( rds ); //reikia masyvu
        
        //TODO asserts
        result.getArea();
        result.getRetentionTime();
        
//
//        calculator.calculateIdentity(); //reikia feikinio metodo?
//
//        calculator.calculateAssay();

//fdgcvcvh
    }

}


//