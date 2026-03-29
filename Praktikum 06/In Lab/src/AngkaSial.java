//  Nama File : AngkaSial.java
//  Deskripsi : Program penggunaan exception buatan sendiri
//              Pengenalan klausa 'throw' dan 'throws'
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 30 Maret 2026

// PETANYAAN :
// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Apakah baris 21 pada AngkaSial.java di atas dieksekusi? Jelaskan pada lembar praktikum anda!

// JAWABAN :
// Ketika exception terjadi pada saat pemanggilan method cobaAngka(13), baris 12 tidak dieksekusi 
// karena program langsung berhenti pada baris throw new AngkaSialException() dan keluar dari method tersebut.
// Kemudian, exception tersebut ditangkap oleh catch, sehingga baris 21 dieksekusi untuk menampilkan pesan error menggunakan getMessage().

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada class "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}