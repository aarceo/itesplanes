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
@Table(name = "AsigTemasComp", catalog = "InstrDidactica", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AsigTemasComp.findAll", query = "SELECT a FROM AsigTemasComp a")
    , @NamedQuery(name = "AsigTemasComp.findByIdTemasComp", query = "SELECT a FROM AsigTemasComp a WHERE a.idTemasComp = :idTemasComp")
    , @NamedQuery(name = "AsigTemasComp.findByIdAsignatura", query = "SELECT a FROM AsigTemasComp a WHERE a.idAsignatura = :idAsignatura")
    , @NamedQuery(name = "AsigTemasComp.findByCompNumero", query = "SELECT a FROM AsigTemasComp a WHERE a.compNumero = :compNumero")
    , @NamedQuery(name = "AsigTemasComp.findByCompEspecifica", query = "SELECT a FROM AsigTemasComp a WHERE a.compEspecifica = :compEspecifica")
    , @NamedQuery(name = "AsigTemasComp.findByCompGenericas", query = "SELECT a FROM AsigTemasComp a WHERE a.compGenericas = :compGenericas")
    , @NamedQuery(name = "AsigTemasComp.findByCompActAprendizaje", query = "SELECT a FROM AsigTemasComp a WHERE a.compActAprendizaje = :compActAprendizaje")})
public class AsigTemasComp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_temas_comp")
    private Short idTemasComp;
    @Column(name = "id_asignatura")
    private Short idAsignatura;
    @Column(name = "comp_numero")
    private Integer compNumero;
    @Size(max = 50)
    @Column(name = "comp_especifica")
    private String compEspecifica;
    @Size(max = 2147483647)
    @Column(name = "comp_genericas")
    private String compGenericas;
    @Size(max = 2147483647)
    @Column(name = "comp_act_aprendizaje")
    private String compActAprendizaje;

    public AsigTemasComp() {
    }

    public AsigTemasComp(Short idTemasComp) {
        this.idTemasComp = idTemasComp;
    }

    public Short getIdTemasComp() {
        return idTemasComp;
    }

    public void setIdTemasComp(Short idTemasComp) {
        this.idTemasComp = idTemasComp;
    }

    public Short getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Short idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Integer getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(Integer compNumero) {
        this.compNumero = compNumero;
    }

    public String getCompEspecifica() {
        return compEspecifica;
    }

    public void setCompEspecifica(String compEspecifica) {
        this.compEspecifica = compEspecifica;
    }

    public String getCompGenericas() {
        return compGenericas;
    }

    public void setCompGenericas(String compGenericas) {
        this.compGenericas = compGenericas;
    }

    public String getCompActAprendizaje() {
        return compActAprendizaje;
    }

    public void setCompActAprendizaje(String compActAprendizaje) {
        this.compActAprendizaje = compActAprendizaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemasComp != null ? idTemasComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AsigTemasComp)) {
            return false;
        }
        AsigTemasComp other = (AsigTemasComp) object;
        if ((this.idTemasComp == null && other.idTemasComp != null) || (this.idTemasComp != null && !this.idTemasComp.equals(other.idTemasComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.AsigTemasComp[ idTemasComp=" + idTemasComp + " ]";
    }
    
}
