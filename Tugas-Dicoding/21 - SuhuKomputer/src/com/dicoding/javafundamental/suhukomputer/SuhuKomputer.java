package com.dicoding.javafundamental.suhukomputer;

import java.util.Scanner;

public class SuhuKomputer {
    public static void main(String[] args) {
        /* contoh pemakaian IF tiga kasus : wujud komputer */

        /*Kamus*/
        int T;

        /*Program*/
        System.out.println("Contoh IF tiga kasus");
        System.out.print("Suhu (der. C) = ");

        //scanner untuk masukan suhu komputer
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //masukan suhu komputer dengan tipe int

        //proses pengecekan dengan if
        if (T < 0) {
            System.out.println("Wujud komputer intel " + T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud komputer amd " + T);
        } else if (T > 100) {
            System.out.println("Wujud komputer pc/laptop " + T);
        }
    }
}
