//  Nama File : PolimorfismeCoersion.java
//  Deskripsi : Program untuk mengilustrasikan konsep polimorfisme coercion dalam Java, termasuk konversi tipe data dan operasi pada string dan angka.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 25 April 2026

public class PolimorfismeCoersion {
    public static void main(String[] args) {
        // a. Buatlah program Java yang mengilustrasikan konsep polimorfisme tersebut!
        int nilaiInteger = 65;
        char nilaiChar = (char) nilaiInteger;
        double nilaiDouble = (double) nilaiInteger;

        System.out.println("Nilai Integer: " + nilaiInteger);
        System.out.println("Nilai Char: " + nilaiChar);
        System.out.println("Nilai Double: " + nilaiDouble);

        // b. Misalnya sebuah nilai integer yang sudah diubah menjadi real, akan dikembalikan ke format integer di dalam variabel yang berbeda, tuliskan kode programnya!
        int nilaiIntegerDariDouble = (int) nilaiDouble;
        System.out.println("Nilai Integer dari Double: " + nilaiIntegerDariDouble);

        // c. Diberikan objek String X dan Y masing-masing bernilai “1234” dan “5678”. Objek String S merupakan hasil konkatenasi X dan Y. Sedangkan objek Integer Z merupakan hasil penjumlahan angka X dan Y. Tuliskan kode program yang merealisasikan keadaan tersebut!
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y: " + S);
        System.out.println("Penjumlahan X dan Y: " + Z);

        // d. Diberikan objek String P dan Q masing-masing bernilai “12.34” dan “56.78”. Objek String R merupakan hasil konkatenasi P dan Q. Sedangkan objek Double D merupakan hasil penjumlahan angka P dan Q. Tuliskan kode program yang merealisasikan keadaan tersebut!
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q: " + R);
        System.out.println("Penjumlahan P dan Q: " + D);

        // e. Buatlah sebuah objek Integer A yang diisi hasil konversi nilai S! Tampilkan A!
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai A: " + A);

        // f. Buatlah sebuah objek String T yang diisi hasil konversi nilai A! Tampilkan T!
        String T = A.toString();
        System.out.println("Nilai T: " + T);
    }
}