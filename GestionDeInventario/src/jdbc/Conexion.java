
package jdbc;

import java.sql.*;

public class Conexion {
    private static final String JDBC_STRING = "";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/gestion_inventario";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "serpiente01";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
        
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    
    public static void close(PreparedStatement ps) throws SQLException{
        ps.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}
