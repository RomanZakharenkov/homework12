package com.itacademy.zakharenkov.task1;

import java.util.Map;

/**
 * Created by Рома on 04.08.2018.
 */
public class Task1 {

    private final static String INPUT_FILE_NAME = "Input.txt";
    private final static String OUTPUT_FILE_NAME = "Output.txt";

    public static void main(String[] args) {
        String text = FilesUtils.read(INPUT_FILE_NAME);
        Map<Character, Integer> letters = StringUtils.calculateCountDifferentLetter(text);
        FilesUtils.write(letters, OUTPUT_FILE_NAME);
    }
}
