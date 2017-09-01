package aula25v01;

import java.awt.event.*;
import java.util.*;

public class GestorRegistrarListado{
    
    private static String nombreAdmin = " ";
    private static String passAdmin = " ";

    public GestorRegistrarListado(){
    }
    
    public static void gestorJButtonIniciarSesionMousePressed(Aula25 v1){
        
        v1.dispose();
        FIniciarSecion miIniciarSecion = new FIniciarSecion();
        miIniciarSecion.show();
        miIniciarSecion.jLabelTitulo.setText("Iniciar sesión");
        miIniciarSecion.jLabelAlumno.setText("Alumno");
        miIniciarSecion.jLabelPass.setText("Contraseña");
        miIniciarSecion.jButtonAceptar.setText("Aceptar");
        miIniciarSecion.jButtonCancelar.setText("Cancelar");
        miIniciarSecion.setTitle("Inciar sesión");
        miIniciarSecion.jTextFieldAlumno.setText("Usuario");
        miIniciarSecion.jTextFieldPass.setText("Password");
        miIniciarSecion.jTextFieldAlumno.selectAll();
        
    }
    
    public static void gestorJButtonCancelarMousePressed(FIniciarSecion v1){
        
        GestorRegistrarConsulta.iniciarAplicacion();
        v1.dispose();
        
    }
    
    public static void gestorJButtonAceptarMousePressed(FIniciarSecion v1){
        
        String nombreAuxiliar = v1.jLabelAlumno.getText();
        String passAuxiliar = v1.jTextFieldPass.getText();
        String morosos = "asd";
        
        MostrarInformacion miMostrar = new MostrarInformacion();
        miMostrar.show();
        miMostrar.setTitle("Listado de Morosos");
        miMostrar.jButtonAceptar.setText("Aceptar");
        miMostrar.establecerTextoJTextArea(morosos);
        v1.dispose();
        
        /*
        if(nombreAuxiliar == nombreAdmin){
            
            if(passAuxiliar == passAdmin){
                
                MostrarInformacion miMostrar = new MostrarInformacion();
                miMostrar.show();
                //miMostrar.setTitle("Listado de Morosos");
                //miMostrar.jButtonAceptar.setText("Aceptar");
                miMostrar.establecerTextoJTextArea(morosos);
                v1.dispose();
                
            }else{
                
                Mensaje miMensaje = new Mensaje();
                miMensaje.show();
                miMensaje.setTitle("Contraseña incorrecta");
                miMensaje.jButtonAceptar.setText("Aceptar");
                miMensaje.jLabelLinea1.setText("La contreseña ingresada es incorrecta.");
                v1.dispose();
                
            }
            
        }else{
            
            Mensaje miMensaje = new Mensaje();
            miMensaje.show();
            miMensaje.setTitle("Usuario no existente");
            miMensaje.jButtonAceptar.setText("Aceptar");
            miMensaje.jLabelLinea1.setText("El nombre ingresado no existe.");
            miMensaje.jLabelLinea2.setText("Ingresar un usuario habilitado.");
            v1.dispose();
            
        }*/
        
    }
    
    
    
}
