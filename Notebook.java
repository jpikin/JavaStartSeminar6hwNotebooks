package org.example.seminar6HW;


public class Notebook {
    private int ozu = 16;
    private int hdd;
    private String os;
    private String color;
    public Notebook(String color, String os, int hdd, int ozu) {
        this.color = color;
        this.hdd = hdd;
        this.os = os;
        this.ozu = ozu;
    }
    Notebook one = new Notebook("white", "Win 10", 1024, 8);
    Notebook two = new Notebook("black", "Win 10", 512, 16);
    Notebook three = new Notebook("gray", "Linux", 256, 4);
    Notebook four = new Notebook("white", "MacOS", 1024, 16);
    Notebook five = new Notebook("red", "Win 10", 2048, 32);
    Notebook six = new Notebook("black", "Linux", 1024, 8);
    Notebook seven = new Notebook("gray", "Win 11", 1024, 16);
    Notebook eight = new Notebook("red", "Win 11", 512, 8);
    Notebook nine = new Notebook("black", "MacOS", 2024, 32);
    Notebook ten = new Notebook("white", "Linux", 512, 16);

}
