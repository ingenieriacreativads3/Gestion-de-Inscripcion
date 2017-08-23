package aula25v01;
import java.util.*;

public class Inscripcion{
    
    private int IdInscripion;
    private int fecha; //La fecha se incia como sigue, AAAAMMDD.
    private double importe;
    private int estado;
        //Los estados son:  0 = interesado;
        //                  1 = preInscripto;
        //                  2 = inscripto;
        //                  3 = cancelado;
    
    private Alumno alumno_1;
    private Curso curso_1;
    
    private static Set<Inscripcion> listaInscripcion = new HashSet<>();
    
    public Inscripcion(){};
    
    //Set
    
    public void setIdInscripcion(int IdInscripcionAuxiliar){
        
        this.IdInscripion = IdInscripcionAuxiliar;
        
    }
    
    public void setFecha(int fechaAuxiliar){
        
        this.fecha = fechaAuxiliar;
        
    }
    
    public void setImporte(double importeAuxiliar){
        
        this.importe = importeAuxiliar;
        
    }
    
    public void setEstado(int estadoAuxiliar){
        
        this.estado = estadoAuxiliar;
        
    }
    
    public void setAlumno_1(Alumno alumno_1Auxiliar){
        
        this.alumno_1 = alumno_1Auxiliar;
        
    }
    
    public void setCurso_1(Curso curso_1Auxiliar){
        
        this.curso_1 = curso_1Auxiliar;
        
    }
    
    //Get
    
    public int getIdInscripcion(){
        
        return this.IdInscripion;
        
    }
    
    public int getFecha(){
        
        return this.fecha;
        
    }
    
    public double getImporte(){
        
        return this.importe;
        
    }
    
    public int getEstado(){
        
        return this.estado;
        
    }
    
    public Alumno getAlumno_1(){
        
        return this.alumno_1;
        
    }
    
    public Curso getCurso_1(){
        
        return this.curso_1;
        
    }
    
    //Manejo de Lista.
    
    public static void setListaInscripcion(Set<Inscripcion> listaAuxiliar){
        
        listaInscripcion = listaAuxiliar;
        
    }
    
    public static Set<Inscripcion> getListaInscripcion(){
        
        return listaInscripcion;
        
    }
    
    public static void addListaInscripcion(Inscripcion inscripcionAuxiliar){
        
        listaInscripcion.add(inscripcionAuxiliar);
        
    }
    
    //Other
    
    public boolean verificarEstado(int estadoAuxiliar){
        
        if(this.estado == estadoAuxiliar){
            
            return true;
            
        } else {
            
            return false;
            
        }
    }
    
}
