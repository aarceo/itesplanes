/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Alfredo Arceo
 */
import Model.Usuarios;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "usuario")
@SessionScoped
public class Usuario implements Serializable {

    @ManagedProperty(value = "#{querys}")
    private Querys consulta;
      
    private Usuarios UsuarioActual;
   
    private String nombre;
    private String password;

    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    
    public Usuarios getUsuarioActual() {
        return UsuarioActual;
    }

    public void setUsuarioActual(Usuarios UsuarioActual) {
        this.UsuarioActual = UsuarioActual;
    }

    
    public Querys getConsulta() {
        return consulta;
    }

    public void setConsulta(Querys consulta) {
        this.consulta = consulta;
    }

    public Usuario() {
          UsuarioActual = null;
    }

  
   
    
    
    public String login() {

        if (consulta.ValidaUsuario (this.nombre, this.password)) {
            UsuarioActual = consulta.getEncontrado();
            return "captura.xhtml?faces-redirect=true";

        }
        RequestContext.getCurrentInstance().update("form:mensajes");
        FacesContext contexto = FacesContext.getCurrentInstance();
        contexto.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuario o Contraseña No Valida"));

        return "index.xhtml";
    }

    
}
