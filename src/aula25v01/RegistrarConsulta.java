package aula25v01;

import java.util.*;
import java.awt.event.*;

public class RegistrarConsulta extends javax.swing.JFrame {

    public RegistrarConsulta() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCurso = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelEMail = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jComboBoxCurso = new javax.swing.JComboBox<>();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNombre.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusGained(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyPressed(evt);
            }
        });

        jTextFieldApellido.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldApellidoFocusGained(evt);
            }
        });
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyPressed(evt);
            }
        });

        jTextFieldDni.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDniFocusGained(evt);
            }
        });
        jTextFieldDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDniKeyPressed(evt);
            }
        });

        jTextFieldEmail.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldEmailFocusGained(evt);
            }
        });
        jTextFieldEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldEmailKeyPressed(evt);
            }
        });

        jTextFieldTelefono.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldTelefonoFocusGained(evt);
            }
        });
        jTextFieldTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTelefonoKeyPressed(evt);
            }
        });

        jLabelCurso.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelNombre.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelApellido.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelDni.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelEMail.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelTelefono.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jComboBoxCurso.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jComboBoxCurso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxCursoKeyPressed(evt);
            }
        });

        jButtonAceptar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAceptarMousePressed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxCurso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMousePressed
        
        GestorRegistrarConsulta.gestorJButtonAceptarMousePressed(this);
        
    }//GEN-LAST:event_jButtonAceptarMousePressed

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        
        GestorRegistrarConsulta.gestionarJButtonCancelarConsultaMousePressed(this);
        
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jTextFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusGained
        
        jTextFieldNombre.selectAll();
        
    }//GEN-LAST:event_jTextFieldNombreFocusGained

    private void jTextFieldApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldApellidoFocusGained
        
        jTextFieldApellido.selectAll();
        
    }//GEN-LAST:event_jTextFieldApellidoFocusGained

    private void jTextFieldDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDniFocusGained
        
        jTextFieldDni.selectAll();
        
    }//GEN-LAST:event_jTextFieldDniFocusGained

    private void jTextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEmailFocusGained
        
        jTextFieldEmail.selectAll();
        
    }//GEN-LAST:event_jTextFieldEmailFocusGained

    private void jTextFieldTelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoFocusGained
        
        jTextFieldTelefono.selectAll();
        
    }//GEN-LAST:event_jTextFieldTelefonoFocusGained

    private void jTextFieldNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldApellido.requestFocus();
            
        }
        
        if((evt.getKeyCode() <= KeyEvent.VK_A) && (evt.getKeyCode() >= KeyEvent.VK_Z)){
            
            Mensaje miMensaje = new Mensaje(Status.getEstadoError001());
            miMensaje.setTitle("Error de ingreso");
            miMensaje.jButtonAceptar.setText("Aceptar");
            miMensaje.jLabelLinea1.setText("El carácter ingresado no es válido.");
            miMensaje.jLabelLinea2.setText("Por favor, intentarlo otra vez.");
            
        }
    }//GEN-LAST:event_jTextFieldNombreKeyPressed

    private void jTextFieldApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldDni.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldApellidoKeyPressed

    private void jTextFieldDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDniKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldEmail.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldDniKeyPressed

    private void jTextFieldEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEmailKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldTelefono.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldEmailKeyPressed

    private void jTextFieldTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jButtonAceptar.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldTelefonoKeyPressed

    private void jComboBoxCursoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxCursoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldNombre.requestFocus();
            
        }
    }//GEN-LAST:event_jComboBoxCursoKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAceptar;
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JComboBox<String> jComboBoxCurso;
    public javax.swing.JLabel jLabelApellido;
    public javax.swing.JLabel jLabelCurso;
    public javax.swing.JLabel jLabelDni;
    public javax.swing.JLabel jLabelEMail;
    public javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JTextField jTextFieldApellido;
    public javax.swing.JTextField jTextFieldDni;
    public javax.swing.JTextField jTextFieldEmail;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
