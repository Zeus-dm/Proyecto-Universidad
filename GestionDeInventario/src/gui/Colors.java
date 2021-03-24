
package gui;

public enum Colors {
    BLANCO("#FFFFFF"),
    DORADO("#EFB810"),
    GRIS_SUAVE("#5C5E5F"),
    GRIS("#4C5053"),
    GRIS_OSCURO("#3C3F42"),
    ROJO_SUAVE("#F44336"),
    
    FONDO(Colors.GRIS_OSCURO.getColor()),
    TITULO(Colors.BLANCO.getColor()),
    
    TEXTO(Colors.BLANCO.getColor()),
    TEXTO_FONDO(Colors.GRIS_SUAVE.getColor()),
    TEXT_ERROR(Colors.ROJO_SUAVE.getColor()),
    
    FONDO_BOTON(Colors.GRIS.getColor()),
    TEXTO_BOTON(Colors.BLANCO.getColor()),
    
    BORDE(Colors.DORADO.getColor());
    
    private final String color;

    private Colors(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
}
