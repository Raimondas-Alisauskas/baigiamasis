package com.vcs.toptags;

import java.util.ArrayList;
import java.util.HashMap;

public class CountWords {
    public HashMap<String, Integer> getCountedWordsArray(ArrayList<String> pureTextList) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < pureTextList.size(); i++) {

            if (map.containsKey(pureTextList.get(i))){
                map.put(pureTextList.get(i), map.get(pureTextList.get(i)) + 1);
            } else {
                map.put(pureTextList.get(i), 1);
            }
        }

        return map;
    }

}
