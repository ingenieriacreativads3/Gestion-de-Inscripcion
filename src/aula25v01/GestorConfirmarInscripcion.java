package aula25v01;

public class GestorConfirmarInscripcion{

    public GestorConfirmarInscripcion(){
    }
    
    public static void gestionarJButtonConfirmarPago(Aula25 v1){
        
        FConfirmarInscripcion miFConfirmar = new FConfirmarInscripcion();
        miFConfirmar.show();
        miFConfirmar.jLabelTitulo.setText("Resgistraremos tu confirmación de pago.");
        miFConfirmar.jLabelLinea1.setText("En 24 horas habilitaremos tu plataforma.");
        miFConfirmar.jLabelAlumno.setText("Alumno");
        miFConfirmar.jLabelPass.setText("Contraseña");
        miFConfirmar.jLabelCodigoConfirmacion.setText("Codigo de confirmación");
        miFConfirmar.jTextFieldAlumno.setText("Ingresa tu usuario");
        miFConfirmar.jTextFieldCodigoConfirmacion.setText("Ingresa tu codigo");
        miFConfirmar.jButtonAceptar.setText("Aceptar");
        miFConfirmar.jButtonCancelar.setText("Cancelar");
        
        v1.dispose();
        
    }
    
    public static void gestionarJButtonCancelarMousePressed(FConfirmarInscripcion v1){
        
        GestorRegistrarConsulta.iniciarAplicacion();
        v1.dispose();
        
    }
    
    public static void gestionarJButtonAceptar(FConfirmarInscripcion v1){
        
        String pass = String.valueOf(v1.jPasswordFieldPass.getPassword());
        int usuarioAuxi = Integer.valueOf(v1.jTextFieldAlumno.getText());
        int codigoAuxi = Integer.valueOf(v1.jTextFieldCodigoConfirmacion.getText());
        
        Mensaje miMensaje = new Mensaje(Status.getEstadoInicial());
        miMensaje.show();
        miMensaje.setTitle("Informe de Pago Recibido");
        miMensaje.jButtonAceptar.setText("Aceptar");
        miMensaje.jLabelLinea1.setText("Recibimos tu informe de pago.");
        miMensaje.jLabelLinea2.setText("En las próximas 24 hs habilitaremos");
        miMensaje.jLabelLinea3.setText("el ingreso a tu plataforma.");
        miMensaje.jLabelLinea4.setText("Recibiras la información en tu correo.");
        
        v1.dispose();
        
    }
    
}
