
package jdbc;

import domain.IGenerico;
import java.sql.SQLException;

public interface IGenericoSelectDao {
    public IGenerico select(int id) throws SQLException;
}