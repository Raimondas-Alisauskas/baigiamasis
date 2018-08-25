import org.junit.Test;
import com.vcs.projektas.algoritmai.Algoritmas;
import com.vcs.projektas.algoritmai.PrIrPabSimetrija;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

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
