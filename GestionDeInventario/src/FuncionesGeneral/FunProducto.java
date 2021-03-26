
package FuncionesGeneral;

import domain.IGenerico;
import domain.Producto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import jdbc.JdbcProducto;


public class FunProducto {
    public static Map<String,Producto> listarProducto() throws SQLException {
        Producto prod ;
        
        Map<String,Producto> newP = new HashMap<>() ;
        
        JdbcProducto jp = new JdbcProducto() ;
        
        Map<String,IGenerico> nuevoP = jp.select() ;
        
        for (IGenerico iGenerico:nuevoP.values()) {
            prod = (Producto) iGenerico ;
            newP.put(prod.getBarCode(), prod) ;
        }
        
        return newP ;
    }
    
    public static Producto selecProducto(int id) throws SQLException {
        JdbcProducto jp = new JdbcProducto() ;
        
        Producto newP = (Producto) jp.select(id) ;
        
        return newP ;
    }
    
    public static String modificarProducto(int id, String nombre, String barCode, String precio, String descripcion) throws SQLException {
        int precioAux = 0 ;
        
        if(nombre == null || nombre.isEmpty()) {
            return "*Error: Campo nombre vacío" ;
        }
        if (barCode == null || barCode.isEmpty()) {
            return "*Error: Campo Codigo de barras vacío" ;
        }
        if(precio == null || precio.isEmpty()) {
            return "*Error: Campo Precio vacío" ;
        }else {
            try {
                precioAux = Integer.parseInt(precio) ;
                if (precioAux == 0) {
                    return "*Error: Precio debe ser mayor a 0" ;
                }
            }catch(NumberFormatException e) {
                return "*Error: Ingrese solo numeros al precio" ;
            }
        }
        
        JdbcProducto jp = new JdbcProducto() ;
        
        Producto newP = (Producto) jp.select(id) ; 
        
        newP.setNombre(nombre);
        newP.setBarCode(barCode);
        newP.setPrecio(precioAux);
        newP.setDescripcion(descripcion);
        
        jp.update(newP);
        
        return null ;
    }
}