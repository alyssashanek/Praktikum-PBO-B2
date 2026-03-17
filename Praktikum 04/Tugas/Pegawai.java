import java.time.LocalDate;
import java.time.Period;

public class Pegawai {

    protected String nip;
    protected String nama;
    protected LocalDate tglLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() { 
        return nip; 
    }

    public void setNIP(String nip) { 
        this.nip = nip; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public LocalDate getTglLahir() { 
        return tglLahir; 
    }

    public void setTglLahir(LocalDate tglLahir) { 
        this.tglLahir = tglLahir; 
    }

    public LocalDate getTmt() { 
        return tmt; 
    }

    public void setTmt(LocalDate tmt) { 
        this.tmt = tmt; 
    }

    public double getGajiPokok() { 
        return gajiPokok; 
    }

    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("TMT : " + tmt);
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
    }
}