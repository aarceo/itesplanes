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
@Table(name = "AsigTemas", catalog = "InstrDidactica", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AsigTemas.findAll", query = "SELECT a FROM AsigTemas a")
    , @NamedQuery(name = "AsigTemas.findByIdTemas", query = "SELECT a FROM AsigTemas a WHERE a.idTemas = :idTemas")
    , @NamedQuery(name = "AsigTemas.findByIdAsignatura", query = "SELECT a FROM AsigTemas a WHERE a.idAsignatura = :idAsignatura")
    , @NamedQuery(name = "AsigTemas.findByTemaNumero", query = "SELECT a FROM AsigTemas a WHERE a.temaNumero = :temaNumero")
    , @NamedQuery(name = "AsigTemas.findByTemaNombre", query = "SELECT a FROM AsigTemas a WHERE a.temaNombre = :temaNombre")
    , @NamedQuery(name = "AsigTemas.findByTemaSubtemas", query = "SELECT a FROM AsigTemas a WHERE a.temaSubtemas = :temaSubtemas")})
public class AsigTemas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_temas")
    private Short idTemas;
    @Column(name = "id_asignatura")
    private Short idAsignatura;
    @Column(name = "tema_numero")
    private Integer temaNumero;
    @Size(max = 50)
    @Column(name = "tema_nombre")
    private String temaNombre;
    @Size(max = 2147483647)
    @Column(name = "tema_subtemas")
    private String temaSubtemas;

    public AsigTemas() {
    }

    public AsigTemas(Short idTemas) {
        this.idTemas = idTemas;
    }

    public Short getIdTemas() {
        return idTemas;
    }

    public void setIdTemas(Short idTemas) {
        this.idTemas = idTemas;
    }

    public Short getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Short idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getTemaNumero() {
        return temaNumero;
    }

    public void setTemaNumero(Integer temaNumero) {
        this.temaNumero = temaNumero;
    }

    public String getTemaNombre() {
        return temaNombre;
    }

    public void setTemaNombre(String temaNombre) {
        this.temaNombre = temaNombre;
    }

    public String getTemaSubtemas() {
        return temaSubtemas;
    }

    public void setTemaSubtemas(String temaSubtemas) {
        this.temaSubtemas = temaSubtemas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemas != null ? idTemas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsigTemas)) {
            return false;
        }
        AsigTemas other = (AsigTemas) object;
        if ((this.idTemas == null && other.idTemas != null) || (this.idTemas != null && !this.idTemas.equals(other.idTemas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.AsigTemas[ idTemas=" + idTemas + " ]";
    }
    
}
