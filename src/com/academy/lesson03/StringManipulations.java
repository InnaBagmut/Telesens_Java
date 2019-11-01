package com.academy.lesson03;

import java.util.Arrays;

import static java.lang.Integer.*;

public class StringManipulations {
    public static void main(String[] args) {
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12", "track_99", "track_11", "track_10"};
        System.out.println(Arrays.toString(tracks));
        System.out.println(extractNumber(tracks[2]));

        String priceRaw1 = "4 418?грн";
        String priceRaw2 = "43 418?грн";
        System.out.println(priceRaw1);
        String replace = priceRaw1.replace(" ", "").replace("?грн", "");
        int price = Integer.parseInt(replace);
        System.out.println(price);
        System.out.println(price == 4418);
    }
    private static int extractNumber(String track) {
        String digits = track.substring(6);
        // Integer result = valueOf(digits);
        //return valueOf(digits);
        return Integer.parseInt(digits); // "01" => 1
    }


}
