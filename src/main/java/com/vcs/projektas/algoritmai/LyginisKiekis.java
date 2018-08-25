package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class LyginisKiekis implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        return eilute.getEilute().size() % 2 == 0;
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL1;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> lyginesteisingos = new ArrayList<SpalvotaEilute>();
        lyginesteisingos.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.GREEN, Spalva.RED));
        lyginesteisingos.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE));
        lyginesteisingos.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.RED, Spalva.YELLOW));
        lyginesteisingos.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.BLUE, Spalva.YELLOW, Spalva.BLUE));
        lyginesteisingos.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.RED, Spalva.BLUE));
        return lyginesteisingos;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> lyginesneteisingos = new ArrayList<SpalvotaEilute>();
        lyginesneteisingos.add(new SpalvotaEilute(Spalva.BLUE));
        lyginesneteisingos.add(new SpalvotaEilute(Spalva.GREEN, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW));
        lyginesneteisingos.add(new SpalvotaEilute(Spalva.BLUE, Spalva.RED, Spalva.RED));
        lyginesneteisingos.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.GREEN));
        lyginesneteisingos.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW));
        return lyginesneteisingos;
    }
}
