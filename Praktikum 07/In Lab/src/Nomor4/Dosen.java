package Nomor4;
public class Dosen extends CivitasAkademika {
    private String NIP;

    public Dosen(String nama, String NIP) {
        super(nama);
        this.NIP = NIP;
    }

    public String getNIP() {
        return NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}

