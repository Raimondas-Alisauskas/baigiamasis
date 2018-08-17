package com.vcs.toptags.page_adapters;

import java.util.ArrayList;

public interface INewsPage {

 //   ArrayList<String> getActiveLinksFromJavaScript(String encoding);
    public String getWebDomain();
    public String getEncoding();
    public String getActiveTag();
    public String getHrefTag();
    public void setActiveLinks(ArrayList<String> activeLinks);
    public ArrayList<String> getActiveLinks();
    public boolean isAddWebPageDomain();
}
