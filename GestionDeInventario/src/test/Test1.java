
package test;

import domain.Producto;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Funcion Main");
        
        Producto x = new Producto("Pisco", "2,5,1,", "#12345", 23, 6000, "Un Pisco Weno");
        
        System.out.println("ids = " + x.getIdsSucursales());
        
    }
}
