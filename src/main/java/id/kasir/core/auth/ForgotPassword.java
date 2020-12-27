  interface ForgotInterface{
   public void check();
   }
  
class ForgotPassword {
   public static void main (String []args){
      String email = "novitakha25@gmail.com";
      
      Verivy sesuai=new Verivy(email);
      sesuai.check();
   } 
}
class Verivy implements ForgotInterface {
   String email;
   String RegisterEmail = "novitakha25@gmail.com";
   
   public Verivy (String email){
      this.email=email;
   }
   
   public void check() {
      if(this.email.equals("novitakha25@gmail.com")) {
        System.out.println("Succes");
      }else {
           System.out.println("Incorrect email");
       }      
   }
   
   public boolean CheckEmail(){
     if (this.email.equals(RegisterEmail)){
         return true;
     }else {
         return false;
     }
 }
}
   

