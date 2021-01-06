
class ManajemenInventori{
    String idBarang;  
    String name;
    int price;
    int Stock;
    
    public ManajemenInventori(String idBarang, String name, int price, int Stock){ 
        this.idBarang = idBarang;
        this.name = name;
        this.price = price;
        this.Stock = Stock; 

    }
    
    public void check(){
        if(this.idBarang == this.idBarang){
            System.out.println("Id = B2656");
        }
        if(this.name == this.name){
            System.out.println("Name = Kopi");
        }
        if(this.price == this.price){
            System.out.println("Price = 4000");
        }
        if(this.Stock == this.Stock){
            System.out.println("Stock = 100 ");
        }
} 
}
    public class Product {  
    public static void main(String[] args){ 

        String idBarang = "B2656"; 
        String name = "Kopi";
        int price = 4000;
        int Stock = 100;

        ManajemenInventori MI = new ManajemenInventori(idBarang, name, price, Stock);
        MI.check(); 
    }}