
package FuncionesGeneral;

import domain.Cliente;
import domain.IGenerico;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.JdbcCliente;

public class FunCliente {
    public static String agregarCliente(String nombre, String edad, String direccion, String telefono, String email) throws SQLException {
        int edadAux = 0 ;
        int telefonoAux = 0 ;
        
        if(nombre == null || nombre.isEmpty()) {
            return "*Error: Campo nombre vacío" ;
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
        
        if(direccion == null || direccion.isEmpty()) {
            return "*Error: Campo dirección vacío" ;
        }
        
        if(telefono == null || telefono.isEmpty()) {
            return "*Error: Campo telefono vacío" ;
        }else {
            
            try{
                telefonoAux = Integer.parseInt(edad) ;
                if (telefono.length() != 8) {
                    return "*Error: Telefono debe tener 8 dígitos" ;
                }
            }catch (NumberFormatException e) {
                return "*Error: Campo telefono no es un número" ;
            }
        }
        
        if(email == null || email.isEmpty()) {
            return "*Error: Campo E-mail Vacío" ;
        }else {
            String cadena[] = email.split("@") ;
            if (cadena.length != 2){
                return "*Error: E-mail inválido" ;
            }else if(cadena[0] == null || cadena[0].isEmpty() || cadena[1] == null || cadena[1].isEmpty()) {
                return "*Error: E-mail inválido" ;
            }else if(cadena[1].contains(".") && '.' == email.charAt(email.length()-1)) {
                return "*Error: E-mail inválido" ;
            }
        }
        
        Cliente newC = new Cliente(nombre, edadAux, direccion, telefonoAux, email);
        JdbcCliente jc = new JdbcCliente() ;
        
        jc.insert(newC) ;
        
        return null ;
    }
    
    public static void eliminarCliente(int id) throws SQLException {
        Cliente newC = new Cliente(id) ;
        JdbcCliente jc = new JdbcCliente() ;
        
        jc.delete(newC);
    }
    
    public static String modificarCliente(int id, String nombre, String edad, String direccion, String telefono, String email) throws SQLException {
        int edadAux = 0 ;
        int telefonoAux = 0 ;
        
        if(nombre == null || nombre.isEmpty()) {
            return "*Error: Campo nombre vacío" ;
        }
        if(edad == null || edad.isEmpty()) {
            return "*Error: Campo edad vacío" ;
        }else {
            try{
                edadAux = Integer.parseInt(edad) ;
                if (edadAux<18 || edadAux>130) {
                    return "*Error: Campo edad fuera de rango" ;
                }
            }catch (NumberFormatException e) {
                return "*Error: Campo edad no es un número" ;
            }
        }
        if(direccion == null || direccion.isEmpty()) {
            return "*Error: Campo dirección vacío" ;
        }
        if(telefono == null || telefono.isEmpty()) {
            return "*Error: Campo telefono vacío" ;
        }else {
            
            try{
                telefonoAux = Integer.parseInt(edad) ;
                if (telefono.length() != 8) {
                    return "*Error: Telefono debe tener 8 dígitos" ;
                }
            }catch (NumberFormatException e) {
                return "*Error: Campo telefono no es un número" ;
            }
        }
        if(email == null || email.isEmpty()) {
            return "*Error: Campo E-mail vacío" ;
        }else {
            String cadena[] = email.split("@") ;
            if (cadena.length != 2){
                return "*Error: E-mail inválido" ;
            }else if(cadena[0] == null || cadena[0].isEmpty() || cadena[1] == null || cadena[1].isEmpty()) {
                return "*Error: E-mail inválido" ;
            }else if(cadena[1].contains(".") && '.' == email.charAt(email.length()-1)) {
                return "*Error: E-mail inválido" ;
            }
        }
        
        JdbcCliente jc = new JdbcCliente() ;
        
        Cliente newC = (Cliente) jc.select(id) ; 
        
        newC.setNombre(nombre);
        newC.setEdad(edadAux);
        newC.setDireccion(direccion);
        newC.setTelefono(telefonoAux);
        newC.setEmail(email);
        
        jc.update(newC);
        
        return null ;
    }
    
    public static List<Cliente> listarClientes () throws SQLException {
        List<Cliente> newC = new ArrayList<>() ;
        JdbcCliente jc = new JdbcCliente() ;
        
        List<IGenerico> nuevoG = jc.select() ;
        
        for (IGenerico iGenerico : nuevoG) {
            newC.add((Cliente)iGenerico) ;
        }
        return newC ;
    }
    
    public static Cliente selecCliente (int id) throws SQLException {
        JdbcCliente jc = new JdbcCliente() ;
        
        Cliente newC = (Cliente) jc.select(id) ;
        
        return newC ;
    }
}
