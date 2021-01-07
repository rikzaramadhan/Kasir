package id.payment.app.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class configDatabase {
 
    public static Connection con;
    public static Statement stm;
    public static void createConnection() {
        
        try {
            String url ="jdbc:mysql://localhost/kasir";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println(" ");
        } catch (ClassNotFoundException | SQLException error) {
            System.err.println("koneksi gagal : " +error.getMessage());
        }
    }
    
}

