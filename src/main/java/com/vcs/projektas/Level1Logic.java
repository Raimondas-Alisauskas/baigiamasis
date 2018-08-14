package com.vcs.projektas;

public class Level1Logic extends levels {

    public boolean pirmaFormule() {

        // pirma spalva lygi paskutinei
        if (duomenys[0].equals(duomenys[duomenys.length-1])) {
            return true;

        }
        return false;

    }
}
