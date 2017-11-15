package aula25v01;

import java.util.*;

public class GestorSetCurso{

    public GestorSetCurso(){
    }
    
    public static void gestorJButtonSetCursoMousePressed(){
        
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
        
        formularioActual.jButtonAceptar.setText("Aceptar");
        formularioActual.jButtonCancelar.setText("Cancelar");
        
        for(Docente empleado : Docente.getListaDocente()){
            
            formularioActual.jComboBoxDocente.addItem(empleado.toString());
            
        }
        
        formularioActual.show();
        
    }
    
    public static boolean asd(){
        
        return true;
        
    }
    
    public static void gestorJButtonCancelarMousePressed(FSetCurso formulario){
        
        formulario.dispose();
        GestorRegistrarConsulta.iniciarAplicacion();
        
    }
    
    
}
    

