import org.junit.Test;
import projektas.algoritmai.Algoritmas;
import projektas.algoritmai.PrIrPabSimetrija;
import projektas.algoritmai.eilute.SpalvotaEilute;

public class AlgoritmaiTest {

    private Algoritmas algoritmuTikrinimas;
    //čia interface

    @Before
    private void init() {
        //čia konkreti klase
        algoritmuTikrinimas = new PrIrPabSimetrija();
        SpalvotaEilute spalvos = new SpalvotaEilute();


    }

    @Test
    public void getArSimetrija() {
        //algoritmuTikrinimas.patikrink(1,3,2,3);

    }

}
