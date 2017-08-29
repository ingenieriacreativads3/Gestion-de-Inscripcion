package aula25v01;
import java.util.*;

public class Pago{
    
    private int IdPago;
    private int fecha; //AAAAMMDD;
    private float importe;
    
    private Inscripcion inscripcion_1;
    
    private static Set<Pago> listaPago = new HashSet<>();
    
    public Pago(){};
    
    //SetSet
    
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
    
    //Manejo de lista.
    
    public static void setListaPago(Set<Pago> listaPagoAuxiliar){
        
        listaPago = listaPagoAuxiliar;
        
    }
    
    public static Set<Pago> getListaPago(){
        
        return listaPago;
        
    }
    
    public static void addListaPago(Pago pagoAuxiliar){
        
        listaPago.add(pagoAuxiliar);
        
    }
    
    public static int siguienteIdPago(){
        
        return listaPago.size() + 1;
        
    }
    
    //Others
    
    @Override
    public int hashCode(){
        
            return this.IdPago;
               
        }
        
    @Override
    public boolean equals(Object objetoAuxiliar){
        
        if (objetoAuxiliar == null){return false;}
        if (this.getClass() != objetoAuxiliar.getClass()){return false;}
        
        final Pago pagoAuxiliar = (Pago) objetoAuxiliar;
        
        if (this.hashCode() != pagoAuxiliar.hashCode()){return false;}
        
        return true;
        
    }
    
    @Override
    public String toString(){
        
        return "";
        
    }
    
}
