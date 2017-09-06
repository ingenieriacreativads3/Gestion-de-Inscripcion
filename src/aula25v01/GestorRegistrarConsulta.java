package aula25v01;

import java.util.*;

public class GestorRegistrarConsulta {

    public GestorRegistrarConsulta(){
    }
    
    public static void iniciarAplicacion(){
        
        Aula25 ventana_1 = new Aula25();
        ventana_1.show();
        ventana_1.jLabelTitulo.setText("Aula 25");
        ventana_1.jButtonIniciarSesion.setText("Iniciar sesión");
        ventana_1.jButtonRegistrarAlumno.setText("Registrarse");
        ventana_1.jButtonRegistrarConsulta.setText("Solicitar Información");
        ventana_1.jButtonConfirmarPago.setText("Informar Pago");
        ventana_1.jButtonCancelarInscripcion.setText("Cancelar inscripcion");
        ventana_1.jButtonCancelar.setText("Cancelar");
        
    }
    
    public static void gestorJButtonRegistrarConsultaMousePressed(Aula25 ventanaAuxiliar){
        
        RegistrarConsulta miConsulta = new RegistrarConsulta(); 
        miConsulta.show();
        miConsulta.setTitle("Solicitud de Información de Curso");
        miConsulta.jLabelCurso.setText("Curso de Interés");
        miConsulta.jLabelNombre.setText("Nombre");
        miConsulta.jLabelApellido.setText("Apellido");
        miConsulta.jLabelDni.setText("DNI");
        miConsulta.jLabelEMail.setText("E-Mail");
        miConsulta.jLabelTelefono.setText("Telefono");
        
        miConsulta.jComboBoxCurso.addItem("Seleccionar curso");
        
        for(Curso cursoAuxiliar : Curso.getListaCurso()){
            
            miConsulta.jComboBoxCurso.addItem(cursoAuxiliar.getNombre());
            
        }
        
        miConsulta.jTextFieldNombre.setText("Ingresar nombre");
        miConsulta.jTextFieldApellido.setText("Ingresar apellido");
        miConsulta.jTextFieldDni.setText("Ingresar DNI");
        miConsulta.jTextFieldEmail.setText("Ingresar E-Mail");
        miConsulta.jTextFieldTelefono.setText("Ingresar teléfono");
        
        ventanaAuxiliar.dispose();
 
    }
    
    public static void gestorJButtonAceptarMousePressed(RegistrarConsulta ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
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
        //inscripcion_1.setCurso_1(cursoAuxiliar);
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
    
    public static void gestionarJButtonCancelarConsultaMousePressed(RegistrarConsulta ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
        GestorRegistrarConsulta.iniciarAplicacion();
    }
    
}
