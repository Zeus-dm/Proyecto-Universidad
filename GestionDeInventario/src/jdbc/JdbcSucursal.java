
package jdbc;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import domain.Sucursal;

public class JdbcSucursal implements ISucursalDao{
    private Connection userConn;
    
    private static final String SQL_INSERT = "INSERT INTO gestion_inventario.sucursal(id_region, nombre, direccion, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE gestion_inventario.sucursal SET id_region = ?, nombre = ?, direccion = ?, telefono = ? WHERE id_sucursal = ?";
    private static final String SQL_DELETE = "DELETE FROM gestion_inventario.sucursal WHERE id_sucursal = ?";
    private static final String SQL_SELECT = "SELECT * FROM gestion_inventario.sucursal";
    private static final String SQL_ONE_SELECT = "SELECT * FROM gestion_inventario.sucursal WHERE id_sucursal = ?";

    public JdbcSucursal() {
    }

    public JdbcSucursal(Connection userConn) {
        this.userConn = userConn;
    }
    
    @Override
    public void insert(Sucursal sucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, sucursal.getIdRegion());
            ps.setString(2, sucursal.getNombre());
            ps.setString(3, sucursal.getDireccion());
            ps.setInt(4, sucursal.getTelefono());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(Sucursal sucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setInt(1, sucursal.getIdRegion());
            ps.setString(2, sucursal.getNombre());
            ps.setString(3, sucursal.getDireccion());
            ps.setInt(4, sucursal.getTelefono());
            ps.setInt(5, sucursal.getIdSucursal());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(Sucursal sucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, sucursal.getIdSucursal());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public List<Sucursal> select() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Sucursal sucursal = null;
        List<Sucursal> listaSucursales = new ArrayList<>();
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idSucursal = rs.getInt("id_sucursal");
                int idRegion = rs.getInt("id_region");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                int telefono = rs.getInt("telefono");
                
                sucursal = new Sucursal(idSucursal, idRegion, nombre, direccion, telefono);
                listaSucursales.add(sucursal);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return listaSucursales;
    }

    @Override
    public Sucursal select(int idSucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Sucursal sucursal = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ONE_SELECT);
            ps.setInt(1, idSucursal);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int newIdSucursal = rs.getInt("id_sucursal");
                int idRegion = rs.getInt("id_region");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                int telefono = rs.getInt("telefono");

                sucursal = new Sucursal(newIdSucursal, idRegion, nombre, direccion, telefono);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return sucursal;
    }
    
}
