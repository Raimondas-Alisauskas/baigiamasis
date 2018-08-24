package projektas.algoritmai;

import com.sun.org.apache.regexp.internal.RE;
import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PirmaArbaAntraSpalvaSutampaSuPaskutine implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        //eilute ilgesne nei 2
        return eilute.getEilute().size() >= 2 &&
                (eilute.getEilute().get(0).equals(eilute.getEilute().get(eilute.getEilute().size() - 1)) ||
                        (eilute.getEilute().get(0).equals(eilute.getEilute().get(eilute.getEilute().size() - 2))));
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL7;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirasutampasupaskt = new ArrayList<SpalvotaEilute>();
        pirasutampasupaskt.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.GREEN));
        pirasutampasupaskt.add(new SpalvotaEilute(Spalva.RED, Spalva.RED,Spalva.BLUE, Spalva.GREEN, Spalva.RED));
        pirasutampasupaskt.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE));
        pirasutampasupaskt.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        pirasutampasupaskt.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN));

        return pirasutampasupaskt;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirasutampasupaskn = new ArrayList<SpalvotaEilute>();
        pirasutampasupaskn.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.RED));
        pirasutampasupaskn.add(new SpalvotaEilute(Spalva.YELLOW));
        pirasutampasupaskn.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.RED, Spalva.BLUE));
        pirasutampasupaskn.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.BLUE));
        pirasutampasupaskn.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN));

        return pirasutampasupaskn;
    }
}
