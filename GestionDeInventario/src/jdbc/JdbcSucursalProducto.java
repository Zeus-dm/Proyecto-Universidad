
package jdbc;

import java.sql.*;
import domain.SucursalProducto;

public class JdbcSucursalProducto implements ISucursalProductoDao{
    private Connection userConn;
    
    private static final String SQL_INSERT = "INSERT INTO gestion_inventario.sucursal_producto(id_producto, id_sucursal, stock) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE gestion_inventario.sucursal_producto SET id_producto = ?, id_sucursal = ?, stock = ? WHERE id_sucursal_producto = ?";
    private static final String SQL_DELETE = "DELETE FROM gestion_inventario.sucursal_producto WHERE id_sucursal_producto = ?";
    private static final String SQL_ONE_SELECT = "SELECT * FROM gestion_inventario.sucursal_producto WHERE id_producto = ? AND id_sucursal = ?";

    public JdbcSucursalProducto() {
    }

    public JdbcSucursalProducto(Connection userConn) {
        this.userConn = userConn;
    }
    
    @Override
    public void insert(SucursalProducto sp) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setInt(1, sp.getIdProducto());
            ps.setInt(2, sp.getIdSucursal());
            ps.setInt(3, sp.getStock());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(SucursalProducto sp) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setInt(1, sp.getIdProducto());
            ps.setInt(2, sp.getIdSucursal());
            ps.setInt(3, sp.getStock());
            ps.setInt(4, sp.getIdSP());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(SucursalProducto sp) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, sp.getIdSP());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public SucursalProducto select(int idProducto, int idSucursal) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        SucursalProducto sp = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ONE_SELECT);
            ps.setInt(1, idProducto);
            ps.setInt(2, idSucursal);
            rs = ps.executeQuery();
            
            int idSP = rs.getInt("id_sucursal_producto");
            int newIdProducto = rs.getInt("id_producto");
            int newIdSucursal = rs.getInt("id_sucursales");
            int stock = rs.getInt("stock");
                
            sp = new SucursalProducto(idSP, newIdProducto, newIdSucursal, stock);  
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return sp;
    }
    
}
