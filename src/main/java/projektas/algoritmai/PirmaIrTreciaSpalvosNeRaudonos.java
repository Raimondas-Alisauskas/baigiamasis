package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PirmaIrTreciaSpalvosNeRaudonos implements Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute) {
        //pirma ir trecia spalva negali buti raudona, eilute gali buti bet kokio ilgio
        if (eilute.getEilute().size() <= 1 && eilute.getEilute().get(0) != 2) {
            return true;
        } else if(eilute.getEilute().size() <= 1) {
            return false;
        } else if (eilute.getEilute().get(0) != 2 && eilute.getEilute().get(2) != 2) {
            return true;
        }
        return false;
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL8;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirmittrecneraudonat = new ArrayList<SpalvotaEilute>();
        pirmittrecneraudonat.add(new SpalvotaEilute(1,2,0,2,2));
        pirmittrecneraudonat.add(new SpalvotaEilute(0));
        pirmittrecneraudonat.add(new SpalvotaEilute(3,3,3,3,3));
        pirmittrecneraudonat.add(new SpalvotaEilute(0,2,3,3));
        pirmittrecneraudonat.add(new SpalvotaEilute(1,2));

        return pirmittrecneraudonat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirmittrecneraudonan = new ArrayList<SpalvotaEilute>();
        pirmittrecneraudonan.add(new SpalvotaEilute(1,3,2,0));
        pirmittrecneraudonan.add(new SpalvotaEilute(2,2,2,2));
        pirmittrecneraudonan.add(new SpalvotaEilute(2));
        pirmittrecneraudonan.add(new SpalvotaEilute(0,0,2,1,1,3));
        pirmittrecneraudonan.add(new SpalvotaEilute(2,3));

        return pirmittrecneraudonan;
    }
}
