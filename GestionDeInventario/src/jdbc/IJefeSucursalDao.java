
package jdbc;

import java.sql.SQLException;
import domain.JefeSucursal;

public interface IJefeSucursalDao {
    public void insert(JefeSucursal jefe) throws SQLException;
    
    public void update(JefeSucursal jefe) throws SQLException;
    
    public void delete(JefeSucursal jefe) throws SQLException;
        
    public JefeSucursal select(int idSucursal) throws SQLException;
}
