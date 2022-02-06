package com.metadevs;

import java.util.Scanner;

public class Task3b {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int a = scanNum.nextInt();
        System.out.println(a > 0 && a < 5 ? "Верно" : "Неверно");
    }
}