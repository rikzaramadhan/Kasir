/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import java.sql.*;
import java.util.Scanner;

public class Main {
    public class db extends configDatabase {
    
     public boolean showData (modelsdbpayment post) {
         try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        String sql = "SELECT * FROM barang";
           try {
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int harga_barang = rs.getInt("id_buku");
                String nama_barang = rs.getString("judul");

                
                System.out.println(String.format("%d. %s", harga_barang, nama_barang));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

     }

        private void showMenu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    }
    public static void main(String[] args) { 
        
//
          int sizeArray = 3;
          Scanner input = new Scanner(System.in);
          
        //object
          Payment pay = new Payment();
          Product[] items = new Product[sizeArray];
      
        //Array items
          int[] codeItems = new int[] {1,2,3};          
          String[] nameItems = new String[] {"MSI","ASUS","ACER"};
          int[] priceItems =  new int[] {10000000,12000000,14000000};

        //Logic
        for (int i = 0; i < sizeArray; i++){
          items[i] = new Product();
          items[i].setCode(codeItems[i]);
          items[i].setName(nameItems[i]);
          items[i].setPrice(priceItems[i]);
        }
   
        // just for simple interface XD
          System.out.println("=======================================");
          System.out.println("       TOKO MENDING RAKIT LAPTOP     ");
          System.out.println("=======================================");
          System.out.println("1. MSI                  Rp. 10.000.000");
          System.out.println("2. ASUS                 Rp. 12.000.000");
          System.out.println("3. ACER                 Rp. 14.000.000");       
          System.out.println("=======================================");
          
        // items and total
          System.out.print("Kode Barang   : ");
          int Code = input.nextInt();
          Product p = items[Code - 1];
          pay.setProduct(p);
          System.out.print("Jumlah        : ");
          pay.setAmount(input.nextInt());
          System.out.println("Barang        : " + p.getName());
          System.out.println("=======================================");
          
         // bill
          System.out.println("Tagihan       : " + pay.Bill());
          System.out.println("=======================================");
          
        // payment
          System.out.print("Pembayaran    : ");
          pay.setPayment(input.nextInt());
          System.out.println("Kembalian     : " + pay.moneyChanges());

          System.out.println("=======================================");
          System.out.println("              MAKASIH LO              ");
          System.out.println("=======================================");
    }
    }   
    



