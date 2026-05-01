//  Nama File : OperatorGenerik.java
//  Deskripsi : Program untuk membuat kelas OperatorGenerik yang berisi prosedur Tukar untuk menukar nilai dari dua objek generik, serta fungsi Bobot2 untuk menghitung total bobot dari dua objek Kucing.
//  Pembuat : Alyssa Shane Kurniawan - 24060124120038
//  Tanggal : 1 Mei 2026

public class OperatorGenerik {
    // class pembungkus
    public static class Box<T> {
        public T value;

        public Box(T value) {
            this.value = value;
        }
    }

    // prosedur Tukar
    public static <T> void Tukar(Box<T> a, Box<T> b) {
        T temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    // fungsi Bobot2
    public static double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}