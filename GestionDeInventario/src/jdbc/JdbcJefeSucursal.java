
package jdbc;

import java.sql.*;
import domain.JefeSucursal;

public class JdbcJefeSucursal implements IJefeSucursalDao{
    private Connection userConn;
    
    private static final String SQL_INSERT = "INSERT INTO gestion_inventario.jefe_sucursal(id_sucursal, nombre, edad) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE gestion_inventario.jefe_sucursal SET id_sucursal = ?, nombre = ?, edad = ? WHERE id_jefe_sucursal = ?";
    private static final String SQL_DELETE = "DELETE FROM gestion_inventario.jefe_sucursal WHERE id_jefe_sucursal = ?";
    private static final String SQL_ONE_SELECT = "SELECT * FROM gestion_inventario.jefe_sucursal WHERE id_sucursal = ?";

    public JdbcJefeSucursal() {
    }

    public JdbcJefeSucursal(Connection userConn) {
        this.userConn = userConn;
    }
    
    @Override
    public void insert(JefeSucursal jefe) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, jefe.getIdSucursal());
            ps.setString(2, jefe.getNombre());
            ps.setInt(3, jefe.getEdad());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(JefeSucursal jefe) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setInt(1, jefe.getIdSucursal());
            ps.setString(2, jefe.getNombre());
            ps.setInt(3, jefe.getEdad());
            ps.setInt(4, jefe.getIdJefe());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(JefeSucursal jefe) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, jefe.getIdJefe());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public JefeSucursal select(int idSucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        JefeSucursal jefeSucursal = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ONE_SELECT);
            ps.setInt(1, idSucursal);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idJefeSucursal = rs.getInt("id_jefe_sucursal");
                int newIdSucursal = rs.getInt("id_sucursal");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                
                jefeSucursal = new JefeSucursal(idJefeSucursal, nombre, edad, newIdSucursal);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return jefeSucursal;
    }
    
}
