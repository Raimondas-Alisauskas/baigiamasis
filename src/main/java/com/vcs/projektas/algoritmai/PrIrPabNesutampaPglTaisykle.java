package com.vcs.projektas.algoritmai;

import com.vcs.projektas.Lygis;
import com.vcs.projektas.algoritmai.eilute.Spalva;
import com.vcs.projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;
/*
 Pradzia ir pabai nesutampa tokiu budu:
3...2; 2...1; 1...0; 0...3;
*/


public class PrIrPabNesutampaPglTaisykle implements Algoritmas {

    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        if (eilute.getEilute().get(0) == (eilute.getEilute().get(eilute.getEilute().size() - 1))) {
            return false;
        } else if ((eilute.getEilute().get(0).equals(Spalva.RED)) && (eilute.getEilute().get(eilute.getEilute().size() - 1)).equals(Spalva.GREEN)) {
            return true;
        } else if ((eilute.getEilute().get(0).equals(Spalva.GREEN)) && (eilute.getEilute().get(eilute.getEilute().size() - 1)).equals(Spalva.BLUE)) {
            return true;
        } else if ((eilute.getEilute().get(0).equals(Spalva.BLUE)) && (eilute.getEilute().get(eilute.getEilute().size() - 1)).equals(Spalva.YELLOW)) {
            return true;
        } else if ((eilute.getEilute().get(0).equals(Spalva.YELLOW)) && (eilute.getEilute().get(eilute.getEilute().size() - 1)).equals(Spalva.RED)) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL9;
    }

    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklet = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.RED, Spalva.RED, Spalva.BLUE, Spalva.GREEN));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.YELLOW, Spalva.BLUE));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.RED, Spalva.GREEN, Spalva.RED, Spalva.GREEN));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.BLUE, Spalva.YELLOW, Spalva.GREEN, Spalva.RED, Spalva.YELLOW));
        nesutampapgltaisyklet.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED));
        return nesutampapgltaisyklet;
    }

    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> nesutampapgltaisyklen = new ArrayList<SpalvotaEilute>();
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.GREEN, Spalva.GREEN));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.RED, Spalva.BLUE, Spalva.GREEN, Spalva.BLUE, Spalva.YELLOW));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.BLUE));
        nesutampapgltaisyklen.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.RED, Spalva.GREEN));
        return nesutampapgltaisyklen;
    }
}
