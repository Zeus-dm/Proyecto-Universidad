/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Alumno
 */
public class JefeSucursal extends Persona {
    private int idJefe ;
    private int idSucursal ;
    
    public JefeSucursal() {
        
    }
    public JefeSucursal(int idJefe) {
        this.idJefe = idJefe ;
    }
    
    public JefeSucursal(String nombre, int edad, int idSucursal) {
        super.nombre = nombre ;
        super.edad = edad ;
        this.idSucursal = idSucursal ;
    }
    
    public JefeSucursal(int idJefe, String nombre, int edad, int idSucursal) {
        this.idJefe = idJefe ;
        super.nombre = nombre ;
        super.edad = edad ;
        this.idSucursal = idSucursal ;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public int getIdSucursal() {
        return idSucursal;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int getEdad() {
        return edad;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JefeSucursal{idJefe=").append(idJefe);
        sb.append(", idSucursal=").append(idSucursal);
        sb.append('}');
        return sb.toString();
    }
    
}
