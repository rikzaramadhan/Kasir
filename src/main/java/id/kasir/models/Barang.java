
class ManajemenInventori{
    String idBarang;  
    String nama;
    int harga;
    int stock;
    
    public ManajemenInventori(String idBarang, String nama, int harga, int stock){ 
        this.idBarang = idBarang;
        this.nama = nama;
        this.harga = harga;
        this.stock = stock; 

    }
    
    public void check(){
        if(this.idBarang == this.idBarang){
            System.out.println("Id = B2656");
        }
        if(this.nama == this.nama){
            System.out.println("Barang = Kopi");
        }
        if(this.harga == this.harga){
            System.out.println("Harga = 4000");
        }
        if(this.stock == this.stock){
            System.out.println("Stock = 100 ");
        }
} 
}
    public class Barang {  
    public static void main(String[] args){ 

        String idBarang = "B2656"; 
        String nama = "Kopi";
        int harga = 4000;
        int stock = 100;

        ManajemenInventori MI = new ManajemenInventori(idBarang, nama, harga, stock);
        MI.check(); 
    }}