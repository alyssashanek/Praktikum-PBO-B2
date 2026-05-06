//  Nama File : Anjing.java
//  Deskripsi : Program untuk realisasi kelas Anjing yang merupakan subclass dari kelas abstrak Anabul, dengan implementasi metode gerak() dan bersuara() sesuai karakteristik anjing.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

public class Anjing extends Anabul {
    private double bobot;

    public Anjing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }

    public double getBobot() {
        return bobot;
    }
}
