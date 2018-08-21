package com.vcs.projektas;

import projektas.algoritmai.Algoritmas;
import projektas.algoritmai.PrIrPabSimetrija;

import java.util.*;

public class LygioLogika {

    //private Map<Integer, List<Algoritmas>> algsByLevel = new HashMap<>();

    private Map<Integer, List<Algoritmas>> algsByLevel;

    public LygioLogika() {
        algsByLevel = new HashMap<Integer, List<Algoritmas>>();

    }

    // TODO konstruktorius kuriame supildysim sita map'a


    public Algoritmas getAlgoritmasByLevel(int level) {

        List<Algoritmas> algs = algsByLevel.get(level);
        Random rnd = new Random();

        return algs.get(rnd.nextInt(algs.size())); //grazina atsitiktini dydi
    }

}
