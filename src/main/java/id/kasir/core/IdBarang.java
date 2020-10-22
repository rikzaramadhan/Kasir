import java.util.Date;
class ManajemenInventori {
	
	protected int IdBarang;
	protected int JumlahBarangMasuk; 

	private int correctIdBarang = 5; 
	public ManajemenInventori(int IdBarang, int JumlahBarangMasuk){
		this.IdBarang = IdBarang;
		this.JumlahBarangMasuk = JumlahBarangMasuk; 
	}
	
	public void check(){
			//validasi Id 
			if (this.IdBarang == this.correctIdBarang){
			System.out.println("Id Sesuai");
		}	else {
			System.out.println("Id Tidak Sesuai");
		}
	}
}

	public class IdBarang {
	public static void main(String[] args){

		Date date = new Date();
		System.out.println(date.toString());

		int inputIdBarang = 5;
		int inputJumlahBarangMasuk = 100;

		ManajemenInventori MI = new ManajemenInventori(inputIdBarang, inputJumlahBarangMasuk);
		MI.check();
		System.out.println("Barang Berhasil Dimasukkan");
	}
}