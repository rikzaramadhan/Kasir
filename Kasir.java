package kasir;
import java.util.Scanner;
        
public class Kasir{  
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // membuat objek kategorilaptop
        kategoriLaptop kategorilaptop = new kategoriLaptop();
        
        // objek msi
        msi laptopMSI = new msi ();
        laptopMSI.kodeLaptop = 1;
        laptopMSI.namaLaptop = "MSI";
        laptopMSI.hargaLaptop = 10000000;
        
        //objek asus
        asus laptopASUS = new asus ();
        laptopASUS.kodeLaptop = 2;
        laptopASUS.namaLaptop = "ASUS";
        laptopASUS.hargaLaptop = 12000000;
        
         //objek acer
        acer laptopACER = new acer ();
        laptopACER.kodeLaptop = 3;
        laptopACER.namaLaptop = "ACER";
        laptopACER.hargaLaptop = 14000000;
                
                System.out.println("======================================");
                System.out.println("       TOKO MENDING RAKTIT LAPTOP     ");
                System.out.println("======================================");
                System.out.println("1. MSI              Rp. 10.000.000");
                System.out.println("2. ASUS             Rp. 12.000.000");
                System.out.println("3. ACER             Rp. 14.000.000");       
                System.out.println("======================================");
                
                //input kode makanan
                System.out.print("Silahkan pilih kode pesanan : ");
                int kodeLaptop = in.nextInt();
                
                String namaLaptop = "";
                int hargaLaptop = 0;
                
                 if (kodeLaptop == laptopMSI.getkodeLaptop()) {
                     namaLaptop = laptopMSI.getnamaLaptop();
                     hargaLaptop = laptopMSI.gethargaLaptop();
                 } else if (kodeLaptop == laptopASUS.getkodeLaptop()) {
                     namaLaptop = laptopASUS.getnamaLaptop();
                     hargaLaptop = laptopASUS.gethargaLaptop();
                } else if (kodeLaptop== laptopACER.getkodeLaptop()) {
                     namaLaptop = laptopACER.getnamaLaptop();
                     hargaLaptop = laptopACER.gethargaLaptop();
                }
                 
               // kodeMakanan = in.nextInt();
                System.out.println(kodeLaptop+ "." + " "  + namaLaptop);
                
                // input jumlah pesanan
                System.out.print("Masukkan jumlah pesanan : ");
                int jp = in.nextInt();
                
                //tagihan
                int tagihan = hargaLaptop * jp;
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
