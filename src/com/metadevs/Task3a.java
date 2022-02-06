package com.metadevs;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        int a = scanNum.nextInt();
        a = ((a == 2 || a == 0) ? a + 7 : a / 10);
        System.out.println(a);
    }
}
