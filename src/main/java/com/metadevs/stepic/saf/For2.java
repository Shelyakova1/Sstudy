package com.metadevs.stepic.saf;

import java.util.Scanner;

public class For2 {
    public For2() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 число.");
        int from = scan.nextInt();
        System.out.println("Введите 2 число.");
        int to = scan.nextInt();
        int i;
        if (from < 0) {
            for(i = 1; i <= to; ++i) {
                System.out.print(" " + i);
            }
        } else {
            for(i = from; i <= to; ++i) {
                System.out.print(" " + i);
            }
        }

    }
}