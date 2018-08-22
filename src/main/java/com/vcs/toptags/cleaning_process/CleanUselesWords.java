package com.vcs.toptags.cleaning_process;

;

import com.vcs.toptags.io.OpenUselesWordFile;

import java.util.ArrayList;

public class CleanUselesWords {

    public ArrayList<String> getClean(ArrayList<String> inArray) {

        return cleanText(inArray);
    }

    private ArrayList<String> cleanText(ArrayList<String> inArray) {
        OpenUselesWordFile ouwf = new OpenUselesWordFile();
        ArrayList<String> uselessWords = ouwf.getUselesWordsList();

        for (int i = 0; i < uselessWords.size(); i++) {
            for (int j = (inArray.size() - 1); j >= 0; j--) {

                if (uselessWords.get(i).equals(inArray.get(j))) {
                    inArray.remove(j);
                }
            }
        }
        return inArray;
    }
}