import java.util.Date;

interface BarangKeluarInterface{
	//membuat class implements yaitu class ManajamenInventori dari interface BarangKeluarInterface
public void check () ;
}

	class ManajemenInventori implements BarangKeluarInterface{
	int IdBarang; //membuat variabel dengan tipe integer karena berupa angka 
	int JumlahBarangKeluar; 

	private int correctIdBarang = 5; //merupakan variabel global, yang bisa diakses dari semua fungsi

	public ManajemenInventori(int IdBarang, int JumlahBarangKeluar){ //merupakan variabel yang ada di parameter
		this.IdBarang = IdBarang;
		this.JumlahBarangKeluar = JumlahBarangKeluar; 
	}
	
	public void check(){
			//digunakan untuk mengakses variabel golbal dalam fungsi check
			if (this.IdBarang == this.correctIdBarang){
			System.out.println("Id Sesuai");
		}	else {
			System.out.println("Id Tidak Sesuai");
		}
			if(this.JumlahBarangKeluar == this.JumlahBarangKeluar){
			System.out.println("Jumlah Barang Keluar 50 ");
		}
	}
}

	public class BarangKeluar { //membuat class BarangKeluar
	public static void main(String[] args){//method

		Date date = new Date(); //membuat tanggal otomatis
		System.out.println(date.toString());

		int inputIdBarang = 5;
		int inputJumlahBarangKeluar = 50; //barang keluar sisa barang keluar

		ManajemenInventori MI = new ManajemenInventori(inputIdBarang, inputJumlahBarangKeluar);
		MI.check(); 
		//memanggil fungsi check dari class ManajemenInventori
	}
}