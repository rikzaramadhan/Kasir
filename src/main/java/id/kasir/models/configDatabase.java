/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baros
 */
import java.sql.*;

public class configDatabase {
    
    private String HOSTNAME = "127.0.0.1";
    private String USERNAME = "root";
    private String DBNAME = "kasirKevin";
    private int PORT = 3306;

    protected String getJdbcDatabaseUrl() {
        return String.format("jdbc:mysql://%s:%s@%s:%d/%s", this.USERNAME, this.HOSTNAME, this.PORT, this.DBNAME);
    }
}

