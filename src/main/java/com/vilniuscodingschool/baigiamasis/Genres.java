package com.vilniuscodingschool.baigiamasis;

import java.util.ArrayList;
import java.util.List;

class Genres {

    // for saving resources additional code lines 10 to 18

    private List<String> genreDescription;

    List<String> getGDescription() {

        if (genreDescription == null) {
            genreDescription = loadDescription();
        }
        return genreDescription;
    }

    private List<String> loadDescription() {

        List<String> genreList = new ArrayList<>();

        genreList.add("Vaikams");
        genreList.add("Dalykinė");
        genreList.add("Dokumentika");
        genreList.add("Receptai");
        genreList.add("Mokomoji");
        genreList.add("Psichologija");
        genreList.add("Kelionės");

        return genreList;

    }

}
