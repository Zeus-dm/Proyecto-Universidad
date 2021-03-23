
package gui;

public enum Colors {
    FONDO("#3C3F42"),
    TITULO("#FFFFFF"),
    TEXTO("#FFFFFF"),
    TEXT_ERROR("#F44336"),
    FONDO_BOTON("#4C5053"),
    TEXTO_BOTON("#FFFFFF"),
    BORDE_BOTON("#EFB810"),
    DORADO("#EFB810"),
    GRIS("#5C5E5F");
    
    
    private final String color;

    private Colors(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
}
