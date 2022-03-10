package com.metadevs;

import java.util.Arrays;
import java.util.Scanner;

public class LiveCodingArrays {
    final static int fullingArray = 1;
    final static int printArray = 2;
    final static int changeEl = 3;
    final static int deliteEl = 4;
    final static int addEl = 5;
    final static int fullForOne = 6;
    final static int exit = 7;

    static boolean exitProg = false;
    static Scanner scanAll = new Scanner(System.in);
    static int amountOfElements = 3;
    static int[] array = new int[amountOfElements];


    public static void main(String[] args) {
        while (!exitProg) {
            printCom();
        }
    }

    public static void arrayFulling(int[] array) {
        System.out.println("Введите элементы.");
        for (int i = 0; i < array.length; i++) {
            userInputCheck();
            array[i] = scanAll.nextInt();
        }
    }

    public static void arrayPrint() {
        System.out.println(Arrays.toString(array));

    }

    public static void changeElOfArray() {
        System.out.println("Выберите элемент массива который хотите изменить.Нумерация приводинся с 0 до 2.");
        userInputCheck();
        int indexForChange = scanAll.nextInt();
        System.out.println("Введите новое число.");
        userInputCheck();
        array[indexForChange] = scanAll.nextInt();
        arrayPrint();
    }

    public static void deleteOneEl() {
        System.out.println("Введите индекс элемениа который хотите удалить.");
        userInputCheck();
        int indexForDelete = scanAll.nextInt();
        int[] arrayCopyDel = new int[array.length - 1];
        for (int i = 0, j = 0; i < arrayCopyDel.length; i++, j++) {
            if (!(i == indexForDelete)) {
                arrayCopyDel[i] = array[j];
            } else {
                ++j;
                arrayCopyDel[i] = array[j];
            }
        }
        array = arrayCopyDel;
        arrayPrint();
    }

    public static void addEl() {
        System.out.println("Введите индекс элемениа который хотите добавить.");
        userInputCheck();
        int indexForAdd = scanAll.nextInt();
        System.out.println("Введите число.");
        userInputCheck();
        int elForAdd = scanAll.nextInt();
        int[] arrayCopyAdd = new int[array.length + 1];
        for (int i = 0, j = 0; j < arrayCopyAdd.length; i++, j++) {
            if (j == indexForAdd) {
                arrayCopyAdd[j] = elForAdd;
                i--;
            } else {
                arrayCopyAdd[j] = array[i];
            }
        }
        array = arrayCopyAdd;
        arrayPrint();
    }

    public static void fullOneNum() {
        System.out.println("Введите число которым заполнятся все элементы массива.");
        userInputCheck();
        int elForFull = scanAll.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = elForFull;
        }
        arrayPrint();
    }

    public static void printCom() {
        System.out.println("Количесво элементов массива 3.");
        System.out.println("Меню:");
        System.out.println("1.Ввести массив чисел.");
        System.out.println("2.Вывести  массив чисел.");
        System.out.println("3.Изменить один элемент массива.");
        System.out.println("4.Удалить один элемент массива.");
        System.out.println("5.Добавить новый элемент массива.");
        System.out.println("6.Заполнить весь массив введенным числом.");
        System.out.println("7.Выход.");
        userInputCheck();
        int comand = scanAll.nextInt();

        switch (comand) {
            case fullingArray:
                arrayFulling(array);
                break;

            case printArray:
                arrayPrint();
                break;

            case changeEl:
                changeElOfArray();
                break;

            case deliteEl:
                deleteOneEl();
                break;

            case addEl:
                addEl();
                break;

            case fullForOne:
                fullOneNum();
                break;

            case exit:
                exitProg = true;
                break;

            default:
                System.out.println("Неверный ввод.");
        }
    }

    public static void userInputCheck() {
        while (!scanAll.hasNextInt()) {
            System.out.println("Пожалуйста введите номер команды или число!!!");
            scanAll.next();
        }
    }
}




