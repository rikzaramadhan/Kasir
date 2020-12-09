import java.util.Date;
import java.sql.Statement;

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

public class ShowBarang extends ConfigDatabase {
    public boolean insertPost(Barang post) {
        String sql = "INSERT INTO barang (`id`, `nama`, `harga`, `tanggal`, `jumlahbarangmasuk`, `jumlahbarangkeluar`) VALUES ('%s', '%s', '%d', '%d', '%d', '%d')";
        sql = String.format(sql, post.getid(), post.getnama(), post.getharga(), post.gettanggal(), post.getjumlahbarangmasuk(), post.getjumlahbarangkeluar());
        
        try {
            Statement stmt = this.connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }
}

public class ShowBarang extends ConfigDatabase {
    public boolean insertPost(Barang post) {
        String sql = "SELECT * FROM barang WHERE nama =? AND harga=?";
        sql = String.format(sql, post.getnama(), post.getharga());
        
        try {
            Statement stmt = this.connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }
}

public class ShowBarang extends ConfigDatabase {
    public boolean insertPost(Barang post) {
        String sql = "UPDATE barang SET jumlahbarangkeluar=%d WHERE id=%s";
        sql = String.format(sql, post.getjumlahbarangkeluar(), post.getid());
        
        try {
            Statement stmt = this.connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }
}

public class ShowBarang extends ConfigDatabase {
    public boolean insertPost(Barang post) {
        String sql = "DELETE FROM barang WHERE id=%s";
        
        try {
            Statement stmt = this.connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
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
