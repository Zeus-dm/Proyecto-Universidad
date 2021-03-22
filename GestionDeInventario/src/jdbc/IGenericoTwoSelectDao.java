
package jdbc;

import domain.IGenerico;
import java.sql.SQLException;

public interface IGenericoTwoSelectDao {
    public IGenerico select(int id1, int id2) throws SQLException;
}
