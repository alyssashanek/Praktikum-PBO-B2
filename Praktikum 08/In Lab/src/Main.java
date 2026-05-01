//  Nama File : Main.java
//  Deskripsi : Main class untuk menjalankan program yang mendemonstrasikan penggunaan generik pada kelas, operator, dan larik dengan objek-objek dari kelas Kucing, Anggora, dan Kembangtelon.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 1 Mei 2026

public class Main {
    public static void main(String[] args) {
        System.out.println("\n===== I. GENERIK PADA CLASS =====");
        Anggora k1 = new Anggora("Milo", 3.5);
        Kembangtelon k2 = new Kembangtelon("Luna", 2.8);

        // generic Datum
        Datum<Kucing> data = new Datum<>();

        // simpan Anggora
        data.setIsi(k1);
        data.getIsi().tampilInfo();
        data.getIsi().gerak();
        data.getIsi().bersuara();
        System.out.println("------------------");

        // ganti isi dengan KembangTelon
        data.setIsi(k2);
        data.getIsi().tampilInfo();
        data.getIsi().gerak();
        data.getIsi().bersuara();

        System.out.println("\n===== II. GENERIK PADA OPERATOR =====");

        // integer
        OperatorGenerik.Box<Integer> a = new OperatorGenerik.Box<>(3);
        OperatorGenerik.Box<Integer> b = new OperatorGenerik.Box<>(6);
        System.out.println("Sebelum Tukar (Integer): a = " + a.value + ", b = " + b.value);
        OperatorGenerik.Tukar(a, b);
        System.out.println("Setelah Tukar (Integer): a = " + a.value + ", b = " + b.value);

        // string
        OperatorGenerik.Box<String> s1 = new OperatorGenerik.Box<>("Anjing");
        OperatorGenerik.Box<String> s2 = new OperatorGenerik.Box<>("Kucing");
        System.out.println("\nSebelum Tukar (String): s1 = " + s1.value + ", s2 = " + s2.value);
        OperatorGenerik.Tukar(s1, s2);
        System.out.println("Setelah Tukar (String): s1 = " + s1.value + ", s2 = " + s2.value);

        // anabul
        OperatorGenerik.Box<Kucing> box1 = new OperatorGenerik.Box<>(k1);
        OperatorGenerik.Box<Kucing> box2 = new OperatorGenerik.Box<>(k2);
        System.out.println("\nSebelum Tukar (Kucing):");
        box1.value.tampilInfo();
        box2.value.tampilInfo();
        OperatorGenerik.Tukar(box1, box2);
        System.out.println("\nSetelah Tukar (Kucing):");
        box1.value.tampilInfo();
        box2.value.tampilInfo();

        // Bobot2
        double total = OperatorGenerik.Bobot2(box1.value, box2.value);
        System.out.println("\nTotal bobot: " + total + " kg");

        System.out.println("\n===== III. LARIK GENERIK =====");
        Data<Kucing> dataKucing = new Data<>();

        // isi data
        dataKucing.setIsi(1, k1);
        dataKucing.setIsi(2, k2);

        // tampilkan isi
        System.out.println("Isi Data:");
        for (int i = 1; i <= dataKucing.getSize(); i++) {
            Kucing k = dataKucing.getIsi(i);
            if (k != null) {
                k.tampilInfo();
                k.gerak();
                k.bersuara();
                System.out.println();
            }
        }

        // tampilkan size
        System.out.println("Jumlah elemen: " + dataKucing.getSize());
    }
}