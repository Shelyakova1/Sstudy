package com.metadevs;

import java.util.Scanner;
//задача №5 со stepic раздел 7.1
public class For5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {
            int i, fact = 1;
            System.out.println("Введите число.");
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Факториал числа " + number + " равен " + fact);
        }
  else {
            System.out.println("Введите число больше 0.");
        }
    }
}
