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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ceReticula", catalog = "Conect", schema = "dbo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CeReticula.findAll", query = "SELECT c FROM CeReticula c")
    , @NamedQuery(name = "CeReticula.findByRetID", query = "SELECT c FROM CeReticula c WHERE c.retID = :retID")
    , @NamedQuery(name = "CeReticula.findByRetClave", query = "SELECT c FROM CeReticula c WHERE c.retClave = :retClave")
    , @NamedQuery(name = "CeReticula.findByRetClaveInt", query = "SELECT c FROM CeReticula c WHERE c.retClaveInt = :retClaveInt")
    , @NamedQuery(name = "CeReticula.findByRetNomCorto", query = "SELECT c FROM CeReticula c WHERE c.retNomCorto = :retNomCorto")
    , @NamedQuery(name = "CeReticula.findByRetNomCompleto", query = "SELECT c FROM CeReticula c WHERE c.retNomCompleto = :retNomCompleto")
    , @NamedQuery(name = "CeReticula.findByRetClaveOficial", query = "SELECT c FROM CeReticula c WHERE c.retClaveOficial = :retClaveOficial")
    , @NamedQuery(name = "CeReticula.findByRetCreditos", query = "SELECT c FROM CeReticula c WHERE c.retCreditos = :retCreditos")
    , @NamedQuery(name = "CeReticula.findByRetOrdAparCert", query = "SELECT c FROM CeReticula c WHERE c.retOrdAparCert = :retOrdAparCert")
    , @NamedQuery(name = "CeReticula.findByRetAntecedentes", query = "SELECT c FROM CeReticula c WHERE c.retAntecedentes = :retAntecedentes")
    , @NamedQuery(name = "CeReticula.findByRetPorceCreRequi", query = "SELECT c FROM CeReticula c WHERE c.retPorceCreRequi = :retPorceCreRequi")
    , @NamedQuery(name = "CeReticula.findByRetSemRequerido", query = "SELECT c FROM CeReticula c WHERE c.retSemRequerido = :retSemRequerido")
    , @NamedQuery(name = "CeReticula.findByRetHrsTeoricas", query = "SELECT c FROM CeReticula c WHERE c.retHrsTeoricas = :retHrsTeoricas")
    , @NamedQuery(name = "CeReticula.findByRetHrsPractica", query = "SELECT c FROM CeReticula c WHERE c.retHrsPractica = :retHrsPractica")
    , @NamedQuery(name = "CeReticula.findByRetCorrequisito", query = "SELECT c FROM CeReticula c WHERE c.retCorrequisito = :retCorrequisito")
    , @NamedQuery(name = "CeReticula.findByRetLinReticula", query = "SELECT c FROM CeReticula c WHERE c.retLinReticula = :retLinReticula")
    , @NamedQuery(name = "CeReticula.findByRetColReticula", query = "SELECT c FROM CeReticula c WHERE c.retColReticula = :retColReticula")
    , @NamedQuery(name = "CeReticula.findByMoeID", query = "SELECT c FROM CeReticula c WHERE c.moeID = :moeID")
    , @NamedQuery(name = "CeReticula.findByRetExtraEscolar", query = "SELECT c FROM CeReticula c WHERE c.retExtraEscolar = :retExtraEscolar")
    , @NamedQuery(name = "CeReticula.findByDepID", query = "SELECT c FROM CeReticula c WHERE c.depID = :depID")
    , @NamedQuery(name = "CeReticula.findByRetAnexoNomb", query = "SELECT c FROM CeReticula c WHERE c.retAnexoNomb = :retAnexoNomb")
    , @NamedQuery(name = "CeReticula.findByPesID", query = "SELECT c FROM CeReticula c WHERE c.pesID = :pesID")        
    , @NamedQuery(name = "CeReticula.findByRetSeevalua", query = "SELECT c FROM CeReticula c WHERE c.retSeevalua = :retSeevalua")
    , @NamedQuery(name = "CeReticula.findByRetClaveCOSNET", query = "SELECT c FROM CeReticula c WHERE c.retClaveCOSNET = :retClaveCOSNET")
    , @NamedQuery(name = "CeReticula.findByRetServSocial", query = "SELECT c FROM CeReticula c WHERE c.retServSocial = :retServSocial")
    , @NamedQuery(name = "CeReticula.findByRetCurriculares", query = "SELECT c FROM CeReticula c WHERE c.retCurriculares = :retCurriculares")
    , @NamedQuery(name = "CeReticula.findByRetArchivoplanedio", query = "SELECT c FROM CeReticula c WHERE c.retArchivoplanedio = :retArchivoplanedio")
    , @NamedQuery(name = "CeReticula.findByRetParciales", query = "SELECT c FROM CeReticula c WHERE c.retParciales = :retParciales")
    , @NamedQuery(name = "CeReticula.findByRetIdiomas", query = "SELECT c FROM CeReticula c WHERE c.retIdiomas = :retIdiomas")
    , @NamedQuery(name = "CeReticula.findByRetLaboratorio", query = "SELECT c FROM CeReticula c WHERE c.retLaboratorio = :retLaboratorio")
    , @NamedQuery(name = "CeReticula.findByRetResidencias", query = "SELECT c FROM CeReticula c WHERE c.retResidencias = :retResidencias")
    , @NamedQuery(name = "CeReticula.findByRetOtra", query = "SELECT c FROM CeReticula c WHERE c.retOtra = :retOtra")
    , @NamedQuery(name = "CeReticula.findByRetSePromedia", query = "SELECT c FROM CeReticula c WHERE c.retSePromedia = :retSePromedia")
    , @NamedQuery(name = "CeReticula.findByRetApCertificado", query = "SELECT c FROM CeReticula c WHERE c.retApCertificado = :retApCertificado")
    , @NamedQuery(name = "CeReticula.findByRetSeInscribe", query = "SELECT c FROM CeReticula c WHERE c.retSeInscribe = :retSeInscribe")
    , @NamedQuery(name = "CeReticula.findByRetObligatoriaIns", query = "SELECT c FROM CeReticula c WHERE c.retObligatoriaIns = :retObligatoriaIns")
    , @NamedQuery(name = "CeReticula.findByRetEnCardexCierre", query = "SELECT c FROM CeReticula c WHERE c.retEnCardexCierre = :retEnCardexCierre")
    , @NamedQuery(name = "CeReticula.findByRetEnCardexSiAprueba", query = "SELECT c FROM CeReticula c WHERE c.retEnCardexSiAprueba = :retEnCardexSiAprueba")
    , @NamedQuery(name = "CeReticula.findByRetActComplement", query = "SELECT c FROM CeReticula c WHERE c.retActComplement = :retActComplement")})
public class CeReticula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ret_ID")
    private Short retID;
    @Size(max = 3)
    @Column(name = "ret_Clave")
    private String retClave;
    @Size(max = 10)
    @Column(name = "ret_ClaveInt")
    private String retClaveInt;
    @Size(max = 15)
    @Column(name = "ret_NomCorto")
    private String retNomCorto;
    @Size(max = 55)
    @Column(name = "ret_NomCompleto")
    private String retNomCompleto;
    @Size(max = 7)
    @Column(name = "ret_ClaveOficial")
    private String retClaveOficial;
    @Column(name = "ret_Creditos")
    private Short retCreditos;
    @Column(name = "ret_OrdAparCert")
    private Short retOrdAparCert;
    @Size(max = 12)
    @Column(name = "ret_Antecedentes")
    private String retAntecedentes;
    @Column(name = "ret_PorceCreRequi")
    private Short retPorceCreRequi;
    @Column(name = "ret_SemRequerido")
    private Short retSemRequerido;
    @Column(name = "ret_HrsTeoricas")
    private Short retHrsTeoricas;
    @Column(name = "ret_HrsPractica")
    private Short retHrsPractica;
    @Size(max = 12)
    @Column(name = "ret_Correquisito")
    private String retCorrequisito;
    @Column(name = "ret_LinReticula")
    private Short retLinReticula;
    @Column(name = "ret_ColReticula")
    private Short retColReticula;
    @Column(name = "moe_ID")
    private Short moeID;
    @Column(name = "ret_ExtraEscolar")
    private Boolean retExtraEscolar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dep_ID")
    private short depID;
    @Size(max = 25)
    @Column(name = "ret_AnexoNomb")
    private String retAnexoNomb;
    @Column(name = "ret_seevalua")
    private Boolean retSeevalua;
    @Column(name = "ret_ClaveCOSNET")
    private Integer retClaveCOSNET;
    @Column(name = "ret_ServSocial")
    private Boolean retServSocial;
    @Column(name = "ret_Curriculares")
    private Boolean retCurriculares;
    @Size(max = 50)
    @Column(name = "ret_archivoplanedio")
    private String retArchivoplanedio;
    @Column(name = "ret_parciales")
    private Short retParciales;
    @Column(name = "ret_Idiomas")
    private Boolean retIdiomas;
    @Column(name = "ret_Laboratorio")
    private Boolean retLaboratorio;
    @Column(name = "ret_Residencias")
    private Boolean retResidencias;
    @Column(name = "ret_Otra")
    private Boolean retOtra;
    @Column(name = "ret_SePromedia")
    private Boolean retSePromedia;
    @Column(name = "ret_ApCertificado")
    private Boolean retApCertificado;
    @Column(name = "ret_SeInscribe")
    private Boolean retSeInscribe;
    @Column(name = "ret_ObligatoriaIns")
    private Boolean retObligatoriaIns;
    @Column(name = "ret_EnCardexCierre")
    private Boolean retEnCardexCierre;
    @Column(name = "ret_EnCardexSiAprueba")
    private Boolean retEnCardexSiAprueba;
    @Column(name = "ret_ActComplement")
    private Boolean retActComplement;
    @JoinColumn(name = "pes_ID", referencedColumnName = "pes_ID")
    @ManyToOne
    private CePlanesEstudios pesID;

    public CeReticula() {
    }

    public CeReticula(Short retID) {
        this.retID = retID;
    }

    public CeReticula(Short retID, short depID) {
        this.retID = retID;
        this.depID = depID;
    }

    public Short getRetID() {
        return retID;
    }

    public void setRetID(Short retID) {
        this.retID = retID;
    }

    public String getRetClave() {
        return retClave;
    }

    public void setRetClave(String retClave) {
        this.retClave = retClave;
    }

    public String getRetClaveInt() {
        return retClaveInt;
    }

    public void setRetClaveInt(String retClaveInt) {
        this.retClaveInt = retClaveInt;
    }

    public String getRetNomCorto() {
        return retNomCorto;
    }

    public void setRetNomCorto(String retNomCorto) {
        this.retNomCorto = retNomCorto;
    }

    public String getRetNomCompleto() {
        return retNomCompleto;
    }

    public void setRetNomCompleto(String retNomCompleto) {
        this.retNomCompleto = retNomCompleto;
    }

    public String getRetClaveOficial() {
        return retClaveOficial;
    }

    public void setRetClaveOficial(String retClaveOficial) {
        this.retClaveOficial = retClaveOficial;
    }

    public Short getRetCreditos() {
        return retCreditos;
    }

    public void setRetCreditos(Short retCreditos) {
        this.retCreditos = retCreditos;
    }

    public Short getRetOrdAparCert() {
        return retOrdAparCert;
    }

    public void setRetOrdAparCert(Short retOrdAparCert) {
        this.retOrdAparCert = retOrdAparCert;
    }

    public String getRetAntecedentes() {
        return retAntecedentes;
    }

    public void setRetAntecedentes(String retAntecedentes) {
        this.retAntecedentes = retAntecedentes;
    }

    public Short getRetPorceCreRequi() {
        return retPorceCreRequi;
    }

    public void setRetPorceCreRequi(Short retPorceCreRequi) {
        this.retPorceCreRequi = retPorceCreRequi;
    }

    public Short getRetSemRequerido() {
        return retSemRequerido;
    }

    public void setRetSemRequerido(Short retSemRequerido) {
        this.retSemRequerido = retSemRequerido;
    }

    public Short getRetHrsTeoricas() {
        return retHrsTeoricas;
    }

    public void setRetHrsTeoricas(Short retHrsTeoricas) {
        this.retHrsTeoricas = retHrsTeoricas;
    }

    public Short getRetHrsPractica() {
        return retHrsPractica;
    }

    public void setRetHrsPractica(Short retHrsPractica) {
        this.retHrsPractica = retHrsPractica;
    }

    public String getRetCorrequisito() {
        return retCorrequisito;
    }

    public void setRetCorrequisito(String retCorrequisito) {
        this.retCorrequisito = retCorrequisito;
    }

    public Short getRetLinReticula() {
        return retLinReticula;
    }

    public void setRetLinReticula(Short retLinReticula) {
        this.retLinReticula = retLinReticula;
    }

    public Short getRetColReticula() {
        return retColReticula;
    }

    public void setRetColReticula(Short retColReticula) {
        this.retColReticula = retColReticula;
    }

    public Short getMoeID() {
        return moeID;
    }

    public void setMoeID(Short moeID) {
        this.moeID = moeID;
    }

    public Boolean getRetExtraEscolar() {
        return retExtraEscolar;
    }

    public void setRetExtraEscolar(Boolean retExtraEscolar) {
        this.retExtraEscolar = retExtraEscolar;
    }

    public short getDepID() {
        return depID;
    }

    public void setDepID(short depID) {
        this.depID = depID;
    }

    public String getRetAnexoNomb() {
        return retAnexoNomb;
    }

    public void setRetAnexoNomb(String retAnexoNomb) {
        this.retAnexoNomb = retAnexoNomb;
    }

    public Boolean getRetSeevalua() {
        return retSeevalua;
    }

    public void setRetSeevalua(Boolean retSeevalua) {
        this.retSeevalua = retSeevalua;
    }

    public Integer getRetClaveCOSNET() {
        return retClaveCOSNET;
    }

    public void setRetClaveCOSNET(Integer retClaveCOSNET) {
        this.retClaveCOSNET = retClaveCOSNET;
    }

    public Boolean getRetServSocial() {
        return retServSocial;
    }

    public void setRetServSocial(Boolean retServSocial) {
        this.retServSocial = retServSocial;
    }

    public Boolean getRetCurriculares() {
        return retCurriculares;
    }

    public void setRetCurriculares(Boolean retCurriculares) {
        this.retCurriculares = retCurriculares;
    }

    public String getRetArchivoplanedio() {
        return retArchivoplanedio;
    }

    public void setRetArchivoplanedio(String retArchivoplanedio) {
        this.retArchivoplanedio = retArchivoplanedio;
    }

    public Short getRetParciales() {
        return retParciales;
    }

    public void setRetParciales(Short retParciales) {
        this.retParciales = retParciales;
    }

    public Boolean getRetIdiomas() {
        return retIdiomas;
    }

    public void setRetIdiomas(Boolean retIdiomas) {
        this.retIdiomas = retIdiomas;
    }

    public Boolean getRetLaboratorio() {
        return retLaboratorio;
    }

    public void setRetLaboratorio(Boolean retLaboratorio) {
        this.retLaboratorio = retLaboratorio;
    }

    public Boolean getRetResidencias() {
        return retResidencias;
    }

    public void setRetResidencias(Boolean retResidencias) {
        this.retResidencias = retResidencias;
    }

    public Boolean getRetOtra() {
        return retOtra;
    }

    public void setRetOtra(Boolean retOtra) {
        this.retOtra = retOtra;
    }

    public Boolean getRetSePromedia() {
        return retSePromedia;
    }

    public void setRetSePromedia(Boolean retSePromedia) {
        this.retSePromedia = retSePromedia;
    }

    public Boolean getRetApCertificado() {
        return retApCertificado;
    }

    public void setRetApCertificado(Boolean retApCertificado) {
        this.retApCertificado = retApCertificado;
    }

    public Boolean getRetSeInscribe() {
        return retSeInscribe;
    }

    public void setRetSeInscribe(Boolean retSeInscribe) {
        this.retSeInscribe = retSeInscribe;
    }

    public Boolean getRetObligatoriaIns() {
        return retObligatoriaIns;
    }

    public void setRetObligatoriaIns(Boolean retObligatoriaIns) {
        this.retObligatoriaIns = retObligatoriaIns;
    }

    public Boolean getRetEnCardexCierre() {
        return retEnCardexCierre;
    }

    public void setRetEnCardexCierre(Boolean retEnCardexCierre) {
        this.retEnCardexCierre = retEnCardexCierre;
    }

    public Boolean getRetEnCardexSiAprueba() {
        return retEnCardexSiAprueba;
    }

    public void setRetEnCardexSiAprueba(Boolean retEnCardexSiAprueba) {
        this.retEnCardexSiAprueba = retEnCardexSiAprueba;
    }

    public Boolean getRetActComplement() {
        return retActComplement;
    }

    public void setRetActComplement(Boolean retActComplement) {
        this.retActComplement = retActComplement;
    }

    public CePlanesEstudios getPesID() {
        return pesID;
    }

    public void setPesID(CePlanesEstudios pesID) {
        this.pesID = pesID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (retID != null ? retID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CeReticula)) {
            return false;
        }
        CeReticula other = (CeReticula) object;
        if ((this.retID == null && other.retID != null) || (this.retID != null && !this.retID.equals(other.retID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.CeReticula[ retID=" + retID + " ]";
    }
    
}
