import java.util.LinkedList;

public class Piaraan {
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    // konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // i. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul a){
        Lanabul.addLast(a);
        nbelm++;
    }

    // iii. isMember(anabul)
    public boolean isMember(Anabul a) {
        return Lanabul.contains(a);
    }

    // iv. getAnabul() -> mengambil data anabul pertama dalam antrian
    public Anabul getAnabul() {
        if (!Lanabul.isEmpty()) {
            return Lanabul.getFirst();
        }
        return null;
    }

    // v. dequeueAnabul() -> mengambil anabul pertama sekaligus mengeluarkannya dari antrian
    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.removeFirst();
        }
        return null;
    }

    // showAnabul() -> menampilkan nama-nama panggilan para anabul dalam antrean
    public void showAnabul() {
        System.out.println("Daftar Anabul (nama panggilan):");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama());
        }
    }

    // countKucing() -> menghitung banyak keluarga kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // bobotKucing() -> menghitung bobot keluarga kucing dalam antrean
     public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot(); // casting
            }
        }
        return total;
    }

    // showJenisAnabul() -> menampilkan nama panggilan dan jenis anabul dalam antrean
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul & Jenis:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getNama() +
                " (" + a.getClass().getName() + ")");
        }
    }
}