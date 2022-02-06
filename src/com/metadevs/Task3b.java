package com.metadevs;

import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        int numbersForCheck[] = {5, 0, -3, 2};
        for (int i = 0; i < numbersForCheck.length; i++) {
          int a = numbersForCheck[i];
            System.out.println(a > 0 && a < 5 ? "Верно" : "Неверно");
            System.out.println(a);
        }
    }
}