package projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabAsimetrija implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        // pradžia ir pabaiga nesutampa

        return eilute.getEilute().get(0) != (eilute.getEilute().get(eilute.getEilute().size() - 1));
    }

    public int sudetingumas() {
        return 2;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> asimetrijageri = new ArrayList<SpalvotaEilute>();
        asimetrijageri.add(new SpalvotaEilute(1,3,2,1,0));
        asimetrijageri.add(new SpalvotaEilute(2));
        asimetrijageri.add(new SpalvotaEilute(0,3,1,2,2));
        asimetrijageri.add(new SpalvotaEilute(1,2,1,1,2));
        asimetrijageri.add(new SpalvotaEilute(0,0,3));
        return asimetrijageri;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> asimetrijablogi = new ArrayList<SpalvotaEilute>();
        asimetrijablogi.add(new SpalvotaEilute(1,3,2,1,0));
        asimetrijablogi.add(new SpalvotaEilute(2));
        asimetrijablogi.add(new SpalvotaEilute(0,3,1,2,2));
        asimetrijablogi.add(new SpalvotaEilute(1,2,1,1,2));
        asimetrijablogi.add(new SpalvotaEilute(0,0,3));
        return asimetrijablogi;
    }
}