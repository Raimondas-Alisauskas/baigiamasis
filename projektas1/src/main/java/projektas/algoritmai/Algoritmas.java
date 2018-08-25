package com.vcs.projektas.algoritmai;

import java.util.List;

public interface Algoritmas {

    public boolean patikrink(SpalvotaEilute eilute);

    public int sudetingumas();

    public List<SpalvotaEilute> getTeisingos();

    public List<SpalvotaEilute> getNeteisingos();
}
