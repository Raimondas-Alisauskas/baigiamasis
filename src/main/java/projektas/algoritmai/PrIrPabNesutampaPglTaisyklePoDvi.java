package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabNesutampaPglTaisyklePoDvi implements Algoritmas {

    // Pradzia ir pabaiga nesutampa tokiu budu:
    //3...0; 2...1; 1...2; 0...3;
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        /*if (eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1))) {
            return false;
        } else if ((eilute.getEilute().get(0) == 3) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 0) {
            return true;
        } else if ((eilute.getEilute().get(0) == 2) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 1) {
            return true;
        } else if ((eilute.getEilute().get(0) == 1) && (eilute.getEilute().get(eilute.getEilute().size() - 1)) == 2) {
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
        List<SpalvotaEilute> nesutampapgltaisyklePoDvit = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.BLUE, Spalva.YELLOW));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(Spalva.GREEN, Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.RED, Spalva.YELLOW));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.GREEN));
        nesutampapgltaisyklePoDvit.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        return nesutampapgltaisyklePoDvit;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklePoDvin = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.YELLOW));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(Spalva.BLUE));
        nesutampapgltaisyklePoDvin.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.GREEN));
        return nesutampapgltaisyklePoDvin;
    }
}
