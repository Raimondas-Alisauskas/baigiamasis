package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

/**
 * ar nera nei vienos raudonos
 */

public class ArNeraRaudonos implements Algoritmas {


    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isNotUsing(Spalva.RED);
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> raudonosnerat = new ArrayList<SpalvotaEilute>();
        raudonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE));
        raudonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.YELLOW));
        raudonosnerat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE));
        raudonosnerat.add(new SpalvotaEilute(Spalva.GREEN));
        raudonosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED));
        return raudonosnerat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> raudonosneran = new ArrayList<SpalvotaEilute>();
        raudonosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE, Spalva.GREEN, Spalva.RED));
        raudonosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        raudonosneran.add(new SpalvotaEilute(Spalva.RED));
        raudonosneran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.RED, Spalva.YELLOW));
        raudonosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        return raudonosneran;
    }
}
