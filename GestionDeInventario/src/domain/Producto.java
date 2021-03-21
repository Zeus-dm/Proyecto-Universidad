
package domain;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private int idProducto ;
    private List <Integer> idsSucursales ;
    private String nombre ;
    private String barCode ;
    private int stockTotal ;
    private long precio ;
    private String descripcion ;
    
    public Producto(){
    }
    
    public Producto(int idProducto){
        this.idProducto = idProducto ;
    }
    
    public Producto(String nombre, String idsSucursales, String barCode, int stockTotal, long precio, String descripcion){
        this.nombre = nombre ;
        this.barCode = barCode ;
        this.stockTotal = stockTotal ;
        this.precio = precio ;
        this.descripcion = descripcion ;
        
        this.setIdsSucursales(idsSucursales);
    }
    
    public Producto(int idProducto, String nombre, String idsSucursales, String barCode, int stockTotal, long precio, String descripcion){
        this.idProducto = idProducto ;
        this.nombre = nombre ;
        this.barCode = barCode ;
        this.stockTotal = stockTotal ;
        this.precio = precio ;
        this.descripcion = descripcion ;
        
        this.setIdsSucursales(idsSucursales);
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getIdsSucursales() {
        String idsSucursales = "";
        for (Integer id : this.idsSucursales) {
            idsSucursales += id+",";
        }
        return idsSucursales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getStockTotal() {
        return stockTotal;
    }

    public long getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setIdsSucursales(String idsSucursales) {
        this.idsSucursales = new ArrayList<>();
        String arrayIds[] = idsSucursales.split(",");
        for (String arrayId : arrayIds) {
            this.idsSucursales.add(Integer.parseInt(arrayId));
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setStockTotal(int stockTotal) {
        this.stockTotal = stockTotal;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", idsSucursales=").append(idsSucursales);
        sb.append(", nombre=").append(nombre);
        sb.append(", barCode=").append(barCode);
        sb.append(", stockTotal=").append(stockTotal);
        sb.append(", precio=").append(precio);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

}
