package com.vcs.toptags.page_adapters;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;

import java.util.ArrayList;

public class TestNewsPage implements INewsPage {
    String web;
    String encoding;
    ArrayList<String> activeLinks;

    @Override
    public ArrayList<String> getActiveLinksFromJavaScript(String encoding) {

//        String web = "https://www.delfi.lt/";
//        String activeTag = "headline-image";
//        String hrefTag = "\"";
//
//        Working code:
        // alfa tested: OK
        // delfi tested: OK
        // diena tested: OK
        // vz tested: OK


        web = "https://www.vz.lt/";
        encoding = "windows-1257";
        String activeTag = "\"article\"";
        String hrefTag = "\"";


        // if true: add www.vz.lt to the dynamic link
        boolean addWebPageDomain = false;
//        boolean addWebPageDomain = false;

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
