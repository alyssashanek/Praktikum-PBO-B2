import java.time.LocalDate;

public class MPerguruanTinggi {
    public static void main(String[] args) {
        // Dosen Tetap
        DosenTetap d1 = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika"
        );
        d1.printInfo();
        System.out.println("\n============================\n");

        // Dosen Tamu
        DosenTamu d2 = new DosenTamu(
                "1234567890",
                "99887766",
                "Cadera",
                LocalDate.of(1985, 8, 10),
                LocalDate.of(2020, 2, 1),
                4500000,
                "Fakultas Teknik",
                LocalDate.of(2026, 12, 31)
        );
        d2.printInfo();
        System.out.println("\n============================\n");

        // Tendik
        Tendik t1 = new Tendik(
                "5678901234",
                "Timi",
                LocalDate.of(1992, 3, 10),
                LocalDate.of(2018, 6, 1),
                4000000,
                "Akademik"
        );
        t1.printInfo();
    }
}