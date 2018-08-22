package com.vcs.toptags.db;

import com.vcs.toptags.page_adapters.INewsPage;

import java.util.List;

public interface IWordsDB {
    public void setWordsDB(List<INewsPage> lastTopWords);
    public List<INewsPage> getWordsDB();
}
