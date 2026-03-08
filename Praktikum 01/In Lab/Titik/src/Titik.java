/* Nama File: Titik.java
 * Deskripsi: berisi atribut dan method dalam class Titik
 * Pembuat: Alyssa Shane Kurniawan
 * Tanggal: 25 Februari 2026
 */

public class Titik {
    // ATRIBUT
    double absis;
    double ordinat;

    // METHOD
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // mengaembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    // mengaembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    // mengeset absis titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    // menggeser titik sejauh (x,y)
    void geser (double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan kuadran titik
    int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    // menghitung jarak ke pusat (0,0)
    double getJarakPusat(){
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }
    
    // menghitung jarak ke titik lain
    double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    // refleksi titik terhadap sumbu x
    void RefleksiX(){
        ordinat = ordinat * -1;
    }

    // refleksi titik terhadap sumbu y
    void RefleksiY(){
        absis = absis * -1;
    }

    // mendapatkan objek titik baru hasil refleksi
    Titik getRefleksiX() {
        Titik hasil = new Titik();
        hasil.setAbsis(absis);
        hasil.setOrdinat(-ordinat);
        return hasil;
    }

    Titik getRefleksiY() {
        Titik hasil = new Titik();
        hasil.setAbsis(-absis);
        hasil.setOrdinat(ordinat);
        return hasil;
    }

    // mencetak kooordinat titik
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
} // end class titik