package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);

        int prod = value1 * value2;
        System.out.println("Произведение " + prod);

        int dif = value1 - value2;
        System.out.println("Разность " + dif);

        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}
