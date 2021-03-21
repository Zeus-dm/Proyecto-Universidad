
package domain;

public abstract class Persona {
    protected String nombre ;
    protected int edad ;
    
    public Persona(){   
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre ;
        this.edad = edad ;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
    
}
