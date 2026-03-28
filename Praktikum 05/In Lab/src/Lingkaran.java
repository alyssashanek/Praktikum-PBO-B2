//  Nama File : Lingkaran.java
//  Deskripsi : Class Lingkaran sebagai turunan dari BangunDatar
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 Maret 2024

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
    }

    public Lingkaran(double diameter, String warna, String border) {
        this.jari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public Lingkaran(int r) {
        this.jari = r;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public double getDiameter() {
        return 2 * jari;
    }

    @ Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }

    @ Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @ Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @ Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
    }

}
 