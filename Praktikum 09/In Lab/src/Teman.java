import java.util.ArrayList;

public class Teman {
    private int nbelm;
    private ArrayList<String> Lnama;

    // Konstruktor
    public Teman() {
        Lnama = new ArrayList<>();
        nbelm = 0;
    }

    // a. getNbelm()
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama(indeks)
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        }
        return "Indeks tidak valid";
    }

    // c. setNama(indeks, nama)
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // d. addNama(nama)
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama(nama)
    public void delNama(String nama) {
        if (Lnama.remove(nama)) {
            nbelm--;
        }
    }

    // f. isMember(nama)
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama(nama, namabaru)
    public void gantiNama(String nama, String namabaru) {
        int index = Lnama.indexOf(nama);
        if (index != -1) {
            Lnama.set(index, namabaru);
        }
    }

    // h. countNama(nama)
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }

    // i. showTeman()
    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String nama : Lnama) {
            System.out.println("- " + nama);
        }
    }
}