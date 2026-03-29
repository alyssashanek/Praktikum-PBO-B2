//  Nama File : MBangunDatar.java
//  Deskripsi : Main class untuk menguji class Persegi dan Lingkaran yang merupakan turunan dari BangunDatar
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 Maret 2026

public class MBangunDatar {
    public static void main(String[] args) {
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        System.out.println("=== Persegi P1 ===");
        System.out.println("Luas: " + P1.getLuas());
        System.out.println("Keliling: " + P1.getKeliling());

        System.out.println("\n=== Persegi P2 ===");
        System.out.println("Luas: " + P2.getLuas());
        System.out.println("Keliling: " + P2.getKeliling());

        System.out.println("\n=== Lingkaran L1 ===");
        System.out.println("Luas: " + L1.getLuas());
        System.out.println("Keliling: " + L1.getKeliling());

        System.out.println("\n=== Lingkaran L2 ===");
        System.out.println("Luas: " + L2.getLuas());
        System.out.println("Keliling: " + L2.getKeliling());

        // Cek luas
        System.out.println("P1 vs P2 (Luas): " + P1.isEqualLuas(P2));
        System.out.println("P1 vs L1 (Luas): " + P1.isEqualLuas(L1));
        System.out.println("L1 vs L2 (Luas): " + L1.isEqualLuas(L2));

        // Cek keliling
        System.out.println("P1 vs P2 (Keliling): " + P1.isEqualKeliling(P2));
        System.out.println("P1 vs L1 (Keliling): " + P1.isEqualKeliling(L1));
        System.out.println("L1 vs L2 (Keliling): " + L1.isEqualKeliling(L2));

        ((IResize) P1).zoomIn();
        ((IResize) L1).zoomOut();
        P2.zoom(200);
        L2.zoom(50);

        System.out.println("P1 luas: " + P1.getLuas());
        System.out.println("P2 luas: " + P2.getLuas());
        System.out.println("L1 luas: " + L1.getLuas());
        System.out.println("L2 luas: " + L2.getLuas());
    }
}