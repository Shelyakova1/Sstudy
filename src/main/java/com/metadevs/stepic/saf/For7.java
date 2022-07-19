package com.metadevs.stepic.saf;

import java.util.Scanner;

public class For7 {
    public For7() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int a = scan.nextInt();
        System.out.println("Введите второе число.");
        int b = scan.nextInt();
        if (a < b) {
            int count = 1;

            for(int i = a; i <= b; ++i) {
                for(int j = 0; j < count; ++j) {
                    System.out.print(i + " ");
                }

                ++count;
            }

            System.out.println();
        } else {
            System.out.println("Первое введенное число должно быть меньше второго.");
        }

    }
}
