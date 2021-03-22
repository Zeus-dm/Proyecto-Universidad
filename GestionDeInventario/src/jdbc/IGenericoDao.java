
package jdbc;

import domain.IGenerico;
import java.sql.SQLException;

public interface IGenericoDao {
    public void insert(IGenerico generico) throws SQLException;
    
    public void update(IGenerico generico) throws SQLException;
    
    public void delete(IGenerico generico) throws SQLException;
}
