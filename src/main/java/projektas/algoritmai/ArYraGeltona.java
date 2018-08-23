package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArYraGeltona implements Algoritmas {


    public boolean patikrink(SpalvotaEilute eilute) {
        // yra bent viena geltona
        return Arrays.asList(eilute).contains(0);
        //TODO ar 1 geltona?
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> geltonayrat = new ArrayList<SpalvotaEilute>();
        geltonayrat.add(new SpalvotaEilute(0,3,1,0,1));
        geltonayrat.add(new SpalvotaEilute(2,2,0,0,0));
        geltonayrat.add(new SpalvotaEilute(0,1));
        geltonayrat.add(new SpalvotaEilute(1,3,0));
        geltonayrat.add(new SpalvotaEilute(0));
        return geltonayrat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> geltonayran = new ArrayList<SpalvotaEilute>();
        geltonayran.add(new SpalvotaEilute(1,2));
        geltonayran.add(new SpalvotaEilute(2,2,3));
        geltonayran.add(new SpalvotaEilute(3,2,3,3,1));
        geltonayran.add(new SpalvotaEilute(2));
        geltonayran.add(new SpalvotaEilute(2,3,3,1));
        return geltonayran;
    }


}
