package com.metadevs;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        sum(a, b); //15
        sum(3, a); //10
        sum(5, 23); //28

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;


        if (aGreaterThenB) {
            System.out.println("a > b");
        } else {
            System.out.println("False");
        }
        if (aLessThenB) {
            System.out.println("a < b");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a >= b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a <= b");
        } else {
            System.out.println("False");
        }

        int userInput1 = new Scanner(System.in).nextInt();
        if (userInput1 % 2 == 0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }

    static void sum(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }
}

