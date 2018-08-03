package com.itacademy.zakharenkov.task1;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Рома on 04.08.2018.
 */
public final class FilesUtils {

    private FilesUtils() {
    }

    public static String read(String fileName) {
        StringBuilder text = new StringBuilder();
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(fileName)))) {
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString().toLowerCase();
    }

    public static void write(Map<Character, Integer> letters, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
                bufferedWriter.append(entry.getKey() + " : " + entry.getValue());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
