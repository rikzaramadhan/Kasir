/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import java.util.Scanner;
public class Pembayaran {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        //variabel nama menu
        String menumakanan;
        
        //variabel jumlah pesanan
        int jp = 0;
        //variabel total harga pesanan
        int harga = 0;
        //h = harga
             int h1 = 5000;
             int h2 = 3000;
             int h3 = 2500;
        
       
             
        //output pilihan dan harga makanan
        System.out.println("======================================");
        System.out.println("\t DAFTAR HARGA MAKANAN");
        System.out.println("======================================");
        System.out.println("1. Kentang Goreng       Rp. 5000");
        System.out.println("2. Telur Bakar          Rp. 3000");
        System.out.println("3. Pentol Bakar         Rp. 2500");       
        System.out.println("======================================");
        
        //memilih jenis pesanan
         System.out.print("Silahkan pilih kode pesanan : ");
        
         int kode = in.nextInt();
         System.out.println("======================================");

            switch (kode) {
                case 1:
                    menumakanan = " Kentang Goreng";
                    System.out.println("Pilihan anda " +menumakanan);
                    harga = harga + h1;
                    break;
                case 2:
                    menumakanan = " Telur Bakar";
                    System.out.println("Pilihan anda "+menumakanan);
                    harga = harga + h2;
                    break;
                case 3:
                    menumakanan = " Pentol Bakar";
                    System.out.println("Pilihan anda "+menumakanan);
                    harga = harga + h3;
                    break;
                //output jika kode tidak terdapat pada menu
                default:
                    System.out.println("Nomor yang dipilih tidak ada di menu.");
                    break;
            }
        //input jumlah pesanan
        System.out.print("Silahkan masukkan jumlah pesanan : ");
        jp = in.nextInt();
        
      // output total harga
        int tagihan = harga*jp;
        System.out.println("Tagihan : Rp. "+(tagihan));
        System.out.println("======================================");
      // output kembalian customer  
      System.out.print("Pembayaran Rp. ");
      int nominal = in.nextInt();
        System.out.println("kembalian Rp."+(nominal-tagihan));
       
        System.out.println("======================================");
        
    }
}

