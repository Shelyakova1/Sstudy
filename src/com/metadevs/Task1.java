package com.metadevs;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        test();
        scan.close();
    }

    public static void test() {
        Scanner scan1 = new Scanner(System.in);
        int i = scan1.nextInt();
        double d = scan1.nextDouble();
        String s = scan1.nextLine();
        scan1.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

    }
}

