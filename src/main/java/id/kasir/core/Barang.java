import java.util.Date;

interface BarangInterface{
public void check () ;
}

	class ManajemenInventori implements BarangInterface{
	int idBarang;  
	String nama;
	int harga;
	int jumlahBarangMasuk; 
	int jumlahBarangKeluar;
	int jumlah;

	public ManajemenInventori(int idBarang, int jumlahBarangMasuk, int jumlahBarangKeluar){ 
		this.idBarang = idBarang;
		this.nama = nama;
		this.harga = harga;
		this.jumlahBarangMasuk = jumlahBarangMasuk; 
		this.jumlahBarangKeluar = jumlahBarangKeluar;

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
		if(this.jumlahBarangMasuk == this.jumlahBarangMasuk){
			System.out.println("Jumlah Barang Masuk = 100 ");
		}
		if(this.jumlahBarangKeluar == this.jumlahBarangKeluar){
			System.out.println("Jumlah Barang Keluar = 50 ");
		}
			jumlah = jumlahBarangMasuk - jumlahBarangKeluar;
			System.out.println("Jumlah = " + jumlah );
	}
}



	public class Barang {  
	public static void main(String[] args){ 

		Date date = new Date();
		System.out.println(date.toString());

		int idBarang = 5; 
		String nama = "Kopi";
		int harga = 4000;
		int jumlahBarangMasuk = 100;
		int jumlahBarangKeluar = 50;

		ManajemenInventori MI = new ManajemenInventori(idBarang, jumlahBarangMasuk, jumlahBarangKeluar);
		MI.check();
	}
}
