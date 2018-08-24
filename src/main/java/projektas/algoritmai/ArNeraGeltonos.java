package projektas.algoritmai;

import com.vcs.projektas.Lygis;

import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ar nera nei vienos geltonos
 */
public class ArNeraGeltonos implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        return eilute.isNotUsing(Spalva.YELLOW);
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> geltonosnerat = new ArrayList<SpalvotaEilute>();
        geltonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE));
        geltonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.BLUE));
        geltonosnerat.add(new SpalvotaEilute(Spalva.BLUE));
        geltonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        geltonosnerat.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.BLUE));
        geltonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.BLUE));
        return geltonosnerat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> geltonosneran = new ArrayList<SpalvotaEilute>();
        geltonosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE));
        geltonosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE));
        geltonosneran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.RED, Spalva.YELLOW, Spalva.BLUE));
        geltonosneran.add(new SpalvotaEilute(Spalva.YELLOW));
        geltonosneran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.RED, Spalva.YELLOW, Spalva.BLUE));
        return geltonosneran;
    }

}

