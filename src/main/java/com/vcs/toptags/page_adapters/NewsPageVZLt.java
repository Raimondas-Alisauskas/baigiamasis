package com.vcs.toptags.page_adapters;

import java.util.ArrayList;

public class NewsPageVZLt implements INewsPage {
    String web = "https://www.vz.lt/";
    String encoding = "windows-1257";
    String activeTag = "\"article\"";
    String hrefTag = "\"";
    // Internal Page links taked from Dynamic JavaScript Array
    ArrayList<String> activeLinks;
    // Filterred Top Words Array
    String[] filteredTopWordsArray;
    // if true: add www.vz.lt to the dynamic link
    boolean addWebPageDomain = false;
    // Quantity of the Checked words grabbed from the page
    Integer checkedWordsQty = 0;
    // Quantity of the Unique words grabbed from the page
    Integer uniqueWordsQty = 0;

    @Override
    public String getWebDomain() {

        return web;
    }

    @Override
    public String getEncoding() {

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
    public void setActiveLinks(ArrayList<String> activeLinks) {

        this.activeLinks = activeLinks;
    }

    @Override
    public ArrayList<String> getActiveLinks() {

        return activeLinks;
    }

    @Override
    public boolean isAddWebPageDomain() {
        return addWebPageDomain;
    }

    @Override
    public String[] getFilteredTopWordsArray() {
        return filteredTopWordsArray;
    }

    @Override
    public void setFilteredTopWordsArray(String[] filteredTopWordsArray) {
        this.filteredTopWordsArray = filteredTopWordsArray;
    }

    @Override
    public Integer getCheckedWordsQty() {
        return checkedWordsQty;
    }

    @Override
    public void setCheckedWordsQty(Integer checkedWordsQty) {
        this.checkedWordsQty = checkedWordsQty;
    }

    @Override
    public Integer getUniqueWordsQty() {
        return uniqueWordsQty;
    }

    @Override
    public void setUniqueWordsQty(Integer uniqueWordsQty) {
        this.uniqueWordsQty = uniqueWordsQty;
    }
}