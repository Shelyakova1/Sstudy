package com.metadevs.stepic.saf;

import java.util.Scanner;

public class For8 {
    public For8() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int a = scan.nextInt();
        System.out.println("Введите второе число.");
        int b = scan.nextInt();
        if (a < b) {
            for(int i = a; i <= b; ++i) {
                int count = i;

                for(int j = 0; j < count; ++j) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        } else {
            System.out.println("Первое введенное число должно быть меньше второго.");
        }

    }
}
