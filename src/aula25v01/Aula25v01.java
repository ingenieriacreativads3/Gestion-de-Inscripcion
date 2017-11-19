package aula25v01;
import java.util.*;

public class Aula25v01{
    
    public Aula25v01(){};
    
    public static void main(String[] args){
        
        
        //NuevoDocente
        Docente docente_1 = new Docente();
        docente_1.setNombre("Damian");
        docente_1.setApellido("Cordoba");
        docente_1.setDni(32546743);
        docente_1.setTituloHabilitante("...");
        docente_1.setHonorario(200);
        
        
        //NuevoCurso 
        Curso curso_1 = new Curso();
        curso_1.setNombre("Frances");
        curso_1.setDescripcion("...");
        curso_1.setCosto(1500);
        curso_1.setCupoMin(10);
        curso_1.setCupoMax(30);
        curso_1.setEnCuotas(false);
        curso_1.setDiaInicio(new Date());
        curso_1.setDocente_1(docente_1);
        
        //NuevoDocente
        Docente docente_2 = new Docente();
        docente_2.setNombre("Pablo");
        docente_2.setApellido("Lopez");
        docente_2.setDni(35668756);
        docente_2.setTituloHabilitante("titulo");
        docente_2.setHonorario(23);
        
        
        //NuevoCurso 
        Curso curso_2 = new Curso();
        curso_2.setNombre("Programacion");
        curso_2.setDescripcion("...");
        curso_2.setCosto(800);
        curso_2.setDocente_1(docente_2);
        
        System.out.println(12.4);
        
        
        
        //JFrame
        GestorRegistrarConsulta.iniciarAplicacion();
        Status miStatusInicializar = new Status(999, "Estado inicializar");
        miStatusInicializar.incializarStatus();
        
        
    }
    
}
