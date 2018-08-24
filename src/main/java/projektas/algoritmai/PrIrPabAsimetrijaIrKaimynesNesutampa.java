package projektas.algoritmai;

import com.sun.org.apache.regexp.internal.RE;
import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabAsimetrijaIrKaimynesNesutampa implements Algoritmas {
    @Override

    public boolean patikrink(SpalvotaEilute eilute) {
        // pradžia ir pabaiga nesutampa ir salia esancios spalvos nesutampa

        int count = 0;

        for (int i = 0; i < eilute.getEilute().size(); i++) {
            if (eilute.getEilute().get(i) != (eilute.getEilute().get(i + 1)))
                count++;
        }

        return (count == eilute.getEilute().size() - 1) &&
                (eilute.getEilute().get(0) != (eilute.getEilute().get(eilute.getEilute().size() - 1)));


    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL6;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> asimetrijairkaimynest = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynest.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW, Spalva.GREEN));
        asimetrijairkaimynest.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        asimetrijairkaimynest.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW));
        asimetrijairkaimynest.add(new SpalvotaEilute(Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        asimetrijairkaimynest.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.GREEN));
        return asimetrijairkaimynest;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> asimetrijairkaimynesn = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynesn.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.BLUE, Spalva.BLUE));
        asimetrijairkaimynesn.add(new SpalvotaEilute(Spalva.GREEN));
        asimetrijairkaimynesn.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.RED));
        asimetrijairkaimynesn.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        asimetrijairkaimynesn.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.RED, Spalva.RED));
        return asimetrijairkaimynesn;
    }
}
