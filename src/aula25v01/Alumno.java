package aula25v01;
import java.util.*;

public class Alumno{
    
    private String nombre;
    private String apellido;
    private int dni;
    private String domicilio;
    private int telefono;
    private int fechaNac;           //AAAAMMDD.
    private String email;
    private boolean estadoAlumno;   //true = activo, false  = inactivo
    private boolean prorrogaAlumno;
    
    public Alumno(){};
    
    //Set
    
    public void setNombre(String nombreAuxiliar){
        
        this.nombre = nombreAuxiliar;
        
    }
    
    public void setApellido(String apellidoAuxiliar){
                
        this.apellido = apellidoAuxiliar;
        
    }
    
    public void setDni(int dniAuxliar){
        
        this.dni = dniAuxliar;
        
    }
    
    public void setDomicilio(String domicilioAuxiliar){
        
        this.domicilio = domicilioAuxiliar;
        
    }
    
    public void setTelefono(int telefonoAuxiliar){
        
        this.telefono = telefonoAuxiliar;
        
    }
    
    public void setFechaNac(int fechaNacAuxiliar){
        
        this.fechaNac = fechaNacAuxiliar;
        
    }
    
    public void setEmail(String emailAuxiliar){
        
        this.email = emailAuxiliar;
        
    }
    
    public void setEstado(boolean estadoAuxiliar){
        
        this.estadoAlumno = estadoAuxiliar;
        
    }
    
    public void setProrroga(boolean prorrogaAuxiliar){
        
        this.prorrogaAlumno = prorrogaAuxiliar;
        
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
    
    public String getDomicilio(){
        
        return this.domicilio;
        
    }
    
    public int getTelefono(){
        
        return this.telefono;
        
    }
    
    public int getFechaNac(){
        
        return this.fechaNac;
        
    }
    
    public String getEmail(){
        
        return this.email;
        
    }
    
    public boolean getEstado(){
        
       return this.estadoAlumno;
        
    }
    
    public boolean getProrroga(){
        
        return prorrogaAlumno;
        
    }
    
    //Other
    
    public boolean verificarExistencia(int dniAuxiliar){
        
        if(dniAuxiliar == this.dni){
            
            return true;
            
        } else {
            
            return false;
            
        }
        
    }
}
