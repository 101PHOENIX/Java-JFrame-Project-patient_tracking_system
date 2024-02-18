/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ŞerafettinDoruk_SEZER_2021221038_bp2_Project;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PatientLoginConnection {

    Connection con = null;

    public static Connection PatientLoginConnectionDB() {

        try {
            //Hangi SQL sistemini kullandığımı belirtiyorum.
            Class.forName("org.sqlite.JDBC");
            // Uygulamada oluşturduğum database'sin yolunu veriyorum.
            Connection con = DriverManager.getConnection("jdbc:sqlite:PatientLoginDB.db");
            // Bağlantı doğru sağlanırsa, Komut satırına bu yazıyı yazdırıyorum.
            System.out.println("Connection Succeeded");
            return con;
        } catch (Exception e) {
            // Bağlantı sağlanamazsa, Komut satırına bu yazıyı ve neden sağlanamadığını yazdırıyorum.
            System.out.println("Connection Failed" + e);
            return null;

        }

    }
}
