package kasir;
import java.util.Scanner;
        
public class Kasir{  
             int kodeLaptop, hargaLaptop;
             String namaLaptop;

            public Kasir(int kodeLaptop, String namaLaptop, int hargaLaptop){
                this.kodeLaptop = kodeLaptop;
                this.namaLaptop = namaLaptop;
                this.hargaLaptop = hargaLaptop;
            }
            //method 1
            public int getkodeLaptop(){
                return kodeLaptop;
            }
            //method 2
            public String getnamaLaptop(){
                return namaLaptop;
            }
            //method 3
            public int gethargaLaptop(){
                return hargaLaptop;
            }
            @Override
            public String toString(){
                return(this.getkodeLaptop() + this.getnamaLaptop() + this.gethargaLaptop());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kasir MSI = new Kasir(1, "MSI", 10000000);
        Kasir ASUS = new Kasir(2, "ASUS", 12000000);
        Kasir ACER = new Kasir(3, "ACER", 14000000);
        
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
                
                 if (kodeLaptop == MSI.getkodeLaptop()) {
                     namaLaptop = MSI.getnamaLaptop();
                     hargaLaptop = MSI.gethargaLaptop();
                 } else if (kodeLaptop == ASUS.getkodeLaptop()) {
                     namaLaptop = ASUS.getnamaLaptop();
                     hargaLaptop = ASUS.gethargaLaptop();
                } else if (kodeLaptop== ACER.getkodeLaptop()) {
                     namaLaptop = ACER.getnamaLaptop();
                     hargaLaptop = ACER.gethargaLaptop();
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
