package aula25v01;
import com.sun.javafx.geom.transform.BaseTransform;
import java.util.*;

public class Alumno{
    
    private String nombre;
    private String apellido;
    private int dni;                //Usamos este atributo como ID
    private String domicilio;
    private int telefono;
    private int fechaNac;           //AAAAMMDD.
    private String email;
    private boolean estadoAlumno;   //true = activo, false  = inactivo
    private boolean prorrogaAlumno;
    
    private static Set<Alumno> listaAlumno = new HashSet<>();
    
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
    
    //Manejo de Lista
    
    public void setListaAlumno(Set<Alumno> listaAlumnoAuxiliar){
        
        listaAlumno = listaAlumnoAuxiliar;
        
    }
    
    public static  Set<Alumno> getListaAlumno(){
        
        return listaAlumno;
        
    }
    
    public static void addListaAlumno(Alumno alumnoAuxiliar){
        
        listaAlumno.add(alumnoAuxiliar);
        
    }
    
    //Other
    
    public boolean yaExisteAlumno(Alumno alumnoAuxiliar){
        
        if(alumnoAuxiliar == null){return false;}
        if(listaAlumno.contains(alumnoAuxiliar)){return true;}
        return false;
        
    }
    
    @Override
    public int hashCode(){
        
        return this.dni;
        
    }
    
    @Override
    public boolean equals(Object objetoAuxiliar){
        
        if (objetoAuxiliar == null){return false;}
        if (this.getClass() != objetoAuxiliar.getClass()){return false;}
        
        final Alumno alumnoAuxiliar = (Alumno) objetoAuxiliar;
        
        if (this.hashCode() != alumnoAuxiliar.hashCode()){return false;}
        
        return true;
        
    }
    
    @Override
    public String toString(){
        
        return "";
        
    }
}
