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
            
            //TODO hacer esto
            
            int cantidadCursosAntes = Curso.getListaCurso().size();
            
            //Obtener datos, y buscar los objetos seleccionados
            //a partir de los datos ingresados
            String nombre = formulario.jTextFieldNombre.getText();
            double costo = Double.valueOf(formulario.jTextFieldCosto.getText());
            int cupoMaximo = Integer.valueOf(formulario.jTextFieldCupoMaximo.getText());
            int cupoMinimo = Integer.valueOf(formulario.jTextFieldCupoMinimo.getText());
            String descripcion = formulario.jTextAreaDescripcion.getText();
            Date fecha = formulario.jDateChooserFechaInicio.getDate();
            
            String nombreDocente = formulario.jComboBoxDocente.getItemAt(
                    formulario.jComboBoxDocente.getSelectedIndex());
            
            System.out.println(nombreDocente);
            
            Docente docenteDelCurso = null;
            for(Docente docenteActual : Docente.getListaDocente()){
                
                System.out.println(docenteActual.toString());
                
                if(docenteActual.toString() == nombreDocente){
                    
                    System.out.println("los nombres son iguales");
                    docenteDelCurso = docenteActual;
                    
                }
                
            }
            
            System.out.println(formulario.jComboBoxDocente.getSelectedIndex());
            
            
            System.out.println(Docente.getDocentePorId(formulario.jComboBoxDocente.getSelectedIndex()).getNombre());
            
            System.out.println(formulario.jComboBoxDocente.getItemAt(formulario.jComboBoxDocente.getSelectedIndex()));
            //System.out.println(docenteDelCurso.getNombre());
            
            //Obtener un curso nuevo y asignarle los datos requeridos
            
            //Llevar la cuenta de la cnatidad de cursos
            
            //Verificar el proceso se realizo con exito
            
        }else{
            
            //...la variable fue inicializada con un valor por defecto
            
        }
        
        formulario.dispose();
        
        GestorRegistrarConsulta.iniciarAplicacion();
        
        return estadoADevolver;
        
    }
    
    
}
    

