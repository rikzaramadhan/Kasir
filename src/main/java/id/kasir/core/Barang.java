import java.util.Date;

interface BarangInterface{
		//membuat class implements yaitu class ManajamenInventori dari interface BarangInterface
public void check () ;
}

	class ManajemenInventori implements BarangInterface{
	int idBarang;  //membuat variabel dengan tipe integer karena berupa angka
	int jumlahBarangMasuk; 
	int jumlahBarangKeluar;
	int jumlah;

	private int correctIdBarang = 5; //merupakan variabel global, yang bisa diakses dari semua fungsi

	public ManajemenInventori(int idBarang, int jumlahBarangMasuk, int jumlahBarangKeluar){ //merupakan variabel yang ada di parameter
		this.idBarang = idBarang;//this merupakan keyword yang mengacu pada class
		this.jumlahBarangMasuk = jumlahBarangMasuk; 
		this.jumlahBarangKeluar = jumlahBarangKeluar;

	}
	
	public void check(){
			//digunakan untuk mengakses variabel global dalam fungsi check
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

	public class Barang {  //membuat class Barang
	public static void main(String[] args){ //method

		Date date = new Date();//membuat tanggal otomatis 
		System.out.println(date.toString());

		int idBarang = 5; //atribut
		int jumlahBarangMasuk = 100;
		int jumlahBarangKeluar = 50;

		ManajemenInventori MI = new ManajemenInventori(idBarang, jumlahBarangMasuk, jumlahBarangKeluar);
		MI.check();
		//memanggil fungsi check dari class ManajemenInventori
	}
}