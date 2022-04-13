package com.metadevs;

import java.util.Scanner;
//задача №10 со stepic раздел 7.1
public class For10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число.");
        int n = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n ; i++) {
            if(n%i==0){
                isPrime = false;
            }
        }
        if (isPrime)
            System.out.println(1);
        else
            System.out.println(0);
    }
}

