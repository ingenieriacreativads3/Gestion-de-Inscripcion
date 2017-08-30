package aula25v01;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.*;

public class Curso{
    
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
    
    private static Set<Curso> listaCurso = new HashSet<Curso> ();
    
    public Curso(){};
    
    //Set
    
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
    
    //Manejo de Lista
    
    public static void setListaCurso(Set<Curso> listaCursoAuxiliar) {
        
        Curso.listaCurso = listaCursoAuxiliar;
        
    }
    
    public static Set<Curso> getListaCurso() {
        
        return listaCurso;
        
    }
    
    public static void addListaCurso(Curso cursoAuxiliar){
        
        listaCurso.add(cursoAuxiliar);
        
    }
    
    public static int siguienteIdCurso(){
        
        return listaCurso.size() + 1;
        
    }
    
    public static Curso getCursoPorId(int IdCursoAuxiliar){
        
        for(Curso cursoAuxiliar : listaCurso){
            
            if(cursoAuxiliar.getIdCurso() == IdCursoAuxiliar){
                
                return cursoAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    //Others
    
    public String solicitarInformacion(){
        
    return  "\nNombre: " + this.nombre + "\nDescripción: " + this.descripcion +
            "\nProfesor: " + this.docente_1.getNombre() +
            "\nCosto: " + this.costo;
    
    }
    
    @Override
    public int hashCode(){
        
        return this.IdCurso;
        
    }
    
    @Override
    public boolean equals(Object objetoAuxiliar){
        
        if (objetoAuxiliar == null){return false;}
        if (this.getClass() != objetoAuxiliar.getClass()){return false;}
        
        final Curso cursoAuxiliar = (Curso) objetoAuxiliar;
        
        if (this.hashCode() != cursoAuxiliar.hashCode()){return false;}
        
        return true;
        
    }
    
    @Override
    public String toString(){
        
        return "";
        
    }
    
}
