import java.sql.SQLException;
import java.sql.Statement;

public class BarangService extends Configurasi {

    private boolean status;
    private String errorMessage;

    public boolean insertPost(Post post) {

        String getIdBarang;
        String getName;
        String getPrice;
        String getDate;
        String getAmount;
        
        String sql = "INSERT INTO barang (`IdBarang`, `Name`, `Price`, `Date`, `Amount`) VALUES ('%s', '%s', '%s', '%s', '%s')";
        sql = String.format(sql, post.getIdBarang(), post.getName(), post.getPrice(), post.getDate(), post.getAmount());
        
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
    throw new UnsupportedOperationException("Not supported yet."); 
    }
    public boolean selectPost(Post post) {

        String getName;
        String getPrice;
                
        String sql = "SELECT * FROM barang WHERE Name =? AND Price=?";
        sql = String.format(sql, post.getName(), post.getPrice());
        
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
    public boolean UpdatePost(Post post) {

        String getAmount;
        String getIdBarang;
                
        String sql = "UPDATE barang SET Amount=%d WHERE IdBarang=%s";
        sql = String.format(sql, post.getAmount(), post.getIdBarang());
        
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

        String getIdBarang;
                
        String sql = "DELETE FROM barang WHERE IdBarang=%d";
        sql = String.format(sql, post.getIdBarang()); 
        
        try {
            Statement stmt = this.createStatement();
            stmt.execute(sql);
            return true;

        } catch (SQLException e) {
            this.status = false;
            this.errorMessage = e.getMessage();
            return false;
        }}}