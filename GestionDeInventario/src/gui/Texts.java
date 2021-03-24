
package gui;

public enum Texts {
    TITULO("Waltmart"),
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
