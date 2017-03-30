/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "ceEspecialidades", catalog = "Conect", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CeEspecialidades.findAll", query = "SELECT c FROM CeEspecialidades c")
    , @NamedQuery(name = "CeEspecialidades.findByEspID", query = "SELECT c FROM CeEspecialidades c WHERE c.espID = :espID")
    , @NamedQuery(name = "CeEspecialidades.findByEspClave", query = "SELECT c FROM CeEspecialidades c WHERE c.espClave = :espClave")
    , @NamedQuery(name = "CeEspecialidades.findByEspClaveInterna", query = "SELECT c FROM CeEspecialidades c WHERE c.espClaveInterna = :espClaveInterna")
    , @NamedQuery(name = "CeEspecialidades.findByEspNomCorto", query = "SELECT c FROM CeEspecialidades c WHERE c.espNomCorto = :espNomCorto")
    , @NamedQuery(name = "CeEspecialidades.findByEspNombre", query = "SELECT c FROM CeEspecialidades c WHERE c.espNombre = :espNombre")
    , @NamedQuery(name = "CeEspecialidades.findByEspCategoria", query = "SELECT c FROM CeEspecialidades c WHERE c.espCategoria = :espCategoria")
    , @NamedQuery(name = "CeEspecialidades.findByEspLetraNumCon", query = "SELECT c FROM CeEspecialidades c WHERE c.espLetraNumCon = :espLetraNumCon")
    , @NamedQuery(name = "CeEspecialidades.findByEspNivelCarrera", query = "SELECT c FROM CeEspecialidades c WHERE c.espNivelCarrera = :espNivelCarrera")
    , @NamedQuery(name = "CeEspecialidades.findByEspFechaInicio", query = "SELECT c FROM CeEspecialidades c WHERE c.espFechaInicio = :espFechaInicio")
    , @NamedQuery(name = "CeEspecialidades.findByEspFechaFin", query = "SELECT c FROM CeEspecialidades c WHERE c.espFechaFin = :espFechaFin")
    , @NamedQuery(name = "CeEspecialidades.findByEspSituacion", query = "SELECT c FROM CeEspecialidades c WHERE c.espSituacion = :espSituacion")
    , @NamedQuery(name = "CeEspecialidades.findByEspSemModEsp", query = "SELECT c FROM CeEspecialidades c WHERE c.espSemModEsp = :espSemModEsp")
    , @NamedQuery(name = "CeEspecialidades.findByEspHrasCruzSem", query = "SELECT c FROM CeEspecialidades c WHERE c.espHrasCruzSem = :espHrasCruzSem")
    , @NamedQuery(name = "CeEspecialidades.findByEspSolicitarReci", query = "SELECT c FROM CeEspecialidades c WHERE c.espSolicitarReci = :espSolicitarReci")
    , @NamedQuery(name = "CeEspecialidades.findByEspClaveCOSNET", query = "SELECT c FROM CeEspecialidades c WHERE c.espClaveCOSNET = :espClaveCOSNET")
    , @NamedQuery(name = "CeEspecialidades.findByEspArchivoRet", query = "SELECT c FROM CeEspecialidades c WHERE c.espArchivoRet = :espArchivoRet")})
public class CeEspecialidades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "esp_ID")
    private Short espID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "esp_Clave")
    private short espClave;
    @Size(max = 4)
    @Column(name = "esp_ClaveInterna")
    private String espClaveInterna;
    @Size(max = 15)
    @Column(name = "esp_NomCorto")
    private String espNomCorto;
    @Size(max = 80)
    @Column(name = "esp_Nombre")
    private String espNombre;
    @Column(name = "esp_Categoria")
    private Character espCategoria;
    @Column(name = "esp_LetraNumCon")
    private Character espLetraNumCon;
    @Size(max = 15)
    @Column(name = "esp_NivelCarrera")
    private String espNivelCarrera;
    @Column(name = "esp_FechaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date espFechaInicio;
    @Column(name = "esp_FechaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date espFechaFin;
    @Size(max = 15)
    @Column(name = "esp_Situacion")
    private String espSituacion;
    @Size(max = 2)
    @Column(name = "esp_SemModEsp")
    private String espSemModEsp;
    @Column(name = "esp_HrasCruzSem")
    private Short espHrasCruzSem;
    @Column(name = "esp_SolicitarReci")
    private Boolean espSolicitarReci;
    @Column(name = "esp_ClaveCOSNET")
    private Short espClaveCOSNET;
    @Size(max = 100)
    @Column(name = "esp_ArchivoRet")
    private String espArchivoRet;

    public CeEspecialidades() {
    }

    public CeEspecialidades(Short espID) {
        this.espID = espID;
    }

    public CeEspecialidades(Short espID, short espClave) {
        this.espID = espID;
        this.espClave = espClave;
    }

    public Short getEspID() {
        return espID;
    }

    public void setEspID(Short espID) {
        this.espID = espID;
    }

    public short getEspClave() {
        return espClave;
    }

    public void setEspClave(short espClave) {
        this.espClave = espClave;
    }

    public String getEspClaveInterna() {
        return espClaveInterna;
    }

    public void setEspClaveInterna(String espClaveInterna) {
        this.espClaveInterna = espClaveInterna;
    }

    public String getEspNomCorto() {
        return espNomCorto;
    }

    public void setEspNomCorto(String espNomCorto) {
        this.espNomCorto = espNomCorto;
    }

    public String getEspNombre() {
        return espNombre;
    }

    public void setEspNombre(String espNombre) {
        this.espNombre = espNombre;
    }

    public Character getEspCategoria() {
        return espCategoria;
    }

    public void setEspCategoria(Character espCategoria) {
        this.espCategoria = espCategoria;
    }

    public Character getEspLetraNumCon() {
        return espLetraNumCon;
    }

    public void setEspLetraNumCon(Character espLetraNumCon) {
        this.espLetraNumCon = espLetraNumCon;
    }

    public String getEspNivelCarrera() {
        return espNivelCarrera;
    }

    public void setEspNivelCarrera(String espNivelCarrera) {
        this.espNivelCarrera = espNivelCarrera;
    }

    public Date getEspFechaInicio() {
        return espFechaInicio;
    }

    public void setEspFechaInicio(Date espFechaInicio) {
        this.espFechaInicio = espFechaInicio;
    }

    public Date getEspFechaFin() {
        return espFechaFin;
    }

    public void setEspFechaFin(Date espFechaFin) {
        this.espFechaFin = espFechaFin;
    }

    public String getEspSituacion() {
        return espSituacion;
    }

    public void setEspSituacion(String espSituacion) {
        this.espSituacion = espSituacion;
    }

    public String getEspSemModEsp() {
        return espSemModEsp;
    }

    public void setEspSemModEsp(String espSemModEsp) {
        this.espSemModEsp = espSemModEsp;
    }

    public Short getEspHrasCruzSem() {
        return espHrasCruzSem;
    }

    public void setEspHrasCruzSem(Short espHrasCruzSem) {
        this.espHrasCruzSem = espHrasCruzSem;
    }

    public Boolean getEspSolicitarReci() {
        return espSolicitarReci;
    }

    public void setEspSolicitarReci(Boolean espSolicitarReci) {
        this.espSolicitarReci = espSolicitarReci;
    }

    public Short getEspClaveCOSNET() {
        return espClaveCOSNET;
    }

    public void setEspClaveCOSNET(Short espClaveCOSNET) {
        this.espClaveCOSNET = espClaveCOSNET;
    }

    public String getEspArchivoRet() {
        return espArchivoRet;
    }

    public void setEspArchivoRet(String espArchivoRet) {
        this.espArchivoRet = espArchivoRet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (espID != null ? espID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeEspecialidades)) {
            return false;
        }
        CeEspecialidades other = (CeEspecialidades) object;
        if ((this.espID == null && other.espID != null) || (this.espID != null && !this.espID.equals(other.espID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.CeEspecialidades[ espID=" + espID + " ]";
    }
    
}
