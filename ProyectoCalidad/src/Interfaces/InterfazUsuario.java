/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import controladoresjpa.UsuarioJpaController;
import entidades.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanp
 */
public class InterfazUsuario {
    UsuarioJpaController usuario = new UsuarioJpaController();
    
    
    public void insertarUsuario(Usuario datos){
        try {
            this.usuario.create(datos);
        } catch (Exception ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
