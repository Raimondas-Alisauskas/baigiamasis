package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArYraZalia implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // yra bent viena zalia
        return Arrays.asList(eilute).contains(3);
        //TODO ar 1 zalia?
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> raudonayrat = new ArrayList<SpalvotaEilute>();
        raudonayrat.add(new SpalvotaEilute(0,3,2,2,1));
        raudonayrat.add(new SpalvotaEilute(3,2,1,0));
        raudonayrat.add(new SpalvotaEilute(2,3));
        raudonayrat.add(new SpalvotaEilute(3));
        raudonayrat.add(new SpalvotaEilute(3,3,1));
        return raudonayrat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> raudonayran = new ArrayList<SpalvotaEilute>();
        raudonayran.add(new SpalvotaEilute(1,0));
        raudonayran.add(new SpalvotaEilute(1,1,1));
        raudonayran.add(new SpalvotaEilute(2,2,0,0));
        raudonayran.add(new SpalvotaEilute(0));
        raudonayran.add(new SpalvotaEilute(0,1));
        return raudonayran;
    }
}
