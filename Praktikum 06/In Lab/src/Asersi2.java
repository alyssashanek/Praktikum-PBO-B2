//  Nama File : Asersi2.java
//  Deskripsi : Program untuk demo asersi yang akan menolak input jari-jari lingkaran yang bernilai nol
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 30 Maret 2026

// PETANYAAN : 
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
// Jelaskan pada lembar laporan praktikum!

// JAWABAN :
// Penggunaan assert untuk memvalidasi nilai jari-jari kurang tepat karena assert hanya digunakan untuk 
// debugging dan dapat dinonaktifkan saat program dijalankan. Karena assert bisa tidak aktif, pesan
// "Jari-jari tidak boleh nol atau negatif" tidak selalu muncul. Oleh karena itu, untuk validasi input 
// seharusnya menggunakan percabangan seperti if-else, sehingga program dapat selalu menampilkan pesan 
// yang sesuai kepada pengguna.
// contoh percabangan if-else:
// if (jariJari <= 0) {
//  System.out.println("Jari-jari tidak boleh nol atau negatif!");
//  return;
//}

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);
    }
}