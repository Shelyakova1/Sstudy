package com.metadevs.stepic.saf;

import java.util.Scanner;

public class Switch {
    public Switch() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оценку.");
        int grade = scan.nextInt();
        switch(grade) {
            case 1:
                System.out.println("Плохо.");
                break;
            case 2:
                System.out.println("Неуд.");
                break;
            case 3:
                System.out.println("Уд.");
                break;
            case 4:
                System.out.println("Хор.");
                break;
            case 5:
                System.out.println("Отл.");
        }

    }
}
