package aula25v01;

public class GestorConfirmarInscripcion{

    public GestorConfirmarInscripcion(){
    }
    
    public static void gestionarJButtonConfirmarPagoMousePressed(Aula25 v1){
        
        FConfirmarInscripcion miFConfirmar = new FConfirmarInscripcion();
        miFConfirmar.show();
        miFConfirmar.setTitle("Confirmacion de Pago");
        miFConfirmar.jLabelTitulo.setText("Informe de pago.");
        miFConfirmar.jLabelLinea1.setText("En 24 horas se habiliará la plataforma.");
        miFConfirmar.jButtonAceptar.setText("Aceptar");
        miFConfirmar.jButtonCancelar.setText("Cancelar");
        miFConfirmar.jLabelDni.setText("Usuario");
        miFConfirmar.jLabelPass.setText("Contraseña");
        miFConfirmar.jLabelCodigoConfirmacion.setText("Código confirmacion");
        miFConfirmar.jTextFieldDni.setText("Ingresar usuario");
        miFConfirmar.jPasswordFieldPass.setText("Ingresar contraseña");
        miFConfirmar.jTextFieldCodigoConfirmacion.setText("Ingresar código");
        v1.dispose();
        
    }
    
    public static void gestionarJButtonCancelarMousePressed(FConfirmarInscripcion v1){
        
        GestorRegistrarConsulta.iniciarAplicacion();
        v1.dispose();
        
    }
    
    public static void gestionarJButtonAceptar(FConfirmarInscripcion v1){
        
        String pass = String.valueOf(v1.jPasswordFieldPass.getPassword());
        int dniAuxi = Integer.valueOf(v1.jTextFieldDni.getText());
        int codigoAuxi = Integer.valueOf(v1.jTextFieldCodigoConfirmacion.getText());
        
        Mensaje miMensaje = new Mensaje();
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
