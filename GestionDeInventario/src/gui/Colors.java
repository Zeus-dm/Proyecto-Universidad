
package gui;

public enum Colors {
    FONDO("#3C3F42");
    
    private final String color;

    private Colors(String color) {
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
}
