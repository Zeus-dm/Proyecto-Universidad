
package FuncionesGeneral;

import domain.IGenerico;
import domain.JefeSucursal;
import domain.Producto;
import domain.Sucursal;
import domain.SucursalProducto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcJefeSucursal;
import jdbc.JdbcSucursal;

public class FunSucursal {
    private static String verificarDatosSucursal(int idSucursal,int idRegion, String nombre, String direccion, String telefono) throws SQLException {
       
        if(nombre == null || nombre.isEmpty()) {
            return "*Error: Campo Nombre vacío" ;
        }
        
        List<Sucursal> sucursales = FunSucursal.listarSucursales(idRegion);
        for (Sucursal sucursal : sucursales) {
            if(nombre.equalsIgnoreCase(sucursal.getNombre()) && idSucursal != sucursal.getIdSucursal()){
                return "*Error: Sucursal Existente";
            }
        }
        
        if(direccion == null || direccion.isEmpty()) {
            return "*Error: Campo Dirección vacío" ;
        }
        
        if(telefono == null || telefono.isEmpty()) {
            return "*Error: Campo Teléfono vacío" ;
        }else {
            try{
                int auxTelefono = Integer.parseInt(telefono) ;
                if(telefono.length() != 8) {
                    return "*Error: Teléfono debe tener 8 dígitos" ;
                }
            }catch(NumberFormatException e){
                return "*Error: Campo Teléfono no es un número" ;
            }
        }
        
        return null;
    }
    
    public static String agregarSucursal(int idRegion, String nombre, String direccion, String telefono) throws SQLException {
        
        String verificar = verificarDatosSucursal(-1,idRegion, nombre, direccion, telefono);
        if(verificar != null){
            return verificar;
        }
        
        Sucursal newS = new Sucursal(idRegion,nombre,direccion, telefono);
        JdbcSucursal js = new JdbcSucursal() ;
        
        js.insert(newS);
        
        return null ;
    }
    
    public static void eliminarSucursal(Sucursal sucursal) throws SQLException {
        
        List<SucursalProducto> listaSP = FunSucursalProducto.listarSucursalProductoS(sucursal.getIdSucursal());
        
        for (SucursalProducto sp : listaSP) {
            Producto producto = FunProducto.selecProducto(sp.getIdProducto());
            producto.setStockTotal(producto.getStockTotal() - sp.getStock());
            
            if(producto.getStockTotal() == 0){
                FunProducto.eliminarProducto(producto.getIdProducto());
            }else{
                FunProducto.actualizarProducto(producto);
            }
            
            FunSucursalProducto.eliminarSucursalProducto(sp.getIdSP());
        }
        
        JefeSucursal jefe = FunSucursal.selecJefe(sucursal.getIdSucursal());
        if(jefe != null){
            FunSucursal.eliminarJefe(jefe.getIdSucursal());
        }
        
        JdbcSucursal js = new JdbcSucursal() ;
        
        js.delete(sucursal);
    }
    
    public static String modificarSucursal(int idSucursal, int idRegion, String nombre, String direccion, String telefono)throws SQLException {
        
        String verificar = verificarDatosSucursal(idSucursal,idRegion, nombre, direccion, telefono);
        if(verificar != null){
            return verificar;
        }
        
        JdbcSucursal js = new JdbcSucursal() ;
        
        Sucursal newS = (Sucursal) js.select(idSucursal) ;
        
        newS.setNombre(nombre);
        newS.setDireccion(direccion);
        newS.setTelefono(telefono);
        
        js.update(newS);
        
        return null ;
    }
    
    public static List<Sucursal> listarSucursales(int idRegion) throws SQLException {
        List<Sucursal> newS = new ArrayList<>() ;
        JdbcSucursal js = new JdbcSucursal() ;
        
        List<IGenerico> nuevoG = js.selectList(idRegion);
        
        nuevoG.forEach(iGenerico -> {
            newS.add((Sucursal)iGenerico) ;
        });
        return newS ;
    }
    
    public static Sucursal selecSucursal (int idSucursal) throws SQLException {
        JdbcSucursal js = new JdbcSucursal() ;
        
        Sucursal newS = (Sucursal) js.select(idSucursal) ;
        
        return newS ;
    }

    //----------------------------------------------------
    private static String verificarDatosJefe(String nombre, String edad) {  
        
        if(nombre==null || nombre.isEmpty()) {
            return "*Error: Campo Nombre vacío" ;
        }
        
        if(edad == null || edad.isEmpty()) {
            return "*Error: Campo edad vacío" ;
        }else {
            try{
                int edadAux = Integer.parseInt(edad) ;
                if (edadAux < 18 || edadAux > 130) {
                    return "*Error: Campo edad  fuera de rango" ;
                }
            }catch (NumberFormatException e) {
                return "*Error: Campo edad no es un número" ;
            }
        }
        
        return null;
    }
    
    public static String agregarJefe(String nombre, String edad, int idSucursal) throws SQLException {
        
        String verificar = verificarDatosJefe(nombre, edad);
        if(verificar != null){
            return verificar;
        }
        int edadAux = Integer.parseInt(edad);
        
        JefeSucursal newJ = new JefeSucursal(nombre, edadAux, idSucursal);
        JdbcJefeSucursal jjs = new JdbcJefeSucursal() ;
        
        jjs.insert(newJ);
        
        return null ;
    }
    
    public static void eliminarJefe(int idSucursal) throws SQLException {
        JefeSucursal newJ = new JefeSucursal(idSucursal);
        JdbcJefeSucursal jjs = new JdbcJefeSucursal() ;
        
        jjs.delete(newJ);
    }
    
    public static String modificarJefe(int idSucursal, String nombre, String edad) throws SQLException {
        
        String verificar = verificarDatosJefe(nombre, edad);
        if(verificar != null){
            return verificar;
        }
        int edadAux = Integer.parseInt(edad);
        
        JdbcJefeSucursal jjs = new JdbcJefeSucursal() ;
        JefeSucursal newJ = (JefeSucursal) jjs.select(idSucursal) ;
        
        newJ.setNombre(nombre);
        newJ.setEdad(edadAux);
        
        jjs.update(newJ);
        
        return null ;
    }

    public static JefeSucursal selecJefe(int idSucursal) throws SQLException {
        JdbcJefeSucursal jjs = new JdbcJefeSucursal() ;
        
        JefeSucursal newJ = (JefeSucursal) jjs.select(idSucursal);
        
        return newJ;
    }
}
