
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrasiService extends Configurasi {
    
    private boolean status;
    private String errorMessage;
    
    public boolean insertPost(Post post) {
        
        String getUserId;
        String getUsername;
        String getEmail;
        String getNo_tlp;
        String getPassword;
        String getLevel_user;

        String sql = "INSERT INTO akun (`userid`, `username`, `email`, `no_tlp`, `password`, `level_user`) VALUES ('%d', '%s', '%s', '%d', '%s', '%s')"; 
        sql = String.format(sql, post.getUserId(), post.getUsername(), post.getEmail(), post.getNo_tlp() ,post.getPassword(), post.getLevelUser());
        
        try {
            Statement stmt = this.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }

    private Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public boolean UpdatePost(Post post) {
        
        String getPassword;
   

        String sql = "UPDATE akun SET password='%s' WHERE id=%d"; 
        sql = String.format(sql, post.getPassword());
        
        try {
            Statement stmt = this.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }

     public boolean DeletePost(Post post) {
        
        String getuserId;
   

        String sql = "DELETE FROM akun WHERE userId=%d";
        sql = String.format(sql, post.getuserId());
        
        
        try {
            Statement stmt = this.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }
    }}
