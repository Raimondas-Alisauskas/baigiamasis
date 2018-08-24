package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.ArrayList;
import java.util.List;

public class PirmairPriespaskutineNesutampa implements Algoritmas {
    public boolean patikrink(SpalvotaEilute eilute) {
        //eilute > 2 ir pirma ir priespaskutine spalva nesutampa
        return (eilute.getEilute().size() > 2) && !(eilute.getEilute().get(0).equals(eilute.getEilute().get(eilute.getEilute().size() - 2)));
    }

    public Lygis sudetingumas() {
        return Lygis.LEVEL4;
    }

    public List<SpalvotaEilute> getTeisingos() {
        List<SpalvotaEilute> pirmairpriespaskutinenesutampat = new ArrayList<SpalvotaEilute>();
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(2,3,3));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(0,0,1,2));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(2,2,1,1));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(3,1,2,0,2));
        pirmairpriespaskutinenesutampat.add(new SpalvotaEilute(1,1,2,2,3,1));
        return pirmairpriespaskutinenesutampat;
    }

    public List<SpalvotaEilute> getNeteisingos() {
        List<SpalvotaEilute> pirmairpriespaskutinenesutampan = new ArrayList<SpalvotaEilute>();
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(2));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(0,1,2,0,3));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(1,1,1));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(0,2,0,0));
        pirmairpriespaskutinenesutampan.add(new SpalvotaEilute(1,2,3,1,2));
        return pirmairpriespaskutinenesutampan;
    }
}