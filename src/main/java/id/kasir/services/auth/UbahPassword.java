interface UbahPasswordInterface{
	public void test();

}
class GantiSandi implements UbahPasswordInterface {
	String passwordLama;
	String passwordBaru;
	String konfirmPassword;

	private String correctpasswordLama = "Syafrinadyah123";
	private String correctpasswordBaru = "Kusumawardani0987";

	public GantiSandi(String passwordLama, String passwordBaru, String konfirmPassword){
		this.passwordLama = passwordLama;
		this.passwordBaru = passwordBaru;
		this.konfirmPassword = konfirmPassword;
	}

	public void test(){
		if(this.passwordLama == correctpasswordLama){
			System.out.println(" Password lama yang dimasukkan sesuai ");
		}else{
			System.out.println(" Password lama yang dimasukkan tidak sesuai / Ulangi ");
		}
		if(this.passwordBaru == correctpasswordBaru){
			System.out.println(" Password baru berhasil dimasukkan ");
		}else{
			System.out.println(" Password baru tidak berhasil dimasukkan ");
		}
		if(this.konfirmPassword == this.passwordBaru){
			System.out.println(" Ganti password berhasil ");
		}else{
			System.out.println(" Konfirmasi password gagal ");
		}
	}
}

public class UbahPassword{
	public static void main(String[] args) {
		String passwordLama = "Syafrinadyah123";
		String passwordBaru = "Kusumawardani0987";
		String konfirmPassword = "Kusumawardani0987";

		GantiSandi GS = new GantiSandi (passwordLama, passwordBaru, konfirmPassword);
		GS.test();
	}
}