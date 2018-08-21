package projektas.algoritmai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArNeraGeltonos implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // ar nera nei vienos geltonos
        return !(Arrays.asList(eilute).contains(0));
        //TODO
    }

    public int sudetingumas() {
        return 5;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> geltonosnerat = new ArrayList<SpalvotaEilute>();
        geltonosnerat.add(new SpalvotaEilute(2,1));
        geltonosnerat.add(new SpalvotaEilute(2,3,3,1));
        geltonosnerat.add(new SpalvotaEilute(1,2,3,3,1));
        geltonosnerat.add(new SpalvotaEilute(3));
        geltonosnerat.add(new SpalvotaEilute(2,3,3,3));
        return geltonosnerat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> geltonosneran = new ArrayList<SpalvotaEilute>();
        geltonosneran.add(new SpalvotaEilute(0,1,1,3));
        geltonosneran.add(new SpalvotaEilute(0,0,3,1,1));
        geltonosneran.add(new SpalvotaEilute(2,2,3,0,1));
        geltonosneran.add(new SpalvotaEilute(0));
        geltonosneran.add(new SpalvotaEilute(1,3,0,1));
        return geltonosneran;
    }

}
