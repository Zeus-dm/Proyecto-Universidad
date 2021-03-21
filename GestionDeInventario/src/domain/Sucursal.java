/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Map;

/**
 *
 * @author Alumno
 */
public class Sucursal {
    private int idSucursal ;
    private int idRegion ;
    private String nombre ;
    private String direccion ;
    private int telefono ;
    private String jefeSucursal ;
    private Map<String,Producto> ;
    
    public Sucursal(){
        
    }
    
    public Sucursal(int idSucursal){
        this.idSucursal = idSucursal ;
    }
    
    public Sucursal(int idRegion, String nombre, String direccion, int telefono) {
        this.idRegion = idRegion ;
        this.nombre = nombre ;
        this.direccion = direccion ;
        this.telefono = telefono ;
    }
    
    public Sucursal(int idSucursal, int idRegion, String nombre, String direccion, int telefono) {
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

    public String getNombreSucursal() {
        return nombre;
    }

    public String getDireccionSucursal() {
        return direccion;
    }

    public int getTelefonoSucursal() {
        return telefono;
    }

    public String getJefeSucursal() {
        return jefeSucursal;
    }
    
}
