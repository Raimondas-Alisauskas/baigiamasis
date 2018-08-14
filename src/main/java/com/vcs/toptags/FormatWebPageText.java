package com.vcs.toptags;

import com.vcs.toptags.cleaning_process.CleanTheText;
import com.vcs.toptags.cleaning_process.CleanUselesWords;

import java.util.ArrayList;

public class FormatWebPageText {

    ArrayList<StringBuffer> htmlFromWebArray;

    public FormatWebPageText(ArrayList<StringBuffer> htmlFromWebArray){
        this.htmlFromWebArray = htmlFromWebArray;
    }


    public ArrayList<String> getFormatedWords() {

        return grabAndFormatWordsFromWebPage();
    }


    private ArrayList<String> grabAndFormatWordsFromWebPage() {

        //Get text Array clean from tags and etc.
        CleanTheText ctt = new CleanTheText();
        ArrayList<String> allWordsArray = ctt.getCleanTextArray(htmlFromWebArray);

        //TODO delete System.out.println();
        System.out.println(" Words, before cleanining: " + allWordsArray.size());

        // clean useless words
        allWordsArray = cleanUselessWords(allWordsArray);

        //TODO delete System.out.println();
        System.out.println(" Words, after cleanining: " + allWordsArray.size());

        return allWordsArray;
    }


    private ArrayList<String> cleanUselessWords(ArrayList<String> array){
        CleanUselesWords cuw = new CleanUselesWords();
        return cuw.getClean(array);
    }
}
