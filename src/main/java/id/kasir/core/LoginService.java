
import java.sql.Statement;

public class LoginService extends Configurasi{

    private boolean status;
    private String errorMessage;
    
    public boolean selectPost(Post post) {
        
        String getUsername;
        String getPassword;
        
        String sql = "SELECT * FROM akun WHERE username =? AND password=?";
        sql = String.format(sql, post.getUsername(), post.getPassword());
        
        try {
            Statement stmt = this.createStatement();
            stmt.execute(sql);
            return true;

        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }

    private Statement createStatement() {
        throw new UnsupportedOperationException("Succes");
    }
}