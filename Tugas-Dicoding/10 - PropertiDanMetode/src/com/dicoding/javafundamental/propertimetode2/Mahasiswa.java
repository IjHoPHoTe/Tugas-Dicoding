package com.dicoding.javafundamental.propertimetode2;

public class Mahasiswa {
    // Properti atau fields

    // Inisiasi dengan nilai inisial
    double tinggi = 165;
    double berat = 75;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Mahasiswa(int umur) {
        this.umur = umur;
    }

    void rajin() { System.out.println("Belajar dengan sangat rajin..");
    }

    void malas() {
        System.out.println("Belajar dengan malas..");
    }

    void bersama() {
        System.out.println("belajar bersama teman-teman..");
    }

    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
