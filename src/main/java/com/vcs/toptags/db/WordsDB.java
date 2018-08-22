package com.vcs.toptags.db;

import com.vcs.toptags.page_adapters.INewsPage;

import java.util.List;


public class WordsDB implements IWordsDB {

    private List<INewsPage> lastTopWords;

    @Override
    public void setWordsDB(List<INewsPage> lastTopWords) {
        this.lastTopWords = lastTopWords;
    }

    @Override
    public List<INewsPage> getWordsDB() {

        return lastTopWords;
    }
}
