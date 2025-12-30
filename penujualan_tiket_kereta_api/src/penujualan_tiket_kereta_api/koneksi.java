/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penujualan_tiket_kereta_api;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author ACER
 */
public class koneksi {
     public static Connection Ukoneksi(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/kereta_api", 
            "root", 
            ""
        );
        // Hapus JOptionPane ini agar tidak muncul terus
        // JOptionPane.showMessageDialog(null,"Koneksi database berhasil");
        return cn;
    } catch (Exception e) { 
        JOptionPane.showMessageDialog(null,"error" + e.getMessage());
        return null;
    }
}
}
