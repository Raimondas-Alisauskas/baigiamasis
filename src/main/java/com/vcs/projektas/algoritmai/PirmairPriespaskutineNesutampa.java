package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/*
eilute > 2 ir pirma ir priespaskutine spalva nesutampa
*/

public class PirmairPriespaskutineNesutampa implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return (eilute.getEilute().size() > 2) && !(eilute.getEilute().get(0).equals(eilute.getEilute().get(eilute.getEilute().size() - 2)));
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL4;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirmairpriespaskutinenesutampat = new ArrayList<SpalvotaEilute>();
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE, Spalva.GREEN));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW, Spalva.GREEN));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.RED, Spalva.BLUE));
        return pirmairpriespaskutinenesutampat;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirmairpriespaskutinenesutampan = new ArrayList<SpalvotaEilute>();
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(Spalva.GREEN));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW, Spalva.RED));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.YELLOW, Spalva.YELLOW));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.RED, Spalva.BLUE, Spalva.GREEN));
        return pirmairpriespaskutinenesutampan;
    }
}
