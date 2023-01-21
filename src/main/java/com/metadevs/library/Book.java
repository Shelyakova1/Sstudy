package com.metadevs.library;

public abstract class Book {
    private  int BID;
    private  String Name;
    private  String Author;
    private  int year;

    public Book(int BID, String Name, String Author, int year) {

        this.BID = BID;
        this.Name = Name;
        this. Author = Author;
        this.year = year;


    }

    public int getBID() {
        return BID;
    }

    public String toString(){
    return "BID: " + BID + ", Name "+ Name + ", Author " + Author + ", year "+ year   ;
}
}
