package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/*
pradžia ir pabaiga nesutampa
*/

public class PrIrPabAsimetrija implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {


        return eilute.getEilute().get(0) != (eilute.getEilute().get(eilute.getEilute().size() - 1));
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL2;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> asimetrijageri = new ArrayList<SpalvotaEilute>();
        asimetrijageri.add(new SpalvotaEilute(Spalva.BLUE, Spalva.RED, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW));
        asimetrijageri.add(new SpalvotaEilute(Spalva.GREEN));
        asimetrijageri.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.GREEN));
        asimetrijageri.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.GREEN));
        asimetrijageri.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.RED));
        return asimetrijageri;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> asimetrijablogi = new ArrayList<SpalvotaEilute>();
        asimetrijablogi.add(new SpalvotaEilute(Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        asimetrijablogi.add(new SpalvotaEilute(Spalva.RED, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.RED));
        asimetrijablogi.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.YELLOW));
        asimetrijablogi.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        asimetrijablogi.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW, Spalva.RED));
        return asimetrijablogi;
    }
}