import java.time.LocalDate;

public class PNS extends Manusia implements Pajak {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl, String alamat, double pendapatan, String nip){
        super(nama, tgl, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public PNS(String nama, LocalDate tgl, double pendapatan, String nip){
        super(nama, tgl, "-", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public String getNip(){
        return nip;
    }

    public void setNip(String nip){
        this.nip = nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    @Override
    public double hitungPajak(){
        return 0.10 * getPendapatan();
    }

    @Override
    public int hitungMasaKerja(){
        int A = 8;
        return LocalDate.now().getYear() - getTglMulaiKerja().getYear() + A;
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}