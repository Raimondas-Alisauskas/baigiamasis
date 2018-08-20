package projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class PirmaArbaAntraSpalvaSutampaSuPaskutine implements Algoritmas {
    public boolean patikrink(SpalvotaEilute eilute) {
        //eilute ilgesne nei 2
        return eilute.eilute.size() >= 2 &&
                (eilute.eilute.get(0).equals(eilute.eilute.get(eilute.eilute.size() - 1)) ||
                        (eilute.eilute.get(0).equals(eilute.eilute.get(eilute.eilute.size() - 2))));
    }

    public int sudetingumas() {
        return 7;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirasutampasupaskt = new ArrayList<SpalvotaEilute>();
        pirasutampasupaskt.add(new SpalvotaEilute(2,1,2));
        pirasutampasupaskt.add(new SpalvotaEilute(3,3,1,2,3));
        pirasutampasupaskt.add(new SpalvotaEilute(0,1,1));
        pirasutampasupaskt.add(new SpalvotaEilute(3,3,1,1,3));
        pirasutampasupaskt.add(new SpalvotaEilute(2,3,0,0,2));

        return pirasutampasupaskt;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirasutampasupaskn = new ArrayList<SpalvotaEilute>();
        pirasutampasupaskn.add(new SpalvotaEilute(2,1,2,2,3));
        pirasutampasupaskn.add(new SpalvotaEilute(0));
        pirasutampasupaskn.add(new SpalvotaEilute(2,2,3,1));
        pirasutampasupaskn.add(new SpalvotaEilute(3,2,1));
        pirasutampasupaskn.add(new SpalvotaEilute(0,0,0,2));

        return pirasutampasupaskn;
    }
}
