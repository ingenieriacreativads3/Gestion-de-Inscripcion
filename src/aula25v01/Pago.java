package aula25v01;
import java.util.*;

public class Pago{
    
    private int IdPago;
    private int fecha; //AAAAMMDD;
    private float importe;
    
    private Inscripcion inscripcion_1;
    
    public Pago(){};
    
    //Set
    
    public void setIdPago(int IdPagoAuxiliar){
        
        this.IdPago = IdPagoAuxiliar;
        
    }
    
    public void setFecha(int fechaAuxiliar){
        
        this.fecha = fechaAuxiliar;
        
    }
    
    public void setImporte(float importeAuxiliar){
        
        this.importe = importeAuxiliar;
        
    }
    
    public void setInscripcion_1(Inscripcion inscripcion_1Auxiliar){
        
        this.inscripcion_1 = inscripcion_1Auxiliar;
        
    }
    
    //Get
    
    public int getIdPago(){
        
        return this.IdPago;
        
    }
            
    public int getFecha(){
        
        return this.fecha;
        
    }
    
    public float getImporte(){
        
        return this.importe;
        
    }
    
    public Inscripcion getInscripcion_1(){
        
        return this.inscripcion_1;
        
    }
    
}
