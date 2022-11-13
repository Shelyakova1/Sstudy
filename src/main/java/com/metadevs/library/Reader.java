package com.metadevs.library;

public class Reader {
    private String FIO;
    private String DOB;
    private int RID;
    private ReaderType readerType;

    public Reader(String FIO,String DOB,int RID, ReaderType readerType ) {
        this.FIO = FIO;
        this.DOB = DOB;
        this.RID = RID;
        this.readerType =  readerType;
    }

    public String toString(){
        return "FIO  " + FIO + ", DOB" + DOB + ",  RID" + RID + ", Reader Type " + readerType;
    }
}
