 interface LoginInterface{
     public void check();
   }

 class password implements LoginInterface{
   String username, password;
   
   public password (String username,String password) {
         this.username=username;
         this.password=password;
    }

   public void check() {
       if(this.username.equals("Novita Khasanah") && (this.password.equals("novita12"))){
    System.out.println("Welcome");
    
  }else {
    System.out.println("Account not found");
  }
   }
 }

public class Login{    
    public static void main(String[] args){   
        String username = "Novita Khasanah";
        String password = "novita12";
 
  password masuk=new password(username,password);
        masuk.check();
    }
}

