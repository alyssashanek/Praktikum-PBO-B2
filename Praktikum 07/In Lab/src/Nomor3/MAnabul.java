//  Nama File : MAnabul.java
//  Deskripsi : Program untuk penggunaan kelas abstrak Anabul dan subclass-subclassnya (Anjing, Kucing, Burung) dengan membuat objek dari masing-masing kelas dan memanggil metode gerak() dan bersuara() untuk menunjukkan karakteristik masing-masing hewan.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

package Nomor3;
public class MAnabul {
    public static void main(String[] args) {
        Anabul anjing = new Anjing("June");
        Anabul kucing = new Kucing("Ucrit");
        Anabul burung = new Burung("Twit");

        System.out.println("Anjing:");
        anjing.gerak();
        anjing.bersuara();

        System.out.println("\nKucing:");
        kucing.gerak();
        kucing.bersuara();

        System.out.println("\nBurung:");
        burung.gerak();
        burung.bersuara();
    }
}
