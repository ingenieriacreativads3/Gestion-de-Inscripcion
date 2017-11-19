package aula25v01;

import java.util.*;

public class GestorSetCurso{

    public GestorSetCurso(){
    }
    
    public static boolean gestorJButtonSetCursoMousePressed(){
        
        FSetCurso formularioActual = new FSetCurso();
        formularioActual.setTitle("Agregar nuevo curso");
        formularioActual.jLabelTitulo.setText("Agregar nuevo curso");
        formularioActual.jLabelNombre.setText("Nombre");
        formularioActual.jLabelCosto.setText("Costo");
        formularioActual.jLabelCupoMinimo.setText("Cupo minimo");
        formularioActual.jLabelCupoMaximo.setText("Cupo maximo");
        formularioActual.jLabelDocente.setText("Docente");
        formularioActual.jLabelFechaInicio.setText("Dia de inicio");
        formularioActual.jDateChooserFechaInicio.setDate(new Date());
        formularioActual.jLabelDescripcion.setText("Descripción");
        
        formularioActual.jButtonAceptar.setText("Aceptar");
        formularioActual.jButtonCancelar.setText("Cancelar");
        
        for(Docente empleado : Docente.getListaDocente()){
            
            formularioActual.jComboBoxDocente.addItem(empleado.toString());
            
        }
        
        formularioActual.show();
        
        return true;
        
    }
    
    public static boolean gestorJButtonCancelarMousePressed(FSetCurso formulario){
        
        formulario.dispose();
        GestorRegistrarConsulta.iniciarAplicacion();
        
        return true;
        
    }
    
    public static boolean gestorJButtonAceptarMousePressed(FSetCurso formulario){
        
        boolean estadoADevolver = false;
        
        if(formulario != null){
            
            //Obtener datos, y buscar los objetos seleccionados
            //a partir de los datos ingresados
            String nombre = formulario.jTextFieldNombre.getText();
            double costo = Double.valueOf(formulario.jTextFieldCosto.getText());
            int cupoMaximo = Integer.valueOf(formulario.jTextFieldCupoMaximo.getText());
            int cupoMinimo = Integer.valueOf(formulario.jTextFieldCupoMinimo.getText());
            String descripcion = formulario.jTextAreaDescripcion.getText();
            Date fechaInicio = formulario.jDateChooserFechaInicio.getDate();
            
            int docenteSeleccionado = formulario.jComboBoxDocente.getSelectedIndex();
            
            Docente docenteDelCurso = null;
            try{
                
                for(Docente docenteActual : Docente.getListaDocente()){
                    
                    if(docenteActual.getId() == docenteSeleccionado){
                        
                        docenteDelCurso = docenteActual;
                        estadoADevolver = true;
                        
                    }else{
                        
                        //...si la asigancion se realiza en la iteracion n,
                        //...en la iteracion n+1, pasa por este camino,
                        //...por esto, no puedo colocar una asiganacion
                        //...de estado de error, en este camino
                        
                    }
                    
                }
                
                
            }catch(Exception e){
                
                //...el estado fue inicializado con un valor por defecto.
                        
            }
            
            //Obtener un curso nuevo y asignarle los datos requeridos
            Curso nuevoCurso = new Curso();
            nuevoCurso.setNombre(nombre);
            nuevoCurso.setCosto(costo);
            nuevoCurso.setCupoMin(cupoMinimo);
            nuevoCurso.setCupoMax(cupoMaximo);
            nuevoCurso.setDocente_1(docenteDelCurso);
            nuevoCurso.setDiaInicio(fechaInicio);
            nuevoCurso.setDescripcion(descripcion);
            
        }else{
            
            //...la variable fue inicializada con un valor por defecto
            
        }
        
        formulario.dispose();
        
        GestorRegistrarConsulta.iniciarAplicacion();
        
        return estadoADevolver;
        
    }
    
    public static boolean gestorJButtonAceptarMousePressed(){
        
        return true;
        
    }
    
}
    

