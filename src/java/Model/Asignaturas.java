/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "Asignaturas", catalog = "InstrDidactica", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asignaturas.findAll", query = "SELECT a FROM Asignaturas a")
    , @NamedQuery(name = "Asignaturas.findByIdAsignatura", query = "SELECT a FROM Asignaturas a WHERE a.idAsignatura = :idAsignatura")
    , @NamedQuery(name = "Asignaturas.findByRetId", query = "SELECT a FROM Asignaturas a WHERE a.retId = :retId")
    , @NamedQuery(name = "Asignaturas.findByAsigNombre", query = "SELECT a FROM Asignaturas a WHERE a.asigNombre = :asigNombre")
    , @NamedQuery(name = "Asignaturas.findByAsigClave", query = "SELECT a FROM Asignaturas a WHERE a.asigClave = :asigClave")
    , @NamedQuery(name = "Asignaturas.findByAsigHorasTeoria", query = "SELECT a FROM Asignaturas a WHERE a.asigHorasTeoria = :asigHorasTeoria")
    , @NamedQuery(name = "Asignaturas.findByAsigHorasPractica", query = "SELECT a FROM Asignaturas a WHERE a.asigHorasPractica = :asigHorasPractica")
    , @NamedQuery(name = "Asignaturas.findByAsigHorasCreditos", query = "SELECT a FROM Asignaturas a WHERE a.asigHorasCreditos = :asigHorasCreditos")
    , @NamedQuery(name = "Asignaturas.findByAsigPresentacion", query = "SELECT a FROM Asignaturas a WHERE a.asigPresentacion = :asigPresentacion")
    , @NamedQuery(name = "Asignaturas.findByAsigIntencionDidactica", query = "SELECT a FROM Asignaturas a WHERE a.asigIntencionDidactica = :asigIntencionDidactica")
    , @NamedQuery(name = "Asignaturas.findByAsigNumeroTemas", query = "SELECT a FROM Asignaturas a WHERE a.asigNumeroTemas = :asigNumeroTemas")
    , @NamedQuery(name = "Asignaturas.findByAsigFuentesInformacion", query = "SELECT a FROM Asignaturas a WHERE a.asigFuentesInformacion = :asigFuentesInformacion")
    , @NamedQuery(name = "Asignaturas.findByAsigCompeMateria", query = "SELECT a FROM Asignaturas a WHERE a.asigCompeMateria = :asigCompeMateria")})
public class Asignaturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id_asignatura")
    private Integer idAsignatura;
    @Column(name = "ret_id")
    private Short retId;
    @Size(max = 50)
    @Column(name = "asig_nombre")
    private String asigNombre;
    @Size(max = 8)
    @Column(name = "asig_clave")
    private String asigClave;
    @Column(name = "asig_horas_teoria")
    private Integer asigHorasTeoria;
    @Column(name = "asig_horas_practica")
    private Integer asigHorasPractica;
    @Column(name = "asig_horas_creditos")
    private Integer asigHorasCreditos;
    @Size(max = 2147483647)
    @Column(name = "asig_presentacion")
    private String asigPresentacion;
    @Size(max = 2147483647)
    @Column(name = "asig_intencion_didactica")
    private String asigIntencionDidactica;
    @Column(name = "asig_numero_temas")
    private Integer asigNumeroTemas;
    @Size(max = 2147483647)
    @Column(name = "asig_fuentes_informacion")
    private String asigFuentesInformacion;
    @Size(max = 255)
    @Column(name = "asig_compe_materia")
    private String asigCompeMateria;

    public Asignaturas() {
    }

    public Asignaturas(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Short getRetId() {
        return retId;
    }

    public void setRetId(Short retId) {
        this.retId = retId;
    }

    public String getAsigNombre() {
        return asigNombre;
    }

    public void setAsigNombre(String asigNombre) {
        this.asigNombre = asigNombre;
    }

    public String getAsigClave() {
        return asigClave;
    }

    public void setAsigClave(String asigClave) {
        this.asigClave = asigClave;
    }

    public Integer getAsigHorasTeoria() {
        return asigHorasTeoria;
    }

    public void setAsigHorasTeoria(Integer asigHorasTeoria) {
        this.asigHorasTeoria = asigHorasTeoria;
    }

    public Integer getAsigHorasPractica() {
        return asigHorasPractica;
    }

    public void setAsigHorasPractica(Integer asigHorasPractica) {
        this.asigHorasPractica = asigHorasPractica;
    }

    public Integer getAsigHorasCreditos() {
        return asigHorasCreditos;
    }

    public void setAsigHorasCreditos(Integer asigHorasCreditos) {
        this.asigHorasCreditos = asigHorasCreditos;
    }

    public String getAsigPresentacion() {
        return asigPresentacion;
    }

    public void setAsigPresentacion(String asigPresentacion) {
        this.asigPresentacion = asigPresentacion;
    }

    public String getAsigIntencionDidactica() {
        return asigIntencionDidactica;
    }

    public void setAsigIntencionDidactica(String asigIntencionDidactica) {
        this.asigIntencionDidactica = asigIntencionDidactica;
    }

    public Integer getAsigNumeroTemas() {
        return asigNumeroTemas;
    }

    public void setAsigNumeroTemas(Integer asigNumeroTemas) {
        this.asigNumeroTemas = asigNumeroTemas;
    }

    public String getAsigFuentesInformacion() {
        return asigFuentesInformacion;
    }

    public void setAsigFuentesInformacion(String asigFuentesInformacion) {
        this.asigFuentesInformacion = asigFuentesInformacion;
    }

    public String getAsigCompeMateria() {
        return asigCompeMateria;
    }

    public void setAsigCompeMateria(String asigCompeMateria) {
        this.asigCompeMateria = asigCompeMateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAsignatura != null ? idAsignatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asignaturas)) {
            return false;
        }
        Asignaturas other = (Asignaturas) object;
        if ((this.idAsignatura == null && other.idAsignatura != null) || (this.idAsignatura != null && !this.idAsignatura.equals(other.idAsignatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Asignaturas[ idAsignatura=" + idAsignatura + " ]";
    }
    
}
