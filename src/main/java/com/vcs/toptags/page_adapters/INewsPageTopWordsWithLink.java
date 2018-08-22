package com.vcs.toptags.page_adapters;


public interface INewsPageTopWordsWithLink extends INewsPageTopWords {

    public String getWebDomain();

    public String getEncoding();

    public Integer getCheckedWordsQty();

    public Integer getUniqueWordsQty();
}
