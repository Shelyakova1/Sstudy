package com.metadevs;
import java.util.Scanner;

public class LiveCodingSwitch {

    final static int firstDec = 1;
    final static int secondDec = 2;
    final static int thierdDec = 3;
    final static int fourtDec = 4;
    static Scanner scanAge = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите число.");
        int k = scanAge.nextInt();
        int x;
        x = k % 10;
        switch (x) {
            case firstDec:
                switch (k) {
                    case 11:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " год");
                        break;
                }
                break;
            case secondDec:
                switch (k) {
                    case 12:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            case thierdDec:
                switch (k) {
                    case 13:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            case fourtDec:
                switch (k) {
                    case 14:
                        System.out.println("Мне " + k + " лет");
                        break;
                    default:
                        System.out.println("Мне " + k + " года");
                        break;
                }
                break;
            default:
                System.out.println("Мне" + k + " лет");
                break;
        }
    }
}
