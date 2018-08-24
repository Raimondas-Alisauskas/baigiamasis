package projektas.algoritmai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArYraMelyna implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // yra bent viena mėlyna
        return Arrays.asList(eilute).contains(1);
        //TODO ar 1 melyna?
    }

    public int sudetingumas() {
        return 3;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> melynayrat = new ArrayList<SpalvotaEilute>();
        melynayrat.add(new SpalvotaEilute(2,1,1,3));
        melynayrat.add(new SpalvotaEilute(0,3,1,1,1));
        melynayrat.add(new SpalvotaEilute(0,3,2,3,1));
        melynayrat.add(new SpalvotaEilute(1));
        melynayrat.add(new SpalvotaEilute(0,3,2,1));
        return melynayrat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> melynayran = new ArrayList<SpalvotaEilute>();
        melynayran.add(new SpalvotaEilute(2,2));
        melynayran.add(new SpalvotaEilute(3,2,0));
        melynayran.add(new SpalvotaEilute(3,2,3,3,0));
        melynayran.add(new SpalvotaEilute(2));
        melynayran.add(new SpalvotaEilute(0,0,3,2,3,2,3));
        return melynayran;
    }
}
