package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageVZLt implements INewsPage {
    String web = "https://www.vz.lt/";
    String encoding = "windows-1257";
    String activeTag = "\"article\"";
    String hrefTag = "\"";
    ArrayList<String> activeLinks;

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        // if true: add www.vz.lt to the dynamic link
        boolean addWebPageDomain = false;


        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        this.activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag);
        return activeLinks;

    }

    @Override
    public String getWebDomain(){

        return web;
    }

    @Override
    public String getEncoding(){

        return encoding;
    }

    @Override
    public ArrayList<String> getActiveLinks(){

        return activeLinks;
    }
}
// Page codec: <meta http-equiv="content-type" content="text/html; charset=windows-1257"
