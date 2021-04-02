
package domain;

public class Producto implements IGenerico{
    private int idProducto ;
    private String nombre ;
    private String barCode ;
    private int stockTotal ;
    private int precio ;
    private String descripcion ;
    
    public Producto(){
    }
    
    public Producto(int idProducto){
        this.idProducto = idProducto ;
    }
    
    public Producto(String nombre, String barCode, int stockTotal, int precio, String descripcion){
        this.nombre = nombre ;
        this.barCode = barCode ;
        this.stockTotal = stockTotal ;
        this.precio = precio ;
        this.descripcion = descripcion ;
    }
    
    public Producto(int idProducto, String nombre, String barCode, int stockTotal, int precio, String descripcion){
        this.idProducto = idProducto ;
        this.nombre = nombre ;
        this.barCode = barCode ;
        this.stockTotal = stockTotal ;
        this.precio = precio ;
        this.descripcion = descripcion ;
    }

    public int getIdProducto() {
        return idProducto;
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

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
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

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", barCode=").append(barCode);
        sb.append(", stockTotal=").append(stockTotal);
        sb.append(", precio=").append(precio);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
}
