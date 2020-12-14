import java.sql.Statement;
 
interface LoginInterface{
     public void check();
   }

 class password implements LoginInterface{ //untuk menampung data username dan password
   String username, password;
   
   public password (String username,String password) {
         this.username=username;
         this.password=password;
    }

   public void check() {    //mengecek apakah username dan password nya ditemukan
       if(this.username.equals("username") && (this.password.equals("password"))){
		System.out.println("Welcome");
		
	}else {
		System.out.println("Account not found");
	}
   }
 }

public class ShowAkun extends configDatabase {

    private boolean status;
    private String errorMessage;
    
    public boolean insertPost(Login post) {
        
        String getUsername;
        String getPassword;
        
        String sql = "SELECT * FROM akun WHERE username =? AND password=?";
        sql = String.format(sql, post.getUsername(), post.getPassword());
        
        try {
            Statement stmt = this..createStatement();
            stmt.execute(sql);
            return true;

        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }
}

public class Login{      //mengeksekusi usename dan password yang diinput
    public static void main(String[] args){   
        String username = null;
        String password = null;
          
	password masuk=new password(username,password);
        masuk.check();
    }
}

