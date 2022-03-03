/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesBD;

import controladoresjpa.TicketJpaController;
import controladoresjpa.UsuarioJpaController;
import entidades.Ticket;
import entidades.Usuario;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
            Date date = new Date();
            datos.setFecha(date);
            this.ticket.create(datos);
        } catch (Exception ex) {
            Logger.getLogger(InterfazUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List listarTickets(){
         return this.ticket.getEntityManager().createQuery(
        "SELECT t from Ticket t where t.usuario IS NULL")
                .getResultList();
    }
    
    public Ticket encontrarTicket(Long id){
        return this.ticket.findTicket(id);
    }
    
    public void actualizarTicket(Ticket datos){
        try {
            this.ticket.edit(datos);
        } catch (Exception ex) {
            Logger.getLogger(InterfazTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

