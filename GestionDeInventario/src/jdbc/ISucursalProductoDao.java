
package jdbc;

import java.sql.SQLException;
import domain.SucursalProducto;

public interface ISucursalProductoDao {
    public void insert(SucursalProducto sp) throws SQLException;
    
    public void update(SucursalProducto sp) throws SQLException;
    
    public void delete(SucursalProducto sp) throws SQLException;
    
    public SucursalProducto select(int idProducto, int idSucursal) throws SQLException;
}
