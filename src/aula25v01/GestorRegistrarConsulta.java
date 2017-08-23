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
        ventana_1.jButtonCancelar.setText("Cancelar");
    
    }
    
    public static void gestorJButtonRegistrarConsultaMousePressed(){
        
        RegistrarConsulta ventana_2 = new RegistrarConsulta(); 
        ventana_2.show();
        //Aca va el codigo que hace todo. Inizializa el alumno lo pone
        //En la lista estática.
        //Tmb desde aca se inizializa la pantalla que muestra la informacion.
        //Aca se pide la informacion del docente vinculado al curso.
        //y se muestra.
 
    }
    
    public static void gestorJButtonAceptarMousePressed
        (String nombreAuxiliar, String apellidoAuxiliar,
         String emailAuxiliar, int telefonoAuxiliar,
         int IdCursoAuxiliar, int dniAuxiliar){
    
        //NuevoAlumno
        Alumno alumno_1 = new Alumno();
        alumno_1.setDni(dniAuxiliar);
        alumno_1.setNombre(nombreAuxiliar);
        alumno_1.setApellido(apellidoAuxiliar);
        alumno_1.setEmail(emailAuxiliar);
        alumno_1.setTelefono(telefonoAuxiliar);
        
        Alumno.addListaAlumno(alumno_1);

        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = pedirCursoALista(IdCursoAuxiliar);

        MostrarInformacion ventanaMostrarInformacion = new MostrarInformacion();
        ventanaMostrarInformacion.establecerTextoJTextArea(cursoAuxiliar.solicitarInformacion());
        ventanaMostrarInformacion.show();
            
    }
        
    private static Curso pedirCursoALista(int IdCursoAuxiliar){
        
        for(Curso cursoAuxiliar : Curso.getListaCurso()){
            
            if(cursoAuxiliar.getIdCurso() == IdCursoAuxiliar){
                
                return cursoAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    public static void gestionarJButtonCancelarMousePressed(Aula25 ventanaAuxiliar){
        
        ventanaAuxiliar.hide();
        
    }
    
}
