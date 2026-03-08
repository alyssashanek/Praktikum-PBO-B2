/* Nama File: MTitik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Alyssa Shane Kurniawan
 * Tanggal: 24 Februari 2026
 */

public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik();     // membuat objek titik T1(0,0)
        T1.setAbsis(3);          // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4);        // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();           // mencetak koordinat T1 ke layar
        T1.geser(3,4);        // menggeser T1 sejauh (3,4)
        T1.printTitik();           // menampilkan koordinat T1 setelah digeser
        System.out.println("Kuadran T1: " + T1.getKuadran());                    // menampilkan kuadran T1
        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());          // menampilkan jarak T1 ke pusat (0,0)
        
        Titik T2 = new Titik();     // membuat objek titik T2(0,0)
        T2.setAbsis(3);         // mengubah absis T2 dengan nilai 3
        T2.setOrdinat(4);        // mengubah ordinat T2 dengan nilai 4
        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));          // menampilkan jarak antara T1 dan T2      

        T1.RefleksiX();
        T1.printTitik();           // menampilkan koordinat T1 setelah direfleksi terhadap sumbu X
        T1.RefleksiY();
        T1.printTitik();           // menampilkan koordinat T1 setelah direfleksi

        Titik A = T2.getRefleksiX();
        A.printTitik();           // menampilkan koordinat A yang merupakan hasil refleksi T2 terhadap sumbu X
        Titik B = T2.getRefleksiY();
        B.printTitik();           // menampilkan koordinat B yang merupakan hasil refleksi T2 terhadap sumbu Y
    }

}