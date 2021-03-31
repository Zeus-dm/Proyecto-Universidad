
package FuncionesGeneral;

import domain.IGenerico;
import domain.Sucursal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcSucursal;

public class FunSucursal {
    
    public static List<Sucursal> selectLista(int id_region) throws SQLException{
        List<Sucursal> newS = new ArrayList<>() ;
        JdbcSucursal js = new JdbcSucursal() ;
        
        List<IGenerico> nuevoG = js.selectList(id_region);
        
        for (IGenerico iGenerico : nuevoG) {
            newS.add((Sucursal)iGenerico) ;
        }
        return newS ;
    }
    
    public static Sucursal selecSucursal (int id) throws SQLException {
        JdbcSucursal js = new JdbcSucursal() ;
        
        Sucursal newS = (Sucursal) js.select(id) ;
        
        return newS ;
    }
}
