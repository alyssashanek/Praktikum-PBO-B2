//  Nama File : Mahasiswa.java
//  Deskripsi : Program untuk realisasi kelas Mahasiswa dengan atribut NIM, Nama, dan Program Studi, serta berbagai konstruktor untuk inisialisasi objek Mahasiswa.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

package Nomor2;
public class Mahasiswa {
    private String NIM;
    private String Nama;
    private String Programstudi;

    // a. Buatlah realisasi kelas Mahasiswa dilengkapi dengan atribut dan operator yang relevan!
    public void setProgramStudi() {
        this.Programstudi = "Kosong";
    }

    public void setProgramStudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }

    public void setProgramStudi(Mahasiswa a) {
        this.Programstudi = a.Programstudi;
    }

    public String getProgramStudi() {
        return Programstudi;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    // c. Buatlah realisasi dan aplikasi konstruktor Mahasiswa tanpa parameter yang menghasilkan objek dengan default NIM=-999, Nama=”n/a”, dan Programstudi=”n/a” !
    public Mahasiswa() {
        this.NIM = "-999";
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    // d. Buatlah realisasi dan aplikasi konstruktor Mahasiswa dengan tiga buah parameter yang menghasilkan objek dengan nilai-nilai komponen sesuai parameter input !
    public Mahasiswa(String NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    // e. Buatlah realisasi dan aplikasi konstruktor Mahasiswa dengan satu parameter objek Mahasiswa lain, yang menghasilkan objek hasil ‘kloning’ objek Mahasiswa input!
    public Mahasiswa(Mahasiswa a) {
        this.NIM = a.NIM;
        this.Nama = a.Nama;
        this.Programstudi = a.Programstudi;
    }

    void tampilkanInfo() {
        System.out.println("NIM: " + NIM);
        System.out.println("Nama: " + Nama);
        System.out.println("Program Studi: " + Programstudi);
    }
}