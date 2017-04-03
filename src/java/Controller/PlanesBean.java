/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AsigTemas;
import Model.AsigTemasComp;
import Model.Asignaturas;
import Model.CeEspecialidades;
import Model.CePlanesEstudios;
import Model.CeReticula;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Size;
import org.primefaces.event.SelectEvent;


/**
 *
 * @author Alfredo Arceo
 */
@ManagedBean (name = "planesbean")
@SessionScoped
public class PlanesBean implements Serializable  {
    
    EntityManager emcon;
    EntityManager emplan;

    EntityManagerFactory emfcon;
    EntityManagerFactory emfplan;

    CeEspecialidades carrera;
    CePlanesEstudios  plancarrera;
    CeReticula materia, selmateria;
    
    List <CeEspecialidades> listcarreras;
    List <CePlanesEstudios> listplancarrera;
    List <CeReticula> listmaterias;
    
    Map<String,String> mapcarreras = new HashMap<String,String>();
    Map<String,String> mapmaterias = new HashMap<String,String>();

    String idcarre;
    String idmateria;
    Boolean modifica = false;
    Boolean temamod = false;

    Asignaturas asignaturasmod;    
    AsigTemas asigtemasmod, selasigtemas;
    AsigTemasComp asigtemascompmod;

    List<AsigTemas> gridtemasmod = new ArrayList<AsigTemas>();
    List<AsigTemasComp> gridcompmod = new ArrayList<AsigTemasComp>();
    
    // Campos de la tabla Asignaturas
    String asignom;
    String asigclave;
    String asighorasteoria;
    String asighoraspractica;
    String asighorascreditos;
    String asignumtemas;
    @Size(max = 2147483647)
    String asigpresentacion;
    @Size(max = 2147483647)
    String asigintenciondidactica;
    @Size(max = 2147483647)
    String asigfuentesinfo;
    String asigcompematerias;

        
    // Campos de la Tabla Temas
    String tema_numero;
    String tema_nombre;
    @Size(max = 2147483647)
    String tema_subtemas;
    
    List<AsigTemas> gridtemas = new ArrayList<AsigTemas>();

    // Campos de Competencias
    
    String compnumero;
    String compespecifica;
    @Size(max = 2147483647)
    String compgenerica;
    @Size(max = 2147483647)
    String compactaprendizaje;
    
    List<AsigTemasComp> gridcomp = new ArrayList<AsigTemasComp>();

    
    
    public AsigTemas getSelasigtemas() {
        return selasigtemas;
    }

    public void setSelasigtemas(AsigTemas selasigtemas) {
        this.selasigtemas = selasigtemas;
    }
    
    public String getCompnumero() {
        return compnumero;
    }

    public void setCompnumero(String compnumero) {
        this.compnumero = compnumero;
    }

    public String getCompespecifica() {
        return compespecifica;
    }

    public void setCompespecifica(String compespecifica) {
        this.compespecifica = compespecifica;
    }

    public String getCompgenerica() {
        return compgenerica;
    }

    public void setCompgenerica(String compgenerica) {
        this.compgenerica = compgenerica;
    }

    public String getCompactaprendizaje() {
        return compactaprendizaje;
    }

    public void setCompactaprendizaje(String compactaprendizaje) {
        this.compactaprendizaje = compactaprendizaje;
    }

    
    public String getAsigcompematerias() {
        return asigcompematerias;
    }

    public void setAsigcompematerias(String asigcompematerias) {
        this.asigcompematerias = asigcompematerias;
    }
    
    public String getTema_numero() {
        return tema_numero;
    }

    public void setTema_numero(String tema_numero) {
        this.tema_numero = tema_numero;
    }

    public String getTema_nombre() {
        return tema_nombre;
    }

    public void setTema_nombre(String tema_nombre) {
        this.tema_nombre = tema_nombre;
    }

    public String getTema_subtemas() {
        return tema_subtemas;
    }

    public void setTema_subtemas(String tema_subtemas) {
        this.tema_subtemas = tema_subtemas;
    }

    public CeReticula getSelmateria() {
        return selmateria;
    }

    public void setSelmateria(CeReticula selmateria) {
        this.selmateria = selmateria;
    }

    

    public List<AsigTemasComp> getGridcomp() {
        return gridcomp;
    }

    public void setGridcomp(List<AsigTemasComp> gridcomp) {
        this.gridcomp = gridcomp;
    }
    
       
    public List<AsigTemas> getGridtemas() {
        return gridtemas;
    }

    public void setGridtemas(List<AsigTemas> gridtemas) {
        this.gridtemas = gridtemas;
    }
    

    
    public String getAsignom() {
        return asignom;
    }

    public void setAsignom(String asignom) {
        this.asignom = asignom;
    }

    public String getAsigclave() {
        return asigclave;
    }

    public void setAsigclave(String asigclave) {
        this.asigclave = asigclave;
    }

    public String getAsighorasteoria() {
        return asighorasteoria;
    }

    public void setAsighorasteoria(String asighorasteoria) {
        this.asighorasteoria = asighorasteoria;
    }

    public String getAsighoraspractica() {
        return asighoraspractica;
    }

    public void setAsighoraspractica(String asighoraspractica) {
        this.asighoraspractica = asighoraspractica;
    }

    public String getAsighorascreditos() {
        return asighorascreditos;
    }

    public void setAsighorascreditos(String asighorascreditos) {
        this.asighorascreditos = asighorascreditos;
    }

    public String getAsignumtemas() {
        return asignumtemas;
    }

    public void setAsignumtemas(String asignumtemas) {
        this.asignumtemas = asignumtemas;
    }

    public String getAsigpresentacion() {
        return asigpresentacion;
    }

    public void setAsigpresentacion(String asigpresentacion) {
        this.asigpresentacion = asigpresentacion;
    }

    public String getAsigintenciondidactica() {
        return asigintenciondidactica;
    }

    public void setAsigintenciondidactica(String asigintenciondidactica) {
        this.asigintenciondidactica = asigintenciondidactica;
    }

    public String getAsigfuentesinfo() {
        return asigfuentesinfo;
    }

    public void setAsigfuentesinfo(String asigfuentesinfo) {
        this.asigfuentesinfo = asigfuentesinfo;
    }
    
           
    public Map<String, String> getMapcarreras() {
        return mapcarreras;
    }

    public void setMapcarreras(Map<String, String> mapcarreras) {
        this.mapcarreras = mapcarreras;
    }
    
    
    public Map<String, String> getMapmaterias() {
        return mapmaterias;
    }

    public void setMapmaterias(Map<String, String> mapmaterias) {
        this.mapmaterias = mapmaterias;
    }

    public String getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(String idmateria) {
        this.idmateria = idmateria;
    }
    
    
        
    public String getIdcarre() {
        return idcarre;
    }

    public void setIdcarre(String idcarre) {
        this.idcarre = idcarre;
    }

       
            
    public PlanesBean() {
               
        emfplan = Persistence.createEntityManagerFactory("itesplanesInstrPU");
        emplan = emfplan.createEntityManager();
        emfcon = Persistence.createEntityManagerFactory("itesplanesConPU");
        emcon = emfcon.createEntityManager();
      
        TypedQuery <CeEspecialidades> E = emcon.createNamedQuery("CeEspecialidades.findAll", CeEspecialidades.class);
        listcarreras = E.getResultList();
   
          for(CeEspecialidades carre: listcarreras){
              if (carre.getEspID() > 1) {
                mapcarreras.put(carre.getEspNombre(), String.valueOf(carre.getEspID()));
              }  
          }
    }

    
    public CeEspecialidades getCarrera() {
        return carrera;
    }

    public void setCarrera(CeEspecialidades carrera) {
        this.carrera = carrera;
    }

    public CePlanesEstudios getPlancarrera() {
        return plancarrera;
    }

    public void setPlancarrera(CePlanesEstudios plancarrera) {
        this.plancarrera = plancarrera;
    }

    public CeReticula getMateria() {
        return materia;
    }

    public void setMateria(CeReticula materia) {
        this.materia = materia;
    }
    
       
    public void SeleccionaCarrera (){  
        
         
         if(idcarre !=null && !idcarre.equals("")) {
            mapmaterias = getAllMaterias(idcarre);
         }
        else
            mapmaterias = new HashMap<String, String>();
    }
    
    
    
public Map<String,String> getAllMaterias(String Carrera){
       
        Map<String,String> mate = new HashMap<String,String>();
         
          TypedQuery <CePlanesEstudios> E = emcon.createNamedQuery("CePlanesEstudios.findByEspID", CePlanesEstudios.class).setParameter("espID", Short.valueOf(Carrera));
          listplancarrera = E.getResultList();
          if (listplancarrera.size() > 0) {
              TypedQuery <CeReticula> F = emcon.createNamedQuery("CeReticula.findByPesID", CeReticula.class).setParameter("pesID", listplancarrera.get(0));
              listmaterias = F.getResultList();
              if (listmaterias.size() > 0) {
                 for(CeReticula material: listmaterias){
                      mate.put(material.getRetNomCompleto(), String.valueOf(material.getRetID()));
                 }
               }
           
            }
         return mate;
  }    

    public void agregaRegistros() {
        AsigTemas aux = new AsigTemas();
        if (!temamod) {
         aux.setTemaNumero(Integer.parseInt(this.tema_numero));
         aux.setTemaNombre(this.tema_nombre);
         aux.setTemaSubtemas(this.tema_subtemas);
         this.tema_numero = "";
         this.tema_nombre="";
         this.tema_subtemas="";
         gridtemas.add(aux);
        }
        else {
         if (gridtemas.contains(asigtemasmod)) {
            int indice = gridtemas.indexOf(asigtemasmod);
            asigtemasmod.setTemaNumero(Integer.parseInt(this.tema_numero));
            asigtemasmod.setTemaNombre(this.tema_nombre);
            asigtemasmod.setTemaSubtemas(this.tema_subtemas);
            this.tema_numero = "";
            this.tema_nombre="";
            this.tema_subtemas="";
            gridtemas.set(indice, asigtemasmod);
            temamod = false;
         }
        }
        
    }
    
    public void agregaCompe() {
        AsigTemasComp aux =new AsigTemasComp();
        
        aux.setCompNumero(Integer.parseInt(compnumero));
        aux.setCompEspecifica(compespecifica);
        aux.setCompGenericas(compgenerica);
        aux.setCompActAprendizaje(compactaprendizaje);
        this.compnumero = "";
        this.compespecifica="";
        this.compgenerica="";
        this.compactaprendizaje="";
        gridcomp.add(aux);
        
    }
    
    
    public void validaPlan(){
       List <Asignaturas> result = new ArrayList<Asignaturas>();
    
       TypedQuery q =  emplan.createNamedQuery("Asignaturas.findByRetId", Asignaturas.class)
                        .setParameter("retId", Short.parseShort(idmateria));
       result = q.getResultList(); 
    
       if (!result.isEmpty()){
          modifica = true;
          asignaturasmod = result.get(0);
          LeerAsignatura(asignaturasmod);
        }
       else {
           for (CeReticula selma: listmaterias) {
               if (selma.getRetID().equals(Short.parseShort(idmateria))){
                   asignom = selma.getRetNomCompleto();
               }
           }
       }
    }
    
    public void LeerAsignatura (Asignaturas asig) {

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El Plan de Estudios ya existe. Realice las modificaciones y guarde."));
    
        asignom = asig.getAsigNombre();
        asigclave = asig.getAsigClave();
        asighorasteoria = String.valueOf(asig.getAsigHorasTeoria());
        asighoraspractica = String.valueOf(asig.getAsigHorasPractica());
        asighorascreditos = String.valueOf(asig.getAsigHorasCreditos());
        asignumtemas= String.valueOf(asig.getAsigNumeroTemas());
        asigpresentacion = asig.getAsigPresentacion();
        asigintenciondidactica = asig.getAsigIntencionDidactica();
        asigfuentesinfo = asig.getAsigFuentesInformacion();
        asigcompematerias = asig.getAsigCompeMateria();
        
        asignaturasmod = asig;
        
        TypedQuery q = emplan.createNamedQuery("AsigTemas.findByIdAsignatura", AsigTemas.class)
                             .setParameter("idAsignatura",Short.parseShort(idmateria));
        
        gridtemasmod = q.getResultList();
        gridtemas = gridtemasmod;
        
//        if (!gridtemasmod.isEmpty()) {
//            gridtemas = new ArrayList<AsigTemas>();
//            for (int i = 0; i < gridtemasmod.size(); i++) {
//                gridtemas.add(gridtemasmod.get(i));
//            }
//        }
        q = emplan.createNamedQuery("AsigTemasComp.findByIdAsignatura", AsigTemasComp.class)
                   .setParameter("idAsignatura", Short.parseShort(idmateria));
        gridcompmod = q.getResultList();
        gridcomp = gridcompmod;
//        if (!gridcompmod.isEmpty()){
//            gridcomp = new ArrayList<AsigTemasComp>();
//            for (int i = 0; i < gridcomp.size(); i++) {
//                gridcomp.add(gridcompmod.get(i));
//            }
//        }
                   
    }
    
    public void guardarPlan(){
        Asignaturas asig = new Asignaturas();
        
        if (modifica) {
            guardarPlanMod();
        }
        System.out.println ("Pasa por aqui");
        asig.setIdAsignatura(Integer.parseInt("0"));
        asig.setRetId(Short.parseShort(idmateria));
        asig.setAsigNombre(asignom);
        asig.setAsigClave(asigclave);
        asig.setAsigHorasTeoria(Integer.parseInt(asighorasteoria));
        asig.setAsigHorasPractica(Integer.parseInt(asighoraspractica));
        asig.setAsigHorasCreditos(Integer.parseInt(asighorascreditos));
        asig.setAsigNumeroTemas(Integer.parseInt(asignumtemas));
        asig.setAsigPresentacion(asigpresentacion);
        asig.setAsigIntencionDidactica(asigintenciondidactica);
        asig.setAsigFuentesInformacion(asigfuentesinfo);
        asig.setAsigCompeMateria(asigcompematerias);
        try {
            if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();

            Set<ConstraintViolation<Asignaturas>> constraintViolations = validator.validate(asig);

            if (constraintViolations.size() > 0 ) {
               System.out.println("Constraint Violations occurred..");
               for (ConstraintViolation<Asignaturas> contraints : constraintViolations) {
                    System.out.println(contraints.getRootBeanClass().getSimpleName()+
                                       "." + contraints.getPropertyPath() + " " + contraints.getMessage());
               }
            }
            emplan.persist(asig);
            emplan.getTransaction().commit(); 
        } catch (Exception e) {
          e.printStackTrace();
        }
        
        if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();

        for (AsigTemas ntema: gridtemas){
              ntema.setIdTemas(Integer.parseInt("0"));
              ntema.setIdAsignatura(Integer.parseInt(idmateria));
             emplan.persist(ntema);
        }
        emplan.getTransaction().commit();
        
        if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();
        
        for (AsigTemasComp comp: gridcomp) {
            comp.setIdTemasComp(Integer.parseInt("0"));            
            comp.setIdAsignatura(Integer.parseInt(idmateria));
            emplan.persist(comp);
        }
        emplan.getTransaction().commit();
        
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Plan de Estudios "+ asignom +" guardado")); 
    }

    
    public void guardarPlanMod(){
     
           
     //   asignaturasmod.setRetId(Short.parseShort(idmateria));
        asignaturasmod.setAsigNombre(asignom);
        asignaturasmod.setAsigClave(asigclave);
        asignaturasmod.setAsigHorasTeoria(Integer.parseInt(asighorasteoria));
        asignaturasmod.setAsigHorasPractica(Integer.parseInt(asighoraspractica));
        asignaturasmod.setAsigHorasCreditos(Integer.parseInt(asighorascreditos));
        asignaturasmod.setAsigNumeroTemas(Integer.parseInt(asignumtemas));
        asignaturasmod.setAsigPresentacion(asigpresentacion);
        asignaturasmod.setAsigIntencionDidactica(asigintenciondidactica);
        asignaturasmod.setAsigFuentesInformacion(asigfuentesinfo);
        asignaturasmod.setAsigCompeMateria(asigcompematerias);
        try {
            if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            Validator validator = factory.getValidator();

            Set<ConstraintViolation<Asignaturas>> constraintViolations = validator.validate(asignaturasmod);

            if (constraintViolations.size() > 0 ) {
               System.out.println("Constraint Violations occurred..");
               for (ConstraintViolation<Asignaturas> contraints : constraintViolations) {
                    System.out.println(contraints.getRootBeanClass().getSimpleName()+
                                       "." + contraints.getPropertyPath() + " " + contraints.getMessage());
               }
            }
            emplan.merge(asignaturasmod);
            emplan.getTransaction().commit(); 
        } catch (Exception e) {
          e.printStackTrace();
        }

        if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();

        for (AsigTemas ntema: gridtemas){
             emplan.merge(ntema);
        }
        emplan.getTransaction().commit();
        
        if(!emplan.getTransaction().isActive())
              emplan.getTransaction().begin();
        
        for (AsigTemasComp comp: gridcomp) {
            emplan.merge(comp);
        }
        emplan.getTransaction().commit();

       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Plan de Estudios "+ idmateria +" modificado")); 
    }
    
public void onRowSelect(SelectEvent event) {
//        FacesMessage msg = new FacesMessage("Car Selected", ((Car) event.getObject()).getId());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
      
      temamod = true;
      asigtemasmod = ((AsigTemas) event.getObject());
      tema_numero = String.valueOf(asigtemasmod.getTemaNumero());
      tema_nombre = asigtemasmod.getTemaNombre();
      tema_subtemas = asigtemasmod.getTemaSubtemas();
  }
    
}
