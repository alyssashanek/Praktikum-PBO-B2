package Nomor4;

public class Seminar {
    private CivitasAkademika[] peserta;
    private int banyakPeserta;

    public Seminar() {
        peserta = new CivitasAkademika[100];
        banyakPeserta = 0;
    }

    // c. countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // d. registrasi
    public void registrasi(CivitasAkademika c) {
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = c;
            banyakPeserta++;
        } else {
            System.out.println("Seminar sudah penuh");
        }
    }

    // g. tampilPeserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println(peserta[i].getNomor() + " - " + peserta[i].getNama());
        }
    }

    // h. countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
