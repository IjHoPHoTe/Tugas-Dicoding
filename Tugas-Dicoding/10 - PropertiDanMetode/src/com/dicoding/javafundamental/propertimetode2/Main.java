package com.dicoding.javafundamental.propertimetode2;

public class Main {
    public static void main(String[] args) {

        // Kita tambahkan 1 argumen dengan nilai int 2
        // Nilai tersebut adalah nilai yang digunakan untuk inisiasi variabel umur
        Mahasiswa fahmi = new Mahasiswa(20);
        fahmi.rajin();
        fahmi.malas();
        fahmi.bersama();

        // Contoh penggunaan fungsi getUmur
        System.out.println("Umurnya adalah " + fahmi.getUmur());
        // Perhitungan indeks massa tubuh (BMI)
        // berat(kg) / ( tinggi(m) * tinggi(m) )
        double bmi = fahmi.getBerat() / ((fahmi.getTinggi() * 0.01) * (fahmi.getTinggi() * 0.01));
        System.out.println("Indeks massa tubuhnya adalah " + bmi);
    }
}
