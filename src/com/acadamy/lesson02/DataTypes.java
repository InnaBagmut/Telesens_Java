package com.acadamy.lesson02;

/**
 * Created by HanSolo on 25.10.2019.
 */
public class DataTypes {
    public static void main(String[] args) {
        double x, y, z, result;
        x = 1.1;
        y = 3;
        z = 5;
        System.out.println("x = " + x + "; y = " + y + "; z = " + z);
        result = z - x - y;
        System.out.println(result);

        int m = Integer.MAX_VALUE;
        System.out.println(m+1);
        x = 10;
        x++; //x = x + 1; x += 1;
        System.out.println(x);

        //статок от деления

        y = 10;
        System.out.println(y++);
        System.out.println(y);
        System.out.println(2%2);
        System.out.println(4%5);

        //Операторы сравнения
        int k1 = 20;
        int k2 = 30;

        System.out.println(k1 > 1 && k1 < 30);
        System.out.println(k1 > 1 && k1 < 20);
        System.out.println(k1 > 1 || k1 < 20);
        System.out.println(k1 > 20 || k2 > 50);

        boolean isCorrectNumber = k1 > 20;
        System.out.println(!isCorrectNumber);
        String str1 = "1";
        String str2 = "2";
        System.out.println(str1 + str2);
        System.out.println(str1 == str2); // как правило, строки никто не сравнивает, так что это для примера

        //Деление
        System.out.println("Деление:");
        double z1 = 5;
        int z2 = 2;
        double div = z1/z2;
        double div2 = 5/2.0;
        System.out.println(div);
        System.out.println(div2);

        //Вывести на консоль нечетные числа от 1 до 9 включительно циклом for
        System.out.println("Odd numbers:");
        for (int i = 1; i < 10; i++) {
            if (i%2 == 1) System.out.println(i);
        }
        System.out.println("Option 2: ");
        for (int i = 1; i <= 9 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("Выводим odd numbers с помощью while:");
        int i = 1;
        while (i < 10) {
            i++;
            if (i%2 == 0) {continue;}
        }
        System.out.println(i);

/*        Создать новый класс с методом main
❑ Прочитать с консоли переменную целого типа n
❑ Убедиться, что переменная n больше 0
❑ Посчитать и вывести на консоль сумму ряда от 1 до n.
        (1+2+3+..+n)
❑ Решить с помощью цикла for или while*/

        System.out.println("Сумма от 1 до 9");
        int sum = 0;
        for (int j = 0; j <=9 ; j++) {
            sum += j; //sum = sum + i;
            System.out.println(sum);

            //массивы
            String[] words = {"A", "b", "Bye"};
            words[0] = "Hello";
            words[1] = "World";
            System.out.println(words[2]);

            for (int k = 0; k < 2; k++) {
                System.out.print(words[i] + " ");
            }
        }
    }
}
