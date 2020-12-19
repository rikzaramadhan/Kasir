/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class configDatabase {
 
    public static Connection con;
    public static Statement stm;
    public static void main(String []args) {
        
        try {
            String url ="jdbc:mysql://localhost/kasir";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
    
=======
import java.sql.*;

public class configDatabase {
    
    private String HOSTNAME = "127.0.0.1";
    private String USERNAME = "root";
    private String DBNAME = "kasirKevin";
    private int PORT = 3306;

    protected String getJdbcDatabaseUrl() {
        return String.format("jdbc:mysql://%s:%s@%s:%d/%s", this.USERNAME, this.HOSTNAME, this.PORT, this.DBNAME);
    }
>>>>>>> e2dae0e3b425abcc55f78a20a8962eed7f07df14
}

