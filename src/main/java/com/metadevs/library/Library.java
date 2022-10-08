package com.metadevs.library;

import java.util.HashMap;
import java.util.List;

public class Library {
    List<Book> books;
    List <Reader> readers;
    HashMap<Book,Reader> takenBooks;

    public Library(List<Book> books, List<Reader> readers) {
        this.books = books;
        this.readers = readers;
        this.takenBooks = new HashMap<>();
    }
    public void printBooks(){
        for (int i = 0; i < books.size() ; i++) {
            System.out.println(books.get(i).toString());
        }
    }
    public void printReaders(){
        for (int i = 0; i < readers.size(); i++) {
            System.out.println(readers.get(i).toString());

        }
    }

    public void takeBook(int bid,int rid){

    }
    public void returnBook(int bid, int rid){

    }


}
