/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuarios;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
/** 
 *
 * @author Alfredo Arceo
 */
@ManagedBean (name = "querys")
@SessionScoped
public class Querys implements Serializable  {
    
    EntityManager em;
    Usuarios encontrado;
    EntityManagerFactory emf;

    public Usuarios getEncontrado() {
        return encontrado;
    }

    public void setEncontrado(Usuarios encontrado) {
        this.encontrado = encontrado;
    }
    

    public Querys() {
        
        emf = Persistence.createEntityManagerFactory("itesplanesInstrPU");
        em = emf.createEntityManager();
        encontrado = null;
       
    }
    
    public boolean ValidaUsuario (String usuario, String contrasena){
        List<Usuarios> xes = null;
        TypedQuery consulta;
        
        

            consulta = em.createNamedQuery("Usuarios.findByUsuarioNombre", Usuarios.class).setParameter("usuarioNombre", usuario);
            xes = consulta.getResultList();
           if (xes.size() > 0) {
               if (xes.get(0).getUsuarioContraseña().equals(contrasena)){
                   setEncontrado(xes.get(0));
                   return true;            
               }
           }
           else {
              return false; 
           } 
      return false;      
    }     
    
    
}
