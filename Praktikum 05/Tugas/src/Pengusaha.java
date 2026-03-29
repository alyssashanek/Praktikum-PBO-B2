import java.time.LocalDate;

public class Pengusaha extends Manusia implements Pajak {
    private String npwp;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl, String alamat, double pendapatan, String npwp){
        super(nama, tgl, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    public String getNpwp(){
        return npwp;
    }

    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    @Override
    public double hitungPajak(){
        return 0.15 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja(){
        int B = 3;
        return LocalDate.now().getYear() - getTglMulaiKerja().getYear() + B;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }
}