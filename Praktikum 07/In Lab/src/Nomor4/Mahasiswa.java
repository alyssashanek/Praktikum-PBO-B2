package Nomor4;

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen DosenWali;

    public Mahasiswa(String nama, String NIM, Dosen DosenWali) {
        super(nama);
        this.NIM = NIM;
        this.DosenWali = DosenWali;
    }

    public String getNIM() {
        return NIM;
    }

    public Dosen getDosenWali() {
        return DosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    }

    // i. setDosenWali
    public void setDosenWali(Dosen d) {
        this.DosenWali = d;
    }

    // j. tampilkanData
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Dosen Wali: " + DosenWali.getNama());
    }
}
