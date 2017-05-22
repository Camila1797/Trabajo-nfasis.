/*
 * 
 * Fecha de Creación: 20/05/2013
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;//Método que nos permite establecer una conexión con la base de datos
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instancia;
    private Conexion() {
    }

    //El metodo recibe instancia 
    //Luego instancia va a la condicion si es nula realiza una nueva conexion 
    //se retorna instancia cumpliendo o no la condicion
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    //El metodo se utiliza para realizar la conexion, excepciones en la BD 
    //Se crea una variable para la conexion
    //Tener la clase en tiempo de ejecuccion 
    //Con la variable creada estblecemos la conexion con la BD y retornamos la variable con la conexion
    
    public Connection conectar() throws SQLException, ClassNotFoundException {

        Connection cnn;
        Class.forName("com.mysql.jdbc.Driver");
        cnn = DriverManager.getConnection("jdbc:mysql://localhost/db_wfm", "root", "");
        //en el equipo donde lo vallas a correr xampp debes crear un usuario work con clave work
        //para cero problema con la aplicacion y los sp
        return cnn;
    }

    //Este metodo verificara si la conexion retorna un valor nulo, automaticamente se cerrara 
    public void desconectar(Connection cnn, PreparedStatement pss) throws SQLException {

        if (cnn != null) {
            cnn.close();
        }
        if (pss != null) {
            pss.close();
        }
    }
}