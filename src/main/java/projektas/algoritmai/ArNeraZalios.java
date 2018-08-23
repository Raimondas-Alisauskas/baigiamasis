package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArNeraZalios implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // ar nera nei vienos zalios
        return !(Arrays.asList(eilute).contains(3));
        //TODO
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> zaliosnerat = new ArrayList<SpalvotaEilute>();
        zaliosnerat.add(new SpalvotaEilute(2,1));
        zaliosnerat.add(new SpalvotaEilute(2,0,1,1));
        zaliosnerat.add(new SpalvotaEilute(1,2,1));
        zaliosnerat.add(new SpalvotaEilute(2));
        zaliosnerat.add(new SpalvotaEilute(2,0,0,0,0,0));
        return zaliosnerat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> zaliosneran = new ArrayList<SpalvotaEilute>();
        zaliosneran.add(new SpalvotaEilute(0,2,2,3));
        zaliosneran.add(new SpalvotaEilute(0,2,3,1,1));
        zaliosneran.add(new SpalvotaEilute(2,2,3,0,1));
        zaliosneran.add(new SpalvotaEilute(3,3,3));
        zaliosneran.add(new SpalvotaEilute(1,3,0,2));
        return zaliosneran;
    }

}
