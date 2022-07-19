package com.metadevs.lc;

import java.util.Scanner;

public class LiveCoding {

    public static void main(String[] args) {
        numOperationDataFromUser();
    }

    public static int userInputCheck(Scanner scan) {
        while (!scan.hasNextInt()) {
            System.out.println("Введите целое число!");
            scan.nextLine();
        }
        return scan.nextInt();
    }

    public static void numOperationDataFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую переменную");

        int value1 = userInputCheck(scan);
        System.out.println("Введите вторую переменную");

        int value2 = userInputCheck(scan);
        System.out.println("Выберите операцию : 1.Сложение; 2.Вычитание; 3.Умножение. ");

        int userOperationCheck = userInputCheck(scan);

        switch (userOperationCheck) {
            case 1:
                System.out.println(value1 + value2);
                break;
            case 2:
                System.out.println(value1 - value2);
                break;
            case 3:
                System.out.println(value1 * value2);
                break;
            default:
                System.out.println("Операция не определена");
                userInputCheck(scan);
        }
    }
}
