package com.metadevs.stepic.saf;


import java.util.Scanner;

public class For4 {
    public For4() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1 целое число.");
        int from = scan.nextInt();
        System.out.println("Введите 2 целое число.");
        int to = scan.nextInt();
        if (from < to) {
            for(int i = to; i >= from; --i) {
                System.out.print(" " + i);
            }
        } else {
            System.out.println("Неверный ввод.");
        }

    }
}