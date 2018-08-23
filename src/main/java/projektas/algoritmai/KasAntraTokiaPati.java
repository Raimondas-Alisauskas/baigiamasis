package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class KasAntraTokiaPati implements Algoritmas {


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
            public Lygis sudetingumas () {
            return Lygis.LEVEL0;
        }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> kasAntrat = new ArrayList<SpalvotaEilute>();
        kasAntrat.add(new SpalvotaEilute(1,1,1));
        kasAntrat.add(new SpalvotaEilute(2,3,2,3,2));
        kasAntrat.add(new SpalvotaEilute(0,1,0,2));
        kasAntrat.add(new SpalvotaEilute(3));
        kasAntrat.add(new SpalvotaEilute(2,2));

        return kasAntrat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> kasAntran = new ArrayList<SpalvotaEilute>();
        kasAntran.add(new SpalvotaEilute(1,2,3));
        kasAntran.add(new SpalvotaEilute(1,2,2,3));
        kasAntran.add(new SpalvotaEilute(2,2,0));
        kasAntran.add(new SpalvotaEilute(0,1,1,1));
        kasAntran.add(new SpalvotaEilute(0,1,3,1,3));

        return kasAntran;
    }


}
