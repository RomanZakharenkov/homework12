package com.itacademy.zakharenkov.task1;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Рома on 04.08.2018.
 */
public final class StringUtils {

    private final static String SYMBOLS = "[-\",.!? ():;]+";

    private StringUtils() {
    }

    public static Map<Character, Integer> calculateCountDifferentLetter(String text) {
        text = text.replaceAll(SYMBOLS, "");
        Map<Character, Integer> letters = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (letters.containsKey(currentLetter)) {
                letters.put(currentLetter, letters.get(currentLetter) + 1);
            } else {
                letters.put(currentLetter, 1);
            }
        }
        return letters;
    }
}
