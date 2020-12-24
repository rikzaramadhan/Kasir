import java.sql.DriverManager;
import java.sql.Connection;

public class MySQL extends ConfigurationDatabase {
    protected final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    protected Connection connection;

    public boolean status = false;
    public String errorMessage = null;

    public MySQL() {
        this.createConnection();
    }

    protected void createConnection() {
        try {
            // register driver yang akan dipakai
            Class.forName(JDBC_DRIVER);
            this.connection = DriverManager.getConnection(this.getJdbcDatabaseUrl());
            this.status = true;
        } catch (Exception e) {
            this.status = false;
            this.errorMessage = e.getMessage();
        }
    }

    public void close() {
        try {
            this.connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}