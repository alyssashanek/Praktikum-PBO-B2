//  Nama File : Anabul.java
//  Deskripsi : Program untuk demo kelas abstrak Anabul dengan metode abstrak gerak() dan bersuara(), serta atribut nama.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
    this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}