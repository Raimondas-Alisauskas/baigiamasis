package com.vcs.toptags.counting;

import java.util.HashMap;
import java.util.Map;

public class TopWords {

    public String[] getTopWords(HashMap<String, Integer> map, int qtyTopWords) {

        return calculateTop(map, qtyTopWords);
    }


    private String[] calculateTop(HashMap<String, Integer> map, int qtyTopWords) {
        String[] array = new String[qtyTopWords];

        // searching for the highest number of word Repeats - topRepeats
        int topRepeats = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (topRepeats < entry.getValue()) {
                topRepeats = entry.getValue();
            }
        }

        // number of TOP Words
        int count = 0;
        for (int i = topRepeats; i > 0; i--) {

            for (Map.Entry<String, Integer> entry : map.entrySet()) {

                if (i == entry.getValue()) {

                    array[count] = entry.getKey();

                    // counting TOP words Qty.
                    count++;
                    if (count == qtyTopWords) {
                        break;
                    }
                }
            }
            if (count == qtyTopWords) {
                break;
            }
        }
        return array;
    }
}
