package com.metadevs;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        Scanner scanNum = new Scanner(System.in);
        System.out.println("Ведите количество элементов ");
        String[] array = new String[scanNum.nextInt()];
        scanNum.nextLine();
        System.out.println("Введите элементы ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanNum.nextLine();
        }
        for (int i = (array.length - 1); i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
