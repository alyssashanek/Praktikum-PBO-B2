import java.time.LocalDate;

public class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() { 
        return fakultas; 
    }

    public void setFakultas(String fakultas) { 
        this.fakultas = fakultas; 
    }
}