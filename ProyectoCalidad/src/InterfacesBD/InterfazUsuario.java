/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesBD;

import controladoresjpa.UsuarioJpaController;
import entidades.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;

/**
 *
 * @author juanp
 */
public class InterfazUsuario {
    UsuarioJpaController usuario = new UsuarioJpaController();
    
  
    public void insertarUsuario(Usuario datos){
        EntityManager em = this.usuario.getEntityManager();
        em.getTransaction().begin();
        em.createNativeQuery(
        "INSERT into Usuario(Usuario_Apellidos,Usuario_Nombres,Usuario_Cedula,Usuario_Contraseña)"
                + "values (?, ? , ? , SHA1(?) );")
                .setParameter(1, datos.getApellidos())
                .setParameter(2, datos.getNombres())
                .setParameter(3,datos.getCedula())
                .setParameter(4, datos.getContraseña())
                .executeUpdate();
        em.getTransaction().commit();
    }
    
    public Usuario verificarUsuario(String cedula, String contraseña){
        List<Object[]> usuario= this.usuario.getEntityManager().createNativeQuery(
        "SELECT * from Usuario where usuario_cedula=? and usuario_contraseña= SHA1(?);")
                .setParameter(1, cedula)
                .setParameter(2, contraseña)
                .getResultList();
        if(usuario.isEmpty()){
            return null;
        }else{
            Usuario user = new Usuario(usuario.get(0)[4].toString(),usuario.get(0)[1].toString(), usuario.get(0)[2].toString(), usuario.get(0)[3].toString());
            user.setId(Long.valueOf(usuario.get(0)[0].toString()));
            System.out.println(user.toString());
            return user;
        }
            
            
    }
}
