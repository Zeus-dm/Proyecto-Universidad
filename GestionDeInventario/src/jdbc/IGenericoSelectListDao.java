
package jdbc;

import domain.IGenerico;
import java.sql.SQLException;
import java.util.List;

public interface IGenericoSelectListDao {
    public List<IGenerico> select() throws SQLException;
}
