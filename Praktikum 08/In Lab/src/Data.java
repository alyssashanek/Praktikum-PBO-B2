//  Nama File : Data.java
//  Deskripsi : Program untuk membuat kelas Data yang dapat menyimpan elemen dengan tipe data generik
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 1 Mei 2026

public class Data<T> {
    private static final int max = 100;
    private Object[] ruang; 
    private int banyak;

    public Data() {
        ruang = new Object[max];
        banyak = 0;
    }

    // setIsi: isi elemen di posisi tertentu (1-100)
    public void setIsi(int posisi, T nilai) {
        if (posisi >= 1 && posisi <= max) {
            ruang[posisi - 1] = nilai;

            if (posisi > banyak) {
                banyak = posisi;
            }
        } else {
            System.out.println("Posisi tidak valid!");
        }
    }

    // getIsi: ambil elemen di posisi tertentu
    @SuppressWarnings("unchecked")
    public T getIsi(int posisi) {
        if (posisi >= 1 && posisi <= banyak) {
            return (T) ruang[posisi - 1];
        } else {
            return null;
        }
    }

    // getSize: jumlah elemen
    public int getSize() {
        return banyak;
    }
}