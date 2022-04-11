package com.metadevs;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scann2 = new Scanner(System.in);

        int value1 = scann2.nextInt();
        int value2 = scann2.nextInt();
        boolean statement1 = (value1 > value2);
        boolean statement2 = (value1 < value2);

        if (value1 > value2) {
            System.out.println("Первое число больше второго");
        } else if (value1 < value2) {
            System.out.println("Первое число меньше второго");
        } else {
            System.out.println("Числа равны");
        }
    }
}