import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
public static void main(String[] args) {

    PesertaMember p = new PesertaMember("123", "Alyssa", "alyss@email.com");
    
    Pelatihan r = new PelatihanReguler("P01", "Java", 20, "Budi", 1000000, 3, "Basic", "Kelompok");
    Pelatihan i = new PelatihanInsidental("P02", "Workshop AI", 15, "Andi", 500000, LocalDate.of(2026, 4, 1), "Online");
    Pelatihan r2 = new PelatihanReguler("P03", "Python", 25, "Sinta", 750000, 6, "Intermediate", "Private");

    p.tambahPelatihan(r);
    p.tambahPelatihan(i);
    p.tambahPelatihan(r2);

    p.tampilkanSemua(LocalDate.of(2026, 4, 2), "Transfer");
}

}

// ======= Pelatihan =======
abstract class Pelatihan {
protected String kode, nama, instruktur;
protected int kuota;
protected double harga;
protected static final double PAJAK = 0.1;

public Pelatihan(String kode, String nama, int kuota, String instruktur, double harga) {
    this.kode = kode;
    this.nama = nama;
    this.kuota = kuota;
    this.instruktur = instruktur;
    this.harga = harga;
}

public abstract void tampilkanDetail();

}

// ======= Pelatihan Reguler =======
class PelatihanReguler extends Pelatihan {
private int durasi;
private String level, metode;

public PelatihanReguler(String kode, String nama, int kuota, String instruktur,
                        double harga, int durasi, String level, String metode) {
    super(kode, nama, kuota, instruktur, harga);
    this.durasi = durasi;
    this.level = level;
    this.metode = metode;
}

@Override
public void tampilkanDetail() {
    System.out.println("=== Pelatihan Reguler ===");
    System.out.println("Kode: " + kode);
    System.out.println("Nama: " + nama);
    System.out.println("Jenis: Reguler");
    System.out.println("Kuota: " + kuota);
    System.out.println("Instruktur: " + instruktur);
    System.out.println("Harga: " + harga);
    System.out.println("Durasi: " + durasi + " bulan");
    System.out.println("Level: " + level);
    System.out.println("Metode: " + metode);
    System.out.println();
}

}

// ======= Pelatihan Insidental =======
class PelatihanInsidental extends Pelatihan {
private LocalDate tanggal;
private String mode;

public PelatihanInsidental(String kode, String nama, int kuota, String instruktur,
                           double harga, LocalDate tanggal, String mode) {
    super(kode, nama, kuota, instruktur, harga);
    this.tanggal = tanggal;
    this.mode = mode;
}

@Override
public void tampilkanDetail() {
    System.out.println("=== Pelatihan Insidental ===");
    System.out.println("Kode: " + kode);
    System.out.println("Nama: " + nama);
    System.out.println("Jenis: Insidental");
    System.out.println("Kuota: " + kuota);
    System.out.println("Instruktur: " + instruktur);
    System.out.println("Harga: " + harga);
    System.out.println("Tanggal: " + tanggal);
    System.out.println("Mode: " + mode);
    System.out.println();
}

}

// ======= Peserta =======
class Peserta {
protected String noKTP, nama, email;
protected ArrayList<Pelatihan> daftar = new ArrayList<>();

public Peserta(String noKTP, String nama, String email) {
    this.noKTP = noKTP;
    this.nama = nama;
    this.email = email;
}

public void tambahPelatihan(Pelatihan p) {
    if (daftar.size() < 3) {
        daftar.add(p);
    }
}

public double getDiskon() {
    return 0; // default peserta umum
}

public void tampilkanSemua(LocalDate tanggalBayar, String metode) {
    System.out.println("=== DATA PESERTA ===");
    System.out.println("No KTP: " + noKTP);
    System.out.println("Nama: " + nama);
    System.out.println("Email: " + email);
    System.out.println();

    double totalAwal = 0;

    for (Pelatihan p : daftar) {
        p.tampilkanDetail();
        totalAwal += p.harga;
    }

    double diskon = getDiskon();
    double totalDiskon = totalAwal * diskon;
    double totalPajak = totalAwal * Pelatihan.PAJAK;
    double totalAkhir = totalAwal - totalDiskon + totalPajak;

    System.out.println("=== PEMBAYARAN ===");
    System.out.println("Total Harga Awal: " + totalAwal);
    System.out.println("Diskon: " + (diskon * 100) + "%");
    System.out.println("Pajak: " + (Pelatihan.PAJAK * 100) + "%");
    System.out.println("Total Harga Akhir: " + totalAkhir);
    System.out.println("Tanggal Bayar: " + tanggalBayar);
    System.out.println("Metode Pembayaran: " + metode);
}

}

// ======= Peserta Member =======
class PesertaMember extends Peserta {
private static final double DISKON = 0.01;

public PesertaMember(String noKTP, String nama, String email) {
    super(noKTP, nama, email);
}

@Override
public double getDiskon() {
    return DISKON;
}

}

// ======= Peserta Umum =======
class PesertaUmum extends Peserta {
public PesertaUmum(String noKTP, String nama, String email) {
super(noKTP, nama, email);
}
}
