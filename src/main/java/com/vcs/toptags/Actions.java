package com.vcs.toptags;

import com.vcs.toptags.cleaning_process.ActiveLinksFromJS;
import com.vcs.toptags.cleaning_process.CleanAndCalculate;
import com.vcs.toptags.io.*;
import com.vcs.toptags.page_adapters.*;

import java.util.ArrayList;


public class Actions {


    public void actionsWithNewsWebPages() {

        int qtyTopWords = 20;

        ArrayList<INewsPage> newsPageList = generateNewsPageObjects();

        //Get Active (JavaScript) links of pages with text
        for (int i = 0; i < newsPageList.size(); i++) {

            // get active links from the Page Java Script Dynamic links and Set it To Page Object
            setJSLinksFromWebPageToObject(newsPageList.get(i));

            // filteredTopWordsArray [] moved to the Object value
            new CleanAndCalculate(newsPageList.get(i), qtyTopWords).actionsWithNewsWebPages();

        }

            // TODO DELETE PrintIt
        for (int i = 0; i < newsPageList.size(); i++) {

            printIt(newsPageList.get(i));
        }

    }

        // Get News Pages Object Array
        private ArrayList<INewsPage> generateNewsPageObjects(){
            NewsPageObjects npo = new NewsPageObjects();

            return npo.getNewsPageObjects();
        }

        // get active links from thePage Java Script Dynamic links nad Set it To Page Object
        private void setJSLinksFromWebPageToObject(INewsPage newsPage){

            newsPage.setActiveLinks(new ActiveLinksFromJS().getActiveLinksFromJavaScript(newsPage));
        }


        private void printIt (INewsPage newsPage){
            // Print Top Words
            new PrintAll().printTopWords(newsPage);

        }
}