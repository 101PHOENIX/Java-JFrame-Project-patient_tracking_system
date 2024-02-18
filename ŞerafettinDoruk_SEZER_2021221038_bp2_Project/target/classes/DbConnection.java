
package ŞerafettinDoruk_SEZER_2021221038_bp2_Project;

import java.sql.*;


public class DbConnection {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LoginAccountsDB.db");
            System.out.println("Connection Succeeded");
            return con;
        } 
        catch (Exception e) {
            System.out.println("Connection Failed" + e);
            return null;
        }
        
    }
    
}
