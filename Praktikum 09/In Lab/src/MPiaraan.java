public class MPiaraan {
    public static void main(String[] args) {
        Piaraan p = new Piaraan();

        // tambah anabul
        p.enqueueAnabul(new Kucing("Milo", 7.2));
        p.enqueueAnabul(new Anjing("Oreo", 5));
        p.enqueueAnabul(new Kucing("oyen", 5.5));

        // c. tampilkan semua nama
        p.showAnabul();

        // d. jumlah kucing
        System.out.println("Jumlah kucing: " + p.countKucing());

        // e. total bobot kucing
        System.out.println("Total bobot kucing: " + p.bobotKucing());

        // f. tampilkan nama + jenis
        p.showJenisAnabul();
    }
}