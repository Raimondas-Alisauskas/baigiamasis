package com.vcs.toptags;

import com.vcs.toptags.cleaning_process.FormatWebPageText;
import com.vcs.toptags.counting.CountWords;
import com.vcs.toptags.counting.TopWords;
import com.vcs.toptags.io.*;
import com.vcs.toptags.page_adapters.*;

import java.util.ArrayList;
import java.util.HashMap;


public class CleanAndCalculate {
    int qtyTopWords;
    INewsPage pageClass;

    public CleanAndCalculate(INewsPage pageClass, int qtyTopWords) {
        this.pageClass = pageClass;
        this.qtyTopWords = qtyTopWords;
    }

    public String[] actionsWithNewsWebPages() {


        //Get html of text pages by the plain text
        HtmlFromActiveLinks hfal = new HtmlFromActiveLinks();
        ArrayList<StringBuffer> htmlFromWebArray = hfal.getHTMLArray(pageClass.getActiveLinks(), pageClass.getEncoding());


        // Clean HTML and return filtered words
        FormatWebPageText fwpt = new FormatWebPageText(htmlFromWebArray);
        ArrayList<String> allWordsArray = fwpt.getFormatedWords();


        // Calculate same words
        HashMap<String, Integer> map = calculatedWords(allWordsArray);

        TopWords tw = new TopWords();
        String[] filteredTopWordsArray = tw.getTopWords(map, qtyTopWords);


        return filteredTopWordsArray;
    }

    // Pages Names And Tags From Enum List


        // Words Calculation
        private HashMap<String, Integer> calculatedWords (ArrayList < String > pureTextList) {
            CountWords cw = new CountWords();
            return cw.getCountedWordsArray(pureTextList);
        }
}
