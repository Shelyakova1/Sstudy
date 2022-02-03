package com.metadevs;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int value = scann.nextInt();
        if (value > 10) {
            System.out.println("Число больше 10");
        } else {
            System.out.println("Число меньше 10");
        }
    }
}
