
package domain;

import java.util.Map;

public class Sucursal implements IGenerico{
    private int idSucursal ;
    private int idRegion ;
    private String nombre ;
    private String direccion ;
    private String telefono ;
    private JefeSucursal jefeSucursal ;
    private Map <String,Producto> productos ;
    
    public Sucursal(){       
    }
    
    public Sucursal(int idSucursal){
        this.idSucursal = idSucursal ;
    }
    
    public Sucursal(int idRegion, String nombre, String direccion, String telefono) {
        this.idRegion = idRegion ;
        this.nombre = nombre ;
        this.direccion = direccion ;
        this.telefono = telefono ;
    }
    
    public Sucursal(int idSucursal, int idRegion, String nombre, String direccion, String telefono) {
        this.idSucursal = idSucursal ;
        this.idRegion = idRegion ;
        this.nombre = nombre ;
        this.direccion = direccion ;
        this.telefono = telefono ;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public JefeSucursal getJefeSucursal() {
        return jefeSucursal;
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setJefeSucursal(JefeSucursal jefeSucursal) {
        this.jefeSucursal = jefeSucursal;
    }
    
    public void setProductos(Map<String, Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sucursal{idSucursal=").append(idSucursal);
        sb.append(", idRegion=").append(idRegion);
        sb.append(", nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", jefeSucursal=").append(jefeSucursal);
        sb.append('}');
        return sb.toString();
    }
   
}
