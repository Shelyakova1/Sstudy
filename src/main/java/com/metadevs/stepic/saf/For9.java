package com.metadevs.stepic.saf;

import java.util.Scanner;

public class For9 {
    public For9() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число.");
        int n = scan.nextInt();

        for(int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }

    }
}
