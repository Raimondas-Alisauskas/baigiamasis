package com.vcs.projektas;

public class Level2Logic extends levels {

    public boolean antraFormule() {

        int count = 0;

        for (int i = 0; i < duomenys.length - 1; i++) {
            if (!duomenys[i].equals(duomenys[i + 1]))
                count++;
         //   return count;
        }

        if (count == duomenys.length - 1) {
            return true;
        }
        return false;

      //  antraFormule() = ((count == duomenys.length - 1) ? true : false);

        /*
        //šalia esančios spalvos nesutampa
        for (int i = 0; i < duomenys.length - 1 && antraFormule() == true; i++) {
            if (duomenys[i] != duomenys[i + 1]) {
                return true;
            }
            return false;

        }
        */
    }
}
