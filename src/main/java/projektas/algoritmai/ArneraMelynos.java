package projektas.algoritmai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArneraMelynos implements Algoritmas {
    public boolean patikrink(SpalvotaEilute eilute) {
        // ar nera nei vienos melynos
        return !(Arrays.asList(eilute).contains(1));
        //TODO ar 1 melyna?
    }

    public int sudetingumas() {
        return 5;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> melynosnerat = new ArrayList<SpalvotaEilute>();
        melynosnerat.add(new SpalvotaEilute(2,0));
        melynosnerat.add(new SpalvotaEilute(2,3,3,0));
        melynosnerat.add(new SpalvotaEilute(0,2,3,3,0));
        melynosnerat.add(new SpalvotaEilute(3));
        melynosnerat.add(new SpalvotaEilute(2,3,3,3));
        return melynosnerat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> melynosneran = new ArrayList<SpalvotaEilute>();
        melynosneran.add(new SpalvotaEilute(0,1,1,3));
        melynosneran.add(new SpalvotaEilute(0,3,1,1,1));
        melynosneran.add(new SpalvotaEilute(0,2,2,3,1));
        melynosneran.add(new SpalvotaEilute(1));
        melynosneran.add(new SpalvotaEilute(0,3,2,1));
        return melynosneran;
    }
}
