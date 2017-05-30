/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registro.modelo;

/**
 *
 * @author Edwin Vasquez
 */
public class Registro {
    
    private String nombre;
    private String correo;

    public Registro(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    public Registro() {
        this.nombre=("");
        this.correo=("");
    }
    

    public String getnombre() {
        return nombre;
    }

    public void setUsuario(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Registro{" + "usuario=" + nombre + ", correo=" + correo + '}';
    }
    
    
}
