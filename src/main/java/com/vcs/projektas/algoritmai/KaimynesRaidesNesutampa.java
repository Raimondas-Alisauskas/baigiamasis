package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/*
salia esancios spalvos nesutampa
*/

public class KaimynesRaidesNesutampa implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        int count = 0;

        for (int i = 0; i < eilute.getEilute().size(); i++) {
            if (eilute.getEilute().get(i) != (eilute.getEilute().get(i + 1))) {
                count++;
            }
        }

        return count == eilute.getEilute().size() - 1;
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL1;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW));
        r.add(new SpalvotaEilute(Spalva.BLUE));
        r.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.YELLOW));
        r.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE));
        r.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.BLUE));
        return r;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> r = new ArrayList<SpalvotaEilute>();
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN));
        r.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.GREEN, Spalva.GREEN));
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW, Spalva.YELLOW));
        r.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN));
        r.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.YELLOW, Spalva.RED, Spalva.RED));
        return r;
    }
}
