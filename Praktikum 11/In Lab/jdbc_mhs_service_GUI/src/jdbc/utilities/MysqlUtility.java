/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;
import java.sql.*;

/**
 *
 * @author regina
 */

/**
 * MysqlUtility.java (utilities)
 * Kelas ini digunakan untuk mengelola koneksi dengan basis data yang digunakan.
 */
public class MysqlUtility {
    
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Registrasi driver MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Sesuaikan host, port, dan nama database
                // Menggunakan nama database pbo sesuai langkah sebelumnya
                String url = "jdbc:mysql://localhost:3306/pbo"; 
                
                // Sesuaikan username dan password
                String user = "root"; 
                String password = "12345678";
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}