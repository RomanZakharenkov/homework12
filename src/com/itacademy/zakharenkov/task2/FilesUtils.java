package com.itacademy.zakharenkov.task2;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Рома on 04.08.2018.
 */
public final class FilesUtils {

    private FilesUtils() {
    }

    public static List<Integer> read(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileName)))) {
            while (scanner.hasNext()) {
                numbers.add(Integer.parseInt(scanner.next()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static void write(List<Integer> numbers, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : numbers) {
                bufferedWriter.write(String.valueOf(number));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
