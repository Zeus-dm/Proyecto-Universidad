
package gui;

public enum Texts {
    TITULO("El Chefcito"),
    REGIONES("Regiones"),
        AGR_REGION("Agr. Región"),
            AGREGAR_REGION("Agregar Nueva Región"),
            NOMBRE("Nombre"),
        ELIM_REGION("Elim. Región"),
            ELIMINAR_REGION("Eliminar Región"),
            REGION("Región"),
        MOD_REGION("Mod. Región"),
            MODIFICAR_REGION("Modificar Región"),
            
    CLIENTES("Clientes"),
        AGR_CLIENTE("Agr. Cliente"),
            AGREGAR_CLIENTE("Agregar Nuevo Cliente"),
            EDAD("Edad"),
            DIRECCION("Dirección"),
            TELEFONO("Teléfono"),
                ID_TELEFONO("+56 9"),
            EMAIL("E-mail"),
        ELIM_CLIENTE("Elim. Cliente"),
        MOD_CLIENTE("Mod. Cliente"),
            MODIFICAR_CLIENTE("Modificar Cliente"),
            
    PRODUCTOS("Productos"),
        BUSCAR("Buscar"),
        PRECIO("Precio"),
        MIN("Min"),
        MAX("Max"),
            BARCODE("BarCode"),
            STOCK_TOTAL("Stock Total"),
            DESCRIPCION("Descripción"),
        MODIFICAR_PRODUCTO("Modificar Producto"),
    
    REPORTES("Reportes"),
    SALIR("Salir"),
    ACEPTAR("Aceptar"),
    CANCELAR("Cancelar"),
    VOLVER("Volver");
    
    private final String texto;

    private Texts(String texto) {
        this.texto = texto;
    }
    
    public String getTexto(){
        return this.texto;
    }
}
