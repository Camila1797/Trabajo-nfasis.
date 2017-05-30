/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.modelo;

/**
 *
 * @author Edwin
 */
public class usuario {
    
    private String Login;
    

    public usuario(String Login) {
        this.Login = Login;
    }

    public usuario() {
        this("");
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    @Override
    public String toString() {
        return "usuario{" + "Login=" + Login + '}';
    }
    
    
    
}
