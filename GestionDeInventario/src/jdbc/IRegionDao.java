
package jdbc;

import java.sql.SQLException;
import java.util.List;
import domain.Region;

public interface IRegionDao {
    public void insert(Region region) throws SQLException;
    
    public void update(Region region) throws SQLException;
    
    public void delete(Region region) throws SQLException;
    
    public List<Region> select() throws SQLException;
}
