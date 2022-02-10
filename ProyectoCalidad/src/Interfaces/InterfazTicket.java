/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import controladoresjpa.TicketJpaController;
import controladoresjpa.UsuarioJpaController;
import entidades.Ticket;
import entidades.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juanp
 */
public class InterfazTicket {
    TicketJpaController ticket = new TicketJpaController();
    
    
    public void insertarTicket(Ticket datos){
        try {
            this.ticket.create(datos);
        } catch (Exception ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
