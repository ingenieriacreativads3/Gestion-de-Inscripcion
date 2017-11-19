package aula25v01;
import java.util.*;

public class Docente{
    
    private String nombre;
    private String apellido;
    private int id;
    private int dni;                    
    private String tituloHabilitante;
    private float honorario;
    
    private static Set<Docente> listaDocente = new HashSet<>();
    
    public Docente(){
        
        this.id = getSiguienteIdDocente();
        addDocente(this);
        
        
    };
    
    //Set
    
    public void setNombre(String nombreAuxliar){
        
        this.nombre = nombreAuxliar;
        
    }
    
    public void setApellido(String apellidoAuxiliar){
        
        this.apellido = apellidoAuxiliar;
        
    }
    
    public void setDni(int dniAuxiliar){
        
        this.dni = dniAuxiliar;
        
    }
    
    public void setTituloHabilitante(String tituloHabilitanteAuxiliar){
        
        this.tituloHabilitante = tituloHabilitanteAuxiliar;
        
    }
    
    public void setHonorario(float honorarioAuxiliar){
        
        this.honorario = honorarioAuxiliar;
        
    }
    
    //Get
    
    public String getNombre(){
        
        return this.nombre;
        
    }
    
    public String getApellido(){
        
        return this.apellido;
        
    }
    
    public int getDni(){
        
        return this.dni;
        
    }
    
    public String getTituloHabilitante(){
        
        return this.tituloHabilitante;
        
    }
    
    public float getHonorario(){
        
        return this.honorario;
        
    }
    
    public int getId(){
        
        return this.id;
        
    }
    
    //Manejo de lista.
    
    public static Set<Docente> getListaDocente(){
        
        return listaDocente;
        
    }
    
    public static void setListaDocente(Set<Docente> listaDocenteAuxiliar){
        
        listaDocente = listaDocenteAuxiliar;
        
    }
    
    private static int getSiguienteIdDocente(){
        
        return listaDocente.size() + 1;
        
    }
    
    private static void addDocente(Docente actual){
        
        listaDocente.add(actual);
        
    }
    
    public static Docente getDocentePorId(int idActual){
        
        for(Docente docenteActual : listaDocente){
            
            if(docenteActual.getId()== idActual){
                
                return docenteActual;
                
            }
            
        }
        
        return null;
        
    }
    
    
    
    
    //Others
    
    @Override
    public int hashCode(){
        
        return this.id;
        
    }
    
    @Override
    public boolean equals(Object objetoAuxiliar){
        
        if (objetoAuxiliar == null){return false;}
        if (this.getClass() != objetoAuxiliar.getClass()){return false;}
        
        final Docente docenteAuxiliar = (Docente) objetoAuxiliar;
        
        if (this.hashCode() != docenteAuxiliar.hashCode()){return false;}
        
        return true;
        
    }
    
    @Override
    public String toString(){
        
        return this.nombre + " " + this.apellido;
        
    }
    
}
