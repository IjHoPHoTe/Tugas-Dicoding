package com.dicoding.javafundamental.accessmodifier;

public class KelasA {

    private int memberA = 15;
    private int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
