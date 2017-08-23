package aula25v01;

import java.util.*;

public class GestorRegistrarInscripcion{
    
    public static void gestorJButtonRegistrarAlumnoMousePressed(){
        
        FInscripcionAlumnoExistente fInscripcionAlumno = new FInscripcionAlumnoExistente();
        fInscripcionAlumno.show();
        fInscripcionAlumno.jLabelTitulo.setText("Bienvenido! Rellenar los campos para poder registrarse.");
        
        fInscripcionAlumno.jButtonAceptar.setText("Aceptar");
        fInscripcionAlumno.jButtonCancelar.setText("Cancelar");
        fInscripcionAlumno.jLabelDni.setText("DNI");
        fInscripcionAlumno.jLabelNombre.setText("Nombre");
        fInscripcionAlumno.jLabelApellido.setText("Apellido");
        fInscripcionAlumno.jLabelEmail.setText("E-Mail");
        fInscripcionAlumno.jLabelCurso.setText("Curso");
        fInscripcionAlumno.jLabelTelefono.setText("Telefono");
        fInscripcionAlumno.jLabelDireccion.setText("Direccion");
        fInscripcionAlumno.jLabelFechaNac.setText("Fecha de Nacimiento");
        
        System.out.println(Alumno.getListaAlumno().size());
        
    }
    
}
