/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import login.modelo.usuario;
import registro.modelo.Registro;

/**
 *
 * @author Edwin
 */
public class UsuarioDAO {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    public UsuarioDAO() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/t_enfasis", "root", "");
            System.out.println("conexion lista");

        } catch (Exception error) {
            error.printStackTrace();

        }
    }

    public boolean getUsuario(usuario usuario) {
        String sql = "SELECT * FROM t_usuarios WHERE nombre_usuario='" + usuario.getLogin() + "'";
        try {
            st = conexion.createStatement();
            rs = st.executeQuery(sql);
            return rs.first();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return false;
    }

    public boolean getRegistro(Registro Registro) {
        String sql = "INSERT INTO t_usuarios (nombre_usuario,correo_usuario) VALUES ('" + Registro.getnombre() + "','" + Registro.getCorreo() + "')";
        try {
            st = conexion.createStatement();
            st.executeUpdate(sql);
        } catch (Exception error) {
            error.printStackTrace();
        }
        return true;
    }

}
