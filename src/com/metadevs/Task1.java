package com.metadevs;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args){
    Scanner scannMonth = new Scanner(System.in);
   String month = scannMonth.nextLine();

    switch(month){
        case "Январь" :
            System.out.println("Зима");
            break;
        case "Февраль" :
            System.out.println("Зима");
            break;
        case "Март" :
            System.out.println("Весна");
            break;
        case "Апрель" :
            System.out.println("Весна");
            break;
        case "Май" :
            System.out.println("Весна");
            break;
        case "Июнь" :
            System.out.println("Лето");
            break;
        case "Июль" :
            System.out.println("Лето");
            break;
        case "Август":
            System.out.println("Лето");
            break;
        case "Сентябрь" :
            System.out.println("Осень");
            break;
        case "Октябрь" :
            System.out.println("Осень");
            break;
        case "Ноябрь" :
            System.out.println("Осень");
            break;
        case "Декабрь" :
            System.out.println("Зима");
            break;
        default:
            System.out.println("Введены некорректные данные");
    }
}
}
