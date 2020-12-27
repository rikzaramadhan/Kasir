//membuat class implements yaitu class ManajamenInventori dari interface BarangMasukInterface


	class ManajemenInventori{
	int IdBarang; //membuat variabel dengan tipe integer karena berupa angka
	int JumlahBarangMasuk; 

	private int correctIdBarang = 5;  //merupakan variabel global, yang bisa diakses dari semua fungsi
	public ManajemenInventori(int IdBarang, int JumlahBarangMasuk){ //merupakan variabel yang ada di parameter
		this.IdBarang = IdBarang;
		this.JumlahBarangMasuk = JumlahBarangMasuk; 
	}
	
	public void check(){
			//digunakan untuk mengakses variabel golbal dalam fungsi check
			if (this.IdBarang == this.correctIdBarang){
			System.out.println("Id Sesuai");
		}	else {
			System.out.println("Id Tidak Sesuai");
		}
			if(this.JumlahBarangMasuk == this.JumlahBarangMasuk){
			System.out.println("Jumlah Barang Masuk 100 ");
		}
	}
}

	public class IdBarang { //membuat class IdBarang
	public static void main(String[] args){ //method

	
		int inputIdBarang = 5;
		int inputJumlahBarangMasuk = 100; 

		ManajemenInventori MI = new ManajemenInventori(inputIdBarang, inputJumlahBarangMasuk);
		MI.check();
		//memanggil fungsi check dari class ManajemenInventori
	}
}