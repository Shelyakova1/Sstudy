package com.metadevs;

import java.util.Scanner;

//задача №3 со stepic раздел 7.1
public class For3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число.");
        int from = scan.nextInt();
        System.out.println("Введите 2  число.");
        int to = scan.nextInt();
        int calc = to - from + 1;
        if (from < 0) {
            for (int i = 1; i <= to; i++) {
                System.out.print(" " + i);
            }
        } else {
            for (int i = from; i <= to; i++) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        System.out.println(" " + calc);
    }
}

