package com.metadevs.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Этот класс отвечает за :
 * 1.Ввод-Вывод данных
 * 2.Реализует управление данными класса Library через Menu.
 */
public class ControlPanel {

    static List<Book> books = new ArrayList<>();

    private Scanner scanCons;
    private Library library;

    public void menu() {
        System.out.println("1.Список книг");
        System.out.println("2.Список читателей");
        int input = scanCons.nextInt();
        switch (input) {
            case 1:
                printBooks();
                break;
            case 2:
                printReaders();
                break;
            case 3:
                takeBook();
                break;
            default:
                break;
        }
        //метод выводит пункты меню
    }

    public ControlPanel(Library library) {
        this.scanCons = new Scanner(System.in);
        this.library = library;
    }

    private void takeBook() {
        System.out.println("Enter RID and BID");
        int RID = scanCons.nextInt();
        int BID = scanCons.nextInt();
        library.takeBook(BID,RID);
    }



    private void returnBook() {
        //считывает BID RID  с консоли и вызвать library.returnBook

    }

    public void printBooks() {
        List<Book> books = library.getBooks();
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
    }

    public void printReaders() {
        List<Reader> readers = library.getReaders();
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i).toString());

        }
    }

}
