package com.metadevs;

import java.util.Scanner;

//задача №6 со stepic раздел 7.1
public class For6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число.");
        int count = scan.nextInt();
        int var1 = 0;
        int var2 = 1;
        int result = 0;
        for (int i = 1; i <= count; ++i) {
            result = var1 + var2;
            var1 = var2;
            var2 = result;
        }
        System.out.print(result + " ");
    }
}
