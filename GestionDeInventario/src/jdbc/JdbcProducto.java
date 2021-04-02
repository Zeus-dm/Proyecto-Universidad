
package jdbc;

import domain.IGenerico;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import domain.Producto;

public class JdbcProducto implements IGenericoDao, IGenericoMapDao, IGenericoSelectDao{
    private Connection userConn;
    
    private static final String SQL_INSERT = "INSERT INTO gestion_inventario.producto(nombre, barcode, stock_total, precio, descripcion) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE gestion_inventario.producto SET nombre = ?, barcode = ?, stock_total = ?, precio = ?, descripcion = ? WHERE id_producto = ?";
    private static final String SQL_DELETE = "DELETE FROM gestion_inventario.producto WHERE id_producto = ?";
    private static final String SQL_SELECT = "SELECT * FROM gestion_inventario.producto";
    private static final String SQL_WHERE_SELECT = "SELECT * FROM gestion_inventario.producto WHERE precio >= ? AND precio <= ? ";
    private static final String SQL_ONE_SELECT = "SELECT * FROM gestion_inventario.producto WHERE id_producto = ?";

    public JdbcProducto() {
    }

    public JdbcProducto(Connection userConn) {
        this.userConn = userConn;
    }
    
    @Override
    public void insert(IGenerico generico) throws SQLException {
        Producto producto = (Producto)generico;
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getBarCode());
            ps.setInt(3, producto.getStockTotal());
            ps.setInt(4, producto.getPrecio());
            ps.setString(5, producto.getDescripcion());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(IGenerico generico) throws SQLException {
        Producto producto = (Producto)generico;
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, producto.getNombre());
            ps.setString(2, producto.getBarCode());
            ps.setInt(3, producto.getStockTotal());
            ps.setInt(4, producto.getPrecio());
            ps.setString(5, producto.getDescripcion());
            ps.setInt(6, producto.getIdProducto());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(IGenerico generico) throws SQLException {
        Producto producto = (Producto)generico;
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, producto.getIdProducto());
            ps.executeUpdate();
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public Map<String,IGenerico> select() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Map<String,IGenerico> mapaProductos = new HashMap<>();
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idProducto = rs.getInt("id_producto");
                String nombre = rs.getString("nombre");
                String barCode = rs.getString("barcode");
                int stockTotal = rs.getInt("stock_total");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                Producto producto = new Producto(idProducto, nombre, barCode, stockTotal, precio, descripcion);
                mapaProductos.put(barCode, producto);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return mapaProductos;
    }
    
    @Override
    public Map<String,IGenerico> select(int min, int max) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Map<String,IGenerico> mapaProductos = new HashMap<>();
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_WHERE_SELECT);
            ps.setInt(1, min);
            ps.setInt(2, max);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idProducto = rs.getInt("id_producto");
                String nombre = rs.getString("nombre");
                String barCode = rs.getString("barcode");
                int stockTotal = rs.getInt("stock_total");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                Producto producto = new Producto(idProducto, nombre, barCode, stockTotal, precio, descripcion);
                mapaProductos.put(barCode, producto);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return mapaProductos;
    }
    
    @Override
    public IGenerico select(int idProducto) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Producto producto = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ONE_SELECT);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int newIdProducto = rs.getInt("id_producto");
                String nombre = rs.getString("nombre");
                String barCode = rs.getString("barcode");
                int stockTotal = rs.getInt("stock_total");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                producto = new Producto(newIdProducto, nombre, barCode, stockTotal, precio, descripcion);
            }  
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
        
        return producto;
    }
}
