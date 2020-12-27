/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;
import java.util.Scanner;
        
public class Pembayaran{  
             int kodeMakanan, hargaMakanan;
             String namaMakanan;

            public Pembayaran(int kodeMakanan, String namaMakanan, int hargaMakanan){
                this.kodeMakanan = kodeMakanan;
                this.namaMakanan = namaMakanan;
                this.hargaMakanan = hargaMakanan;
            }
            //method 1
            public int getkodeMakanan(){
                return kodeMakanan;
            }
            //method 2
            public String getnamaMakanan(){
                return namaMakanan;
            }
            //method 3
            public int gethargaMakanan(){
                return hargaMakanan;
            }
            @Override
            public String toString(){
                return(this.getkodeMakanan() + this.getnamaMakanan() + this.gethargaMakanan());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pembayaran kentang = new Pembayaran(1, "Kentang Goreng", 3000);
        Pembayaran telur = new Pembayaran(2, "Telur Bakar", 5000);
        Pembayaran pentol = new Pembayaran(3, "Pentol Bakar", 2000);
        
                System.out.println("======================================");
                System.out.println("\t DAFTAR HARGA MAKANAN");
                System.out.println("======================================");
                System.out.println("1. Kentang Goreng           Rp. 3000");
                System.out.println("2. Telur Bakar              Rp. 5000");
                System.out.println("3. Pentol Bakar             Rp. 2000");       
                System.out.println("======================================");
                
                //input kode makanan
                System.out.print("Silahkan pilih kode pesanan : ");
                int kodeMakanan = in.nextInt();
                
                String namaMakanan = "";
                int hargaMakanan = 0;
                
                 if (kodeMakanan == kentang.getkodeMakanan()) {
                     namaMakanan = kentang.getnamaMakanan();
                     hargaMakanan = kentang.gethargaMakanan();
                 } else if (kodeMakanan == telur.getkodeMakanan()) {
                     namaMakanan = telur.getnamaMakanan();
                     hargaMakanan = telur.gethargaMakanan();
                } else if (kodeMakanan == pentol.getkodeMakanan()) {
                     namaMakanan = pentol.getnamaMakanan();
                     hargaMakanan = pentol.gethargaMakanan();
                }
                 
               // kodeMakanan = in.nextInt();
                System.out.println(kodeMakanan+ "." + " "  + namaMakanan);
                
                // input jumlah pesanan
                System.out.print("Masukkan jumlah pesanan : ");
                int jp = in.nextInt();
                
                //tagihan
                int tagihan = hargaMakanan * jp;
                System.out.println("Tagihan : Rp. " + tagihan);
                System.out.println("======================================");
                
                //pembayaran
                System.out.print("Pembayaran : Rp. ");
                int nominal = in.nextInt();
                
                //kembalian
                System.out.println("Kembalian : Rp. " + (nominal - tagihan));
                System.out.println("======================================");

    }
    
}
