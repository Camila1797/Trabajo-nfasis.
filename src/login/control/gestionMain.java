/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.control;

/**
 *
 * @author Edwin
 */
public class gestionMain {
    private VusuarioControler VusuarioControler;

    public gestionMain() {
        VusuarioControler = new VusuarioControler();
    }
    
    
    public static void main(String[] args) {
        new gestionMain();
    }
}
