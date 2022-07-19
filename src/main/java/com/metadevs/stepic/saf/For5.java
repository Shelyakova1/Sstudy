package com.metadevs.stepic.saf;

import java.util.Scanner;

public class For5 {
    public For5() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {
            int fact = 1;
            System.out.println("Введите число.");

            for(int i = 1; i <= number; ++i) {
                fact *= i;
            }

            System.out.println("Факториал числа " + number + " равен " + fact);
        } else {
            System.out.println("Введите число больше 0.");
        }

    }
}
