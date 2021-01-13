package com.dicoding.javafundamental.inheritance;

public class Fahmi extends Mahasiswa {
    public Fahmi() {
        super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Fahmi");
    }
}
