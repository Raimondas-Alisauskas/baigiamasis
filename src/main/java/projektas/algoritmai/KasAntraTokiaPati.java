package projektas.algoritmai;

import com.sun.org.apache.regexp.internal.RE;
import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class KasAntraTokiaPati implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        // kas antra tokia pati nuo pirmo

        if (eilute.getEilute().size() > 1) {
            for (int i = 2; i < eilute.getEilute().size(); i = i + 2) {
                if (eilute.getEilute().get(i).equals(eilute.getEilute().get(0))) {
                }
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL0;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> kasAntrat = new ArrayList<SpalvotaEilute>();
        kasAntrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        kasAntrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.GREEN, Spalva.BLUE));
        kasAntrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN));
        kasAntrat.add(new SpalvotaEilute(Spalva.GREEN));
        kasAntrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE));

        return kasAntrat;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> kasAntran = new ArrayList<SpalvotaEilute>();
        kasAntran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN));
        kasAntran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        kasAntran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.YELLOW));
        kasAntran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.YELLOW));
        kasAntran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.BLUE, Spalva.RED));

        return kasAntran;
    }


}
