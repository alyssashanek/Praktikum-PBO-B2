//  Nama File : ExceptionOnArray.java
//  Deskripsi : Program penggunaan eksepsi menggunakan class library Java
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 30 Maret 2026

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}