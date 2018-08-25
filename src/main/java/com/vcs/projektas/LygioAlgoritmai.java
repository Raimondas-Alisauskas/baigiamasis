package com.vcs.projektas;

import com.vcs.projektas.algoritmai.*;

import java.util.*;

public class LygioAlgoritmai {

    private Map<Lygis, List<Algoritmas>> algsByLevel;

    private List<Algoritmas> visiLygiai;

    public LygioAlgoritmai(Lygis levelsCount) {

        visiLygiai = getVisiLygiai();
        algsByLevel = new HashMap<>();

        sarasuLygiamsSukurimas();
        lygioUzpidymasAlgoritmais();
    }

    private void sarasuLygiamsSukurimas() {
        for (int i = 0; i < Lygis.values().length; i++) {
            algsByLevel.put(Lygis.values()[i], new ArrayList<>());
        }
    }

    private void lygioUzpidymasAlgoritmais() {
        for (int i = 0; i < Lygis.values().length; i++) {
            Algoritmas al = rastiPirmaPagalLygi(visiLygiai, Lygis.values()[i]);

            while (al != null) {
                algsByLevel.get(Lygis.values()[i]).add(al);

                al = rastiPirmaPagalLygi(visiLygiai, Lygis.values()[i]);
            }
        }

    }

    private Algoritmas rastiPirmaPagalLygi(List<Algoritmas> visiLygiai, Lygis value) {

        for (Algoritmas alg : visiLygiai) {
            if (value.equals(alg.sudetingumas())) {
                visiLygiai.remove(alg);
                return alg;
            }
        }

        return null;
    }

    private List<Algoritmas> getVisiLygiai() {
        List<Algoritmas> result = new ArrayList<>();

        result.add(new PrIrPabSimetrija());
        result.add(new KasAntraTokiaPati());
        result.add(new KaimynesRaidesNesutampa());
        result.add(new LyginisKiekis());
        result.add(new PrIrPabAsimetrija());
        result.add(new ArYraMelyna());
        result.add(new ArYraGeltona());
        result.add(new ArYraRaudona());
        result.add(new ArYraZalia());
        result.add(new PirmairPriespaskutineNesutampa());
        result.add(new ArneraMelynos());
        result.add(new ArNeraGeltonos());
        result.add(new ArNeraRaudonos());
        result.add(new ArNeraZalios());
        result.add(new PrIrPabAsimetrijaIrKaimynesNesutampa());
        result.add(new PirmaArbaAntraSpalvaSutampaSuPaskutine());
        result.add(new PirmaIrTreciaSpalvosNeRaudonos());
        result.add(new PrIrPabNesutampaPglTaisykle());
        result.add(new PrIrPabNesutampaPglTaisyklePoDvi());

        return result;

    }

    public Algoritmas atsitiktinioAlgoritmoGavimas(Lygis level) {

        List<Algoritmas> algs = algsByLevel.get(level);
        Random rnd = new Random();

        return algs.get(rnd.nextInt(algs.size())); //grazina atsitiktini dydi
    }

}
