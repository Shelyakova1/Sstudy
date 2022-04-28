package com.metadevs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//задача №1 со stepic раздел 7.3
public class For1 {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество элементов.");
            int size = scan.nextInt();
            int array[] = new int[size];
            System.out.println("Введите элементы.");
            for (int i = 0; i < size; i++) {
                array[i] = scan.nextInt();
            }
            System.out.println("Элементы в обратном порядке.");
            for (int i = size - 1; i >= 0; i--) {
                array[0] = 0;
                if (array[i] > 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }

