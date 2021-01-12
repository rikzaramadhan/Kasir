/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.kasir.app.view;

import javax.swing.*;
import java.awt.Image;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author LaptopKU
 */
public class DashboardView extends JFrame{
     JMenu menu;  
          JMenuItem i1, i2, i3;  
          DashboardView(){  
          JFrame f= new JFrame("TOKO SERBA ADA");  
          JMenuBar mb=new JMenuBar();  
          menu=new JMenu("Menu");   
          i1=new JMenuItem("Absen");  
          i2=new JMenuItem("Pembayaran");  
          i3=new JMenuItem("Laporan");  
          
          //image.setBackground 
          menu.add(i1); menu.add(i2); menu.add(i3);   
          mb.add(menu);  
          f.setJMenuBar(mb);  
          f.setSize(400,400);  
          f.setLayout(null);  
          f.setVisible(true); 
     }
  public static void main(String args[])  {  
  new DashboardView(); 

}
}
