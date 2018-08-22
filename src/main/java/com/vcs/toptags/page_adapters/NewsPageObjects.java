package com.vcs.toptags.page_adapters;

import java.util.ArrayList;

public class NewsPageObjects {

    ArrayList<INewsPage> newsPageList = new ArrayList<>();

    public ArrayList<INewsPage> getNewsPageObjects(){

//        newsPageList.add(new TestNewsPage());

        newsPageList.add(new NewsPageAlfaLt());
//        newsPageList.add(new NewsPageDelfiLt());
//        newsPageList.add(new NewsPageDienaLt());
//        newsPageList.add(new NewsPageVZLt());

        return newsPageList;
    }
}
