package aula25v01;

import java.util.*;

public class Status{
    
    public Status(int controlAuxiliar, String nombreAuxiliar){
        
        this.control = controlAuxiliar;
        this.nombre = nombreAuxiliar;
        
    }
    
    private final int control;
    private final String nombre;
    private static Set<Status> miListaStatus = new HashSet<>();
    
    public void incializarStatus(){
        
        Status estadoInicial = new Status(getIdEstado(), "Estado Inicial");miListaStatus.add(estadoInicial);
        Status estadoError001 = new Status(getIdEstado(), "Estado error 001");miListaStatus.add(estadoError001);
    }
    
    static Status getEstadoInicial(){
        
        for(Status statusAuxiliar : miListaStatus){
            
            if(statusAuxiliar.hashCode() == 000){
                
                return statusAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    static Status getEstadoError001(){
        
        for(Status statusAuxiliar : miListaStatus){
            
            if(statusAuxiliar.hashCode() == 001){
                
                return statusAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    public static int getIdEstado(){
        
        return (miListaStatus.size() + 1);
        
    }
    
    @Override
    public int hashCode(){
        
        return this.control;
        
    }
    
    @Override
    public boolean equals(Object objetoAuxiliar){
        
        if (objetoAuxiliar == null){return false;}
        if (this.getClass() != objetoAuxiliar.getClass()){return false;}
        
        final Status statusAuxiliar = (Status) objetoAuxiliar;
        
        if (this.hashCode() != statusAuxiliar.hashCode()){return false;}
        
        return true;
        
    }
  
    @Override
    public String toString(){
        
        return this.nombre;
        
    }
    
}
