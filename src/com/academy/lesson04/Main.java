package com.academy.lesson04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String rawData = "petrov,Ivanov ,KiRill, Helen ";
        String[] preparedNames = UpperAndLowCases.makeUpperAndLowCases(rawData);
        System.out.println(Arrays.toString(preparedNames));
        // => [Petrov, Ivanov, Kirill, Helen]
        //System.out.println(Arrays.toString(preparedNames));
    }
}
