package com.vcs.projektas;

public class Level3Logic extends levels {

    public boolean treciaFormule() {

        // pradžia ir pabaiga nesutampa
        if (duomenys[0] != (duomenys[duomenys.length-1])) {
            return true;

        }
        return false;

    }

}
