package aula25v01;

import java.util.*;

public class GestorRegistrarInscripcion{
            
    public static void gestorJButtonRegistrarAlumnoMousePressed(){
        
       
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
    
    public static void gestorJButtonAceptarMousePressed(FInscripcionAlumnoExistente ventanaAuxiliar,int dniAlumnoAuxiliar)
    {
        
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar = pedirAlumnoALista(dniAlumnoAuxiliar);

        ventanaAuxiliar.jLabelDireccion.setText("Direccion");
        ventanaAuxiliar.jLabelFechaNac.setText("Fecha de Nacimiento");
        ventanaAuxiliar.jTextFieldDireccion.setVisible(true);
        ventanaAuxiliar.jTextFieldFechaNac.setVisible(true);
        ventanaAuxiliar.jButtonAceptar.setVisible(false);    
        
    if(alumnoAuxiliar==null)
    {
        
       ventanaAuxiliar.jLabelNombre.setText("Nombre");
       ventanaAuxiliar.jLabelApellido.setText("Apellido");
       ventanaAuxiliar.jLabelEmail.setText("E-Mail");
       ventanaAuxiliar.jLabelTelefono.setText("Telefono");
       ventanaAuxiliar.jTextFieldApellido.setVisible(true);
       ventanaAuxiliar.jTextFieldNombre.setVisible(true);
       ventanaAuxiliar.jTextFieldEmail.setVisible(true);
       ventanaAuxiliar.jTextFieldTelefono.setVisible(true);
       ventanaAuxiliar.jButtonAceptarAlumNoExistente.setVisible(true); 
    }
    else
    {
       ventanaAuxiliar.jButtonAceptarAlumExistente.setVisible(true); 
    }
    }
    
    public static void gestorJButtonAceptarAlumExistenteMousePressed(FInscripcionAlumnoExistente ventanaAuxiliar,int dniAlumnoAuxiliar,String domicilioAuxiliar,int fechaNacAuxiliar)
    {
        ventanaAuxiliar.hide();
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar = pedirAlumnoALista(dniAlumnoAuxiliar);
        
        alumnoAuxiliar.setDomicilio(domicilioAuxiliar);
        alumnoAuxiliar.setFechaNac(fechaNacAuxiliar);
        alumnoAuxiliar.setEstado(true);   
        alumnoAuxiliar.setProrroga(false);
        
        Inscripcion inscripcionAuxiliar = new Inscripcion();
        inscripcionAuxiliar = pedirInscripcionALista(alumnoAuxiliar);
        System.out.println(inscripcionAuxiliar.getFecha()); 
        
        inscripcionAuxiliar.setEstado(1);
        
    }
    
    public static void gestorJButtonAceptarAlumNoExistenteMousePressed(FInscripcionAlumnoExistente ventanaAuxiliar,int dniAuxiliar, int IdCursoAuxiliar, String nombreAuxiliar, String apellidoAuxiliar, String emailAuxiliar, int telefonoAuxiliar, String domicilioAuxiliar, int fechaNacAuxiliar)
    {
        Alumno alumno_1 = new Alumno();

        alumno_1.setDni(dniAuxiliar);
        alumno_1.setNombre(nombreAuxiliar);
        alumno_1.setApellido(apellidoAuxiliar);
        alumno_1.setEmail(emailAuxiliar);
        alumno_1.setTelefono(telefonoAuxiliar);
        alumno_1.setDomicilio(domicilioAuxiliar);
        alumno_1.setFechaNac(fechaNacAuxiliar);
        alumno_1.setEstado(true);   
        alumno_1.setProrroga(false);
        
        Alumno.addListaAlumno(alumno_1);
       
        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = pedirCursoALista(IdCursoAuxiliar);

        Date fecha = new Date();
        
        Inscripcion inscripcion_1 = new Inscripcion();
        inscripcion_1.setAlumno_1(alumno_1);
        inscripcion_1.setCurso_1(cursoAuxiliar);
        inscripcion_1.setEstado(1);
        inscripcion_1.setImporte(cursoAuxiliar.getCosto());
        inscripcion_1.setFecha(fecha);
        
        Inscripcion.addListaInscripcion(inscripcion_1);
        
        ventanaAuxiliar.hide();
 
    }
    
    private static Curso pedirCursoALista(int IdCursoAuxiliar){
        
        for(Curso cursoAuxiliar : Curso.getListaCurso()){
            
            if(cursoAuxiliar.getIdCurso() == IdCursoAuxiliar){
                
                return cursoAuxiliar;
                
            }
            
        }
        
        return null;
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
        
        ventanaAuxiliar.hide();
        
    }
    
}
