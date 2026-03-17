import java.time.LocalDate;

public class DosenTamu extends Dosen {
    protected String nidk;
    protected LocalDate akhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas, LocalDate akhirKontrak) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    public String getNIDK() { 
        return nidk; 
    }

    public void setNIDK(String nidk) { 
        this.nidk = nidk; 
    }

    public LocalDate getAkhirKontrak() { 
        return akhirKontrak; 
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) { 
        this.akhirKontrak = akhirKontrak; 
    }

    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK : " + nidk);
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Akhir Kontrak : " + akhirKontrak);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}