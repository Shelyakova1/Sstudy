package com.metadevs;
import java.util.Scanner;

public class PussyFeeder {
    static Scanner scanCom = new Scanner(System.in);
    static int[] food = new int[5];
    static boolean exit = false;

    public static void main(String[] args) {
        while (!exit) {
            printCom();
            print();
        }
    }

    public static void changeCountOfFoodCheck(int index, int value) {
        if (value > 7 || value < 0) {
            System.out.println("Неверный ввод.Пожалуйста внимательно прочитайте условия пользования.");
            System.out.println();
            return;
        }

        food[index] = value;
    }

    public static int userInputCheck() {
        while (!scanCom.hasNextInt()) {
            System.out.println("Пожалуйста введите целое число!!!");
            scanCom.next();
        }
        int input = scanCom.nextInt();
        return input;
    }

    public static boolean checkIndex(int index) {
        if (index < 0 || index >= food.length) {
            System.out.println("Неверный ввод.Введите номер миски от 0 до 4.");
            return false;
        }

        return true;
    }

    public static void print() {
        for (int i = 0; i < food.length; i++) {
            System.out.println("В миске " + i + " количество корма " + food[i]);
        }
        System.out.println();

    }

    public static void changeCountOfFoodForOne(int numberOfPlate, int count, boolean isAdd) {
        if (checkIndex(numberOfPlate)) {
            if (isAdd) {
                changeCountOfFoodCheck(numberOfPlate, food[numberOfPlate] + count);
            } else {
                changeCountOfFoodCheck(numberOfPlate, food[numberOfPlate] - count);
            }
        }
    }

    public static void addCountOfFoodForAll(int count) {
        for (int i = 0; i < food.length; i++) {
            changeCountOfFoodCheck(i, food[i] + count);

        }
    }

    public static void putAwayCountOfFoodForAll(int count) {
        for (int i = 0; i < food.length; i++) {
            changeCountOfFoodCheck(i, food[i] - count);
        }
    }

    public static void changeNotWierd(boolean putAway, int count) {
        for (int i = 0; i < food.length; i++) {
            if (i % 2 != 0) {
                if (putAway) {
                    changeCountOfFoodCheck(i, food[i] - count);
                } else {
                    changeCountOfFoodCheck(i, food[i] + count);
                }
            }
        }
    }

    public static void changeWierd(boolean putAway, int count) {
        for (int i = 0; i < food.length; i++) {
            if (i % 2 != 0) {
                if (putAway) {
                    changeCountOfFoodCheck(i, food[i] - count);
                } else {
                    changeCountOfFoodCheck(i, food[i] + count);
                }
            }
        }
    }

    public static void printCom() {
        System.out.println("Данная программа обладает функционалом, позволяющим управлять количеством корма в кошачьих мисках.Они пронумерованы от нуля до четырех.Количесво проций корма в мисках должно быть от одной и до семи.Не более.");
        System.out.println("1.Добавить указанное количество порций корма в миску с номером от 0 до 4;");
        System.out.println("2.Убать указанное количество порций корма из миски с номером от 0 до 4;");
        System.out.println("3.Добавить во все миски указанное количество порций корма;");
        System.out.println("4.Убрать из всех мисок указанное количество проций корма;");
        System.out.println("5.Добавить указанное количесто порций корма ТОЛЬКО в миски с четными номерами;");
        System.out.println("6.Убрать указанное количестово поррций корма из мисок ТОЛЬКО с четными номерами;");
        System.out.println("7.Добавить указанное количесто порций корма ТОЛЬКО в миски с нечетными номерами;");
        System.out.println("8.Убрать указанное количестово порций корма из мисок ТОЛЬКО с нечетными номерами;");
        System.out.println("0.Выход.");
        System.out.println("Выберите команду из предложенных: ");
        int comand = userInputCheck();
        switch (comand) {
            case 1:
                System.out.println("Введите номер миски от 0 до 4");
                int numPlate1 = userInputCheck();
                System.out.println("Введите количество порций корма которое нужно добавить - от 1 до 7");
                int foodCount1 = userInputCheck();
                changeCountOfFoodForOne(numPlate1, foodCount1, true);
                break;

            case 2:
                System.out.println("Введите номер миски от 0 до 4");
                int numPlate2 = userInputCheck();
                System.out.println("Введите количество порций корма которое нужно убрать - от 1 до 7");
                int foodCount2 = userInputCheck();
                changeCountOfFoodForOne(numPlate2, foodCount2, false);
                break;

            case 3:
                System.out.println("Введите количество порций корма которое нужно добавить - от 1 до 7");
                int foodCount3 = userInputCheck();
                addCountOfFoodForAll(foodCount3);
                break;

            case 4:
                System.out.println("Введите количество порций корма которое нужно убрать - от 1 до 7");
                int foodCount4 = userInputCheck();
                putAwayCountOfFoodForAll(foodCount4);
                break;

            case 5:
                System.out.println("Введите количество порций корма которое нужно добавить - от 1 до 7");
                int foodCount5 = userInputCheck();
                changeNotWierd(true, foodCount5);
                break;

            case 6:
                System.out.println("Введите количество порций корма которое нужно убрать - от 1 до 7");
                int foodCount6 = userInputCheck();
                changeNotWierd(false, foodCount6);
                break;
            case 7:
                System.out.println("Введите количество порций корма которое нужно добавить - от 1 до 7");
                int foodCount7 = userInputCheck();
                changeWierd(true, foodCount7);
                break;

            case 8:
                System.out.println("Введите количество порций корма которое нужно убрать - от 1 до 7");
                int foodCount8 = userInputCheck();
                changeWierd(false, foodCount8);
                break;

            case 0:
                exit = true;
                break;

            default:
                System.out.println("Неверный ввод.Пожалуйста внимательно прочитайте условия пользования.");
                System.out.println();
        }
    }
}
