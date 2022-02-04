package com.metadevs;

import java.util.Random;
import java.util.Scanner;

public class GameGuessNumber {

        public static void main(String[] args) {
            Scanner newScan = new Scanner(System.in);
            int scanNum;
            Random randomNum = new Random();
            int randomInt = randomNum.nextInt(100) + 1;
            System.out.println("Вам нужно угадать число от 1 до 100.У вас есть 10 попыток. Введите число из предложенного диапазона.");
            boolean isAnswered = false;
            for (int calc = 9; calc >= 0; calc--) {
                scanNum = newScan.nextInt();
                if (scanNum > randomInt) {
                    System.out.println("Введенное число больше загаданного.Осталось " + calc + " попыток");
                } else if (scanNum < randomInt) {
                    System.out.println("Введенное число меньше загаданного.Осталось " + calc + " попыток");
                } else if (scanNum == randomInt) {
                    System.out.println("Вы угадали!");
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

