package com.vcs.toptags.page_adapters.io;

import java.util.ArrayList;

public class HtmlFromActiveLinks {

    public ArrayList<StringBuffer> getHTMLArray(ArrayList<String> activeLinks, String encoding){
        //TODO delete System.out.println();
//        System.out.println("activeLinks: " + activeLinks.size() + " web:" + web);
        return grabHTMLinkPlainText(activeLinks, encoding);
    }

    private ArrayList<StringBuffer> grabHTMLinkPlainText(ArrayList<String> activeLinks, String encoding){
        ArrayList<StringBuffer> htmlArray = new ArrayList<>();

        URLReader url = new URLReader();

        for (int i = 0; i < activeLinks.size(); i++) {
            htmlArray.add(url.getPlainText(activeLinks.get(i), encoding));
            //TODO delete System.out.println();
/*            System.out.println(web + activeLinks.get(i));
            System.out.println(url.getPlainText(web + activeLinks.get(i)));*/
        }

        return htmlArray;
    }

}
