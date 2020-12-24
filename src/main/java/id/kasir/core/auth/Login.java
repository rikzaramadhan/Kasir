 
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
       if(this.username.equals("Novita Khasanah") && (this.password.equals("novitaa12"))){
        System.out.println("Welcome");
        
    }else {
        System.out.println("Account not found");
    }
   }
 }


public class Login{      //mengeksekusi usename dan password yang diinput
    public static void main(String[] args){   
        String username = "Novita Khasanah";
        String password = "novitaa12";
          
    password masuk=new password(username,password);
        masuk.check();
    }
}

