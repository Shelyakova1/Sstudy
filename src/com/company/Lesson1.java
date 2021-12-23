package com.company;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        //вывод в консоль
        //System.out.println(25);
        System.out.println("Hello World!");

        int value1 = 0;
        int value2 = 5;
        int sum = value1 + value2;
        System.out.println("Сумма " + sum);
        int mulyiply = value1 * value2;
        System.out.println("Произведение " + mulyiply);
        int difference = value1 - value2;
        System.out.println("Разность " + difference);

        Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.next();
        String userInput = new Scanner(System.in).next();
        System.out.println(userInput);
    }
}
