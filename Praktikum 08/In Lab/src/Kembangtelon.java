//  Nama File : Kembangtelon.java
//  Deskripsi : Subkelas Kembangtelon yang merupakan jenis kucing dengan implementasi metode gerak() dan bersuara() sesuai karakteristik kucing Kembangtelon.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 1 Mei 2026

public class Kembangtelon extends Kucing {
    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " berjalan santai");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi meong keras");
    }
}