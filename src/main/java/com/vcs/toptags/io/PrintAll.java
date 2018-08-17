package com.vcs.toptags.page_adapters.io;

import com.vcs.toptags.page_adapters.INewsPage;

public class PrintAll {
    public void printTopWords(INewsPage newsPage) {
        System.out.println("\n" + "TOP " + newsPage.getWebDomain() + " WORDS: ");

        for (int i = 0; i < newsPage.getFilteredTopWordsArray().length; i++) {
            System.out.println((i + 1) + ". " + newsPage.getFilteredTopWordsArray()[i]);
        }
    }
}
