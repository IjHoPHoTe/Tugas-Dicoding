package package3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0 ; x < 15; x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+Perhitungan.nilai);
    }
}

