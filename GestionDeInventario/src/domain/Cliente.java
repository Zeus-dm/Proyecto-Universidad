
package domain;

public class Cliente extends Persona implements IGenerico{
    private int idCliente ;
    private String direccion ;
    private String telefono ;
    private String email ;
    
    public Cliente (){    
    }
    
    public Cliente (int idCliente) {
        this.idCliente = idCliente ;
    }
    
    public Cliente (String nombre, int edad, String direccion, String telefono, String email){
        super.nombre = nombre ;
        super.edad = edad ;
        this.direccion = direccion ;
        this.telefono = telefono ;
        this.email = email ;
    }
    
    public Cliente (int idCliente, String nombre, int edad, String direccion, String telefono, String email){
        this.idCliente = idCliente ;
        super.nombre = nombre ;
        super.edad = edad ;
        this.direccion = direccion ;
        this.telefono = telefono ;
        this.email = email ;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public int getEdad() {
        return edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
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
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append(", nombre=").append(super.getNombre());
        sb.append(", edad=").append(super.getEdad());
        sb.append('}');
        return sb.toString();
    }
}
