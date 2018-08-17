package com.vcs.toptags.page_adapters.io;

public class PrintAll {
    public void printTopWords(String[] arrayTopWords, String web) {
        System.out.println("\n" + "TOP " + web + " WORDS: ");

        for (int i = 0; i < arrayTopWords.length; i++) {
            System.out.println((i + 1) + ". " + arrayTopWords[i]);
        }
    }
}
