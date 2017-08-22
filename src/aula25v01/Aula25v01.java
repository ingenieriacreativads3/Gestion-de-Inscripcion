package aula25v01;
import java.util.*;

public class Aula25v01{
    
    

    public Aula25v01(){};
    
    public static void main(String[] args){
        
//        //MAIN DE PRUEBA V1.1
//        //Inicializa un objeto de la clase Inscripcion.
//        Inscripcion inscripcionPrueba = new Inscripcion();
//        
//        //Asigna valores a cada atributo.
//        inscripcionPrueba.setEstado(1);
//        inscripcionPrueba.setFecha(2);
//        inscripcionPrueba.setIdInscripcion(0);
//        inscripcionPrueba.setImporte(32.1);
//        
//        //Inicializa un objeto de la clase Alumno.
//        Alumno alumno_1 = new Alumno();
//        
//        //Agrega el objeto de la clase Inscricion
//        //a la lista pseudoAtributo de la clase Alumno.
//        //alumno_1.inscripcion_1.add(inscripcionPrueba);
//        
//        //Inicializa un objeto de la clase Inscripcion.
//        Inscripcion inscripcionSacadora = new Inscripcion();
//        
//        //Extrae elemento de la lista del objeto
//        //de la clase Alumno y lo asigna a otro objeto.
//        //inscripcionSacadora = alumno_1.inscripcion_1.get(0);
//        
//        //Muestra un atributo del objeto copiado.
//        System.out.println(inscripcionSacadora.getImporte());

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
        curso_1.setIdCurso(0);
        curso_1.setDescripcion("...");
        curso_1.setCosto(1500);
        curso_1.setCupoMin(10);
        curso_1.setCupoMax(30);
        curso_1.setEnCuotas(false);
        curso_1.setDiaInicio(20172209);
        curso_1.setDocente_1(docente_1);
        
       //NuevoDocente
        Docente docente_2 = new Docente();
        docente_2.setNombre("Pablo");
        docente_2.setApellido("Lopez");
        
        //NuevoCurso 
        Curso curso_2 = new Curso();
        curso_2.setNombre("Programacion");
        curso_2.setIdCurso(1);
        curso_2.setDescripcion("...");
        curso_2.setCosto(800);
        curso_2.setDocente_1(docente_2);
        
        //AgregarCursosArrayList
        Curso.cursos.add(curso_1);
        Curso.cursos.add(curso_2);
        
        //JFrame
        GestorRegistrarConsulta.IniciarAplicacion();
        
    }
    
}
