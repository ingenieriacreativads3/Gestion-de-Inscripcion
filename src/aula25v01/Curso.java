package aula25v01;
import java.util.*;

public class Curso{
    
    static ArrayList <Curso> cursos = new ArrayList <Curso> ();

    private String nombre;
    private int IdCurso;
    private String descripcion;
    private float costo;
    private int cupoMin;
    private int cupoMax;
    private boolean enCuotas;
            //Verificar esto. Paga en cuotas o de contado creo.
    private int diaInicio; //AAAAMMDD.
    
    private Docente docente_1;
    
    public Curso(){};
    
    //Set
    
    public static void setCursos(ArrayList<Curso> cursos) {
        Curso.cursos = cursos;
    }
    
    public void setNombre(String nombreAuxiliar){
        
        this.nombre = nombreAuxiliar;
        
    }
    
    public void setIdCurso(int IdCursoAuxiliar){
        
        this.IdCurso = IdCursoAuxiliar;
        
    }
    
    public void setDescripcion(String descripcionAuxiliar){
        
        this.descripcion = descripcionAuxiliar;
        
    }
    
    public void setCosto(float costoAuxiliar){
        
        this.costo = costoAuxiliar;
        
    }
    
    public void setCupoMin(int cupoMinAuxiliar){
        
        this.cupoMin = cupoMinAuxiliar;
        
    }
    
    public void setCupoMax(int cupoMaxAuxiliar){
        
        this.cupoMax = cupoMaxAuxiliar;
        
    }
    
    public void setEnCuotas(boolean enCuotasAuxiliar){
        
        this.enCuotas = enCuotasAuxiliar;
        
    }
    
    public void setDiaInicio(int diaInicioAuxiliar){
        
        this.diaInicio = diaInicioAuxiliar;
        
    }
    
    public void setDocente_1(Docente docente_1Auxiliar){
        
        this.docente_1 = docente_1Auxiliar;
        
    }
    
    //Get
    
    public int getIdCurso(){
        
        return this.IdCurso;
        
    }
    
    public String getDescripcion(){
        
        return this.descripcion;
        
    }
    
    public float getCosto(){
        
        return this.costo;
        
    }
    
    public int getCupoMin(){
        
        return this.cupoMin;
        
    }
    
    public int getCupoMax(){
        
        return this.cupoMax;
        
    }
    
    public boolean getEnCuotas(){
        
        return this.enCuotas;
        
    }
    
    public int getDiaInicio(){
        
        return this.diaInicio;
        
    }
    
    public Docente getDocente_1(){
        
        return this.docente_1;
        
    }
    
    public String getNombre(){
        
        return this.nombre;
        
    }
      
      public static ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public String solicitarInformacion()
    {
    return  "\nNombre: " + this.nombre + "\nDescripción: " + this.descripcion +
            "\nProfesor: " + this.docente_1.getNombre() +
            "\nCosto: " + this.costo;
    }
    

            
}
