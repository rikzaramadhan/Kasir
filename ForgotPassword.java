  interface ForgotInterface{
   public void check();
   }
  
class ForgotPassword {
   public static void main (String []args){
      String username = "Novita Khasanah";
      String new_password = "novita321";
      String confirm_password = "novita321";
      
      Verivy sesuai=new Verivy(username,new_password,confirm_password);
      sesuai.check();
   } 
}
class Verivy implements ForgotInterface {
   String username, new_password, confirm_password;
   
   public Verivy (String username, String new_password, String confirm_password){
      this.username=username;
      this.new_password=new_password;
      this.confirm_password=confirm_password;
   }
   
   public void check() {
      if(this.username.equals("Novita Khasanah")) {
          System.out.println("Succes");
      }else {
          System.out.println("Username not found");
      }
       if (this.new_password.equals("novita321")&& (this.confirm_password.equals("novita321"))) {
           System.out.println("Succes");
       }else {
           System.out.println("Incorrect Password");
       }
   }
   public boolean CheckUsername(String username){
    return this.username.equals(username);
 } 
   public boolean CheckNewPass(String new_password){
    return this.new_password.equals(new_password);
 } 
   public boolean CheckConfirm(String confirm_password){
    return this.confirm_password.equals(confirm_password);
 } 
}
