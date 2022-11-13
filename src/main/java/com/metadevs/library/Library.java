package com.metadevs.library;

import java.util.HashMap;
import java.util.List;

/**
 * Этот класс отвечает за :
 * 1.Реализует логику проекта.
 */
public class Library {
    List<Book> books;
    List<Reader> readers;
    HashMap<Book, Reader> takenBooks;

    public Library(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
        this.takenBooks = new HashMap<>();
    }


    public void takeBook(int bid, int rid) {

    }

    public void returnBook(int bid, int rid) {

    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

}
