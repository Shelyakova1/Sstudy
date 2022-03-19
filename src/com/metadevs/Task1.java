package com.metadevs;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner scanNum = new Scanner(System.in);
        int num = scanNum.nextInt();
        int result = calcFactorial(num);
        System.out.println("Факториал числа равен " + result);
    }

    public static int calcFactorial(int mum) {
        int result = 1;
        for (int i = 1; i <= mum; i++) {
            result += result * i;
        }
        return result;
    }
}
