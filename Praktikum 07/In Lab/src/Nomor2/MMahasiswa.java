//  Nama File : MMahasiswa.java
//  Deskripsi : Program untuk contoh aplikasi kelas Mahasiswa dengan berbagai konstruktor dan metode untuk menampilkan informasi mahasiswa.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

package Nomor2;
public class MMahasiswa {
    public static void main(String[] args) {
        // b. Buatlah aplikasi kelas Mahasiswa dengan membuat beberapa objek Mahasiswa menggunakan ketiga konstruktor yang sudah dibuat!
        Mahasiswa m1 = new Mahasiswa();
        Mahasiswa m2 = new Mahasiswa("24060124120038", "Puti Shasta", "Teknik Kimia");
        Mahasiswa m3 = new Mahasiswa(m2);

        System.out.println("Informasi Mahasiswa 1:");
        m1.tampilkanInfo();
        System.out.println("\nInformasi Mahasiswa 2:");
        m2.tampilkanInfo();
        System.out.println("\nInformasi Mahasiswa 3:");
        m3.tampilkanInfo();

        // tanpa parameter, dengan string, dan dengan parameter objek mahasiswa
        m1.setProgramStudi();
        System.out.println("\nInformasi Mahasiswa 1 setelah setProgramStudi tanpa parameter:");
        m1.tampilkanInfo();

        m1.setProgramStudi("Sistem Informasi");
        System.out.println("\nInformasi Mahasiswa 1 setelah setProgramStudi dengan String:");
        m1.tampilkanInfo();

        m1.setProgramStudi(m2);
        System.out.println("\nInformasi Mahasiswa 1 setelah setProgramStudi dengan objek Mahasiswa lain:");
        m1.tampilkanInfo();
    }
}
