package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabNesutampaPglTaisykle implements Algoritmas {
    // Pradzia ir pabai nesutampa tokiu budu:
    //3...2; 2...1; 1...0; 0...3;

    public boolean patikrink(SpalvotaEilute eilute) {
        if (eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1))) {
            return false;
        } else if ((eilute.getEilute().get(0) == 3) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 2) {
            return true;
        } else if ((eilute.getEilute().get(0) == 2) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 1) {
            return true;
        } else if ((eilute.getEilute().get(0) == 1) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 0) {
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
        List<SpalvotaEilute> nesutampapgltaisyklet = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklet.add(new SpalvotaEilute(3,3,1,2));
        nesutampapgltaisyklet.add(new SpalvotaEilute(2,0,0,1));
        nesutampapgltaisyklet.add(new SpalvotaEilute(3,2,3,2));
        nesutampapgltaisyklet.add(new SpalvotaEilute(1,0,2,3,0));
        nesutampapgltaisyklet.add(new SpalvotaEilute(0,3));
        return nesutampapgltaisyklet;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklen = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklen.add(new SpalvotaEilute(1,2,2,2));
        nesutampapgltaisyklen.add(new SpalvotaEilute(3,1,2,1,0));
        nesutampapgltaisyklen.add(new SpalvotaEilute(2,1,1,3));
        nesutampapgltaisyklen.add(new SpalvotaEilute(1));
        nesutampapgltaisyklen.add(new SpalvotaEilute(0,3,2));
        return nesutampapgltaisyklen;
    }
}
