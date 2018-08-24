package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.Spalva;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PirmaIrTreciaSpalvosNeRaudonos implements Algoritmas {
    @Override
    public boolean patikrink(SpalvotaEilute eilute) {
        //pirma ir trecia spalva negali buti raudona, eilute gali buti bet kokio ilgio
      /*  if (eilute.getEilute().size() <= 1 && eilute.getEilute().get(0) != 2) {
            return true;
        } else if(eilute.getEilute().size() <= 1) {
            return false;
        } else if (eilute.getEilute().get(0) != 2 && eilute.getEilute().get(2) != 2) {
            return true;
        }*/
        return false;
    }
    @Override
    public Lygis sudetingumas() {
        return Lygis.LEVEL8;
    }
    @Override
    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirmittrecneraudonat = new ArrayList<SpalvotaEilute>();
        pirmittrecneraudonat.add(new SpalvotaEilute(Spalva.BLUE, Spalva.GREEN, Spalva.YELLOW, Spalva.GREEN, Spalva.GREEN));
        pirmittrecneraudonat.add(new SpalvotaEilute(Spalva.YELLOW));
        pirmittrecneraudonat.add(new SpalvotaEilute(Spalva.RED,Spalva.RED,Spalva.RED,Spalva.RED,Spalva.RED));
        pirmittrecneraudonat.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.GREEN,Spalva.RED,Spalva.RED));
        pirmittrecneraudonat.add(new SpalvotaEilute(Spalva.BLUE,Spalva.RED));

        return pirmittrecneraudonat;
    }
    @Override
    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirmittrecneraudonan = new ArrayList<SpalvotaEilute>();
        pirmittrecneraudonan.add(new SpalvotaEilute(Spalva.BLUE,Spalva.RED,Spalva.GREEN,Spalva.YELLOW));
        pirmittrecneraudonan.add(new SpalvotaEilute(Spalva.GREEN, Spalva.GREEN, Spalva.GREEN, Spalva.GREEN));
        pirmittrecneraudonan.add(new SpalvotaEilute(Spalva.GREEN));
        pirmittrecneraudonan.add(new SpalvotaEilute(Spalva.YELLOW, Spalva.YELLOW, Spalva.GREEN, Spalva.BLUE, Spalva.BLUE, Spalva.RED));
        pirmittrecneraudonan.add(new SpalvotaEilute(Spalva.GREEN,Spalva.RED));

        return pirmittrecneraudonan;
    }
}
