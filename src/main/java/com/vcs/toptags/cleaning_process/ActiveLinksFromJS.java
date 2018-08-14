package com.vcs.toptags.cleaning_process;

import com.vcs.toptags.io.URLReader;

import java.util.ArrayList;

public class ActiveLinksFromJS {

    ArrayList<String> textLinksArray = new ArrayList<>();


    public ArrayList<String> getActiveLinksFromJavaScript(String web, String encoding, String activeTag, boolean addWebPageDomain, String hrefTag ){
        // Get Plain Text from the Web Page
        StringBuffer bufferedWebPage = grabPlainTextFromWeb(web, encoding);

        // Change HTML to the LowerCase: StringBuffer => String => StringBuffer
        bufferedWebPage = convertToLowerCase(bufferedWebPage);

// TODO: delete System.out.println(bufferedWebPage);
        System.out.println(bufferedWebPage);

        // Clean Active Links and move it to ArrayList
        textLinksArray = cleanDynamicTextLinksFromJS(bufferedWebPage, activeTag, web, addWebPageDomain, hrefTag );

        // Returns ArrayList with Web Page Links
        return textLinksArray;
    }


    private StringBuffer grabPlainTextFromWeb(String web, String encoding) {
        URLReader url = new URLReader();

        return url.getPlainText(web, encoding);
    }

    private StringBuffer convertToLowerCase(StringBuffer bufferedWebPage){
        String toLowerCase = bufferedWebPage.toString().toLowerCase();
        return new StringBuffer(toLowerCase.subSequence(0, toLowerCase.length()));
    }

    private ArrayList<String> cleanDynamicTextLinksFromJS(StringBuffer bufferedWebPage, String textDivTag, String web, boolean addWebPageDomain, String hrefTag ) {

        try {
            // Strat of search in String
            int startDiv = 0;
            int startHref, endHref;
            String linkToPage;

               while (startDiv >= 0) {

                startDiv = bufferedWebPage.indexOf(textDivTag, startDiv);
                startHref = bufferedWebPage.indexOf("a href=" + hrefTag, startDiv);
                endHref = bufferedWebPage.indexOf(hrefTag + ">", startHref);

                   // TODO: delete System.out.println(bufferedWebPage);
                   System.out.println("startDiv: " + startDiv + " startHref: " + startHref + " endHref: " + endHref);

                if ((startDiv > 0) && (startDiv < bufferedWebPage.length() && (endHref < bufferedWebPage.length()) && (startHref > 0) && (endHref > 0))){

                    if (addWebPageDomain == true) {
                        linkToPage = web + bufferedWebPage.substring(startHref + 8, endHref);
                        //TODO Delete: System.out.println
                        System.out.println("linkToPage: " + linkToPage);
                    } else {
                        linkToPage = bufferedWebPage.substring(startHref + 8, endHref);
                    }
                    // Add Links to Array
                    textLinksArray.add(linkToPage);
                    startDiv++;
                }
            }

        } catch (StringIndexOutOfBoundsException siobe) {
            System.out.println("You catched: " + siobe.getMessage());
        }

    return textLinksArray;
    }
}
