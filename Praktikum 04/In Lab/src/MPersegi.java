public class MPersegi {
    public static void main(String[] args) {

        // Membuat objek Persegi
        Persegi p1 = new Persegi(5, "Putih", "Hitam");
        Persegi p2 = new Persegi(8, "Biru", "Merah");

        // Menampilkan info persegi
        System.out.println("=== Persegi 1 ===");
        p1.printInfo();
        System.out.println("Luas: " + p1.getLuas());
        System.out.println("Keliling: " + p1.getKeliling());
        System.out.println("Diagonal: " + p1.getDiagonal());

        System.out.println();

        System.out.println("=== Persegi 2 ===");
        p2.printInfo();
        System.out.println("Luas: " + p2.getLuas());
        System.out.println("Keliling: " + p2.getKeliling());
        System.out.println("Diagonal: " + p2.getDiagonal());

        System.out.println();

        // Tes static method counter
        BangunDatar.printCounterBangunDatar();
        Persegi.printCounterBangunDatar();
    }
}