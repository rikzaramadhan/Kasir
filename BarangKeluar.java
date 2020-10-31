import java.util.Date;

interface BarangKeluarInterface{
public void check () ;
}

	class ManajemenInventori implements BarangKeluarInterface{
	protected int IdBarang;
	protected int JumlahBarangKeluar; 

	private int correctIdBarang = 5; 
	public ManajemenInventori(int IdBarang, int JumlahBarangKeluar){
		this.IdBarang = IdBarang;
		this.JumlahBarangKeluar = JumlahBarangKeluar; 
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

	public class BarangKeluar {
	public static void main(String[] args){

		Date date = new Date();
		System.out.println(date.toString());

		int inputIdBarang = 5;
		int inputJumlahBarangKeluar = 50; //barang keluar sisa barang keluar

		ManajemenInventori MI = new ManajemenInventori(inputIdBarang, inputJumlahBarangKeluar);
		MI.check();
		System.out.println("Barang Yang Keluar 50");
	}
}