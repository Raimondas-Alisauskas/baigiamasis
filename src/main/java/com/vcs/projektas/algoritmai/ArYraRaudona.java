package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/*
yra bent viena raudona
*/

public class ArYraRaudona implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isUsing(Spalva.RED);
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> raudonayrat = new ArrayList<SpalvotaEilute>();
        raudonayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE, Spalva.GREEN, Spalva.RED));
        raudonayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        raudonayrat.add(new SpalvotaEilute(Spalva.RED));
        raudonayrat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.RED, Spalva.YELLOW));
        raudonayrat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        return raudonayrat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> raudonayran = new ArrayList<SpalvotaEilute>();
        raudonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE));
        raudonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.YELLOW));
        raudonayran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.BLUE));
        raudonayran.add(new SpalvotaEilute(Spalva.GREEN));
        raudonayran.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED));
        return raudonayran;
    }

}
