
package FuncionesGeneral;

import domain.IGenerico;
import domain.Region;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcRegion;

public class FunRegion {
    public static String agregarRegion (String nombre) throws SQLException {
        if (nombre == null || nombre.length()== 0 ){
            return "* Error: Campo vacio" ;
        }
        List<Region> regiones = FunRegion.listarRegiones();
        for (Region region : regiones) {
            if(nombre.equalsIgnoreCase(region.getNombre())){
                return "* Error: Region Existente";
            }
        }
        
        Region newR = new Region(nombre) ;
        JdbcRegion jr = new JdbcRegion() ;
        jr.insert(newR) ;
        
        return null ;
    }
    
    public static void eliminarRegion (Region region) throws SQLException {
        JdbcRegion jr = new JdbcRegion () ;
        jr.delete(region);
    }
    
    public static String modificarRegion(Region modRegion, String nombre) throws SQLException {
        if (nombre == null || nombre.length()== 0 ){
            return "* Error: Campo vacio" ;
        }
        List<Region> regiones = FunRegion.listarRegiones();
        for (Region region : regiones) {
            if(nombre.equalsIgnoreCase(region.getNombre())){
                return "* Error: Region Existente";
            }
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
        
        for (IGenerico iGenerico : nuevoG) {
            newR.add((Region)iGenerico) ;
        }
        return newR ;
    }
    
    public static Region select(int id_region) throws SQLException{
        JdbcRegion jr = new JdbcRegion();
        
        Region newR = (Region) jr.select(id_region);
        
        return newR;
    }
}
