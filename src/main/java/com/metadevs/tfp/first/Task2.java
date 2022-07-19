package com.metadevs.tfp.first;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int value1 = scann.nextInt();
        int value2 = scann.nextInt();
        System.out.println("Sum " + (value1 + value2));
        System.out.println("Dif " + (value1 - value2));
        System.out.println("Quo " + (value1 * value2));
        System.out.println("Prod " + (value1 / value2));
        scann.close();
    }
}
