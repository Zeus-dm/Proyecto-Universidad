
package jdbc;

import domain.IGenerico;
import java.sql.SQLException;
import java.util.Map;

public interface IGenericoMapDao {
    public Map<String,IGenerico> select() throws SQLException;
    
    public Map<String,IGenerico> select( int min, int max) throws SQLException;
}
