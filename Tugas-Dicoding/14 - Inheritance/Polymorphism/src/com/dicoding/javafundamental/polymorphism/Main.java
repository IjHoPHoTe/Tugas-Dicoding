package com.dicoding.javafundamental.polymorphism;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa(); // memanggil constructor
        System.out.println("Apakah mahasiswa IS-A Objek -> " + (mahasiswa instanceof Object));
        System.out.println("Apakah mahasiswa IS-A Hewan -> " + (mahasiswa instanceof Mahasiswa));
        System.out.println("Apakah mahasiswa IS-A Kucing -> " + (mahasiswa instanceof Fahmi));

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
        Fahmi syihab = new Fahmi("Teknik Industri", "4");
        Fahmi zidni = new Fahmi("Teknik Sipil", "4");

        System.out.println(aziz.toString());
        System.out.println(syihab.toString());
        System.out.println(zidni.toString());

        System.out.println("aziz equals syihab ? " + aziz.equals(syihab));
        System.out.println("aziz equals zidni ? " + aziz.equals(zidni));

        System.out.println("------------------------");
        Object o = new Fahmi(); // kucing adalah Object
        Mahasiswa h = new Fahmi(); // kucing adalah Hewan
        Fahmi k = new Fahmi(); // kucing adalah Kucing, pastinya :)

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.belajar();
        k.belajar();
        Object object = k; // bisa langsung diassign
        Mahasiswa mahasiswaK= k; // bisa langsung diassign
        //object.makan(); -> error, karena method makan() tidak ada di class Object
        mahasiswaK.belajar();
        Fahmi fahmiK = (Fahmi) h; // tidak bisa langsung diassign, perlu casting
        fahmiK.belajar();

        Mahasiswa febri = new Mahasiswa();
        Fahmi anggora = (Fahmi) febri ; // compile OK tetapi runtime error ClassCastException
    }
}

