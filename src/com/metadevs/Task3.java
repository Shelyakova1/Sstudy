package com.metadevs;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Что говорит кошка?");
        Scanner voice = new Scanner(System.in);
        String answer = voice.nextLine();
        answer = answer.toLowerCase();

        if (answer.equals("мяу")) {
            System.out.println("Да, верно!");
        } else {
            System.out.println("Это говорит другое животное...");
        }
    }
}
