package com.dicoding.javafundamental.inheritance;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(); // memanggil constructor
        System.out.println("Apakah mahasiswa IS-A Objek -> " + (mahasiswa instanceof Object));
        System.out.println("Apakah mahasiswa IS-A Mahasiswa -> " + (mahasiswa instanceof Mahasiswa));
        System.out.println("Apakah mahasiswa IS-A Fahmi -> " + (mahasiswa instanceof Fahmi));
        System.out.println("------------------------");
        Fahmi fahmi = new Fahmi(); // memanggil constructor
        System.out.println("Apakah mahasiswa IS-A Objek -> " + (fahmi instanceof Object));
        System.out.println("Apakah fahmi IS-A Mahasiswa -> " + (fahmi instanceof Mahasiswa));
        System.out.println("Apakah fahmi IS-A Fahmi -> " + (fahmi instanceof Fahmi));
    }
}

