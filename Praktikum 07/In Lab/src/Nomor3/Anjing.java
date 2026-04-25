//  Nama File : Anjing.java
//  Deskripsi : Program untuk realisasi kelas Anjing yang merupakan subclass dari kelas abstrak Anabul, dengan implementasi metode gerak() dan bersuara() sesuai karakteristik anjing.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

package Nomor3;
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara guk-guk");
    }
}
