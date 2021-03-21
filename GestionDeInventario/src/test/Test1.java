
package test;

import domain.Producto;
import java.sql.SQLException;
import jdbc.IProductoDao;
import jdbc.JdbcProducto;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        System.out.println("Funcion Main");
        
        Producto x = new Producto(1,"Vodka", "#12345", 23, 6000, "Un Pisco Weno");
        x.setIdsSucursales("2,9,10,4,21195");
        
        IProductoDao p1 = new JdbcProducto();
        p1.delete(x);
        /*
        Producto aa = p1.select(1);
        System.out.println( aa.toString() );
        */
        
    }
}
