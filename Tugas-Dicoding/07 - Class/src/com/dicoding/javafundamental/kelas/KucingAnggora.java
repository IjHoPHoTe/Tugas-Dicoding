package com.dicoding.javafundamental.kelas;

public class KucingAnggora {

    //ini adalah contoh no-argument constructor
    public KucingAnggora() {
    }
}








package com.dicoding.javafundamental.kelas;

public class KucingAnggora {

    String namaKucing;
    int beratBadan;

    //ini adalah contoh parameterized constructor
    //dengan memberikan nilai awal data member nama_kucing dan berat_badan
    //dengan parameter yang kita tentukan
    public KucingAnggora(String nama, int berat) {
        namaKucing = nama;
        beratBadan = berat;
    }
}
