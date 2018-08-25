package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/**
 * ar nera nei vienos melynos
 */

public class ArneraMelynos implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isNotUsing(Spalva.BLUE);

    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL5;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> melynosnerat = new ArrayList<SpalvotaEilute>();
        melynosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.YELLOW));
        melynosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        melynosnerat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        melynosnerat.add(new SpalvotaEilute(Spalva.RED));
        melynosnerat.add(new SpalvotaEilute(Spalva.GREEN, Spalva.RED, Spalva.RED));
        return melynosnerat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> melynosneran = new ArrayList<SpalvotaEilute>();
        melynosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        melynosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.BLUE, Spalva.BLUE, Spalva.BLUE));
        melynosneran.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN));
        melynosneran.add(new SpalvotaEilute(Spalva.BLUE));
        melynosneran.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.BLUE));
        return melynosneran;
    }
}
