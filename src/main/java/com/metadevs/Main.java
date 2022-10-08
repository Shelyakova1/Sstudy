package com.metadevs;

import com.metadevs.library.Book;
import com.metadevs.library.ControlPanel;
import com.metadevs.library.Library;
import com.metadevs.library.Reader;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel =new ControlPanel(getLibrary());
        controlPanel.menu();
    }

    public static Library getLibrary() {
        Book book1 = new Book(1);
        Book book2 = new Book(2);
        Book book3 = new Book(3);
        List<Book> books =  new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Reader reader1 = new Reader(1);

        List <Reader> readers = new ArrayList<>();
        readers.add(reader1);

        Library library = new Library(books,readers);
        return library;
    }
}
