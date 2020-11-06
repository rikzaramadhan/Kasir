interface RegistrasiKasirInterface{
	public void test();
}

class Regis implements RegistrasiKasirInterface {
	String leveluser;
	String nama;
	String email;
	String password;
	String konfirmPassword;

	private String correctLeveluser = " Admin / Pemilik Toko ";
	private String correctNama = "dyah111";
	private String namaEmail = "syafrinadyah16@gmail.com";

	public Regis(String leveluser, String nama, String email, String password, String konfirmPassword) {
		this.leveluser = leveluser;
		this.nama = nama;
		this.email = email;
		this.password = password;
		this.konfirmPassword = konfirmPassword;
	}

	public void test(){

			System.out.println(" >>>>>>Pilih User<<<<<< ");
			System.out.println(" 1. Admin / Pemilik Toko ");
			System.out.println(" 2. User / Karyawan \n ");

			System.out.println(" Level User = ");

		if(this.leveluser == correctLeveluser){
			System.out.println(" Admin / Pemilik Toko \n ");
		}else{
			System.out.println();
		}

			System.out.println(" Nama = ");

		if(this.nama == this.correctNama){
			System.out.println(" Nama Sesuai \n ");
		}else{
			System.out.println(" Nama tidak sesuai \n ");
		}

			System.out.println(" Email = ");

		if(this.email == this.namaEmail){
			System.out.println(" Email terdaftar / Berhasil \n ");
		}else{
			System.out.println(" Email tidak terdaftar \n ");
		}

			System.out.println(" Registrasi = ");

		if(this.password == this.konfirmPassword){
			System.out.println(" Registrasi Berhasil \n ");
		}else{
			System.out.println(" Konfirmasi password gagal \n  ");
		}
	}
}
public class RegistrasiKasir{
	public static void main(String[] args) {
		String leveluser = " Admin / Pemilik Toko ";
		String nama = "dyah111";
		String email = "syafrinadyah16@gmail.com";
		String password = "123456";
		String konfirmPassword ="123456";

		Regis TS = new Regis(leveluser,nama,email,password,konfirmPassword);
		TS.test();
	}
}