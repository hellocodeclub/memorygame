package com.hellocodeclub.memorygame;

public class Cell {

    public String value;
    public int row;
    public int col;
    public boolean wasGuessed;

    Cell(String value,int row,int col){
        this.value = value;
        this.row = row;
        this.col = col;
        this.wasGuessed = false;
    }
}
