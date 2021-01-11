/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.app.models;

/**
 *
 * @author SYAFRINA DYAH
 */
public class registrationPost {

    static String Id;
    static String username;
    static String email;
    static String levelUser;
    static String password;
    static String confirmpassword;
    //deklarasi variable dengan modifier private agar hanya dapat diakses class itu sendiri.
    
    public static String getId() { // membuat method getter
        return registrasiPost.Id;
    }
    
    public static String getUsername() {
        return registrasiPost.username;
    }
    
    public static String getEmail() {
        return registrasiPost.email;
    }
    
    public static String getLevelUser() {
        return registrasiPost.levelUser;
    }
    
    public static String getPassword() {
        return registrasiPost.password;
    }
    
    public static String getConfirmpassword() {
        return registrasiPost.confirmpassword;
    }
    
    public static void setId(String Id) { // membuat method setter
        registrasiPost.Id = Id;
    }

    public static void setUsername(String username) {
        registrasiPost.username = username;
    }

    public static void setEmail(String email) {
        registrasiPost.email = email;
    }
    
    public static void setLevelUser(String levelUser) {
        registrasiPost.levelUser = levelUser;
    }
    
    public static void setPassword(String password) {
        registrasiPost.password = password;
    }
    
    public static void setConfirmpassword(String confirmpassword) {
        registrasiPost.confirmpassword = confirmpassword;
    }}
//mengambil dan mengisi data dalam model