package com.vcs.toptags;

import com.vcs.toptags.io.PrintAll;
import com.vcs.toptags.page_adapters.NewsPageVZLt;

import java.util.ArrayList;
import java.util.HashMap;


public class Actions {
    String pageAdapterClass;
    public Actions(String pageAdapterClass) {
        this.pageAdapterClass = pageAdapterClass;
    }
    public Actions() {
    }

    public void actionsWithNewsWebPages() {

        int qtyTopWords = 30;

//        EnumNewsPages newsPage = EnumNewsPages.DIENA_LT;
//        String web = newsPage.getWebLink();
//        String activeTag = newsPage.getWebTag();

        //Links to Class by Web Page Enum
        ArrayList<EnumNewsPages> actList = pagesFromEnum();
        String encoding = "windows-1257";
        // www.diena.lt
//        Actions act1 = new Actions();
//        String web = actList.get(0).getWebLink();
//        String activeTag = actList.get(0).getWebTag();
        //        EnumNewsPages newsPage = EnumNewsPages.values().length;

        // www.vz.lt

        String pageAdapterClass = actList.get(1).getAdapterClass();
        Actions act1 = new Actions(pageAdapterClass);
        //TODO Delete it
        String web ="webPageName";

//
//        String web = newsPage.getWebLink();
//        String activeTag = newsPage.getWebTag();
//
//        return


//        EnumNewsPages[] sss = new EnumNewsPages.values();
//        return sss[1];
//        Arrays.toString(sss);


        // Get HTML String Array

        //Get Active (JavaScript) links of pages with text
        //NewsPageDienaLt mpdl = new NewsPageDienaLt();
        NewsPageVZLt mpdl = new NewsPageVZLt();

        ArrayList<String> activeLinks = act1.grabJSLinksFromWebPage(mpdl, encoding);

        // TODO perkelti i atskira klase

        //Get html of text pages by the plain text
        HtmlFromActiveLinks hfal = new HtmlFromActiveLinks();
        ArrayList<StringBuffer> htmlFromWebArray = hfal.getHTMLArray(activeLinks, encoding);


        // Clean HTML and return filtered words
        FormatWebPageText fwpt = new FormatWebPageText(htmlFromWebArray);
        ArrayList<String> allWordsArray = fwpt.getFormatedWords();


        // Calculate same words
        HashMap<String, Integer> map = calculatedWords(allWordsArray);

        TopWords tw = new TopWords();
        String[] filteredTopWordsArray = tw.getTopWords(map, qtyTopWords);

        act1.printIt(filteredTopWordsArray, web);

    }

    // Pages Names And Tags From Enum List
    private ArrayList pagesFromEnum() {
        ArrayList<EnumNewsPages> actList = new ArrayList<>();

        for ( EnumNewsPages newsPage  : EnumNewsPages.values()){

            actList.add(newsPage);
        }
        return actList;
    }

        // get active links from thePage Java Script Dynamic links

        // WWW.Diena.Lt
        private ArrayList<String> grabJSLinksFromWebPage(NewsPageVZLt mpdl, String encoding){

            ArrayList<String> activeLinks = mpdl.getActiveLinksFromJavaScript(encoding);
            return activeLinks;
        }


        // Words Calculation
        private HashMap<String, Integer> calculatedWords (ArrayList < String > pureTextList) {
            CountWords cw = new CountWords();
            return cw.getCountedWordsArray(pureTextList);
        }

        private void printIt (String[]filteredTopWordsArray, String web){
            // Print Top Words
            PrintAll pl = new PrintAll();
            pl.printTopWords(filteredTopWordsArray, web);

        }

}
