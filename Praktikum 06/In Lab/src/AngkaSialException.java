//  Nama File : AngkaSialException.java
//  Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 30 Maret 2026

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}