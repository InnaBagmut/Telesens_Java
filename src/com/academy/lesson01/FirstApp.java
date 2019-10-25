package com.academy.lesson01;

import java.util.Scanner;

import static java.lang.String.format;

/**
 * Created by HanSolo on 21.10.2019.
 */
public class FirstApp {
    public static void main(String[] args) {
        //выводим сообщение на консоль
        System.out.println("Моя первая программа в Телесенсе");

        //прочитаем с консоли
        //связываем сканнер с консолью
        Scanner scanner = new Scanner(System.in);
        //Введём имя
        System.out.println("Введите имя: ");
        String firstName = scanner.nextLine();
        //Введём фамилию
        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        //Введём пол
        System.out.println("Ведите пол: ");
        String gender = scanner.nextLine();
        //Введём возраст
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        //Введём телефон:
        System.out.println("Введите телефон: ");
        String mobile = scanner.next();

        System.out.println(format("Имя %s,%n Фамилия %s,%n Возраст %d,%n Пол %s,%n Телефон %s,%n",
                firstName, lastName, age, gender, mobile));

        Cycles.triangle();
        Cycles.customTriangle();
    }


}
