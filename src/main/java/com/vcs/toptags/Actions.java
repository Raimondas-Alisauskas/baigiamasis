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

        //Delfi.lt
        INewsPage np_delfi = new NewsPageDelfiLt();
        CleanAndCalculate cac_delfi = new CleanAndCalculate(np_delfi, qtyTopWords);
        grabJSLinksFromWebPage(np_delfi, np_delfi.getEncoding());

        //Diena.lt
        INewsPage np_diena = new NewsPageDienaLt();
        CleanAndCalculate cac_diena = new CleanAndCalculate(np_diena, qtyTopWords);
        grabJSLinksFromWebPage(np_diena, np_diena.getEncoding());

        //vz.lt
        INewsPage np_vz = new NewsPageVZLt();
        CleanAndCalculate cac_vz = new CleanAndCalculate(np_vz, qtyTopWords);
        grabJSLinksFromWebPage(np_vz, np_vz.getEncoding());

            // TODO DELETE PrintIt
        printIt(cac_alfa.actionsWithNewsWebPages(), np_alfa.getWebDomain());
        System.out.println("\n");
        printIt(cac_delfi.actionsWithNewsWebPages(), np_delfi.getWebDomain());
        System.out.println("\n");
        printIt(cac_diena.actionsWithNewsWebPages(), np_diena.getWebDomain());
        System.out.println("\n");
        printIt(cac_vz.actionsWithNewsWebPages(), np_vz.getWebDomain());


//        String[] filteredTopWordsArray = cac_alfa.actionsWithNewsWebPages();

//        //TODO Delete it "String web = np.getWebDomain();"
//        String web = np_alfa.getWebDomain();
//
//        // Print Top Words
//        printIt(filteredTopWordsArray, web);
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
