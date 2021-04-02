
package FuncionesGeneral;

import domain.IGenerico;
import domain.Producto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import jdbc.JdbcProducto;


public class FunProducto {
    private static String verificarDatos(int idProducto, String nombre, String barCode, String precio) throws SQLException{
       
        if(nombre == null || nombre.isEmpty()) {
            return "*Error: Campo nombre vacío" ;
        }
        
        if (barCode == null || barCode.isEmpty()) {
            return "*Error: Campo Codigo de barras vacío" ;
        }else if( barCode.length() != 9){
            return "*Error: Codigo de barras necesita 9 caracteres";
        }else{
            Map<String,Producto> mapa = FunProducto.listarProducto();

            Producto producto = mapa.get(barCode);
            if(producto != null && idProducto != producto.getIdProducto()){
                return "*Error: Codigo de barras ya existe";
            }
        }
        
        if(precio == null || precio.isEmpty()) {
            return "*Error: Campo Precio vacío" ;
        }else {
            try {
                int precioAux = Integer.parseInt(precio) ;
                if (precioAux <= 0) {
                    return "*Error: Precio debe ser mayor a 0" ;
                }
            }catch(NumberFormatException e) {
                return "*Error: Ingrese solo numeros al precio" ;
            }
        }
        
        return null;
    }
    
    public static void actualizarProducto(Producto producto) throws SQLException{
        JdbcProducto jp = new JdbcProducto();
        
        jp.update(producto);
    }
    
    public static void eliminarProducto(int idProducto) throws SQLException{
        JdbcProducto jp = new JdbcProducto() ;
        Producto newP = new Producto(idProducto);
        
        jp.delete(newP);
    }

    public static String modificarProducto(int idProducto, String nombre, String barCode, String precio, String descripcion) throws SQLException {
        
        String verificar = verificarDatos(idProducto, nombre, barCode, precio);
        if(verificar != null){
            return verificar;
        }
        int precioAux = Integer.parseInt(precio);
        
        JdbcProducto jp = new JdbcProducto() ;

        Producto newP = (Producto) jp.select(idProducto) ;
        
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
        try {
            int Imin = Integer.parseInt(min);
            int Imax = Integer.parseInt(max);
          
            if( (Imin == 0) && (Imax == 0) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProducto();
            }else if( (Imin == 0) && (Imax == 0) && (textoBuscar != null) ){
                return listarProducto(textoBuscar);
            }else if( (Imin >= 0) && (Imax >= Imin) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProducto(Imin, Imax);
            }else if( (Imin >= 0) && (Imax >= Imin) && (textoBuscar != null) ){
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
        } catch(NumberFormatException ex){
            if(textoBuscar != null){
                return listarProducto(textoBuscar);
            }
        }
        
        return listarProducto();
    }
    
    public static Producto selecProducto(int idProducto) throws SQLException {
        JdbcProducto jp = new JdbcProducto() ;
        
        Producto newP = (Producto) jp.select(idProducto) ;
        
        return newP ;
    }
}

