/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula25v01;

/**
 *
 * @author Gabriel
 */
public class GestorRegistrarConsulta {
    
   
    public static void IniciarAplicacion(){
        
        Aula25 ventana_1 = new Aula25();
        ventana_1.show(); 
    
    }
    
    public static void gestionarRegistrarConsulta(){
        
        RegistrarConsulta ventana_2 = new RegistrarConsulta(); 
        ventana_2.show();
 
    }
    
     public static void gestionarRegistrarConsulta2(String nombre,String apellido,String email,int telefono,int idCurso){
    
        //NuevoAlumno
        Alumno alumno_1 = new Alumno();
        alumno_1.setNombre(nombre);
        alumno_1.setApellido(apellido);
        alumno_1.setEmail(email);
        alumno_1.setTelefono(telefono); 

        Curso curso_n = new Curso();
        for(int i = 0 ; i < Curso.cursos.size();i++) {
            if(Curso.cursos.get(i).getIdCurso() == idCurso) 
            {
            curso_n = Curso.cursos.get(i);
            }
        }

        MostrarInformacion ventana_3 = new MostrarInformacion();
        ventana_3.establecerTextoJTextArea(curso_n.solicitarInformacion());
        ventana_3.show();
            
    }
    
}
