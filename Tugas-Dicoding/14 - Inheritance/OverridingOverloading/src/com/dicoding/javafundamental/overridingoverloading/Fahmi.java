package com.dicoding.javafundamental.overridingoverloading;

public class Fahmi extends Mahasiswa {

    private String jurusan;
    private String semester;
    public Fahmi(String jurusan, String semester) {
        this.jurusan = jurusan;
        this.semester = semester;
    }
    @Override
    public String toString() {
        return "Fahmi jurusan: " + jurusan + ", semester: " + semester;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Fahmi) {
            Fahmi other = (Fahmi) obj;
            return this.jurusan.equals(other.jurusan);
        } else {
            return false;
        }
    }

    public Fahmi() {
        //super(); // akan tetap memanggil constructor dari parent Class
        System.out.println("construct Fahmi");
    }

    public void belajar() { // overriding
        System.out.println("Fahmi sedang belajar..");
    }

    public void belajar(String komputer) { // overloading
        System.out.println("Fahmi belajar " + komputer);
    }
}
