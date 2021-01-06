/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir.app.view;

/**
 *
 * @author SYAFRINA DYAH
 */

// mengimport package yg dibutuhkan
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import kasir.app.core.mysql;
import kasir.app.core.registrasiService;



public class registrationView { // membuat class registrasiView
    
    //mendeklarasikan objek frame atau tampilan ,button,label,textField
    
    static JFrame frame = new JFrame(); 
    static JLabel lbJudul = new JLabel("Registrasi");
    static JLabel lbId = new JLabel("Id");
    static JLabel lbUsername = new JLabel("Username");
    static JLabel lbEmail = new JLabel("Email");
    static JLabel lbLevelUser = new JLabel ("Level User");
    static JLabel lbPassword = new JLabel ("Password");
    static JLabel lbConfirmPassword = new JLabel ("Konfirmasi Password");
    
    // membuat dan memanggil jLabel baru dengan objek 
    static JTextField txtId = new JTextField();
    static JTextField txtUsername = new JTextField();
    static JTextField txtEmail = new JTextField();
    static JTextField txtLevelUser = new JTextField();
    static JTextField txtPassword = new JPasswordField();
    static JTextField txtConfirmPassword = new JPasswordField();
    static JButton btnRegister = new JButton("Register");
    
    public static void main(String[] args) {
        
        //memanggil prosedur tampilan dan register
        Tampilan();// menu isi dalam 1 frame
        
        Register(); // jbutton,  harus dibuatkan method
        
        New(); // membuat method New() yang digunakan untuk mengkosongkan text
        
        
    }
    
    //membuat prosedur layout tampilan
    static void Tampilan (){
        
        //memberikan judul pada tampilan frame 
        frame.setTitle("Registrasi");
        
        //menentukan ukuran menu tampilan 
        frame.setSize(550, 550);
        
        // untuk membuat tampilan frame berada di tengah layar
        frame.setLocationRelativeTo(null);
        
        //untuk menampilkan tombol close 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //untuk menampilkan tampilan frame agar muncul ke layar saat di jalankan 
        frame.setVisible(true);
        
        //untuk mengatur tampilan pada frame 
        frame.setLayout(null);
       
        
        frame.add(lbJudul);
        frame.add(lbId);
        frame.add(lbUsername); 
        frame.add(lbEmail); 
        frame.add(lbLevelUser); 
        frame.add(lbPassword);
        frame.add(lbConfirmPassword);
        // menambahkan objek label judul,username,email,level user,password,konfirmasi password pada frame tampilan
        
        frame.add(txtId);
        frame.add(txtUsername); 
        frame.add(txtEmail);
        frame.add(txtLevelUser);
        frame.add(txtPassword);
        frame.add(txtConfirmPassword);
        // menambahkan objek text username,email,level user,password,konfirmasi password pada frame tampilan
        
        frame.add(btnRegister);
        // menambahkan objek button / tombol register pada frame tampilan
        

        lbJudul.setBounds(225, 30, 100, 40);
        lbJudul.setFont(new java.awt.Font("Tohama", 1, 20));
        lbId.setBounds(90, 80, 100, 30);
        lbUsername.setBounds(90, 120, 100, 30);
        lbEmail.setBounds(90, 160, 100, 30);
        lbLevelUser.setBounds(90, 200, 100, 30);
        lbPassword.setBounds(90, 240, 100, 30);
        lbConfirmPassword.setBounds(90, 280, 150, 30);
        // mengatur letak dan ukuran dari label judul,username,email,level user,password,konfirmasi password
        
        txtId.setBounds(240, 80, 160, 30);
        txtUsername.setBounds(240, 120, 160, 30);
        txtEmail.setBounds(240, 160, 160, 30);
        txtLevelUser.setBounds(240, 200, 160, 30);
        txtPassword.setBounds(240, 240, 160, 30);
        txtConfirmPassword.setBounds(240, 280, 160, 30);
         // mengatur letak dan ukuran dari text username,email,level user,password,konfirmasi password
 
        btnRegister.setBounds(225, 350, 100, 20);
         // mengatur letak dan ukuran dari button / tombol register  
        
    }
    
    static void New(){
        txtId.setText("");
        txtUsername.setText("");
        txtEmail.setText("");
        txtLevelUser.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
    }
    
    
    //untuk button register
    static void Register(){ // untuk method tombol registrasi untuk memberikan eksekusi
      //melakukan eksekusi
       btnRegister.addActionListener(new ActionListener(){  
        // agar jbutton dari registrasi memiliki aksi

       
           
       @Override
       public void actionPerformed(ActionEvent evt){ 
        // membuat method actionPerformed 
        
       
       String id = txtId.getText();
       String username = txtUsername.getText();
       String email = txtEmail.getText();
       String leveluser = txtLevelUser.getText();
       String password = txtPassword.getText();
       String konfirmpassword = txtConfirmPassword.getText();
       // untuk memasukkan data usernaem, email, leveluser, password, konfirmasi password
       try{
           if(konfirmpassword.equals(password)){
               // untuk mengecek konfirmasi password sesuai atau tidak dengan password
               
               mysql db = new mysql();
               java.sql.Connection connection = db.getConnection();
               java.sql.Statement stmt = connection.createStatement();
               stmt.execute("INSERT INTO akun VALUES ("+"'"+txtId.getText()+"', "
                       + "'"+ txtUsername.getText()+"', "+"'"+ txtEmail.getText()+"', "
                       + "'"+ txtLevelUser.getText()+"', "+"'"+ txtPassword.getText()+"', "
                       + "'"+ txtConfirmPassword.getText()+"')");
               
                   JOptionPane.showMessageDialog(null,"Registrasi berhasil ");
                   // menampilkan pesan registrasi berhasil jika password dan konfirmasi password sama 
           
               New();
           }else{
               JOptionPane.showMessageDialog(null,"Konfirmasi password salah / ulangi ");
               // menampilkan pesan konfirmasi password salah jika password dan konfirmasi password beda
                   New();
           };
       
           } catch (SQLException e) {
               System.out.println("Error : " + e.getMessage());
           }
       }     
      
    });
    }}