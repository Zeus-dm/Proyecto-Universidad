
package FuncionesGeneral;

import domain.IGenerico;
import domain.Region;
import domain.Sucursal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcRegion;

public class FunRegion {
    private static String verificarDatos(String nombre) throws SQLException{
        if (nombre == null || nombre.length()== 0 ){
            return "* Error: Campo vacio" ;
        }
        
        List<Region> regiones = FunRegion.listarRegiones();
        for (Region region : regiones) {
            if(nombre.equalsIgnoreCase(region.getNombre())){
                return "* Error: Region Existente";
            }
        }
        
        return null;
    }
    
    public static String agregarRegion (String nombre) throws SQLException {
        
        String verificar = verificarDatos(nombre);
        if(verificar != null){
            return verificar;
        }
        
        Region newR = new Region(nombre) ;
        JdbcRegion jr = new JdbcRegion() ;
        jr.insert(newR) ;
        
        return null ;
    }
    
    public static void eliminarRegion (Region region) throws SQLException {
        List<Sucursal> sucursales = FunSucursal.listarSucursales(region.getIdRegion());
        
        for (Sucursal sucursal : sucursales) {
            FunSucursal.eliminarSucursal(sucursal);
        }
        
        JdbcRegion jr = new JdbcRegion () ;
        jr.delete(region);
    }
    
    public static String modificarRegion(Region modRegion, String nombre) throws SQLException {
        
        String verificar = verificarDatos(nombre);
        if(verificar != null){
            return verificar;
        }
        
        modRegion.setNombre(nombre);
        JdbcRegion jr = new JdbcRegion();
        jr.update(modRegion);
        
        return null;
    } 
    
    public static List<Region> listarRegiones () throws SQLException {
        List<Region> newR = new ArrayList<>() ;
        JdbcRegion jr = new JdbcRegion() ;
        
        List<IGenerico> nuevoG = jr.select() ;
        
        nuevoG.forEach(iGenerico -> {
            newR.add((Region)iGenerico) ;
        });
        return newR ;
    }
    
    public static Region selecRegion(int idRegion) throws SQLException{
        JdbcRegion jr = new JdbcRegion();
        
        Region newR = (Region) jr.select(idRegion);
        
        return newR;
    }
}