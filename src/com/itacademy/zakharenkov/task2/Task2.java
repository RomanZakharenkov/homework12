package com.itacademy.zakharenkov.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Рома on 04.08.2018.
 */
public class Task2 {

    private final static String FILE_NAME = "Numbers.txt";
    private final static int UPPER_BOUND = 100;

    public static void main(String[] args) {
        FilesUtils.write(generateRandomNumbers(), FILE_NAME);
        List<Integer> numbers = FilesUtils.read(FILE_NAME);
        Collections.sort(numbers);
        FilesUtils.write(numbers, FILE_NAME);
    }

    private static List<Integer> generateRandomNumbers(){
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(UPPER_BOUND));
        }
        return numbers;
    }
}
