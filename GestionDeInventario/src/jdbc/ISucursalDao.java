
package jdbc;

import java.sql.SQLException;
import java.util.List;
import domain.Sucursal;

public interface ISucursalDao {
    public void insert(Sucursal sucursal) throws SQLException;
    
    public void update(Sucursal sucursal) throws SQLException;
    
    public void delete(Sucursal sucursal) throws SQLException;
    
    public List<Sucursal> select() throws SQLException;
    
    public Sucursal select(int idSucursal) throws SQLException;
}
