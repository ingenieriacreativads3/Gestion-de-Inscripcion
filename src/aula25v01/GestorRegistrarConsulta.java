package aula25v01;

import java.util.*;

public class GestorRegistrarConsulta {

    public GestorRegistrarConsulta(){
    }
    
    public static void iniciarAplicacion(){
        
        Aula25 ventana_1 = new Aula25();
        ventana_1.show();
        ventana_1.jLabelAula25.setText("Aula 25");
        ventana_1.jButtonIniciarSesion.setText("Iniciar sesión");
        ventana_1.jButtonRegistrarAlumno.setText("Registrarse");
        ventana_1.jButtonRegistrarConsulta.setText("Solicitar Información");
        ventana_1.jButtonCancelar.setText("Cancelar");
    
    }
    
    public static void gestorJButtonRegistrarConsultaMousePressed(Aula25 ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
        RegistrarConsulta ventana_2 = new RegistrarConsulta(); 
        ventana_2.show();
        //Aca va el codigo que hace todo. Inizializa el alumno lo pone
        //En la lista estática.
        //Tmb desde aca se inizializa la pantalla que muestra la informacion.
        //Aca se pide la informacion del docente vinculado al curso.
        //y se muestra.
 
    }
    
    public static void gestorJButtonAceptarMousePressed
        (RegistrarConsulta ventanaAuxiliar){
        
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar.setDni(Integer.valueOf(ventanaAuxiliar.jTextFieldDni.getText()));
        alumnoAuxiliar.setNombre(ventanaAuxiliar.jTextFieldNombre.getText());
        alumnoAuxiliar.setApellido(ventanaAuxiliar.jTextFieldApellido.getText());
        alumnoAuxiliar.setEmail(ventanaAuxiliar.jTextFieldEmail.getText());
        alumnoAuxiliar.setTelefono(Integer.valueOf(ventanaAuxiliar.jTextFieldTelefono.getText()));
        
        Alumno.addListaAlumno(alumnoAuxiliar);
        
        Curso cursoAuxiliar = new Curso();
        
        cursoAuxiliar = Curso.getCursoPorId(ventanaAuxiliar.jComboBoxCurso.getSelectedIndex());
        
        Inscripcion inscripcion_1 = new Inscripcion();
        inscripcion_1.setAlumno_1(alumnoAuxiliar);
        inscripcion_1.setCurso_1(cursoAuxiliar);
        inscripcion_1.setEstado(0);
        inscripcion_1.setImporte(cursoAuxiliar.getCosto());
        inscripcion_1.setFecha(new Date());
        
        Inscripcion.addListaInscripcion(inscripcion_1);
        
        MostrarInformacion ventanaMostrarInformacion = new MostrarInformacion();
        ventanaMostrarInformacion.establecerTextoJTextArea(cursoAuxiliar.solicitarInformacion());
        ventanaMostrarInformacion.show();
           
    }
    
    public static void gestionarJButtonCancelarMousePressed(Aula25 ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
        System.exit(0);
        
    }
    
}
