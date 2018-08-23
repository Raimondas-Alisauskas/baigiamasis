package projektas.algoritmai;

import com.vcs.projektas.Lygis;
import projektas.algoritmai.eilute.SpalvotaEilute;

import java.util.List;


public interface Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute);

    public Lygis sudetingumas();

    public List<SpalvotaEilute> getTeisingos();

    public List<SpalvotaEilute> getNeteisingos();
}
