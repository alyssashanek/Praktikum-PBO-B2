import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan
 *            key (NIM) dan value (Nama Mahasiswa).
 */

public class LambdaMap {
    public static void main(String[] args) {
        // Membuat objek Map dengan NIM sebagai Key (String) dan Nama sebagai Value (String)
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060124120001", "Adi");
        mahasiswaMap.put("24060124120002", "Bambang");
        mahasiswaMap.put("24060124120003", "Cici");
        mahasiswaMap.put("24060124120004", "Didi");

        // Menggunakan lambda pada Map.forEach untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}