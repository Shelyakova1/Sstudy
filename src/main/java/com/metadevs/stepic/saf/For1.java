package com.metadevs.stepic.saf;
import java.util.Scanner;

public class For1 {
    public For1() {
    }

    public static void main(String[] args) {
        System.out.println("Введите число.");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        for(int i = 1; i <= userInput; ++i) {
            System.out.print(" " + i);
        }

    }
}