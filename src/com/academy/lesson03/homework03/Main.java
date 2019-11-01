package com.academy.lesson03.homework03;


import java.io.IOException;
import java.util.List;

public class Main {
        public static void main(String[] args) throws IOException {
           // FindWordsStartWithD.getWordsStartingWithD();
            List<String> dwords = GetWordsWithDReturn.getWordsStartingWithD();
            System.out.println(dwords);

        }
    }

