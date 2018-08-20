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
    public String[] getFilteredTopWordsArray();
    public void setFilteredTopWordsArray(String[] filteredTopWordsArray);
    public Integer getCheckedWordsQty();
    public void setCheckedWordsQty(Integer checkedWordsQty);
    public Integer getUniqueWordsQty();
    public void setUniqueWordsQty(Integer uniqueWordsQty);
   }
