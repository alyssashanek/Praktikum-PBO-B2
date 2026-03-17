import java.time.LocalDate;

public class DosenTetap extends Dosen {
    protected String nidn;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tglLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNIDN() { 
        return nidn; 
    }

    public void setNIDN(String nidn) { 
        this.nidn = nidn; 
    }

    public LocalDate getTanggalPensiun() {
        return tglLahir.plusYears(65).plusMonths(1).withDayOfMonth(1);
    }

    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    public String formatTanggal(LocalDate date) {
        String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
        return date.getDayOfMonth() + " " + bulan[date.getMonthValue()-1] + " " + date.getYear();
    }

    public String formatRupiah(double angka) {
        String hasil = String.format("%,.2f", angka);
        hasil = hasil.replace(",", "X").replace(".", ",").replace("X", ".");
        return "Rp. " + hasil;
    }

    @Override
    public void printInfo() {

    System.out.println("NIP                : " + nip);
    System.out.println("NIDN               : " + nidn);
    System.out.println("Nama               : " + nama);
    System.out.println("Tanggal Lahir      : " + formatTanggal(tglLahir));
    System.out.println("TMT                : " + formatTanggal(tmt));
    System.out.println("Jabatan            : Dosen Tetap");
    System.out.println("Fakultas           : " + fakultas);

    int tahun = getMasaKerja().getYears();
    int bulan = getMasaKerja().getMonths();

    System.out.println("Masa Kerja         : " + tahun + " tahun " + bulan + " bulan");
    System.out.println("Tanggal Pensiun    : " + formatTanggal(getTanggalPensiun()));
    System.out.println("Gaji Pokok         : " + formatRupiah(gajiPokok));

    double tunjangan = getTunjangan();

    System.out.println("Tunjangan          : 2% x " + tahun + " x "
            + formatRupiah(gajiPokok) + " = " + formatRupiah(tunjangan));
    }
}