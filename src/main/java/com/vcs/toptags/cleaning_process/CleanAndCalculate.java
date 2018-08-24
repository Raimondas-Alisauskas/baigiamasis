package com.vcs.toptags.cleaning_process;

import com.vcs.toptags.counting.CountWords;
import com.vcs.toptags.counting.TopWords;
import com.vcs.toptags.io.*;
import com.vcs.toptags.page_adapters.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        List<StringBuffer> htmlFromWebArray = hfal.getHTMLArray(pageClass.getActiveLinks(), pageClass.getEncoding());


        // Clean HTML and return filtered words
        FormatWebPageText fwpt = new FormatWebPageText(htmlFromWebArray);
        List<String> allWordsArray = fwpt.getFormatedWords();

        // Adding Unique words quantity to the Object parameter
        pageClass.setCheckedWordsQty(allWordsArray.size());

        // Calculate same words
        Map<String, Integer> map = calculatedWords(allWordsArray);

        // Adding Unique words quantity to the Object parameter
        pageClass.setUniqueWordsQty(map.size());

        TopWords tw = new TopWords();
        pageClass.setFilteredTopWordsArray(tw.getTopWords(map, qtyTopWords));

    }

    // Pages Names And Tags From Enum List


    // Words Calculation
    private Map<String, Integer> calculatedWords(List<String> pureTextList) {
        CountWords cw = new CountWords();
        return cw.getCountedWordsArray(pureTextList);
    }
}
