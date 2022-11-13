package com.metadevs;

import com.metadevs.library.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Этот класс отвечает за :
 * 1.Запуск программы.
 * 2.Использует классы Library и ControlPanel.
 * 3.Заполняет данными.
 * 4.Подготавливает их для дальнейшего использования.
 */
public class Main {
    public static void main(String[] args) {
        ControlPanel controlPanel =new ControlPanel(getLibrary());
        controlPanel.menu();
    }

   public static Library getLibrary() {
        Book book1 = new Horror(123244,"The Shining","Stephen King", 1998);
        Book book2 = new SpecialLiterature(289076,"History of Japan","Vadim Alekseevich Kuzmin",2001);
        Book book3 = new ClassicLiterature(345677,"The Cherry Orchard ","Anton Pavlovich Chekhov",2012);
        List<Book> books =  new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Reader reader1 = new Reader("Ivanov Petr Sergeevich","23/04/1990", 765534,ReaderType.ADULT);
        Reader reader2 = new Reader("Sidorova Ekaterina Fedorovna","04/06/2000", 229456,ReaderType.STUDENT);
        Reader reader3 = new Reader("Smirnov Alexandr Timofeevich","30/09/2012", 654431,ReaderType.CHILD);


        List <Reader> readers = new ArrayList<>();
        readers.add(reader1);
        readers.add(reader2);
        readers.add(reader3);

        Library library = new Library(books,readers);
        return library;
    }
}
