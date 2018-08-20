package projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabNesutampaPglTaisykle implements Algoritmas {
    // Pradzia ir pabai nesutampa tokiu budu:
    //3...2; 2...1; 1...0; 0...3;

    public boolean patikrink(SpalvotaEilute eilute) {
        if (eilute.eilute.get(0) == (eilute.eilute.get(eilute.eilute.size() - 1))) {
            return false;
        } else if ((eilute.eilute.get(0) == 3) && (eilute.eilute.get(eilute.eilute.size() - 1)) == 2) {
            return true;
        } else if ((eilute.eilute.get(0) == 2) && (eilute.eilute.get(eilute.eilute.size() - 1)) == 1) {
            return true;
        } else if ((eilute.eilute.get(0) == 1) && (eilute.eilute.get(eilute.eilute.size() - 1)) == 0) {
            return true;
        } else if ((eilute.eilute.get(0) == 0) && (eilute.eilute.get(eilute.eilute.size() - 1)) == 3) {
            return true;
        } else {
            return false;
        }
    }

    public int sudetingumas() {
        return 9;
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
