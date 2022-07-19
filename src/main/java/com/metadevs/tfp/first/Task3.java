package com.metadevs.tfp.first;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String name = scann.nextLine();
        String surname = scann.nextLine();
        int age = scann.nextInt();
        System.out.println("Name " + name);
        System.out.println("Surname " + surname);
        System.out.println("Age " + age);
        scann.close();
    }
}
