package id.kasir.app.model;


public class loginpost { //untuk menampung setter getter yang akan dipanggil di class lain 
    private String username;
    private String Password;
    
    public loginpost(){
        
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
}
