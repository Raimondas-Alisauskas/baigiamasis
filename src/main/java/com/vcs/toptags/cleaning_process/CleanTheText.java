package com.vcs.toptags.cleaning_process;

import com.vcs.toptags.SpecialSimbolRemover;

import java.util.ArrayList;

public class CleanTheText {

    private ArrayList<StringBuffer> htmlFromWebArray;

    public ArrayList<String> getCleanTextArray(ArrayList<StringBuffer> htmlFromWebArray){
        this.htmlFromWebArray = htmlFromWebArray;

        // Change HTML Array to the LowerCase: StringBuffer => String => StringBuffer
        htmlFromWebArray = convertToLowerCase(htmlFromWebArray);

        // Method, that replaces TABs in the String HTML to the Spaces to avoid collisions
        htmlFromWebArray = replaceTabsWithSpaces(htmlFromWebArray);

//        //TODO delete System.out.println();
//        for (int i = 0; i < htmlFromWebArray.size(); i++) {
//            System.out.println(htmlFromWebArray.get(i));
//        }
//        System.out.println(" After: Method, that replaces  TABs ");

        // Method, that replaces <style> ... </style> Tags in the String HTML to the Spaces to avoid collisions
        htmlFromWebArray = replaceStyleTagsWithSpaces(htmlFromWebArray);

        // Method, that replaces <script> Tags in the String HTML to the Spaces to avoid collisions
        htmlFromWebArray = replaceScriptTagsWithSpaces(htmlFromWebArray);

        // Method, that replaces All Tags ( from < to >) Tags in the String HTML to the Spaces to avoid collisions
        htmlFromWebArray = replaceAllTagsWithSpaces(htmlFromWebArray);

        // Method, that replaces All special ( starts with "&"  to " ;", till the 7 char long) Tags in the String HTML to the Spaces to avoid collisions
        htmlFromWebArray = replaceSpecialTagsWithSpaces(htmlFromWebArray);

        // grab the text with Regex and move to ArrayList and MERGE them to one
        return grabTextWithRegex(htmlFromWebArray);
    }



    private ArrayList<StringBuffer> convertToLowerCase(ArrayList<StringBuffer> htmlFromWebArray){

        String toLowerCase;

        ArrayList<StringBuffer> stringToStringbufferArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            toLowerCase = htmlFromWebArray.get(i).toString().toLowerCase();
            stringToStringbufferArray.add(new StringBuffer(toLowerCase.subSequence(0, toLowerCase.length())));
        }
        return stringToStringbufferArray;
    }

    private ArrayList<StringBuffer> replaceTabsWithSpaces(ArrayList<StringBuffer> htmlFromWebArray) {

        // remove Tabs
        String withoutTabs;

        ArrayList<StringBuffer> removedTABsArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            withoutTabs = htmlFromWebArray.get(i).toString().toLowerCase().replaceAll("\u0009", " ");
            removedTABsArray.add(new StringBuffer(withoutTabs.subSequence(0, withoutTabs.length())));
        }
        return removedTABsArray;
    }

    private ArrayList<StringBuffer> replaceStyleTagsWithSpaces(ArrayList<StringBuffer> htmlFromWebArray) {
        StyleTagRemover str = new StyleTagRemover();
        ArrayList<StringBuffer> removedStyleTagsArray = new ArrayList<>();

        // remove Style Tags
        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            removedStyleTagsArray.add(str.getCleanText(htmlFromWebArray.get(i)));
        }
        return removedStyleTagsArray;
    }

    private ArrayList<StringBuffer> replaceScriptTagsWithSpaces(ArrayList<StringBuffer> htmlFromWebArray){

        ScriptTagRemover str = new ScriptTagRemover();
        ArrayList<StringBuffer> removedScriptTagsArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            removedScriptTagsArray.add(str.getCleanText(htmlFromWebArray.get(i)));
        }
        return removedScriptTagsArray;
    }

    private ArrayList<StringBuffer> replaceAllTagsWithSpaces(ArrayList<StringBuffer> htmlFromWebArray){

        // remove All Tags from "<"  till ">"
        AllTagRemover atr = new AllTagRemover();
        ArrayList<StringBuffer> removedAllTagsArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            removedAllTagsArray.add(atr.getCleanText(htmlFromWebArray.get(i)));
        }
        return removedAllTagsArray;
    }

    private ArrayList<StringBuffer> replaceSpecialTagsWithSpaces(ArrayList<StringBuffer> htmlFromWebArray){

        // remove All Special Tags ( starts with "&"  to " ;", till the 7 char long)
        SpecialSimbolRemover ssr = new SpecialSimbolRemover();
        ArrayList<StringBuffer> removedSpecialTagsArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            removedSpecialTagsArray.add(ssr.getCleanText(htmlFromWebArray.get(i)));
        }
        return removedSpecialTagsArray;
    }

    private ArrayList<String> grabTextWithRegex(ArrayList<StringBuffer> htmlFromWebArray){

        // grab the text with Regex and move to ArrayList and MERGE them to one
        GrabTextWithRegex gttwr = new GrabTextWithRegex();
        ArrayList<String> cleanTextArray = new ArrayList<>();

        for (int i = 0; i < htmlFromWebArray.size(); i++) {
            cleanTextArray.addAll(gttwr.getThePureText(htmlFromWebArray.get(i)));
        }
        return cleanTextArray;
    }


}
