import java.sql.Statement;

interface RegistrasiKasirInterface{
	public void test();

}

class Regis implements RegistrasiKasirInterface{
	String leveluser;
	String nama;
	String email;
	String password;
	String konfirmPassword;

	private String correctLeveluser = " Admin / Pemilik Toko ";
	private String correctNama = "dyah111";
	private String namaEmail = "syafrinadyah@gmail.com";

	public Regis(String Leveluser, String nama, String email, String password, String konfirmPassword ){
		this.leveluser = leveluser;
		this.nama = nama;
		this.email = email;
		this.password = password;
		this.konfirmPassword = konfirmPassword;
	}

	public void test(){

	System.out.println(" >>>Pilih User<<< ");
	System.out.println(" 1. Admin / Pemilik Toko ");
	System.out.println(" 2. User / Karyawan \n ");

	System.out.println(" Level User = ");

public class ShowRegis extends ConfigDatabase {
    public boolean insertPost(Registrasi post) {

        String sql = "INSERT INTO akun (`id`, `username`, `email`, `no_tlp`, `password`, `level_user`) VALUES ('%d', '%s', '%s', '%d', '%s', '%s')"; 
        sql = String.format(sql, post.getid(), post.getusername(), post.getemail(), post.getno_tlp(), post.getpassword(), post.getlevel_user());
        
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
public class ShowRegis extends ConfigDatabase {
    public boolean insertPost(Registrasi post) {
        String sql = "UPDATE akun SET password='%s' WHERE id=%d"; 
        sql = String.format(sql, post.getpassword(), post.getid());
        
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
public class ShowRegis extends ConfigDatabase {
    public boolean insertPost(Registrasi post) {
        String sql = String.format("DELETE FROM akun WHERE id=%d" , id); 
        
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
