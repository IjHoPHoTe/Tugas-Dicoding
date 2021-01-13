package com.dicoding.javafundamental.casting;

public class Main {
    public static void main(String[] args) {
        Fahmi syahab = new Fahmi();

        Mahasiswa mahasiswa = syahab; //secara implisit upcasting
        mahasiswa = (Mahasiswa) syahab; //secara explisit melakukan casting dari subclass ke superclass

        Mahasiswa mahasiswa2 = new Fahmi();
        ((Fahmi) mahasiswa2).aziz(); //downcast hewan ke kucing, casting dari superclass ke subclass
    }
}
