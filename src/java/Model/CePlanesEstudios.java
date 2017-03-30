/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "cePlanesEstudios", catalog = "Conect", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CePlanesEstudios.findAll", query = "SELECT c FROM CePlanesEstudios c")
    , @NamedQuery(name = "CePlanesEstudios.findByPesID", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesID = :pesID")
    , @NamedQuery(name = "CePlanesEstudios.findByPesClave", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesClave = :pesClave")
    , @NamedQuery(name = "CePlanesEstudios.findByEspID", query = "SELECT c FROM CePlanesEstudios c WHERE c.espID = :espID")
    , @NamedQuery(name = "CePlanesEstudios.findByPesClaveOfic", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesClaveOfic = :pesClaveOfic")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCredTot", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCredTot = :pesCredTot")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCantidadMat", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCantidadMat = :pesCantidadMat")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCredOpta", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCredOpta = :pesCredOpta")
    , @NamedQuery(name = "CePlanesEstudios.findByPesFechaIni", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesFechaIni = :pesFechaIni")
    , @NamedQuery(name = "CePlanesEstudios.findByPesFechaTer", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesFechaTer = :pesFechaTer")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCargaMax", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCargaMax = :pesCargaMax")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCarga1Rep", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCarga1Rep = :pesCarga1Rep")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCargaMas1Rep", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCargaMas1Rep = :pesCargaMas1Rep")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCargaConEsp", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCargaConEsp = :pesCargaConEsp")
    , @NamedQuery(name = "CePlanesEstudios.findByPesSituacion", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesSituacion = :pesSituacion")
    , @NamedQuery(name = "CePlanesEstudios.findByPesCargaMin", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesCargaMin = :pesCargaMin")
    , @NamedQuery(name = "CePlanesEstudios.findByPesArchRetWeb", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesArchRetWeb = :pesArchRetWeb")
    , @NamedQuery(name = "CePlanesEstudios.findByPesEsPorCompetencias", query = "SELECT c FROM CePlanesEstudios c WHERE c.pesEsPorCompetencias = :pesEsPorCompetencias")})
public class CePlanesEstudios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "pes_ID")
    private Short pesID;
    @Column(name = "pes_Clave")
    private Character pesClave;
    @Basic(optional = false)
    @NotNull
    @Column(name = "esp_ID")
    private short espID;
    @Size(max = 15)
    @Column(name = "pes_ClaveOfic")
    private String pesClaveOfic;
    @Column(name = "pes_CredTot")
    private Short pesCredTot;
    @Column(name = "pes_CantidadMat")
    private Short pesCantidadMat;
    @Column(name = "pes_CredOpta")
    private Short pesCredOpta;
    @Column(name = "pes_FechaIni")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pesFechaIni;
    @Column(name = "pes_FechaTer")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pesFechaTer;
    @Column(name = "pes_CargaMax")
    private Short pesCargaMax;
    @Column(name = "pes_Carga1Rep")
    private Short pesCarga1Rep;
    @Column(name = "pes_CargaMas1Rep")
    private Short pesCargaMas1Rep;
    @Column(name = "pes_CargaConEsp")
    private Short pesCargaConEsp;
    @Size(max = 15)
    @Column(name = "pes_Situacion")
    private String pesSituacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pes_CargaMin")
    private short pesCargaMin;
    @Size(max = 30)
    @Column(name = "pes_ArchRetWeb")
    private String pesArchRetWeb;
    @Column(name = "pes_EsPorCompetencias")
    private Boolean pesEsPorCompetencias;
    @OneToMany(mappedBy = "pesID")
    private Collection<CeReticula> ceReticulaCollection;

    public CePlanesEstudios() {
    }

    public CePlanesEstudios(Short pesID) {
        this.pesID = pesID;
    }

    public CePlanesEstudios(Short pesID, short espID, short pesCargaMin) {
        this.pesID = pesID;
        this.espID = espID;
        this.pesCargaMin = pesCargaMin;
    }

    public Short getPesID() {
        return pesID;
    }

    public void setPesID(Short pesID) {
        this.pesID = pesID;
    }

    public Character getPesClave() {
        return pesClave;
    }

    public void setPesClave(Character pesClave) {
        this.pesClave = pesClave;
    }

    public short getEspID() {
        return espID;
    }

    public void setEspID(short espID) {
        this.espID = espID;
    }

    public String getPesClaveOfic() {
        return pesClaveOfic;
    }

    public void setPesClaveOfic(String pesClaveOfic) {
        this.pesClaveOfic = pesClaveOfic;
    }

    public Short getPesCredTot() {
        return pesCredTot;
    }

    public void setPesCredTot(Short pesCredTot) {
        this.pesCredTot = pesCredTot;
    }

    public Short getPesCantidadMat() {
        return pesCantidadMat;
    }

    public void setPesCantidadMat(Short pesCantidadMat) {
        this.pesCantidadMat = pesCantidadMat;
    }

    public Short getPesCredOpta() {
        return pesCredOpta;
    }

    public void setPesCredOpta(Short pesCredOpta) {
        this.pesCredOpta = pesCredOpta;
    }

    public Date getPesFechaIni() {
        return pesFechaIni;
    }

    public void setPesFechaIni(Date pesFechaIni) {
        this.pesFechaIni = pesFechaIni;
    }

    public Date getPesFechaTer() {
        return pesFechaTer;
    }

    public void setPesFechaTer(Date pesFechaTer) {
        this.pesFechaTer = pesFechaTer;
    }

    public Short getPesCargaMax() {
        return pesCargaMax;
    }

    public void setPesCargaMax(Short pesCargaMax) {
        this.pesCargaMax = pesCargaMax;
    }

    public Short getPesCarga1Rep() {
        return pesCarga1Rep;
    }

    public void setPesCarga1Rep(Short pesCarga1Rep) {
        this.pesCarga1Rep = pesCarga1Rep;
    }

    public Short getPesCargaMas1Rep() {
        return pesCargaMas1Rep;
    }

    public void setPesCargaMas1Rep(Short pesCargaMas1Rep) {
        this.pesCargaMas1Rep = pesCargaMas1Rep;
    }

    public Short getPesCargaConEsp() {
        return pesCargaConEsp;
    }

    public void setPesCargaConEsp(Short pesCargaConEsp) {
        this.pesCargaConEsp = pesCargaConEsp;
    }

    public String getPesSituacion() {
        return pesSituacion;
    }

    public void setPesSituacion(String pesSituacion) {
        this.pesSituacion = pesSituacion;
    }

    public short getPesCargaMin() {
        return pesCargaMin;
    }

    public void setPesCargaMin(short pesCargaMin) {
        this.pesCargaMin = pesCargaMin;
    }

    public String getPesArchRetWeb() {
        return pesArchRetWeb;
    }

    public void setPesArchRetWeb(String pesArchRetWeb) {
        this.pesArchRetWeb = pesArchRetWeb;
    }

    public Boolean getPesEsPorCompetencias() {
        return pesEsPorCompetencias;
    }

    public void setPesEsPorCompetencias(Boolean pesEsPorCompetencias) {
        this.pesEsPorCompetencias = pesEsPorCompetencias;
    }

    @XmlTransient
    public Collection<CeReticula> getCeReticulaCollection() {
        return ceReticulaCollection;
    }

    public void setCeReticulaCollection(Collection<CeReticula> ceReticulaCollection) {
        this.ceReticulaCollection = ceReticulaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pesID != null ? pesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CePlanesEstudios)) {
            return false;
        }
        CePlanesEstudios other = (CePlanesEstudios) object;
        if ((this.pesID == null && other.pesID != null) || (this.pesID != null && !this.pesID.equals(other.pesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.CePlanesEstudios[ pesID=" + pesID + " ]";
    }
    
}
