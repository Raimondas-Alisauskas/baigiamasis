package com.vcs.toptags.page_adapters;

import java.util.ArrayList;

public interface INewsPage {

    ArrayList<String> getActiveLinksFromJavaScript(String encoding);
    public String getWebDomain();
    public String getEncoding();
    public ArrayList<String> getActiveLinks();
}
