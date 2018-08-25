package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/**
 * pirma spalva lygi paskutinei
 */

public class PrIrPabSimetrija implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1));
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL0;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.RED, Spalva.GREEN, Spalva.BLUE));
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.BLUE));
        r.add(new SpalvotaEilute(Spalva.GREEN));
        r.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.YELLOW));
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));

        return r;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> n = new ArrayList<SpalvotaEilute>();
        n.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN));
        n.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.RED));
        n.add(new SpalvotaEilute(Spalva.YELLOW));
        n.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        n.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.BLUE));

        return n;
    }

}
