package projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class KaimynesRaidesNesutampa implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        //salia esancios spalvos nesutampa

        int count = 0;

        for (int i = 0; i < eilute.getEilute().size(); i++) {
            if (eilute.eilute.get(i) != (eilute.eilute.get(i + 1)))
                count++;
        }

        return count == eilute.eilute.size() - 1;
    }

    public int sudetingumas() {
        return 1;
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
