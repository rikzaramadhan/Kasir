
interface RegistrationKasirInterface{
	public void test();

}

class Regis implements RegistrationKasirInterface{
	String id;
	String username;
	String email;
	String levelUser;
	String password;
	String confirmpassword;

	private String correctId = "A002";
	private String correctUsername = "dyahkw";
	private String namaEmail = "syafrina@gmail.com";
	private String correctLeveluser = "karyawan";

	public Regis(String id, String username, String email, String levelUser, String password, String confirmpassword ){
		this.id = id;
		this.username = username;
		this.email = email;
		this.levelUser = levelUser;
		this.password = password;
		this.confirmpassword = confirmpassword;
	}

	public void test(){

		System.out.println(" Id = ");
	if(this.id == correctId){
		System.out.println(" A002 \n ");
	}else{
		System.out.println();
	}	
		System.out.println(" Username = ");
	if(this.username == this.correctUsername){
		System.out.println(" Username Sesuai \n ");
	}else{
		System.out.println(" Username tidak sesuai \n ");
	}
		System.out.println(" Email = ");
	if(this.email == this.namaEmail){
		System.out.println(" Email terdaftar / Berhasil \n ");
	}else{
		System.out.println(" Email tidak terdaftar \n ");
	}
	    System.out.println(" Level user = ");
	if(this.levelUser == correctLeveluser){
		System.out.println(" Karyawan \n ");
	}else{
		System.out.println();
	}
		System.out.println(" Registrasi = ");
	if(this.password == this.confirmpassword){
		System.out.println(" Registrasi Berhasil \n ");
	}else{
		System.out.println(" Konfirmasi password gagal \n  ");
	}}}

public class Registration{
	public static void main(String[] args) {
		String id = "A002";
		String username = "dyahkw";
		String email = "syafrina@gmail.com";
		String levelUser = "karyawan";
		String password = "dyahkw77";
		String confirmpassword ="dyahkw77";

		Regis TS = new Regis(id,username,email,levelUser,password,confirmpassword);
		TS.test();
	}
}
