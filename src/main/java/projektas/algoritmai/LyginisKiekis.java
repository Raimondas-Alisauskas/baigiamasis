package projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class LyginisKiekis implements Algoritmas {
    public boolean patikrink(SpalvotaEilute eilute) {
        return eilute.eilute.size() % 2 == 0;
    }

    public int sudetingumas() {
        return 1;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> lyginesteisingos = new ArrayList<SpalvotaEilute>();
        lyginesteisingos.add(new SpalvotaEilute(2,3,2,3));
        lyginesteisingos.add(new SpalvotaEilute(3,1));
        lyginesteisingos.add(new SpalvotaEilute(0,0,3,0));
        lyginesteisingos.add(new SpalvotaEilute(3,1,2,4,3,2));
        lyginesteisingos.add(new SpalvotaEilute(3,1,2,3));
        return lyginesteisingos;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> lyginesneteisingos = new ArrayList<SpalvotaEilute>();
        lyginesneteisingos.add(new SpalvotaEilute(2));
        lyginesneteisingos.add(new SpalvotaEilute(3,1,0,2,3));
        lyginesneteisingos.add(new SpalvotaEilute(3,1,2,1,2));
        lyginesneteisingos.add(new SpalvotaEilute(2,2,2));
        lyginesneteisingos.add(new SpalvotaEilute(0,0,1,2,1));
        return lyginesneteisingos;
    }
}
