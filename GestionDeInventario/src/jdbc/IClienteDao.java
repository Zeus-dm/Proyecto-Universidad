
package jdbc;

import java.sql.SQLException;
import java.util.List;
import domain.Cliente;

public interface IClienteDao {
    public void insert(Cliente cliente) throws SQLException;
    
    public void update(Cliente cliente) throws SQLException;
    
    public void delete(Cliente cliente) throws SQLException;
    
    public List<Cliente> select() throws SQLException;
    
    public Cliente select(int idCliente) throws SQLException;
}
