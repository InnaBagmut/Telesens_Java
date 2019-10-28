package com.academy.lesson03;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        String[] all = {"Andry", "Abdel", "Nataly", "Alyona", "Nataly", "Alyona", "Andry", "Abdel"};
        String[] group1 = new String[4];
        String[] group2 = new String[4];
        //Output:
        System.out.println(java.util.Arrays.toString(group1));
        System.out.println(java.util.Arrays.toString(all));
        group1 = java.util.Arrays.copyOf(all, 5);
        group2 = java.util.Arrays.copyOfRange(all, 5, 8);
        System.out.println(group1 == group2);
        java.util.Arrays.sort(group1);
        System.out.println("Group1 and Group2 are equal - " + java.util.Arrays.equals(group1, group2));


    }

    public static void print(String[] all, String[] group1, String[] group2) {
        System.out.println( java.util.Arrays.toString(all));
        System.out.println( java.util.Arrays.toString(group1));
        System.out.println( java.util.Arrays.toString(group2));
    }

    public static void checkGroups(String[] group1, String[] group2) {
        java.util.Arrays.sort(group1);
        java.util.Arrays.sort(group2);

        System.out.println(group1 == group2); // так не работает
        System.out.println("Group1 and Group2 are equal - " + Arrays.equals(group1, group2));
    }
}
