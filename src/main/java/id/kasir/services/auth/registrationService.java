/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.app.core;

import java.sql.SQLException;
import java.sql.Statement;
import kasir.app.models.registrationPost;
// mengimport package yg dibutuhkan

/**
 *
 * @author SYAFRINA DYAH
 */
public class registrationService extends service implements userInterfaceregis{ 
// melakukan inheritance atau turunan dari service dan interface dari userinterface
    
    @Override
    public boolean functionInsert (registrationPost registrationPost) { // membuat fungsi untuk memasukkan data
        String sql = "INSERT INTO akun (`Id`, `username`, `email`, `levelUser`, `password`, `confirmpassword`) VALUES ('%s', '%s', '%s', '%s', '%s', '%s')"; 
        // melakukan querry insert yg akan dieksekusi atau dijalankan
        sql = String.format(sql, registrationPost.getId(), registrationPost.getUsername(), registrationPost.getEmail(),registrationPost.getLevelUser(), registrationPost.getPassword(), registrationPost.getConfirmpassword());
        // mengambil nilai dari variabel
    
        try{
            Statement stmt = this.connection.createStatement();
            // membuat objek statement untuk menjalankan perintah sql
            stmt.execute(sql);// menjalankan querry
            return true;
        } catch (SQLException e) {// menampilkan pesan eror jika fungsi insert tidak dapat dilakukan
            System.out.println(e);
            return false;
        }}}
    
  