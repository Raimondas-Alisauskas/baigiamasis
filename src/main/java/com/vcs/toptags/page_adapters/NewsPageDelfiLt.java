package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageDelfiLt implements INewsPage {

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        String web = "https://www.delfi.lt/";
        String activeTag = "headline-image";
        String hrefTag = "\"";

        // encoding=UTF-8
        //<div class="item-data"><h4 class="vl-title"><a href="/verslas/naujiena/bendroves/g-sp

        // if true: add www.vz.lt to the dynamic link
        boolean addWebPageDomain = false;
        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        ArrayList<String> activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag);
        return activeLinks;

    }
}
// Page codec: <meta http-equiv="content-type" content="text/html; charset=windows-1257"
