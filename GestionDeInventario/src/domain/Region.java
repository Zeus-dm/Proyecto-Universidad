
package domain;

import java.util.List;

public class Region {
    private int idRegion ;
    private String nombre ;
    private List <Sucursal> sucursales ;
    
    public Region() {   
    }

    public Region(int idRegion) {
        this.idRegion = idRegion ;
    }
    
    public Region(String nombre) {
        this.nombre = nombre ;
    }
    
    public Region(int idRegion, String nombre) {
        this.idRegion = idRegion ;
        this.nombre = nombre ;
    }

    public int getIdRegion() {
        return idRegion;
    }

    public String getNombre() {
        return nombre;
    }

    public List getSucursales() {
        return sucursales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSucursales(List sucursales) {
        this.sucursales = sucursales;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Region{idRegion=").append(idRegion);
        sb.append(", nombre=").append(nombre);
        sb.append(", sucursales=").append(sucursales);
        sb.append('}');
        return sb.toString();
    }

}
