
package test;

import domain.*;
import jdbc.*;
import java.sql.SQLException;
import java.util.List;


public class Test1 {
    public static void main(String[] args) throws SQLException {
        System.out.println("Funcion Main");
        
        /* -Productos Funcionan
        Producto x = new Producto("Vodka", "DMG1234", 30, 4000, "Un vodka pl");
        x.setIdsSucursales("1,4,6,7,");
        
        IProductoDao p1 = new JdbcProducto();
        //p1.insert(x);
        
        Map<String,Producto> xd = p1.select(4000, 5000);
        for (Producto pro : xd.values()) {
            System.out.println(pro.toString());
        }
        */
        
        //-Clientes Funciona
        //Cliente x = new Cliente(2,"Rafael Carvacho", 20, "Psj. Tolten #0881", 72559399, "rafael.carvacho@gmail.com");
        //JdbcCliente c1 = new JdbcCliente();
        //c1.insert(x);
        //c1.update(x);
        
        /*
        List<IGenerico> xd = c1.select();
        for (IGenerico cliente : xd) {
            System.out.println(cliente.toString());
        }*/
        
        //IGenerico cl = c1.select(2);
        //System.out.println(cl.toString());
        
        //c1.delete(x);
        
        
        /* -Jefes de Sucursal Funciona
        JefeSucursal js = new JefeSucursal(1,"armando", 30, 2);
        IJefeSucursalDao j1 = new JdbcJefeSucursal();
        //j1.insert(js);
        //j1.update(js);
        
        JefeSucursal xd = j1.select(2);
        System.out.println("xd = " + xd.toString());
        
        j1.delete(js);
        */
        
        //-Region Funciona
        //Region r = new Region(4,"Bio Bio");
        //IRegionDao r1 = new JdbcRegion();
        //r1.insert(r);
        //r1.update(r);
        /*
        List<Region> xd = r1.select();
        for (Region region : xd) {
            System.out.println("region = " + region.toString());
        }
        */
        //r1.delete(r);
        
        
        /* -Sucursal funciona
        Sucursal x = new Sucursal(1,3, "aaaa", "calle falsa 123", 44445555);
        ISucursalDao s1 = new JdbcSucursal();
        //s1.insert(x);
        //s1.update(x);
        
        List<Sucursal> xd = s1.select();
        for (Sucursal sucursal : xd) {
            System.out.println("sucursal = " + sucursal.toString());
        }
        
        Sucursal no = s1.select(1);
        System.out.println("no = " + no.toString());
        
        s1.delete(x);
        */
        
        /* -Sucursal producto funciona
        SucursalProducto sp = new SucursalProducto(1, 3, 4, 30);
        ISucursalProductoDao xd = new JdbcSucursalProducto();
        //xd.insert(sp);
        //xd.update(sp);
        SucursalProducto pp = xd.select(3, 4);
        System.out.println("pp = " + pp.toString());
        
        xd.delete(sp);
        */
        
    }
}
