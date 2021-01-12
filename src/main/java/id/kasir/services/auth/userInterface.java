/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kasir.app.core;

import id.kasir.app.model.loginpost;
/**
 *
 * @author LaptopKU
 */
// menampung function yang akan diturunkan pada login service
public interface userInterface {
    public boolean selectUser(String password, String username); // mengecek akun berdasarkan password dan username
}
