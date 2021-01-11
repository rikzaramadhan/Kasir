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
import id.kasir.app.models.Productpost;
import java.util.ArrayList;
import java.util.List;

public class ProductService extends Service implements userInterface{//melakukan inheritance dari service dan userinterface
   String txtCode;
   String txtName;
   String txtPrice;
   String txtStock;
    
    @Override
    public boolean insertBarang(Productpost Productpost) {//membuat fungsi untuk memasukkan data
        String sql = "INSERT INTO barang (`Code`, `Name`, `Price`, `Stock`) VALUES ('%s', '%s', '%d', '%d')";//membuat query sql yang akan dijalankan
        sql = String.format(sql, Productpost.getCode(), Productpost.getName(), Productpost.getPrice(), Productpost.getStock());//mengambil nilai dari variabel

        try {
            Statement stmt = this.connection.createStatement();//membuat statement query
            stmt.execute(sql);//mengeksekusi perintah sql yang sudah dibuat
            return true;
        } catch (SQLException e) { //menampilkan pesan eror jika fungsi insert tidak dapat dilakukan
            System.out.println(e);
            return false;
        }
    }

    public List<Productpost> selectBarang() {
        //mendeklarasikan variabel untuk menampung data produk
        List<Productpost> products = new ArrayList<>();
        String sql = "SELECT * FROM barang";//query sql yang akan dijalankan

        try {
            Statement stmt = this.connection.createStatement();//membuat statement query
            ResultSet result = stmt.executeQuery(sql);//mengeksekusi perintah sql yang sudah dibuat

            while (result.next()) {//melooping hasil dari query
                Productpost product = new Productpost();//memasukkan data yang di dpt ke dlm objek product post
                product.setCode(result.getString("Code"));
                product.setName(result.getString("Name"));
                product.setPrice(result.getInt("Price"));
                product.setStock(result.getInt("Stock"));
                
                products.add(product);//menambahkan objek produk ke dalam array data produk
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return products;
    }

    @Override
    public boolean updateBarang(Productpost Productpost) {//membuat fungsi untuk memasukkan data
        String sql = "UPDATE barang SET Stock=%d, Name = '%s', Price = %d WHERE Code='%s'";//membuat query sql yang akan dijalan
        sql = String.format(sql, Productpost.getStock(), Productpost.getName(), Productpost.getPrice(), Productpost.getCode());//mengambil nilai dari variabel

        try {
            Statement stmt = this.connection.createStatement();//membuat statement query
            stmt.execute(sql);//mengeksekusi perintah sql yang sudah dibuat
            return true;
        } catch (SQLException e) {//menampilkan pesan eror jika fungsi  tidak dapat dilakukan
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean deleteBarang(Productpost Productpost) {//membuat fungsi untuk memasukkan data
        String sql = "DELETE FROM barang WHERE Code='%s'";//membuat query sql yang akan dijalankan 
        sql = String.format(sql, Productpost.getCode());//mengambil nilai dari variabel

        try {
            Statement stmt = this.connection.createStatement();//membuat statement query
            stmt.execute(sql);//mengeksekusi perintah sql yang sudah dibuat
             
            return true;
        } catch (SQLException e) {//menampilkan pesan eror jika fungsi tidak dapat dilakukan
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean selectBarang(Productpost productpost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}