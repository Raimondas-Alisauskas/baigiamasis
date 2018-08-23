package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabAsimetrijaIrKaimynesNesutampa implements Algoritmas {


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

    public Lygis sudetingumas() {
        return Lygis.LEVEL6;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> asimetrijairkaimynest = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynest.add(new SpalvotaEilute(1,2,0,2));
        asimetrijairkaimynest.add(new SpalvotaEilute(0,3));
        asimetrijairkaimynest.add(new SpalvotaEilute(2,3,1,2,0));
        asimetrijairkaimynest.add(new SpalvotaEilute(1,3,2));
        asimetrijairkaimynest.add(new SpalvotaEilute(0,1,2));
        return asimetrijairkaimynest;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> asimetrijairkaimynesn = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynesn.add(new SpalvotaEilute(2,3,1,1));
        asimetrijairkaimynesn.add(new SpalvotaEilute(2));
        asimetrijairkaimynesn.add(new SpalvotaEilute(3,1,2,3));
        asimetrijairkaimynesn.add(new SpalvotaEilute(0,1,2,2,3));
        asimetrijairkaimynesn.add(new SpalvotaEilute(0,0,0,0));
        return asimetrijairkaimynesn;
    }
}
