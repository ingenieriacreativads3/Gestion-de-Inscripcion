package aula25v01;

public class GestorRegistrarConsulta {
    
    public static void iniciarAplicacion(){
        
        Aula25 ventana_1 = new Aula25();
        ventana_1.show();
        ventana_1.jLabelAula25.setText("Aula 25");
        ventana_1.jButtonIniciarSesion.setText("Iniciar sesión");
        ventana_1.jButtonRegistrarAlumno.setText("Registrarse");
        ventana_1.jButtonRegistrarConsulta.setText("Solicitar Información");
    
    }
    
    public static void gestionarRegistrarConsulta(){
        
        RegistrarConsulta ventana_2 = new RegistrarConsulta(); 
        ventana_2.show();
        //Aca va el codigo que hace todo. Inizializa el alumno lo pone
        //En la lista estática.
        //Tmb desde aca se inizializa la pantalla que muestra la informacion.
        //Aca se pide la informacion del docente vinculado al curso.
        //y se muestra.
 
    }
    
     public static void gestionarRegistrarConsulta2
        (String nombre,String apellido,String email,int telefono,int idCurso){
    
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
