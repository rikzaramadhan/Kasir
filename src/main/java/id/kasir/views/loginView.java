/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kasir.app.view;

import id.kasir.app.core.loginService;
import id.kasir.app.core.userInterface;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loginView extends JFrame {
//mendeklarasikan objek frame,button,label,textField, dan passwordField
    static JFrame frame = new JFrame();
    static JLabel lbJudul = new JLabel("Login");
    static JLabel lbUsername = new JLabel("Username");
    static JLabel lbPassword = new JLabel ("Password");
    
    static JTextField txtUsername = new JTextField();
    static JTextField txtPassword = new JPasswordField();
    static JButton btnLogin = new JButton("Login");
    static JButton btnRegister = new JButton("Registrasi");  

    //membuat prosedur layout menu
static void Menu (){
        //set judul frame
        frame.setTitle("Toko Alat Tulis");
        //set ukuran
        frame.setSize(500, 350);
        //set posisi frame berada di tengah layar
        frame.setLocationRelativeTo(null);
        //set tombol close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Agar frame muncul saat di run
        frame.setVisible(true);
        //set layout frame
        frame.setLayout(null);
        
        //memasukkan komponen label, txtField, Button ke dalam Frame
        frame.add(lbJudul);
        frame.add(lbUsername);
        frame.add(lbPassword);
        frame.add(txtUsername);
        frame.add(txtPassword);
        frame.add(btnLogin);
        frame.add(btnRegister);
        

        //menentukan posisi komponen label,txtField, button
        
        lbJudul.setBounds(200, 30, 100, 40);
        lbJudul.setFont(new java.awt.Font("Tohama", 1, 28));
        lbUsername.setBounds(90, 80, 100, 30);
        lbPassword.setBounds(90, 120, 100, 30);
        txtUsername.setBounds(200, 80, 160, 30);
        txtPassword.setBounds(200, 120, 160, 30);
        btnLogin.setBounds(200, 160, 100, 20);
        btnRegister.setBounds(200, 200, 100, 20);
    }
    
    //untuk button login
     static void Login(){
      //melakukan eksekusi
       btnLogin.addActionListener(new ActionListener(){
           
      @Override
      
       public void actionPerformed(ActionEvent e){                     
       String username = txtUsername.getText().toString(); //untuk menginput username
       String password = txtPassword.getText().toString();  // untuk menginput password
       
       loginService service = new loginService(); 
       boolean isValid = service.selectUser(username, password); //validasi username dan password
       if (isValid) {
         
        JOptionPane.showMessageDialog(null,"Login sukses");
        
        //untuk pindah ke form layout
        LayoutView form = new LayoutView();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        //this.dispose();
        
       } else {
        
        JOptionPane.showMessageDialog(null,"Username/Password salah");
        
       }      
       } 

    });
    }
       //untuk button register
       static void Registrasi(){
       //melakukan eksekusi
       btnRegister.addActionListener(new ActionListener(){
       
       @Override
       public void actionPerformed(ActionEvent e) {
       RegistrasiView regis;
       regis = new RegistrasiView();
       regis.setVisible(true);
       }

       } );
}
    public static void main (String [] args) {
    //mengeksekusi frame menu
    Menu();
    //mengeksekusi button login
    Login();
    //mengeksekusi button registrasi
    Registrasi();
     
    } 
       
}
