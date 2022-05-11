package com.company;

public class Main {

    public static void main(String[] args) {
    Programmer programmer = new Programmer("Ainura", "Ingineer", "Google");
        System.out.println(programmer);
        programmer.coding();

        System.out.println();
        Dancer dancer = new Dancer("Saltanat", "dancer", "Ak-shoola" );
        System.out.println(dancer);
        dancer.dancing();

        System.out.println();
    Singer singer = new Singer("Aktilek", "pianist", "Nur");
        System.out.println(singer);
        singer.singing();
        singer.playGuitar();

    }
}
