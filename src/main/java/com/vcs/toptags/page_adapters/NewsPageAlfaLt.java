package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageAlfaLt implements INewsPage {
    String web = "https://www.alfa.lt";;
    String encoding = "utf-8";;
    String activeTag = "article-card";
    String hrefTag = "\"";
    ArrayList<String> activeLinks;

    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

        // encoding=UTF-8
        //<div class=""article-card";">

        // if true: www.alfa.lt to the dynamic link
        boolean addWebPageDomain = true;
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

