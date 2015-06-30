package com.firstchar;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by gbroveri on 29/06/15.
 */
public class FirstCharFinder {

    /**
     * Returns the first unique char in <code>stream</code>
     *
     * @param input
     */
    public static char firstChar(Stream input) {
        Map<Character, Integer> cache = new LinkedHashMap<Character, Integer>();
        while (input.hasNext()) {
            Character letter = Character.valueOf(input.getNext());
            Integer count = cache.get(letter);
            if (count == null) {
                count = 0;
            }
            cache.put(letter, count + 1);
        }
        Set<Map.Entry<Character, Integer>> entries = cache.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\u0000';
    }


}
