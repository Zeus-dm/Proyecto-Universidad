/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Alumno
 */
public class Region {
    private int idRegion ;
    private String nombre ;
    private List <Sucursal> ;
    
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

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Region{idRegion=").append(idRegion);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
}
