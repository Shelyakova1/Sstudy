package com.metadevs.gameguessnumber;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        int scanNum;
        Random randomNum = new Random();
        int randomInt = randomNum.nextInt(100 + 1);
        System.out.println("Вам нужно угадать число от 1 до 100.У вас есть 10 попыток. Введите целое число из предложенного диапазона.");
        boolean isAnswered = false;
        int totalCount = 10;

        for (int calc = totalCount - 1; calc >= 0; calc--) {

            while (!newScan.hasNextInt()) {
                System.out.println("Пожалуйста введите целое число!!!");
                newScan.next();
            }
            scanNum = newScan.nextInt();

            if (scanNum > randomInt) {
                System.out.println("Введенное число больше загаданного.Осталось " + calc + " попыток");
            }
            else if (scanNum < randomInt) {
                System.out.println("Введенное число меньше загаданного.Осталось " + calc + " попыток");
            }
            else if (scanNum == randomInt) {
                System.out.println("Вы угадали!" + "Это произошло с " + (totalCount - calc) + " попытки");
                isAnswered = true;
                break;
            }
        }

       if (isAnswered == false) {
            System.out.println("Количество попыток закончилось.Вы проиграли.");
            System.out.println("Загаданное число " + randomInt);
        }
    }
}

