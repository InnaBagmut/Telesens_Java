package com.academy.lesson03;

import java.util.Arrays;

import static java.lang.Integer.*;

public class StringManipulations {
    public static void main(String[] args) {
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12", "track_99", "track_10", "track_12"};
        System.out.println(Arrays.toString(tracks));
        System.out.println(extractNumber(tracks[2]));
    }

    public static int extractNumber(String track) {
        String digits = track.substring(6);
        // Integer result = valueOf(digits);
        //return valueOf(digits);
        return Integer.parseInt(digits); // "01" => 1

    }
}
