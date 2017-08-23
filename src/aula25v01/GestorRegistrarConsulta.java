package aula25v01;

import java.util.*;

public class GestorRegistrarConsulta {
    
    public static void iniciarAplicacion(){
        
        Aula25 ventana_1 = new Aula25();
        ventana_1.show();
        ventana_1.jLabelAula25.setText("Aula 25");
        ventana_1.jButtonIniciarSesion.setText("Iniciar sesión");
        ventana_1.jButtonRegistrarAlumno.setText("Registrarse");
        ventana_1.jButtonRegistrarConsulta.setText("Solicitar Información");
    
    }
    
    public static void gestionarRegistrarConsulta(){
        
        RegistrarConsulta ventana_2 = new RegistrarConsulta(); 
        ventana_2.show();
        //Aca va el codigo que hace todo. Inizializa el alumno lo pone
        //En la lista estática.
        //Tmb desde aca se inizializa la pantalla que muestra la informacion.
        //Aca se pide la informacion del docente vinculado al curso.
        //y se muestra.
 
    }
    
     protected static void gestionarRegistrarConsulta2
        (String nombre,String apellido,String email,int telefono,int idCurso){
    
        //NuevoAlumno
        Alumno alumno_1 = new Alumno();
        alumno_1.setNombre(nombre);
        alumno_1.setApellido(apellido);
        alumno_1.setEmail(email);
        alumno_1.setTelefono(telefono); 

        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = pedirCursoALista(idCurso);

        MostrarInformacion ventana_3 = new MostrarInformacion();
        ventana_3.establecerTextoJTextArea(cursoAuxiliar.solicitarInformacion());
        ventana_3.show();
            
    }
        
    private static Curso pedirCursoALista(int IdCursoAuxiliar){
        
        for(Curso cursoAuxiliar : Curso.getListaCurso()){
            
            if(cursoAuxiliar.getIdCurso() == IdCursoAuxiliar){
                
                return cursoAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
}
