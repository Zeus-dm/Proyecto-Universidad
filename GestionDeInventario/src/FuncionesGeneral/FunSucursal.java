
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
    
    public static String agregarSucursal(int idRegion, String nombre, String direccion,String telefono) throws SQLException {
        int auxTelefono = 0 ;
        
        if(nombre==null || nombre.isEmpty()) {
            return "*Error: Campo Nombre vacío" ;
        }
        if(direccion == null || direccion.isEmpty()) {
            return "*Error: Campo Dirección vacío" ;
        }
        if(telefono==null || telefono.isEmpty()) {
            return "*Error: Campo Teléfono vacío" ;
        }else {
            try{
                auxTelefono = Integer.parseInt(telefono) ;
                if(telefono.length()!=8) {
                    return "*Error: Teléfono debe tener 8 dígitos" ;
                }
            }catch(NumberFormatException e){
                return "*Error: Campo Teléfono no es un número" ;
            }
        }
        
        Sucursal newS = new Sucursal(idRegion,nombre,direccion, auxTelefono);
        JdbcSucursal js = new JdbcSucursal() ;
        
        js.insert(newS);
        
        return null ;
    }
    
    public static String agregarSucursal(int idRegion, String nombre, String direccion,String telefono,String jefeSucursal,String edad) throws SQLException {
        int telefonoAux = 0 ;
        int edadAux = 0 ;
        if(nombre==null || nombre.isEmpty()) {
            return "*Error: Campo Nombre vacío" ;
        }
        if(direccion == null || direccion.isEmpty()) {
            return "*Error: Campo Dirección vacío" ;
        }
        if(telefono==null || telefono.isEmpty()) {
            return "*Error: Campo Teléfono vacío" ;
        }else {
            try{
                telefonoAux = Integer.parseInt(telefono) ;
                if(telefono.length()!=8) {
                    return "*Error: Teléfono debe tener 8 dígitos" ;
                }
            }catch(NumberFormatException e){
                return "*Error: Campo Teléfono no es un número" ;
            }
        }
        if(jefeSucursal==null || jefeSucursal.isEmpty()){
            return "*Error: Campo Jefe Sucursal vacío" ;
        }
        if(edad == null || edad.isEmpty()) {
            return "*Error: Campo edad vacío" ;
        }else {
            try{
                edadAux = Integer.parseInt(edad) ;
                if (edadAux<18 || edadAux>130) {
                    return "*Error: Campo edad  fuera de rango" ;
                }
            }catch (NumberFormatException e) {
                return "*Error: Campo edad no es un número" ;
            }
        }
        
        Sucursal newS = new Sucursal(idRegion,nombre,direccion, telefonoAux);
        JdbcSucursal js = new JdbcSucursal() ;
        
        js.insert(newS);
        
        return null ;
    }
}
