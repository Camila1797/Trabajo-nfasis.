/*
 * 
 * Fecha de Creación: 20/05/2013
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccesoDatos {

    private Connection conexion;
    private PreparedStatement sentencia;
    private ResultSet resultado;
    private String query;

    //This refiere al objeto desde el que se esta ejecutando un metodo 
    public Connection getConexion() {
        return conexion;
    }
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }    
    public PreparedStatement getSentencia() {
        return sentencia;
    }
    public void setSentencia(PreparedStatement sentencia) {
        this.sentencia = sentencia;
    }
    public ResultSet getResultado() {
        return resultado;
    }
    public void setResultado(ResultSet resultado) {
        this.resultado = resultado;
    }
    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }    
}