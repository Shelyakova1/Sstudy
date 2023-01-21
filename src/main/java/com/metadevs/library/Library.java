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
        if (CheckBookExists(bid) == false) {

            System.out.println("Такой книги нет.");
            return;
        }
        if (isReaderIsOk(bid, rid) == false) {

            System.out.println("Книга недоступна для этой категории читателей.");
            return;
        }
    }

    private boolean CheckBookExists(int BID) {
        if (GetBookByID(BID) != null) {
            System.out.println("Книга найдена.");
            return true;
        }
        return false;
    }

    private Book GetBookByID(int BID) {
        for (int i = 0; i < books.size(); i++) {
            if (BID == books.get(i).getBID()) {
                return books.get(i);
            }
        }
        return null;
    }

    private Reader GetReaderByID(int RID) {
        for (int i = 0; i < readers.size(); i++) {
            if (RID == readers.get(i).getRID()) {
                return readers.get(i);
            }
        }
        return null;
    }

    private boolean isReaderIsOk(int BID, int RID){
    Book book = GetBookByID(BID);
    Reader reader = GetReaderByID(RID);
    if(reader.getReaderType() == ReaderType.STUDENT){
        return true;
    }
    if(reader.getReaderType() == ReaderType.CHILD && book.getClass() == ClassicLiterature.class ){
        return true;
    }
        if(reader.getReaderType() == ReaderType.ADULT && book.getClass() == ClassicLiterature.class || book.getClass() == Horror.class){
            return true;
        }
        return  false;
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
