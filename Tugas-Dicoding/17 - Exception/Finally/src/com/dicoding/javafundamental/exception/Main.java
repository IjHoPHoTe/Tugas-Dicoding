package com.dicoding.javafundamental.exception;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[15];
        try {
            System.out.println("Akses elemen ke 5 :" + a[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[14] = 20;
            System.out.println("Nilai elemen terakhir: " + a[14]);
        }
    }
}
