package com.vcs.toptags;

import com.vcs.toptags.io.*;
import com.vcs.toptags.page_adapters.*;

import java.util.ArrayList;


public class Actions {


    public void actionsWithNewsWebPages() {

        int qtyTopWords = 5;

        // alfa.lt:
        //Get Active (JavaScript) links of pages with text
        INewsPage np_alfa = new NewsPageAlfaLt();
        CleanAndCalculate cac_alfa = new CleanAndCalculate(np_alfa, qtyTopWords);

        // ArrayList<String> can be getted by method:  .getActiveLinks()
        grabJSLinksFromWebPage(np_alfa, np_alfa.getEncoding());

        String[] filteredTopWordsArray = cac_alfa.actionsWithNewsWebPages();

        //TODO Delete it "String web = np.getWebDomain();"
        String web;
        web = np_alfa.getWebDomain();

        // Print Top Words
        printIt(filteredTopWordsArray, web);
    }

//    // Pages Names And Tags From Enum List
//    private ArrayList pagesFromEnum() {
//        ArrayList<EnumNewsPages> actList = new ArrayList<>();
//
//        for ( EnumNewsPages newsPage  : EnumNewsPages.values()){
//
//            actList.add(newsPage);
//        }
//        return actList;
//    }


        // get active links from thePage Java Script Dynamic links
        private ArrayList<String> grabJSLinksFromWebPage(INewsPage pageClass, String encoding){

            ArrayList<String> activeLinks = pageClass.getActiveLinksFromJavaScript(encoding);
            return activeLinks;
        }


        private void printIt (String[]filteredTopWordsArray, String web){
            // Print Top Words
            PrintAll pl = new PrintAll();
            pl.printTopWords(filteredTopWordsArray, web);

        }

}
