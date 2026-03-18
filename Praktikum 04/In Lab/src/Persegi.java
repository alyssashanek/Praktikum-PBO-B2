public class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi () {
        setJmlSisi(4);
    }

    public Persegi (double sisi, String warna, String border) {
        // this.sisi = sisi;
        // setWarna(warna);
        // setBorder(border);
        // setJmlSisi(4);
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @ Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Ini dari class Persegi");
    }
}
 