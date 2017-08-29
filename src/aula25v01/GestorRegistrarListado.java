package aula25v01;

import java.util.*;

public class GestorRegistrarListado{
    
    private static String nombreAdmin = "admin";
    private static int passAdmin = 445689;

    public GestorRegistrarListado(){
    }
    
    public static void gestorJButtonIniciarSesionMousePressed(Aula25 v1){
        
        v1.dispose();
        FIniciarSecion miIniciarSecion = new FIniciarSecion();
        miIniciarSecion.show();
        miIniciarSecion.jLabelTitulo.setText("Iniciar sesión");
        miIniciarSecion.jLabelAlumno.setText("Alumno");
        miIniciarSecion.jLabelConstraseña.setText("Contraseña");
        miIniciarSecion.jButtonAceptar.setText("Aceptar");
        miIniciarSecion.jButtonCancelar.setText("Cancelar");
        miIniciarSecion.setTitle("Inciar sesión");
        
    }
    
    public static void gestorJButtonCancelarMousePressed(FIniciarSecion v1){
        
        GestorRegistrarConsulta.iniciarAplicacion();
        v1.dispose();
        
    }
    
    public static void gestorJButtonAceptarMousePressed(FIniciarSecion v1){
        
        String nombreAuxiliar = v1.jLabelAlumno.getText();
        int passAuxiliar = Integer.valueOf(v1.jLabelConstraseña.getText());
        String morosos = "asd";
        
        if(nombreAuxiliar == nombreAdmin){
            
            if(passAuxiliar == passAdmin){
                
                MostrarInformacion miMostrar = new MostrarInformacion();
                miMostrar.show();
                miMostrar.setTitle("Listado de Morosos");
                miMostrar.jButtonAceptar.setText("Aceptar");
                miMostrar.establecerTextoJTextArea(morosos);
                v1.dispose();
                
            }else{
                
                Mensaje miMensaje = new Mensaje();
                miMensaje.show();
                miMensaje.setTitle("Contraseña incorrecta");
                miMensaje.jButtonAceptar.setText("Aceptar");
                miMensaje.jLabelLinea1.setText("La contreseña ingresada es incorrecta.");
                
            }
            
        }else{
            
            Mensaje miMensaje = new Mensaje();
            miMensaje.show();
            miMensaje.setTitle("Usuario no existente");
            miMensaje.jButtonAceptar.setText("Aceptar");
            miMensaje.jLabelLinea1.setText("El nombre ingresado no existe.");
            miMensaje.jLabelLinea2.setText("Ingresar un usuario habilitado.");
            
        }
        
    }
    
}
