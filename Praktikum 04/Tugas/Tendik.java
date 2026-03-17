import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    protected String bidang;

    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() { 
        return bidang; 
    }

    public void setBidang(String bidang) { 
        this.bidang = bidang; 
    }

    public LocalDate getTanggalPensiun() {
        return tglLahir.plusYears(55).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        Period mk = getMasaKerja();
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun : " + getTanggalPensiun());
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}