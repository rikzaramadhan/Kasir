import java.sql.SQLException;
import java.sql.Statement;

public class ProductService extends Configurasi {

    private boolean status;
    private String errorMessage;

    public boolean insertPost(Post post) {

        String getIdBarang;
        String getName;
        String getPrice;
        String getStock;

        String sql = "INSERT INTO barang (`IdBarang`, `Name`, `Price`, `Stock`) VALUES ('%s', '%s', '%d', '%d')";
        sql = String.format(sql, post.getIdBarang(), post.getName(), post.getPrice(), post.getStock());

        try {
            Statement stmt = this.connection.createStatement();
            stmt.execute(sql);
            return true;
        } catch (SQLException e) { 
            System.out.println(e);
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

        String getStock;
        String getIdBarang;
                
        String sql = "UPDATE barang SET Stock=%d WHERE IdBarang=%s";
        sql = String.format(sql, post.getStock(), post.getIdBarang());
        
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
                
        String sql = "DELETE FROM barang WHERE IdBarang=%s";
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