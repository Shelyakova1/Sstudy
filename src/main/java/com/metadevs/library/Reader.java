package com.metadevs.library;

public class Reader {
    private String FIO;



    private String FY;
    private int RID;
    private ReaderType readerType;

    public Reader(String FIO, String FY, int RID, ReaderType readerType ) {
        this.FIO = FIO;
        this.FY = FY;
        this.RID = RID;
        this.readerType =  readerType;
    }

    public String toString(){
        return "FIO  " + FIO + ", DOB" + FY + ",  RID" + RID + ", Reader Type " + readerType;
    }

    public int getRID() {
        return RID;
    }
    public ReaderType getReaderType() {
        return readerType;
    }
}





