
package jdbc;

import java.sql.SQLException;
import java.util.Map;
import domain.Producto;

public interface IProductoDao {
    public void insert(Producto producto) throws SQLException;
    
    public void update(Producto producto) throws SQLException;
    
    public void delete(Producto producto) throws SQLException;
    
    public Map<String,Producto> select() throws SQLException;
    
    public Map<String,Producto> select( int min, int max) throws SQLException;
    
    public Producto select(int idProducto) throws SQLException;
}
