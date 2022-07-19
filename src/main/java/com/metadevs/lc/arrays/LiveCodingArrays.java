package com.metadevs.lc.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LiveCodingArrays {
    final static int FILLING_ARRAY = 1;
    final static int PRINT_ARRAY = 2;
    final static int CHANGE_ELEMENT = 3;
    final static int DELITE_ELEMENT = 4;
    final static int ADD_ELEMENT = 5;
    final static int FILL_FOR_ONE = 6;
    final static int EXIT = 7;

    static boolean exitProg = false;
    static Scanner scanAll = new Scanner(System.in);
    static int amountOfElements = 3;
    static int[] array = new int[amountOfElements];


    public static void main(String[] args) {
        while (!exitProg) {
            printCom();
        }
    }


    public static void arrayFilling(int[] array) {
        System.out.println("Введите элементы.");
        for (int i = 0; i < array.length; i++) {
            userInputCheck();
            array[i] = scanAll.nextInt();
        }
    }

    public static void arrayPrint() {
        System.out.println(Arrays.toString(array));

    }

    public static void changeElementOfArray() {
        System.out.println("Выберите элемент массива который хотите изменить.Нумерация приводинся с 0 до 2.");
        userInputCheck();
        int indexForChange = readIndex();
        System.out.println("Введите новое число.");
        userInputCheck();
        array[indexForChange] = scanAll.nextInt();
        arrayPrint();
    }

    public static void deleteOneElement() {
        System.out.println("Введите индекс элемениа который хотите удалить.");
        userInputCheck();
        int indexForDelete = readIndex();
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

    public static void addElement() {
        System.out.println("Введите индекс элемента который хотите добавить.");
        userInputCheck();
        int indexForAdd = readIndex();
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

    public static void fillOneNum() {
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
            case FILLING_ARRAY:
                arrayFilling(array);
                break;

            case PRINT_ARRAY:
                arrayPrint();
                break;

            case CHANGE_ELEMENT:
                changeElementOfArray();
                break;

            case DELITE_ELEMENT:
                deleteOneElement();
                break;

            case ADD_ELEMENT:
                addElement();
                break;

            case FILL_FOR_ONE:
                fillOneNum();
                break;

            case EXIT:
                exitProg = true;
                break;

            default:
                System.out.println("Неверный ввод.");
        }
    }

    public static int readIndex() {
        boolean correct = false;
        int index = -1;
        while (!correct)
        {
            userInputCheck();
            index = scanAll.nextInt();
            if (index < 0 || index >= array.length) {
                System.out.println("Неверный ввод.Введите индекс элемента от 0 до 2.");
            }
            else {
                correct = true;
            }
        }
        return index;
    }

    public static void userInputCheck() {
        while (!scanAll.hasNextInt()) {
            System.out.println("Пожалуйста введите номер команды или число!!!");
            scanAll.next();
        }
    }
}




