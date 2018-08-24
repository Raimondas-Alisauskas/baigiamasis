package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * ar yra bent viena melyna
 */

public class ArYraMelyna implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isUsing(Spalva.BLUE);

    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> melynayrat = new ArrayList<SpalvotaEilute>();
        melynayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        melynayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        melynayrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN));
        melynayrat.add(new SpalvotaEilute(Spalva.BLUE));
        melynayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.BLUE));
        return melynayrat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> melynayran = new ArrayList<SpalvotaEilute>();
        melynayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.YELLOW));
        melynayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        melynayran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        melynayran.add(new SpalvotaEilute(Spalva.RED));
        melynayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED));
        return melynayran;
    }
}
