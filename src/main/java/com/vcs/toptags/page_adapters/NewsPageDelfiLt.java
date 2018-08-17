package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class NewsPageDelfiLt implements INewsPage {
    String web = "https://www.delfi.lt/";
    String encoding = "utf-8";
    String activeTag = "headline-image";
    String hrefTag = "\"";
    ArrayList<String> activeLinks = null;
    // if true: www.delfi.lt to the dynamic link
    boolean addWebPageDomain = true;

    @Override
    public String getWebDomain(){

        return web;
    }

    @Override
    public String getEncoding(){

        return encoding;
    }

    @Override
    public String getActiveTag() {
        return activeTag;
    }

    @Override
    public String getHrefTag() {
        return hrefTag;
    }

    @Override
    public void setActiveLinks(ArrayList<String> activeLinks){

        this.activeLinks = activeLinks;
    }

    @Override
    public ArrayList<String> getActiveLinks(){

        return activeLinks;
    }

    @Override
    public boolean isAddWebPageDomain() {
        return addWebPageDomain;
    }
}