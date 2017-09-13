package aula25v01;

import java.util.*;

public class GestorRegistrarInscripcion{

    public GestorRegistrarInscripcion(){
    }
            
    public static void gestorJButtonRegistrarAlumnoMousePressed(Aula25 v1){
        
        v1.dispose();
        FInscripcionAlumnoExistente fInscripcionAlumno = new FInscripcionAlumnoExistente();
        fInscripcionAlumno.show();
        fInscripcionAlumno.jLabelTitulo.setText("Bienvenido! Rellenar los campos para poder registrarse.");
        
        fInscripcionAlumno.jLabelDni.setText("DNI");
        fInscripcionAlumno.jLabelCurso.setText("Curso");
        
        fInscripcionAlumno.jTextFieldApellido.setVisible(false);
        fInscripcionAlumno.jTextFieldNombre.setVisible(false);
        fInscripcionAlumno.jTextFieldDireccion.setVisible(false);
        fInscripcionAlumno.jTextFieldEmail.setVisible(false);
        fInscripcionAlumno.jTextFieldFechaNac.setVisible(false);
        fInscripcionAlumno.jTextFieldTelefono.setVisible(false);
        fInscripcionAlumno.jButtonAceptarAlumExistente.setVisible(false);
        fInscripcionAlumno.jButtonAceptarAlumNoExistente.setVisible(false);

        //System.out.println(Alumno.getListaAlumno().size());

    }
    
    public static void gestorJButtonAceptarMousePressed(FInscripcionAlumnoExistente ventanaAuxiliar,int dniAlumnoAuxiliar){
        
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar = pedirAlumnoALista(dniAlumnoAuxiliar);

        ventanaAuxiliar.jLabelDireccion.setText("Direccion");
        ventanaAuxiliar.jLabelFechaNac.setText("Fecha de Nacimiento");
        ventanaAuxiliar.jTextFieldDireccion.setVisible(true);
        ventanaAuxiliar.jTextFieldFechaNac.setVisible(true);
        ventanaAuxiliar.jButtonAceptar.setVisible(false);    
        
        if(alumnoAuxiliar==null){

           ventanaAuxiliar.jLabelNombre.setText("Nombre");
           ventanaAuxiliar.jLabelApellido.setText("Apellido");
           ventanaAuxiliar.jLabelEmail.setText("E-Mail");
           ventanaAuxiliar.jLabelTelefono.setText("Telefono");
           ventanaAuxiliar.jTextFieldApellido.setVisible(true);
           ventanaAuxiliar.jTextFieldNombre.setVisible(true);
           ventanaAuxiliar.jTextFieldEmail.setVisible(true);
           ventanaAuxiliar.jTextFieldTelefono.setVisible(true);
           ventanaAuxiliar.jButtonAceptarAlumNoExistente.setVisible(true); 

        }else{

           ventanaAuxiliar.jButtonAceptarAlumExistente.setVisible(true); 

        }
    }
    
    public static void gestorJButtonAceptarAlumExistenteMousePressed
        (FInscripcionAlumnoExistente ventanaAuxiliar,
         int dniAlumnoAuxiliar, String domicilioAuxiliar,
         int fechaNacAuxiliar){
            
        ventanaAuxiliar.dispose();
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar = pedirAlumnoALista(dniAlumnoAuxiliar);
        
        alumnoAuxiliar.setDomicilio(domicilioAuxiliar);
        alumnoAuxiliar.setFechaNac(fechaNacAuxiliar);
        alumnoAuxiliar.setEstado(true);   
        alumnoAuxiliar.setProrroga(false);
        
        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = Curso.getCursoPorId(ventanaAuxiliar.jComboBoxCurso.getSelectedIndex());
        
        Inscripcion inscripcionAuxiliar = new Inscripcion();
        inscripcionAuxiliar = pedirInscripcionALista(alumnoAuxiliar);
        
        //System.out.println(inscripcionAuxiliar.getFecha()); 
        
        inscripcionAuxiliar.setEstado(1);
        inscripcionAuxiliar.setCurso_1(cursoAuxiliar);
        
        Mensaje miMensaje = new Mensaje(Status.getEstadoInicial());
        miMensaje.jButtonAceptar.setText("Aceptar");
        miMensaje.show();
        miMensaje.jLabelLinea1.setText("Se registro el Alumno");
        miMensaje.jLabelLinea2.setText(alumnoAuxiliar.getNombre()+" "+alumnoAuxiliar.getApellido());
        miMensaje.jLabelLinea3.setText("al curso de "+cursoAuxiliar.getNombre());
    }
    
    public static void gestorJButtonAceptarAlumNoExistenteMousePressed
        (FInscripcionAlumnoExistente ventanaAuxiliar){
        
        /*(FInscripcionAlumnoExistente ventanaAuxiliar,
         int dniAuxiliar, int IdCursoAuxiliar, 
         String nombreAuxiliar, String apellidoAuxiliar, 
         String emailAuxiliar, int telefonoAuxiliar, 
         String domicilioAuxiliar, int fechaNacAuxiliar){
        
        Alumno alumno_1 = new Alumno();

        alumno_1.setDni(dniAuxiliar);
        alumno_1.setNombre(nombreAuxiliar);
        alumno_1.setApellido(apellidoAuxiliar);
        alumno_1.setEmail(emailAuxiliar);
        alumno_1.setTelefono(telefonoAuxiliar);
        alumno_1.setDomicilio(domicilioAuxiliar);
        alumno_1.setFechaNac(fechaNacAuxiliar);
        alumno_1.setEstado(true);   
        alumno_1.setProrroga(false);*/
        
        Alumno alumnoAuxiliar = new Alumno();
        
        alumnoAuxiliar.setDni(Integer.valueOf(ventanaAuxiliar.jTextFieldDni.getText()));
        alumnoAuxiliar.setNombre(ventanaAuxiliar.jTextFieldNombre.getText());
        alumnoAuxiliar.setApellido(ventanaAuxiliar.jTextFieldApellido.getText());
        alumnoAuxiliar.setEmail(ventanaAuxiliar.jTextFieldEmail.getText());
        alumnoAuxiliar.setTelefono(Integer.valueOf(ventanaAuxiliar.jTextFieldTelefono.getText()));
        alumnoAuxiliar.setDomicilio(ventanaAuxiliar.jTextFieldDireccion.getText());
        alumnoAuxiliar.setFechaNac(Integer.valueOf(ventanaAuxiliar.jTextFieldFechaNac.getText()));
        alumnoAuxiliar.setEstado(true);
        alumnoAuxiliar.setProrroga(false);
        
        
        Alumno.addListaAlumno(alumnoAuxiliar);
       
        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = Curso.getCursoPorId(ventanaAuxiliar.jComboBoxCurso.getSelectedIndex());
        
        Inscripcion inscripcion_1 = new Inscripcion();
        inscripcion_1.setAlumno_1(alumnoAuxiliar);
        inscripcion_1.setCurso_1(cursoAuxiliar);
        inscripcion_1.setEstado(1);
        inscripcion_1.setImporte(cursoAuxiliar.getCosto());
        inscripcion_1.setFecha(new Date());
        
        Inscripcion.addListaInscripcion(inscripcion_1);
        
        ventanaAuxiliar.dispose();
        
        Mensaje miMensaje = new Mensaje(Status.getEstadoInicial());
        miMensaje.jButtonAceptar.setText("Aceptar");
        miMensaje.show();
        miMensaje.jLabelLinea1.setText("Se registro el Alumno");
        miMensaje.jLabelLinea2.setText(alumnoAuxiliar.getNombre()+" "+alumnoAuxiliar.getApellido());
        miMensaje.jLabelLinea3.setText("al curso de "+cursoAuxiliar.getNombre());
        }
    
    private static Alumno pedirAlumnoALista(int dniAlumnoAuxiliar){
        
        for(Alumno alumnoAuxiliar : Alumno.getListaAlumno()){
            
            if(alumnoAuxiliar.getDni()== dniAlumnoAuxiliar){
                
                return alumnoAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    private static Inscripcion pedirInscripcionALista(Alumno AlumnoAuxiliar){
        
        for(Inscripcion inscripcionAuxiliar : Inscripcion.getListaInscripcion()){
            
            if(inscripcionAuxiliar.getAlumno_1()== AlumnoAuxiliar){
                
                return inscripcionAuxiliar;
                
            }
            
        }
        
        return null;  
    }
    
    public static void gestionarJButtonCancelarMousePressed(FInscripcionAlumnoExistente ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
        GestorRegistrarConsulta.iniciarAplicacion();
    }
    
}
