
package jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import domain.Producto;

public class JdbcProducto implements IProductoDao{
    private Connection userConn;
    
    private static final String SQL_INSERT = "INSERT INTO gestion_inventario.producto(ids_sucursales, nombre, barcode, stock_total, precio, descripcion) VALUES(?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE gestion_inventario.producto SET ids_sucursales = ?, nombre = ?, barcode = ?, stock_total = ?, precio = ?, descripcion = ? WHERE id_producto = ?";
    private static final String SQL_DELETE = "DELETE FROM gestion_inventario.producto WHERE id_producto = ?";
    private static final String SQL_SELECT = "SELECT * FROM gestion_inventario.producto";
    private static final String SQL_WHERE_SELECT = "SELECT * FROM gestion_inventario.producto WHERE precio >= ? AND precio <= ? ";
    private static final String SQL_ONE_SELECT = "SELECT * FROM gestion_inventario.producto WHERE id_producto = ?";
    
    @Override
    public void insert(Producto producto) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, producto.getIdsSucursales());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getBarcode());
            ps.setInt(4, producto.getStockTotal());
            ps.setInt(5, producto.getPrecio());
            ps.setString(6, producto.getDescripcion());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void update(Producto producto) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_UPDATE);
            ps.setString(1, producto.getIdsSucursales());
            ps.setString(2, producto.getNombre());
            ps.setString(3, producto.getBarcode());
            ps.setInt(4, producto.getStockTotal());
            ps.setInt(5, producto.getPrecio());
            ps.setString(6, producto.getDescripcion());
            ps.setInt(7, producto.getIdProducto());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public void delete(Producto producto) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_DELETE);
            ps.setInt(1, producto.getIdProducto());
        }finally{
            Conexion.close(ps);
            if (this.userConn == null){
                Conexion.close(conn);
            }
        }
    }

    @Override
    public Map<String,Producto> select() throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Producto producto = null;
        Map<String,Producto> mapaProductos = new HashMap<>();
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idProducto = rs.getInt("id_producto");
                String idsSucursales = rs.getString("ids_Sucursales");
                String nombre = rs.getString("nombre");
                String barCode = rs.getString("barcode");
                int stockTotal = rs.getInt("stock_total");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                producto = new Producto(idProducto, idsSucursales, nombre, barCode, stockTotal, precio, descripcion);
                mapaProductos.put(producto.getBarCode, producto);
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
    public Map<String,Producto> select(int min, int max) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Producto producto = null;
        Map<String,Producto> mapaProductos = new HashMap<>();
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_WHERE_SELECT);
            ps.setInt(1, min);
            ps.setInt(2, max);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int idProducto = rs.getInt("id_producto");
                String idsSucursales = rs.getString("ids_Sucursales");
                String nombre = rs.getString("nombre");
                String barCode = rs.getString("barcode");
                int stockTotal = rs.getInt("stock_total");
                int precio = rs.getInt("precio");
                String descripcion = rs.getString("descripcion");
                
                producto = new Producto(idProducto, idsSucursales, nombre, barCode, stockTotal, precio, descripcion);
                mapaProductos.put(producto.getBarCode, producto);
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
    public Producto select(int idProducto) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        Producto producto = null;
        
        try{
            conn = this.userConn != null ? this.userConn : Conexion.getConnection();
            ps = conn.prepareStatement(SQL_ONE_SELECT);
            ps.setInt(1, idProducto);
            rs = ps.executeQuery();
            
            int newIdProducto = rs.getInt("id_producto");
            String idsSucursales = rs.getString("ids_Sucursales");
            String nombre = rs.getString("nombre");
            String barCode = rs.getString("barcode");
            int stockTotal = rs.getInt("stock_total");
            int precio = rs.getInt("precio");
            String descripcion = rs.getString("descripcion");
                
            producto = new Producto(newIdProducto, idsSucursales, nombre, barCode, stockTotal, precio, descripcion);  
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
