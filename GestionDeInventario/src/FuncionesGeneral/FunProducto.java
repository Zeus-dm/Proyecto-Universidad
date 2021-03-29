
package FuncionesGeneral;

import domain.IGenerico;
import domain.Producto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import jdbc.JdbcProducto;


public class FunProducto {
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
        }else if( barCode.length() != 9){
            return "*Error: Codigo de barras necesita 9 caracteres";
        }else{
            Map<String,Producto> mapa = FunProducto.listarProducto();
            Producto prod = null;
            
            prod = mapa.get(barCode);
            if(prod != null && id != prod.getIdProducto()){
                return "*Error: Codigo de barras ya existe";
            }
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
    
    public static Map<String,Producto> listarProducto(int min, int max) throws SQLException {
        Producto prod ;
        
        Map<String,Producto> newP = new HashMap<>() ;
        
        JdbcProducto jp = new JdbcProducto() ;
        
        Map<String,IGenerico> nuevoP = jp.select(min, max);
        
        for (IGenerico iGenerico:nuevoP.values()) {
            prod = (Producto) iGenerico ;
            newP.put(prod.getBarCode(), prod) ;
        }
        
        return newP ;
    }
    
    public static Map<String,Producto> listarProducto(String textoBuscar) throws SQLException {
        Producto prod ;
        
        Map<String,Producto> newP = new HashMap<>() ;
        JdbcProducto jp = new JdbcProducto() ;
        
        Map<String,IGenerico> nuevoP = jp.select() ;
        
        for (IGenerico iGenerico:nuevoP.values()) {
            prod = (Producto) iGenerico ;
            int lenTexto = textoBuscar.length();
            
            if(prod.getNombre().length() > lenTexto){
                if(textoBuscar.equalsIgnoreCase(prod.getNombre().substring(0, lenTexto))){
                    newP.put(prod.getBarCode(), prod) ;
                }   
            }else if(prod.getNombre().length() == lenTexto){
                if(textoBuscar.equalsIgnoreCase(prod.getNombre())){
                    newP.put(prod.getBarCode(), prod) ;
                }
            }
        }
        
        return newP ;
    }
    
    public static Map<String,Producto> listarProducto(String min, String max, String textoBuscar) throws SQLException {
        
        try{
            int Imin = Integer.parseInt(min);
            int Imax = Integer.parseInt(max);
            
            if( (Imin == 0) && (Imax == 0) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProducto();
            }else if( (Imin == 0) && (Imax == 0) && (textoBuscar != null || !textoBuscar.isEmpty()) ){
                return listarProducto(textoBuscar);
            }else if( (Imin >= 0) && (Imax >= Imin) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProducto(Imin, Imax);
            }else if( (Imin >= 0) && (Imax >= Imin) && (textoBuscar != null || !textoBuscar.isEmpty()) ){
                Producto prod ;
        
                Map<String,Producto> newP = new HashMap<>() ;
        
                JdbcProducto jp = new JdbcProducto() ;
        
                Map<String,IGenerico> nuevoP = jp.select(Imin, Imax);
        
                for (IGenerico iGenerico:nuevoP.values()) {
                    prod = (Producto) iGenerico ;
                    int lenTexto = textoBuscar.length();
            
                    if(prod.getNombre().length() > lenTexto){
                        if(textoBuscar.equalsIgnoreCase(prod.getNombre().substring(0, lenTexto))){
                            newP.put(prod.getBarCode(), prod) ;
                        }   
                    }else if(prod.getNombre().length() == lenTexto){
                        if(textoBuscar.equalsIgnoreCase(prod.getNombre())){
                            newP.put(prod.getBarCode(), prod) ;
                        }
                    }
                }
        
                return newP ;
            }
        }catch(NumberFormatException ex){
            ex.printStackTrace();
        }
        
        return listarProducto();
    }
    
}

