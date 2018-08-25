package com.vcs.projektas.algoritmai;

import java.util.ArrayList;
import java.util.List;

public class PrIrPabAsimetrijaIrKaimynesNesutampa implements Algoritmas {


    public boolean patikrink(SpalvotaEilute eilute) {
        // pradžia ir pabaiga nesutampa ir salia esancios spalvos nesutampa

        int count = 0;

        for (int i = 0; i < eilute.eilute.size(); i++) {
            if (eilute.eilute.get(i) != (eilute.eilute.get(i + 1)))
                count++;
        }

        return (count == eilute.eilute.size() - 1) &&
                (eilute.eilute.get(0) != (eilute.eilute.get(eilute.eilute.size() - 1)));


    }

    public int sudetingumas() {
        return 6;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> asimetrijairkaimynest = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynest.add(new SpalvotaEilute(1,2,0,2));
        asimetrijairkaimynest.add(new SpalvotaEilute(0,3));
        asimetrijairkaimynest.add(new SpalvotaEilute(2,3,1,2,0));
        asimetrijairkaimynest.add(new SpalvotaEilute(1,3,2));
        asimetrijairkaimynest.add(new SpalvotaEilute(0,1,2));
        return asimetrijairkaimynest;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> asimetrijairkaimynesn = new ArrayList<SpalvotaEilute>();
        asimetrijairkaimynesn.add(new SpalvotaEilute(2,3,1,1));
        asimetrijairkaimynesn.add(new SpalvotaEilute(2));
        asimetrijairkaimynesn.add(new SpalvotaEilute(3,1,2,3));
        asimetrijairkaimynesn.add(new SpalvotaEilute(0,1,2,2,3));
        asimetrijairkaimynesn.add(new SpalvotaEilute(0,0,0,0));
        return asimetrijairkaimynesn;
    }
}
