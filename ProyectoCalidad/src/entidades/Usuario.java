/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author juanp
 */

@Entity

public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="Usuario_Nombres")
    private String nombres;
    @Column(name="Usuario_Apellidos")
    private String apellidos;
    @Column(name="Usuario_Cedula")
    private String cedula;
    @Column(name="Usuario_Contraseña")
    private String contraseña;
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "usuario")
    private List<Ticket> tickets;
    
    public Usuario(){
        
    }

    public Usuario(String nombres, String apellidos, String cedula, String contraseña) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.tickets = tickets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", cedula=" + cedula + ", contrase\u00f1a=" + contraseña + ", tickets=" + tickets + '}';
    }
    
    
}
