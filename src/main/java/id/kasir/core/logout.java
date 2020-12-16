 class Auth {
      private static String username;
      private static String password;
      
   public static void setUsername(String username){
       Auth.username = username;
   }
   public static void setPassword(String password){
       Auth.password = password;
  }
   public static String getUsername(){
       return Auth.username;    
   }
   public static String getPassword(){
       return Auth.password;
   }
   
public class logout {
   public void out(){
       
       Auth.setUsername(null);
       Auth.setPassword(null);
   }
}
 }
