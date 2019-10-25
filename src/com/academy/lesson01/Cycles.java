package com.academy.lesson01;
import java.util.Scanner;

public class Cycles {
    /*            Написать Java программу, которая выводит на консоль следующую фигуру:
             *
             **
             ***
             ****
             *****
             ******                */
    public static void triangle() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }
    }

    /*            Написать Java программу, которая выводит на консоль следующую фигуру:
                        *
                        **
                        ***
                        ****
                        *****
                        ******
                   При этом, вместо "*" должен быть любой символ, который ввсёл пользователь */
    public static void customTriangle() {
        System.out.print("Enter any symbol: ");
        Scanner scanner = new Scanner(System.in);
        java.lang.String symbol = scanner.nextLine();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(symbol);
            }
            System.out.println(symbol);
        }
    }
}




