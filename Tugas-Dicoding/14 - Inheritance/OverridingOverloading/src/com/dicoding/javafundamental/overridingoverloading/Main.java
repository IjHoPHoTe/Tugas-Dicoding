package com.dicoding.javafundamental.overridingoverloading;

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

        System.out.println("------------------------");

        mahasiswa.belajar();
        fahmi.belajar();
        fahmi.belajar("matematika");

        System.out.println("------------------------");

        Fahmi aziz = new Fahmi("Teknik Informatika", "3");
        Fahmi syahab = new Fahmi("Teknik Industri", "3");
        Fahmi zidni = new Fahmi("Teknik Sipil", "3");
        System.out.println(aziz.toString());
        System.out.println(syahab.toString());
        System.out.println(zidni.toString());
        System.out.println("aziz equals syahab ? " + aziz.equals(syahab));
        System.out.println("aziz equals zidni ? " + aziz.equals(zidni));
    }
}
