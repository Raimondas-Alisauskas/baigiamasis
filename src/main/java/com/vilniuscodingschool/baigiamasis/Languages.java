package com.vilniuscodingschool.baigiamasis;

import java.util.ArrayList;
import java.util.List;

class Languages {

    // for saving resources additional code lines 10 to 18

    private List<String> langDescription;

    List<String> getLDescription() {

        if (langDescription == null) {
            langDescription = loadLDescription();
        }
        return langDescription;
    }

    private List<String> loadLDescription() {

        List<String> listLanguages = new ArrayList<>();

        listLanguages.add("LT");
        listLanguages.add("EN");
        listLanguages.add("FR");

        return listLanguages;

    }

}
