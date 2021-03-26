
package test;

import domain.JefeSucursal;
import domain.Producto;
import domain.Region;
import domain.Sucursal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test0 {
    public static void main(String[] args) {
        //Se inicializan los Productos del programa
        Producto p1 = new Producto(1, "Pisco 1L Mistral", "#123456789", 50, 6500, "Un Pisco pa las junta");
        Producto p2 = new Producto(2, "Ron Barcelo Añejado", "#543216789", 20, 5000, "Un Ron Bueno XD");
        Producto p3 = new Producto(3, "Vodka SKY", "#987654321", 130, 7100, "Un Vodka con Botella azul");
        Producto p4 = new Producto(4, "Whisky Chivas Regal 12 años", "#987651234", 8, 25000, "Un Whisky weno, pero weno weno");
        Producto p5 = new Producto(5, "Pisco Campanario", "#198765432", 100, 3500, "Un Pisco para Vomitar (alcohol etilico)");
        
        Map<String,Producto> m1 = new HashMap<>();
        m1.put(p2.getBarCode(), p2);
        m1.put(p5.getBarCode(), p5);
        m1.put(p1.getBarCode(), p1);
        
        Map<String,Producto> m2 = new HashMap<>();
        m2.put(p1.getBarCode(), p1);
        m2.put(p3.getBarCode(), p3);
        m2.put(p4.getBarCode(), p4);
        m2.put(p5.getBarCode(), p5);
        
        //Se inicializan Las Regiones
        List<Region> regiones = new ArrayList<>();
        
        Region r1 = new Region(1, "Metropolitana");
        Region r2 = new Region(2, "Valparaiso");
        
        //Se inicializan la sucursales y su respectivo Jefe de Sucursal, de la region Metropolitana (r1)
        List<Sucursal> sucursales1 = new ArrayList<>();
        
        Sucursal s1 = new Sucursal(1, 1, "Sucursal 1", "Calle falsa 123", 11111111);
        JefeSucursal js1 = new JefeSucursal(1, "Jose", 31, 1);
        s1.setJefeSucursal(js1);
        s1.setProductos(m1);
        
        Sucursal s2 = new Sucursal(2, 1, "Sucursal 2", "Calle verdadera 123", 11112222);
        JefeSucursal js2 = new JefeSucursal(2, "Maria", 23, 2);
        s2.setJefeSucursal(js2);
        s2.setProductos(m1);
        
        Sucursal s3 = new Sucursal(3, 1, "Sucursal 3", "Calle nose 123", 11113333);
        JefeSucursal js3 = new JefeSucursal(3, "Jesus", 54, 3);
        s3.setJefeSucursal(js3);
        s3.setProductos(m2);
        
        sucursales1.add(s1);
        sucursales1.add(s2);
        sucursales1.add(s3);
        
        r1.setSucursales(sucursales1);
        
        //Se inicializa las sucursales de la region Valparaiso(r2)
        List<Sucursal> sucursales2 = new ArrayList<>();
        
        Sucursal s4 = new Sucursal(4, 2, "Sucursal 4", "Calle Francia 321", 11114444);
        JefeSucursal js4 = new JefeSucursal(4, "Anacleto", 69, 4);
        s4.setJefeSucursal(js4);
        s4.setProductos(m2);
        
        sucursales2.add(s4);
        
        r2.setSucursales(sucursales2);
        
        //Se muestran los datos de la lista regiones
        regiones.add(r1);
        regiones.add(r2);
        
        mostar(regiones);
    }

    private static void mostar(List<Region> regiones) {
        for (Region region : regiones) {
            System.out.println(region.toString());
            
            for (Sucursal sucursal : region.getSucursales()) {
                System.out.println("    "+sucursal.toString());
                
                for (Producto producto : sucursal.getProductos().values()) {
                    System.out.println("        "+producto.toString());
                }
                System.out.println("");
            }
            
        }
    }
    
}
