package com.vcs.toptags.db;

import com.vcs.toptags.page_adapters.INewsPage;

import java.util.List;

import static com.vcs.toptags.actions.Actions.LAST_TOP_WORDS;


public class WordsDB implements IWordsDB {

    private List<INewsPage> lastTopWords;

    @Override
    public void setWordsDB(List<INewsPage> lastTopWords) {
        synchronized (LAST_TOP_WORDS) {
            this.lastTopWords = lastTopWords;
        }
    }

    @Override
    public List<INewsPage> getWordsDB() {
        synchronized (LAST_TOP_WORDS) {
            return lastTopWords;
        }
    }
}
