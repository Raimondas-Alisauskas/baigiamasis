package com.vcs.projektas;

import projektas.algoritmai.Algoritmas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LygioLogika {


    private Map<Integer, List<Algoritmas>> algsByLevel = new HashMap<>();


    // TODO konstruktorius kuriame supildysim sita map'a


    public Algoritmas getAlgoritmasByLevel(int level) {

        List<Algoritmas> algs = algsByLevel.get(level);
        Random rnd = new Random();

        return algs.get(rnd.nextInt(algs.size())); //grazina atsitiktini dydi
    }


// gal switch? Kaip pasikviesti tinkamą lygį?
//    private void level1() {
//        Simetrija logika1 = new Simetrija();
//        logika1.pirmaFormule();
//
//    }
//
//    private void level2() {
//
//        KaimynesRaidesNesutampa logika2 = new KaimynesRaidesNesutampa();
//        logika2.antraFormule();
//
//    }
//
//    private void level3() {
//
//        PrIrPabAsimetrija logika3 = new PrIrPabAsimetrija();
//        logika3.treciaFormule();
//
//    }

    // ....
    // in char type (perhaps)

}
