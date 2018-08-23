package com.vcs.toptags.page_adapters;

public class NewsPageTopWordsWithLink implements INewsPageTopWordsWithLink {
    String web;
    // Filterred Top Words Array
    String[] filteredTopWordsArray;
    // Quantity of the Checked words grabbed from the page
    Integer checkedWordsQty = 0;
    // Quantity of the Unique words grabbed from the page
    Integer uniqueWordsQty = 0;

    public NewsPageTopWordsWithLink() {
    }

    public NewsPageTopWordsWithLink(String web, String[] filteredTopWordsArray, Integer checkedWordsQty, Integer uniqueWordsQty) {
        this.web = web;
        this.filteredTopWordsArray = filteredTopWordsArray;
        this.checkedWordsQty = checkedWordsQty;
        this.uniqueWordsQty = uniqueWordsQty;
    }

    @Override
    public String getWebDomain() {

        return web;
    }

    @Override
    public Integer getCheckedWordsQty() {
        return checkedWordsQty;
    }

    @Override
    public Integer getUniqueWordsQty() {
        return uniqueWordsQty;
    }

    @Override
    public String[] getFilteredTopWordsArray() {
        return filteredTopWordsArray;
    }

}
