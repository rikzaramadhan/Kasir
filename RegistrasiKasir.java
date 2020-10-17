class Regis{
	String nama;
	String email;
	String password;
	String konfirmPassword;

	private String correctNama = "dyah111";
	private String namaEmail = "syafrinadyah16@gmail.com";

	public Regis(String nama, String email, String password, String konfirmPassword) {
		this.nama = nama;
		this.email = email;
		this.password = password;
		this.konfirmPassword = konfirmPassword;
	}

	public void test(){
		if(this.nama == this.correctNama){
			System.out.println(" Nama Sesuai");
		}else{
			System.out.println(" Nama tidak sesuai ");
		}
		if(this.email == this.namaEmail){
			System.out.println(" Email terdaftar / Berhasil");
		}else{
			System.out.println(" Email tidak terdaftar ");
		}
		if(this.password == this.konfirmPassword){
			System.out.println("Registrasi Berhasil");
		}else{
			System.out.println("Konfirmasi password gagal");
		}
	}
}
public class RegistrasiKasir{
	public static void main(String[] args) {
		String nama = "dyah";
		String email = "syafrinadyah16@gmail.com";
		String password = "123456";
		String konfirmPassword ="123456";

		Regis RS = new Regis(nama,email,password,konfirmPassword);
		RS.test();
	}
}