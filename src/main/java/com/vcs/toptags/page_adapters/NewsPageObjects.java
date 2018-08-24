package com.vcs.toptags.page_adapters;

import java.util.ArrayList;
import java.util.List;

public class NewsPageObjects {

    List<INewsPage> newsPageList = new ArrayList<>();

    public List<INewsPage> getNewsPageObjects() {

//        newsPageList.add(new TestNewsPage());

        newsPageList.add(new NewsPageAlfaLt());
        newsPageList.add(new NewsPageDelfiLt());
        newsPageList.add(new NewsPageDienaLt());
        newsPageList.add(new NewsPageVZLt());

        return newsPageList;
    }
}
