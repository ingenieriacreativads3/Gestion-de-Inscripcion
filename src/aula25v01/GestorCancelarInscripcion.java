/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula25v01;

import java.util.*;

/**
 *
 * @author Gabriel
 */
public class GestorCancelarInscripcion 
{
    public static void gestionarJButtonCancelarInscripcionMousePressed(Aula25 v1){
       
        v1.dispose();
        FCancelarInscripcion miFCancelarInscripcion = new FCancelarInscripcion();
        miFCancelarInscripcion.show();
        miFCancelarInscripcion.jLabelDni.setText("DNI");
        miFCancelarInscripcion.jLabelCurso.setText("Cursos");
        miFCancelarInscripcion.jLabelPassword.setText("Contraseña");
        miFCancelarInscripcion.jButtonAceptar.setText("Aceptar");
        miFCancelarInscripcion.jButtonCancelar.setText("Cancelar");
        
        
        
        
    }
    
    private static Alumno pedirAlumnoALista(int dniAlumnoAuxiliar){
        
        for(Alumno alumnoAuxiliar : Alumno.getListaAlumno()){
            
            if(alumnoAuxiliar.getDni()== dniAlumnoAuxiliar){
                
                return alumnoAuxiliar;
                
            }
            
        }
        
        return null;
        
    }
    
    public static void gestionarJButtonAceptarMousePressed(FCancelarInscripcion ventanaAuxiliar){
        
        
        Alumno alumnoAuxiliar = new Alumno();
        alumnoAuxiliar = pedirAlumnoALista(Integer.valueOf(ventanaAuxiliar.jTextFieldDni.getText()));
        
        
        if(alumnoAuxiliar!=null)
        {
            
        Curso cursoAuxiliar = new Curso();
        cursoAuxiliar = Curso.getCursoPorId(ventanaAuxiliar.jComboBoxCurso.getSelectedIndex());
        
        Set<Inscripcion> listaInscripcion = new HashSet<>();
        listaInscripcion = Inscripcion.getListaInscripcion();
        
        for(Inscripcion ins : listaInscripcion){
            if(ins.getAlumno_1()==alumnoAuxiliar){              
                if(ins.getCurso_1()==cursoAuxiliar){
                  
                    if(ins.getEstado()!=3)
                    {
                       ins.setEstado(3);
                    ventanaAuxiliar.dispose();
                    //System.out.println(ins.getEstado());
                    Mensaje miMensaje = new Mensaje();
                    miMensaje.jButtonAceptar.setText("Aceptar");
                    miMensaje.show();
                    miMensaje.jLabelLinea1.setText("El estado de la inscripcion paso a ser cancelado"); 
                    }
                    else
                    {
                    ventanaAuxiliar.dispose();
                    Mensaje miMensaje = new Mensaje();
                    miMensaje.jButtonAceptar.setText("Aceptar");
                    miMensaje.show();
                    miMensaje.jLabelLinea1.setText("La inscripcion ya fue cancelada");
                    }     
                }
                else
                {
                //Si te equivocas de curso
                  ventanaAuxiliar.dispose();
                  Mensaje miMensaje = new Mensaje();
                  miMensaje.jButtonAceptar.setText("Aceptar");
                  miMensaje.show();
                  miMensaje.jLabelLinea1.setText("El alumno no esta inscripto al curso seleccionado");               
                }             
            }
            else
            {
            }  
        }
        }
        else
        {
            ventanaAuxiliar.dispose();
            Mensaje miMensaje = new Mensaje();
            miMensaje.show();
            miMensaje.jButtonAceptar.setText("Aceptar");
            miMensaje.jLabelLinea1.setText("El alumno no existe");

        }
    }
    
     public static void gestionarJButtonCancelarMousePressed(FCancelarInscripcion ventanaAuxiliar){
        
        ventanaAuxiliar.dispose();
        GestorRegistrarConsulta.iniciarAplicacion();
        
    }
}
