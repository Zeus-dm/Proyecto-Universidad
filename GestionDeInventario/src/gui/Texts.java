
package gui;

public enum Texts {
    TITULO("Gualmarcito"),
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
            
    PRODUCTOS("Productos"),
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
