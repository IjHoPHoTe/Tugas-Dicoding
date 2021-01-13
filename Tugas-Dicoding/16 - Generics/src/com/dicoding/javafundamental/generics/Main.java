package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa type-parameter
        lo.add("lo - String 1"); // lo menampung objek String
        lo.add(new Monitor("Samsung", 0.06)); // lo menampung objek Planet

        for (Object o : lo) {
            Monitor p = (Monitor) o; // perlu type-casting dari Object ke Planet
            p.print();
        }

        List<Monitor> lp = new ArrayList(); // List dengan type-parameter Planet
        lp.add(new Monitor("Samsung", 0.06)); // lp menampung objek Planet
        //lp.add("lp - String 1"); // baris ini compile-error, lp tidak diijinkan menampung objek String
        lp.add(new Monitor("Sony", 0.82));
        for (Monitor p : lp) {
            p.print();
        }
    }
}
