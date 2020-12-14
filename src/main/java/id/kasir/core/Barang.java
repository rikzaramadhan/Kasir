import java.util.Date;

interface BarangInterface{
public void check () ;
}

	class ManajemenInventori implements BarangInterface{
	protected int idBarang;
	protected int jumlahBarangMasuk; 
	protected int jumlahBarangKeluar;
	protected int jumlah;

	private int correctIdBarang = 5; 

	public ManajemenInventori(int idBarang, int jumlahBarangMasuk, int jumlahBarangKeluar){
		this.idBarang = idBarang;
		this.jumlahBarangMasuk = jumlahBarangMasuk; 
		this.jumlahBarangKeluar = jumlahBarangKeluar;

	}
	
	public void check(){
			//validasi Id 
		if(this.idBarang == this.correctIdBarang){
			System.out.println("Id Sesuai");
		}else {
			System.out.println("Id Tidak Sesuai");
		}
		if(this.jumlahBarangMasuk == this.jumlahBarangMasuk){
			System.out.println("Jumlah Barang Masuk 100 ");
		}
		if(this.jumlahBarangKeluar == this.jumlahBarangKeluar){
			System.out.println("Jumlah Barang Keluar 50 ");
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
		int jumlahBarangMasuk = 100;
		int jumlahBarangKeluar = 50;

		ManajemenInventori MI = new ManajemenInventori(idBarang, jumlahBarangMasuk, jumlahBarangKeluar);
		MI.check();
	}
}