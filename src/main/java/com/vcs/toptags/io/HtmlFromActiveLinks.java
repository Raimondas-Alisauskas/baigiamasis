package com.vcs.toptags.io;

import java.util.ArrayList;

public class HtmlFromActiveLinks {

    public ArrayList<StringBuffer> getHTMLArray(ArrayList<String> activeLinks, String encoding) {

         return grabHTMLinkPlainText(activeLinks, encoding);
    }

    private ArrayList<StringBuffer> grabHTMLinkPlainText(ArrayList<String> activeLinks, String encoding) {
        ArrayList<StringBuffer> htmlArray = new ArrayList<>();

        URLReader url = new URLReader();

        for (int i = 0; i < activeLinks.size(); i++) {
            htmlArray.add(url.getPlainText(activeLinks.get(i), encoding));

        }

        return htmlArray;
    }

}
