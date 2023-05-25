package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainConnection {
    public static Connection getConnection() {
        Connection connection = null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CrimeFile;encrypt=true;trustServerCertificate=true", "sa", "sqladmin");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
}