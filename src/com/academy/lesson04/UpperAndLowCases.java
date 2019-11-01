package com.academy.lesson04;

public class UpperAndLowCases {
    public static String[] makeUpperAndLowCases(String rawData) {
        //String rawData = new String();
        String[] preparedNames = rawData.split(",");
        for (int i = 0; i < preparedNames.length; i++) {
            //trim spaces:
            preparedNames[i] = preparedNames[i].trim();
            //all symbols are in lowercase
            preparedNames[i] = preparedNames[i].toLowerCase();
            char firstLetter = preparedNames[i].charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            String restLetters = preparedNames[i].substring(1);
            preparedNames[i] = firstLetter + restLetters;
            System.out.println(preparedNames[i]);
        }
        return preparedNames;
    }
}
