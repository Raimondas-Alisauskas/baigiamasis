package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ar yra bent viena geltona
 */

public class ArYraGeltona implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isUsing(Spalva.YELLOW);

    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> geltonayrat = new ArrayList<SpalvotaEilute>();
        geltonayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE));
        geltonayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE));
        geltonayrat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.RED, Spalva.YELLOW, Spalva.BLUE));
        geltonayrat.add(new SpalvotaEilute(Spalva.YELLOW));
        geltonayrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.RED, Spalva.YELLOW, Spalva.BLUE));
        return geltonayrat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> geltonayran = new ArrayList<SpalvotaEilute>();
        geltonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE));
        geltonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.BLUE));
        geltonayran.add(new SpalvotaEilute(Spalva.BLUE));
        geltonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        geltonayran.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.BLUE));
        geltonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.BLUE));
        return geltonayran;
    }

}
