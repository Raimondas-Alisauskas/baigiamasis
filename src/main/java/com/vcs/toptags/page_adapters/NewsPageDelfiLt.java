package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageDelfiLt implements INewsPage {
    String web = "https://www.delfi.lt/";
    String encoding = "utf-8";
    String activeTag = "headline-image";
    String hrefTag = "\"";
    ArrayList<String> activeLinks;

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        // if true: www.delfi.lt to the dynamic link
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
