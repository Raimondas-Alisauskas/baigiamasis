package com.vcs.toptags.cleaning_process;

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

    public void actionsWithNewsWebPages() {


        //Get html of text pages by the plain text
        HtmlFromActiveLinks hfal = new HtmlFromActiveLinks();
        ArrayList<StringBuffer> htmlFromWebArray = hfal.getHTMLArray(pageClass.getActiveLinks(), pageClass.getEncoding());


        // Clean HTML and return filtered words
        FormatWebPageText fwpt = new FormatWebPageText(htmlFromWebArray);
        ArrayList<String> allWordsArray = fwpt.getFormatedWords();

        // Adding Unique words quantity to the Object parameter
        pageClass.setCheckedWordsQty(allWordsArray.size());

        // Calculate same words
        HashMap<String, Integer> map = calculatedWords(allWordsArray);

        // Adding Unique words quantity to the Object parameter
        pageClass.setUniqueWordsQty(map.size());

        TopWords tw = new TopWords();
        pageClass.setFilteredTopWordsArray(tw.getTopWords(map, qtyTopWords));

    }

    // Pages Names And Tags From Enum List


        // Words Calculation
        private HashMap<String, Integer> calculatedWords (ArrayList < String > pureTextList) {
            CountWords cw = new CountWords();
            return cw.getCountedWordsArray(pureTextList);
        }
}
