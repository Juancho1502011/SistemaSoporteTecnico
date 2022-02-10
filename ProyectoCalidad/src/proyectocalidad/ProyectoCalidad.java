/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocalidad;

import Interfaces.InterfazUsuario;
import entidades.Usuario;
import proyectocalidad.gui.MenuPrincipal;
import proyectocalidad.gui.MenuPrincipal;

/**
 *
 * @author juanp
 */
public class ProyectoCalidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuario = new Usuario("Juan Pablo", "Tovar Vallejo", "0605649383", "123");
        new InterfazUsuario().insertarUsuario(usuario);
        
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);
    }
    
}
