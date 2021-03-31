
package FuncionesGeneral;

import domain.IGenerico;
import domain.SucursalProducto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcSucursalProducto;

public class FunSucursalProducto {
    public static void eliminarSucursalProducto(int id_sp) throws SQLException{
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        SucursalProducto sp = new SucursalProducto(id_sp);
        
        jsp.delete(sp);
    }
    
    public static List<SucursalProducto> listarSucursalProducto (int id_producto) throws SQLException {
        List<SucursalProducto> newSP = new ArrayList<>() ;
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        
        List<IGenerico> nuevoSP = jsp.select(id_producto);
        
        for (IGenerico iGenerico : nuevoSP) {
            newSP.add((SucursalProducto)iGenerico) ;
        }
        return newSP ;
    }
    
    public static List<SucursalProducto> listarSucursalProductoS (int id_sucursal) throws SQLException {
        List<SucursalProducto> newSP = new ArrayList<>() ;
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        
        List<IGenerico> nuevoSP = jsp.selectS(id_sucursal);
        
        for (IGenerico iGenerico : nuevoSP) {
            newSP.add((SucursalProducto)iGenerico) ;
        }
        return newSP ;
    }
}
