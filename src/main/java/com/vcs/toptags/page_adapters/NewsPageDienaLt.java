package com.vcs.toptags.page_adapters;

import com.vcs.toptags.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageDienaLt implements INewsPage {
    @Override
    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        String web = "http://www.diena.lt/";
        String activeTag = "naujausios_list";
        String hrefTag = "\'";

        // if true: add www.diena.lt to the dynamic link
        //TODO Pakeisti i true
        boolean addWebPageDomain = true;
        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        ArrayList<String> activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag );
        return activeLinks;

    }
}
