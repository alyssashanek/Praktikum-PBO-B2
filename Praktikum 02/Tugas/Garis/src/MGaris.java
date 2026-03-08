public class MGaris {
    public static void main(String[] args) {

        // Membuat beberapa titik
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Titik t3 = new Titik(0, 0);
        Titik t4 = new Titik(2, 4);

        // Membuat objek garis
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);

        // Menampilkan titik awal dan akhir
        System.out.println("=== Garis 1 ===");
        g1.printGaris();

        System.out.println("\n=== Garis 2 ===");
        g2.printGaris();

        // Panjang garis
        System.out.println("\nPanjang Garis 1: " + g1.getPanjang());
        System.out.println("Panjang Garis 2: " + g2.getPanjang());

        // Gradien
        System.out.println("Gradien Garis 1: " + g1.getGradien());
        System.out.println("Gradien Garis 2: " + g2.getGradien());

        // Titik Tengah
        Titik tengah1 = g1.getTitikTengah();
        System.out.print("Titik Tengah Garis 1: ");
        tengah1.printTitik();
        Titik tengah2 = g2.getTitikTengah();
        System.out.print("Titik Tengah Garis 2: ");
        tengah2.printTitik();

        // Cek sejajar
        System.out.println("\nApakah g1 sejajar g2? " + g1.isSejajar(g2));

        // Cek tegak lurus
        System.out.println("Apakah g1 tegak lurus g2? " + g1.isTegakLurus(g2));

        // Persamaan garis
        System.out.println("\nPersamaan Garis 1: " + g1.getPersamaanGaris());
        System.out.println("Persamaan Garis 2: " + g2.getPersamaanGaris());

        // Jumlah objek garis
        System.out.println("\nJumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}