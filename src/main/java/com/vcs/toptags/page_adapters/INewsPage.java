package com.vcs.toptags.page_adapters;

import java.util.ArrayList;
import java.util.List;

public interface INewsPage extends INewsPageTopWordsWithLink {

//    public String getWebDomain();

    public String getEncoding();

    public String getActiveTag();

    public String getHrefTag();

    public void setActiveLinks(List<String> activeLinks);

    public List<String> getActiveLinks();

    public boolean isAddWebPageDomain();

//    public Integer getCheckedWordsQty();

    public void setCheckedWordsQty(Integer checkedWordsQty);

//    public Integer getUniqueWordsQty();

    public void setUniqueWordsQty(Integer uniqueWordsQty);

    public void setFilteredTopWordsArray(String[] filteredTopWordsArray);

//    public String[] getFilteredTopWordsArray();
}
