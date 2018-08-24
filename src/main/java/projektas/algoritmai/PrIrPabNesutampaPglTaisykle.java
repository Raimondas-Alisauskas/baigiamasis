package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabNesutampaPglTaisykle implements Algoritmas {
    // Pradzia ir pabai nesutampa tokiu budu:
    //3...2; 2...1; 1...0; 0...3;
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
       /* if (eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1))) {
            return false;
        } else if ((eilute.getEilute().get(0) == 3) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 2) {
            return true;
        } else if ((eilute.getEilute().get(0) == 2) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 1) {
            return true;
        } else if ((eilute.getEilute().get(0) == 1) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 0) {
            return true;
        } else if ((eilute.getEilute().get(0) == 0) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 3) {
            return true;
        } else {*/
        return false;

    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL9;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklet = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.BLUE, Spalva.GREEN));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.YELLOW, Spalva.BLUE));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.RED, Spalva.GREEN));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.YELLOW));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        return nesutampapgltaisyklet;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklen = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.GREEN));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.BLUE));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.GREEN));
        return nesutampapgltaisyklen;
    }
}
