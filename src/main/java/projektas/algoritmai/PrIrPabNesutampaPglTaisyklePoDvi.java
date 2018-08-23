package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabNesutampaPglTaisyklePoDvi implements Algoritmas {

    // Pradzia ir pabaiga nesutampa tokiu budu:
    //3...0; 2...1; 1...2; 0...3;

    public boolean patikrink(SpalvotaEilute eilute) {
        if (eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1))) {
            return false;
        } else if ((eilute.getEilute().get(0) == 3) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 0) {
            return true;
        } else if ((eilute.getEilute().get(0) == 2) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 1) {
            return true;
        } else if ((eilute.getEilute().get(0) == 1) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 2) {
            return true;
        } else if ((eilute.getEilute().get(0) == 0) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 3) {
            return true;
        } else {
            return false;
        }
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL9;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklePoDvit = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(3,3,1,0));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(2,0,0,1));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(3,2,3,0));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(1,0,2,3,2));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(0,3));
        return nesutampapgltaisyklePoDvit;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklePoDvin = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(1,2,2,3));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(3,1,2,1,1));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(2,1,1,0));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(1));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(0,3,2));
        return nesutampapgltaisyklePoDvin;
    }
}
