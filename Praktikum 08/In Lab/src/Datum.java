//  Nama File : Datum.java
//  Deskripsi : Program untuk membuat kelas Datum yang dapat menyimpan satu elemen dengan tipe data generik, serta metode untuk mengakses dan memodifikasi elemen tersebut.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 1 Mei 2026

public class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}