package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ar nera nei vienos zalios
 */

public class ArNeraZalios implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isNotUsing(Spalva.GREEN);

    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> zaliosnerat = new ArrayList<SpalvotaEilute>();
        zaliosnerat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW));
        zaliosnerat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.RED, Spalva.BLUE));
        zaliosnerat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW));
        zaliosnerat.add(new SpalvotaEilute(Spalva.RED));
        zaliosnerat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        return zaliosnerat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> zaliosneran = new ArrayList<SpalvotaEilute>();
        zaliosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.YELLOW));
        zaliosneran.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.GREEN, Spalva.GREEN));
        zaliosneran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN));
        zaliosneran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN));
        zaliosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        return zaliosneran;
    }

}
