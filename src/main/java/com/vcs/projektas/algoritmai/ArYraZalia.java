package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

/**
 * ar yra bent viena zalia
 */

public class ArYraZalia implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {

        return eilute.isUsing(Spalva.GREEN);
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL3;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> zaliaYraT = new ArrayList<SpalvotaEilute>();
        zaliaYraT.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN, Spalva.YELLOW));
        zaliaYraT.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.GREEN, Spalva.GREEN));
        zaliaYraT.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN));
        zaliaYraT.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN));
        zaliaYraT.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.BLUE, Spalva.RED, Spalva.GREEN));
        return zaliaYraT;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> zaliaYraN = new ArrayList<SpalvotaEilute>();
        zaliaYraN.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW));
        zaliaYraN.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.RED, Spalva.BLUE));
        zaliaYraN.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW));
        zaliaYraN.add(new SpalvotaEilute(Spalva.RED));
        zaliaYraN.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.RED, Spalva.RED, Spalva.YELLOW));
        return zaliaYraN;
    }
}
