/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kasir.app.core;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import id.kasir.app.model.loginpost;


public class loginService extends service implements userInterface{ //melakukan turunan dari class service dan mengimplementasikan dari userinterface

 @Override
 
public boolean selectUser(String password, String username) {  //untuk mengecek berdasarkan password dan username

        try {
            //membuat query select untuk mengecek apakah username dan password sesuai di database
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM akun WHERE `username` =? AND `password` =?"); //query yg dieksekusi
            stmt.setString(1, password);
            stmt.setString(2, username);
            
            ResultSet result = stmt.executeQuery(); //eksekusi query
            if(result.next()){
                return true;
            }
            
            return false;

        }catch (SQLException e){       //jika ada error di db, fungsi ini akan dijalankan
            System.out.println(e.getMessage());
            Logger.getLogger(loginService.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
}
}


 
