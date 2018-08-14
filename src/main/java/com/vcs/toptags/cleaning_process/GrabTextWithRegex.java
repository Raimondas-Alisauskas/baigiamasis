package com.vcs.toptags.cleaning_process;;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrabTextWithRegex {
    public ArrayList<String> getThePureText(StringBuffer buffer) {
        return cleanText(buffer);
    }


    private ArrayList<String>  cleanText(StringBuffer buffer){

        ArrayList<String> pureTextList = new ArrayList();

        //https://docs.oracle.com/javase/1.5.0/docs/api/java/util/regex/Pattern.html
        Pattern pattern = Pattern.compile("([\\p{L}&&[^\\p{Lu}]]{3,}+)", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = pattern.matcher(buffer.toString());

        while (m.find()) {
            pureTextList.add(m.group());
        }
        return pureTextList;
    }

}
