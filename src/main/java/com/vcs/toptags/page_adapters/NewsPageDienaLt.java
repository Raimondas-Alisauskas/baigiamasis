package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageDienaLt implements INewsPage {

    String web = "http://www.diena.lt/";
    String encoding = "utf-8";
    String activeTag = "naujausios_list";
    String hrefTag = "\'";
    ArrayList<String> activeLinks;

    @Override
    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {



        // if true: add www.diena.lt to the dynamic link
        boolean addWebPageDomain = true;
        ActiveLinksFromJS cal = new ActiveLinksFromJS();
        this.activeLinks = cal.getActiveLinksFromJavaScript(web, encoding, activeTag, addWebPageDomain, hrefTag );
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
