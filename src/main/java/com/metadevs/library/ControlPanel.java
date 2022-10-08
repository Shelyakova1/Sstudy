package com.metadevs.library;

import java.util.Scanner;

public class ControlPanel {
    private Scanner scanCons;
    private Library library;
    public void menu(){
        System.out.println("1.Список книг");
        System.out.println("2.Список читателей");
        int input = scanCons.nextInt();
        switch (input){
            case 1 :
                printBooks();
                break;
            case 2:
                printReaders();
                break;
            default : break;
        }
        //метод выводит пункты меню
    }

    public ControlPanel(Library library) {
        this.scanCons = new Scanner(System.in);
        this.library = library;
    }

    private void takeBook(){
        //считывает BID RID  с консоли и вызвать library.takeBook
    }
    private void returnBook(){
        //считывает BID RID  с консоли и вызвать library.returnBook

    }

    private void printBooks(){
        library.printBooks();
    }

    private void printReaders(){
        library.printReaders();
    }

}
