//  Nama File : Kucing.java
//  Deskripsi : Program untuk realisasi kelas Kucing yang merupakan subclass dari kelas abstrak Anabul, dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

package Nomor3;
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan dengan melata");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong");
    }
}