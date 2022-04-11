package com.metadevs;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        task2_section_a();
        task2_section_b();
        task2_section_c();
        task2_section_d();
        task2_section_e();
        task2_section_f();
        task2_section_g();
        task2_section_h();
    }

    private static void task2_section_a() {
        int a = 10;
        int b = 5;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    private static void task2_section_b() {
        int a = 50;
        int b = 25;
        boolean statement = (a > b);
        System.out.println(statement);
    }

    private static void task2_section_c() {
        int a = 67;
        int b = 23;
        boolean statement = (a < b);
        System.out.println(statement);
    }

    private static void task2_section_d() {
        int a = 90;
        int b = 80;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    private static void task2_section_e() {
        Scanner scanInt = new Scanner(System.in);
        int a = scanInt.nextInt();
        int b = 60;
        boolean statement = (a == b);
        System.out.println(statement);
    }

    private static void task2_section_f() {
        Scanner scanInt = new Scanner(System.in);
        int a = 100;
        System.out.println("Введите целое число больше ста");
        int b = recursivelyReadNumber2_f(scanInt, a);
        boolean statement = (a < b);
        System.out.println(statement);
    }

    private static int recursivelyReadNumber2_f(Scanner scanner, int a) {
        checkInput(scanner);
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Введены некорректные данные.Введите число больше ста");
            b = recursivelyReadNumber2_f(scanner, a);
        }
        return b;
    }

    private static void task2_section_g() {
        System.out.println("Введите целое положительное число для которого верно выражение : x + (60/2)= 60");
        Scanner scanInt = new Scanner(System.in);
        int b = 60;
        int a = recursivelyReadNumber2_g(scanInt, b);
        boolean statement = (a == b);
        System.out.println(statement);
    }

    private static int recursivelyReadNumber2_g(Scanner scanner, int b) {
        checkInput(scanner);
        int a = scanner.nextInt() + b / 2;
        if (a != b) {
            System.out.println("Число не подходит.");
            a = recursivelyReadNumber2_g(scanner, b);
        }
        return a;
    }

    private static void task2_section_h() {
        System.out.println("Введите целое положительное число для которого верно выражение : x + (146/2)= 146");
        Scanner scanInt = new Scanner(System.in);
        int b = 146;
        int a = recursivelyReadNumber2_h(scanInt, b);
        boolean statement = (a == b);
        System.out.println(statement);
    }

    private static int recursivelyReadNumber2_h(Scanner scanner, int b) {
        checkInput(scanner);
        int a = scanner.nextInt() + b / 2;
        if (a != b) {
            System.out.println("Число не подходит.");
            a = recursivelyReadNumber2_h(scanner, b);
        }
        return a;
    }
    private static void checkInput(Scanner scanner){
        while (!scanner.hasNextInt()){
            System.out.println("Введите число.");
            scanner.next();
        }
    }
}