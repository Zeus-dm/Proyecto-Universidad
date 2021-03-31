
package FuncionesGeneral;

import java.sql.Connection;
import java.sql.SQLException;
import jdbc.Conexion;

public class FunIniciar {
    public static void iniciar() throws SQLException{
        Connection conn = Conexion.getConnection();
        Conexion.close(conn);
    } 
}
