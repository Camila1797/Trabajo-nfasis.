
package modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;


public class Fondo extends JDesktopPane {

  private Image imagen;
 
     public Fondo() {
  
       this.setLayout(null); 
       this.setToolTipText("Ventana Principal");
       this.setBounds(0, 0, 1500, 750);
  
  try {
       imagen=ImageIO.read(getClass().getResource("../imagenes/fondo.gif"));
  }
 catch (IOException e) {
   e.printStackTrace();
  }

  }
 
 public void paintComponent(Graphics g){
  
     super.paintComponent(g);
     g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
     setOpaque(false);
 }

    public void setImagen(String fotofotojpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
