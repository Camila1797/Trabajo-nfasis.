/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.control;

import javax.swing.JOptionPane;
import login.modelo.usuario;
import vistas.JFMenu;
import vistas.JFinicio;

/**
 *
 * @author Edwin
 */
public class VusuarioControler implements InterfaceValidacion2 {
private JFinicio  JFinicio;
private UsuarioDAO usuarioDAO;
private usuario usuario;

    public VusuarioControler() {
        
        JFinicio = new JFinicio(this);
        usuarioDAO = new UsuarioDAO();
        usuario = new usuario();
    }

    
    @Override
    public void RecibeUsuario( String texto) {
        if (texto.length()>1) {
            usuario.setLogin(texto);
        }
    }
    
    @Override
    public void AccionEntrar() {
        if (usuarioDAO.getUsuario(usuario)) {
           JFMenu m= new JFMenu();
           m.setVisible(true);
            JOptionPane.showMessageDialog(null,"Entrada correcta al sistema");
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario incorrecto");
        }
            
    }


}
