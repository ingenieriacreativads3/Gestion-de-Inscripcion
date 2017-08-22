package aula25v01;
import java.util.*;

public class Docente{
    
    private String nombre;
    private String apellido;
    private int dni;
    private String tituloHabilitante;
    private float honorario;
    
    public Docente(){};
    
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
    
}
