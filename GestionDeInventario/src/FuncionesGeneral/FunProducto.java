
package FuncionesGeneral;

import domain.IGenerico;
import domain.Producto;
import domain.SucursalProducto;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
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
            Map<String,Producto> mapa = FunProducto.listarProductos();

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
    
    public static String agregarProducto(int idSucursal, int idProducto, String nombre, String barCode, String precio, String stock, String descripcion) throws SQLException{
        
        String verificar = verificarDatos(idProducto, nombre, barCode, precio);
        if(verificar != null){
            return verificar;
        }
        int precioAux = Integer.parseInt(precio);
        
        try {
            int stockAux = Integer.parseInt(stock);
            if( stockAux <= 0){
                return "*Error: Stock debe ser mayor que 0";
            }
            Producto producto = new Producto(nombre, barCode, stockAux, precioAux, descripcion);
            JdbcProducto jp = new JdbcProducto();
            
            jp.insert(producto);
            
            producto = (Producto)jp.select(barCode);
            
            FunSucursalProducto.agregarSucursalProducto(producto.getIdProducto(), idSucursal, stockAux);
        } catch(NumberFormatException ex){
            return "*Error: Ingrese solo numeros al precio" ;
        }

        return null;
    }
    
    public static String agregarproducto(int idSucursal, int idproducto, String stock) throws SQLException{
        try {
            int stockAux = Integer.parseInt(stock);
            if( stockAux <= 0){
                return "*Error: Stock debe ser mayor que 0";
            }
            
            FunSucursalProducto.agregarSucursalProducto(idproducto, idSucursal, stockAux);
            
            Producto producto = FunProducto.selecProducto(idproducto);
            producto.setStockTotal( producto.getStockTotal() + stockAux );
            
            FunProducto.actualizarProducto(producto);
        } catch(NumberFormatException ex){
            return "*Error: Ingrese solo numeros al precio" ;
        }
        
        return null;
    }
    
    public static void eliminarProducto(int idProducto) throws SQLException{
        JdbcProducto jp = new JdbcProducto() ;
        Producto newP = new Producto(idProducto);
        
        jp.delete(newP);
    }
    
    public static void eliminarProducto(int idProducto, int idSucursal)throws SQLException {
        SucursalProducto newSP = FunSucursalProducto.selectSP(idProducto, idSucursal) ;
        
        Producto newP = FunProducto.selecProducto(idProducto) ;
        
        newP.setStockTotal(newP.getStockTotal() - newSP.getStock());
        
        if(newP.getStockTotal() == 0) {
            FunProducto.eliminarProducto(idProducto);
        }else {
            FunProducto.actualizarProducto(newP);
        }
        
        FunSucursalProducto.eliminarSucursalProducto(newSP.getIdSP());
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
    
    public static Map<String,Producto> listarProductos() throws SQLException {
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
    
    public static Map<String,Producto> listarProductos(int min, int max) throws SQLException {
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
    
    public static Map<String,Producto> listarProductos(String textoBuscar) throws SQLException {
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
    
    public static Map<String,Producto> listarProductos(String min, String max, String textoBuscar) throws SQLException {
        try {
            int Imin = Integer.parseInt(min);
            int Imax = Integer.parseInt(max);
          
            if( (Imin == 0) && (Imax == 0) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProductos();
            }else if( (Imin == 0) && (Imax == 0) && (textoBuscar != null) ){
                return listarProductos(textoBuscar);
            }else if( (Imin >= 0) && (Imax >= Imin) && (textoBuscar == null || textoBuscar.isEmpty()) ){
                return listarProductos(Imin, Imax);
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
                return listarProductos(textoBuscar);
            }
        }
        
        return listarProductos();
    }
    
    public static Map<String,Producto> listarProductos(int id_sucursal) throws SQLException{
        List<SucursalProducto> listaSP = FunSucursalProducto.listarSucursalProductoS(id_sucursal);
        
        Map<String,Producto> newP = new HashMap<>();
        
        for (SucursalProducto sp : listaSP) {
            Producto producto = FunProducto.selecProducto(sp.getIdProducto());
            newP.put(producto.getBarCode(), producto);
        }
        
        return newP;
    }
    
    public static Map<String,Producto> listarProductos(int id_sucursal, String min, String max, String textoBuscar) throws SQLException{
        Map<String,Producto> allProductos = FunProducto.listarProductos(min, max, textoBuscar);
        Map<String,Producto> sucursalProductos = FunProducto.listarProductos(id_sucursal);
        
        Map<String,Producto> listaProductos = new HashMap<>();
        
        for (String key : allProductos.keySet()) {
            Producto producto = sucursalProductos.get(key);
            if(producto != null){
                listaProductos.put(producto.getBarCode(), producto);
            }
        }
        
        return listaProductos;
    }
    
    public static Map<String,Producto> listarProductosExist(int id_sucursal) throws SQLException{
        Map<String,Producto> allProductos = FunProducto.listarProductos();
        Map<String,Producto> sucursalProductos = FunProducto.listarProductos(id_sucursal);
        
        Map<String,Producto> listaProductos = new HashMap<>();
        
        for (String key : allProductos.keySet()) {
            Producto producto = sucursalProductos.get(key);
            if(producto == null){
                producto = allProductos.get(key);
                listaProductos.put(producto.getBarCode(), producto);
            }
        }
        
        return listaProductos;
    }
    
    public static Producto selecProducto(int idProducto) throws SQLException {
        JdbcProducto jp = new JdbcProducto() ;
        
        Producto newP = (Producto) jp.select(idProducto) ;
        
        return newP ;
    }
    
    public static String modificarStockEnTienda (int idSucursal, int idProducto, String stock) throws SQLException {
        try {
            SucursalProducto newSP = FunSucursalProducto.selectSP(idProducto, idSucursal) ;
            
            int stockAux = Integer.parseInt(stock);
            if( stockAux <= 0){
                return "*Error: Stock debe ser mayor que 0";
            }
            
            int nuevoStock = stockAux - newSP.getStock() ;
        
            Producto newP = FunProducto.selecProducto(idProducto) ;
        
            newP.setStockTotal(newP.getStockTotal()+nuevoStock);

            FunProducto.actualizarProducto(newP);
        
            newSP.setStock(stockAux);
        
            FunSucursalProducto.actualizarSP(newSP);
        
            return null ;  
        } catch(NumberFormatException ex){
            return "*Error: Ingrese solo numeros al precio" ;
        }
    }
}

