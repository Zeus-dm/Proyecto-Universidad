
package FuncionesGeneral;

import domain.Sucursal;
import java.sql.SQLException;
import jdbc.JdbcSucursal;

public class FunSucursal {
    public static Sucursal selecSucursal (int id) throws SQLException {
        JdbcSucursal js = new JdbcSucursal() ;
        
        Sucursal newS = (Sucursal) js.select(id) ;
        
        return newS ;
    }
}
