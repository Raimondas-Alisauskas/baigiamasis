package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPage15MinLt implements INewsPage {

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        String web = "https://www.15min.lt/";
        String activeTag = "item-data";
        String hrefTag = "\"";

        // if true: add www.vz.lt to the dynamic link
        boolean addWebPageDomain = true;
        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        ArrayList<String> activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag);
        return activeLinks;

    }
}
// Page codec: <meta http-equiv="content-type" content="text/html; charset=windows-1257"
