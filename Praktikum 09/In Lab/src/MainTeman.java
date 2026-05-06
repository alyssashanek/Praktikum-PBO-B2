public class MainTeman {
    public static void main(String[] args) {
        Teman t = new Teman();

        // Tambah nama
        t.addNama("Alyssa");
        t.addNama("Puti");
        t.addNama("Cipa");

        // Tampilkan semua teman
        t.showTeman();

        // Jumlah elemen
        System.out.println("Jumlah teman: " + t.getNbelm());

        // Ambil nama berdasarkan indeks
        System.out.println("Nama indeks 1: " + t.getNama(1));

        // Ganti nama
        t.gantiNama("Puti", "Caca");

        // Set nama
        t.setNama(0, "Alin");

        // Cek membership
        System.out.println("Apakah Alyssa ada? " + t.isMember("Alyssa"));
        System.out.println("Apakah Alin ada? " + t.isMember("Alin"));

        // Hitung jumlah nama tertentu
        System.out.println("Jumlah Alyssa: " + t.countNama("Alyssa"));
        System.out.println("Jumlah Alin: " + t.countNama("Alin"));

        // Hapus nama
        t.delNama("Alyssa");

        // Tampilkan lagi
        t.showTeman();
    }
}