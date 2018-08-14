package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageVZLt implements INewsPage {

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

//        String web = "https://www.delfi.lt/";
//        String activeTag = "headline-image";
//        String hrefTag = "\"";
//
//        Working code:
        String web = "https://www.vz.lt/";
        String activeTag = "article-img";
        String hrefTag = "\"";


        // if true: add www.vz.lt to the dynamic link
        boolean addWebPageDomain = false;
//        boolean addWebPageDomain = false;

        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        ArrayList<String> activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag);
        return activeLinks;

    }
}
// Page codec: <meta http-equiv="content-type" content="text/html; charset=windows-1257"
