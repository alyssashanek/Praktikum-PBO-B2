package Nomor4;

public class MCivitas {
    public static void main(String[] args) {
        // e. 2 dosen dan 5 mahasiswa
        Dosen d1 = new Dosen("Pak Galang", "12345");
        Dosen d2 = new Dosen("Bu Puti", "54321");
        Mahasiswa m1 = new Mahasiswa("Alyssa", "24060123", d1);
        Mahasiswa m2 = new Mahasiswa("Timmie", "24060124", d2);
        Mahasiswa m3 = new Mahasiswa("Alin", "24060125", d1);
        Mahasiswa m4 = new Mahasiswa("Olip", "24060126", d2);
        Mahasiswa m5 = new Mahasiswa("Cipa", "24060127", d1);

        // b. Seminar
        Seminar seminar = new Seminar();
        seminar.registrasi(m1);
        seminar.registrasi(m2);
        seminar.registrasi(m3);
        seminar.registrasi(d1);
        seminar.registrasi(d2);

        // c. jumlah peserta
        seminar.tampilPeserta();
        System.out.println("Jumlah Peserta: " + seminar.countPeserta());
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        // g. tampil peserta
        seminar.tampilPeserta();

        // h. jumlah mahasiswa
        System.out.println("Jumlah Mahasiswa: " + seminar.countMahasiswa());

        // i. ubah dosen wali
        m1.setDosenWali(d2);
        
        // j. tampilkan data mahasiswa
        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
    }
}
