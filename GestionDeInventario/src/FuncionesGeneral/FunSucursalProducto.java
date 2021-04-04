
package FuncionesGeneral;

import domain.IGenerico;
import domain.SucursalProducto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcSucursalProducto;

public class FunSucursalProducto {
    public static void agregarSucursalProducto(int idProducto, int idSucursal, int stock) throws SQLException{
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        SucursalProducto sp = new SucursalProducto(idProducto, idSucursal, stock);
        
        jsp.insert(sp);
    }
    
    public static void eliminarSucursalProducto(int idSP) throws SQLException{
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        SucursalProducto sp = new SucursalProducto(idSP);
        
        jsp.delete(sp);
    }
    
    public static List<SucursalProducto> listarSucursalProducto (int idProducto) throws SQLException {
        List<SucursalProducto> newSP = new ArrayList<>() ;
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        
        List<IGenerico> listaSP = jsp.select(idProducto);
        
        listaSP.forEach(iGenerico -> {
            newSP.add((SucursalProducto)iGenerico) ;
        });
        
        return newSP ;
    }
    
    public static List<SucursalProducto> listarSucursalProductoS (int idSucursal) throws SQLException {
        List<SucursalProducto> newSP = new ArrayList<>() ;
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        
        List<IGenerico> listaSP = jsp.selectS(idSucursal);
        
        listaSP.forEach(iGenerico -> {
            newSP.add((SucursalProducto)iGenerico) ;
        });
        
        return newSP ;
    }

    public static SucursalProducto selectSP (int idProducto, int idSucursal) throws SQLException{
        JdbcSucursalProducto jsp = new JdbcSucursalProducto();
        SucursalProducto newSP = (SucursalProducto)jsp.select(idProducto, idSucursal);
    
        return newSP;
    }
    
    public static void actualizarSP(SucursalProducto sp) throws SQLException {
        JdbcSucursalProducto jsp = new JdbcSucursalProducto() ;
        
        jsp.update(sp);
    }
}
