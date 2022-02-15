package com.metadevs;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int number = scanNum.nextInt();
        int i = scanNum.nextInt();
        if (number < i) {
            while (number < i) {
                System.out.println("Заданное число меньше i");
                number++;
            }
        } else {
            System.out.println("Заданное число больше или равно i");
        }
    }
}
