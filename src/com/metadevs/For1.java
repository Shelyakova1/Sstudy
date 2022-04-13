package com.metadevs;

import java.util.Scanner;

//задача №1 со stepic раздел 7.1
public class For1 {
    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        for (int i = 1; i <= userInput; i++) {
            System.out.print(" " + i);
        }
    }
}
