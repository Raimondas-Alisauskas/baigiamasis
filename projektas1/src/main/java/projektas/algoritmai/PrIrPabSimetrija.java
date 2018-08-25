package com.vcs.projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabSimetrija implements Algoritmas {


    public boolean patikrink(SpalvotaEilute eilute) {
        // pirma spalva lygi paskutinei
        return eilute.eilute.get(0)==(eilute.eilute.get(eilute.eilute.size() - 1));
    }

    public int sudetingumas() {
        return 0;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(1,0,3,2,1));
        r.add(new SpalvotaEilute(1,2,1));
        r.add(new SpalvotaEilute(2));
        r.add(new SpalvotaEilute(0,1,2,2,0));
        r.add(new SpalvotaEilute(1,1,1,1));

        return r;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> n = new ArrayList<SpalvotaEilute>();
        n.add(new SpalvotaEilute(1,2));
        n.add(new SpalvotaEilute(1,2,1,3));
        n.add(new SpalvotaEilute(0));
        n.add(new SpalvotaEilute(0,1,1,1));
        n.add(new SpalvotaEilute(0,1,3,1));

        return n;
    }

}
