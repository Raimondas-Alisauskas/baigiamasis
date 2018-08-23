package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

public class ArNeraRaudonos implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // ar nera nei vienos raudonos
        return !(Arrays.asList(eilute).contains(2));
        //TODO
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> raudonosnerat = new ArrayList<SpalvotaEilute>();
        raudonosnerat.add(new SpalvotaEilute(2,1));
        raudonosnerat.add(new SpalvotaEilute(2,3,3,1));
        raudonosnerat.add(new SpalvotaEilute(1,2,3,3,1));
        raudonosnerat.add(new SpalvotaEilute(2));
        raudonosnerat.add(new SpalvotaEilute(2,3,3,3));
        return raudonosnerat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> raudonosneran = new ArrayList<SpalvotaEilute>();
        raudonosneran.add(new SpalvotaEilute(0,2,2,3));
        raudonosneran.add(new SpalvotaEilute(0,2,3,1,1));
        raudonosneran.add(new SpalvotaEilute(2,2,3,0,1));
        raudonosneran.add(new SpalvotaEilute(2,2));
        raudonosneran.add(new SpalvotaEilute(1,3,0,2));
        return raudonosneran;
    }
}
