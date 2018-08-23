package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class KaimynesRaidesNesutampa implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        //salia esancios spalvos nesutampa

        int count = 0;

        for (int i = 0; i < eilute.getEilute().size(); i++) {
            if (eilute.getEilute().get(i) != (eilute.getEilute().get(i+1)))
                count++;
        }

        return count == eilute.getEilute().size() - 1;
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL1;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(1,2,0));
        r.add(new SpalvotaEilute(1));
        r.add(new SpalvotaEilute(0,3,0));
        r.add(new SpalvotaEilute(2,1));
        r.add(new SpalvotaEilute(2,3,1,2,0));
        return r;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(1,1,2,0));
        r.add(new SpalvotaEilute(2,3,1,1));
        r.add(new SpalvotaEilute(0,0,2,2,3,3));
        r.add(new SpalvotaEilute(2,2));
        r.add(new SpalvotaEilute(2,3,0,1,1));
        return r;
    }
}
