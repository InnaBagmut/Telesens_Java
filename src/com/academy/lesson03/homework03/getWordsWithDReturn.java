package com.academy.lesson03.homework03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class getWordsWithDReturn {
    public static void getWordsStartingWithD() throws IOException {
    System.out.println("=============================================================================");
            System.out.println("The program outputs the number of words that begin with 'd' letter:");
            System.out.println("Enter phrase or random words: ");
    Reader r = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(r);
    String phrase = reader.readLine();
            System.out.println("You entered: " + phrase);
    List<String> separateWords = Arrays.asList(phrase.split(" "));

    List<Integer> dwords = new ArrayList<>();
            for (int i = 0; i < separateWords.size(); i++) {
        if (separateWords.get(i).startsWith("d"))
            dwords.add(i);
        System.out.println(separateWords.get(i));
    }
            System.out.println("Number of words started with d: " + dwords.size());
}
}
