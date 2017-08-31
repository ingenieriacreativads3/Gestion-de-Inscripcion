package aula25v01;

import java.util.*;
import java.awt.event.*;


public class Aula25 extends javax.swing.JFrame {

    public Aula25() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonRegistrarAlumno = new javax.swing.JButton();
        jButtonRegistrarConsulta = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConfirmarPago = new javax.swing.JButton();
        jButtonCancelarInscripcion = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonIniciarSesion.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMousePressed(evt);
            }
        });
        jButtonIniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIniciarSesionKeyPressed(evt);
            }
        });

        jButtonRegistrarAlumno.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonRegistrarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegistrarAlumnoMousePressed(evt);
            }
        });
        jButtonRegistrarAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistrarAlumnoKeyPressed(evt);
            }
        });

        jButtonRegistrarConsulta.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonRegistrarConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegistrarConsultaMousePressed(evt);
            }
        });
        jButtonRegistrarConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistrarConsultaKeyPressed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });
        jButtonCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarKeyPressed(evt);
            }
        });

        jButtonConfirmarPago.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonConfirmarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonConfirmarPagoMousePressed(evt);
            }
        });

        jButtonCancelarInscripcion.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonCancelarInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarInscripcionMousePressed(evt);
            }
        });
        jButtonCancelarInscripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonCancelarInscripcionKeyPressed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 3, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonConfirmarPago, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jButtonRegistrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jButtonRegistrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jButtonCancelarInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonConfirmarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelarInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarConsultaMousePressed
        
        GestorRegistrarConsulta.gestorJButtonRegistrarConsultaMousePressed(this);
        
    }//GEN-LAST:event_jButtonRegistrarConsultaMousePressed

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        
        GestorRegistrarConsulta.gestionarJButtonCancelarMousePressed(this);
        
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonRegistrarAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarAlumnoMousePressed
        
        GestorRegistrarInscripcion.gestorJButtonRegistrarAlumnoMousePressed(this);
        
    }//GEN-LAST:event_jButtonRegistrarAlumnoMousePressed

    private void jButtonIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMousePressed
        
        GestorRegistrarListado.gestorJButtonIniciarSesionMousePressed(this);
        
    }//GEN-LAST:event_jButtonIniciarSesionMousePressed

    private void jButtonRegistrarConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistrarConsultaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorRegistrarConsulta.gestorJButtonRegistrarConsultaMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonRegistrarConsultaKeyPressed

    private void jButtonRegistrarAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistrarAlumnoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorRegistrarInscripcion.gestorJButtonRegistrarAlumnoMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonRegistrarAlumnoKeyPressed

    private void jButtonIniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorRegistrarListado.gestorJButtonIniciarSesionMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonIniciarSesionKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            this.dispose();
            
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jButtonConfirmarPagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirmarPagoMousePressed
        
        GestorConfirmarInscripcion.gestionarJButtonConfirmarPagoMousePressed(this);
        
    }//GEN-LAST:event_jButtonConfirmarPagoMousePressed

    private void jButtonCancelarInscripcionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarInscripcionMousePressed
        GestorCancelarInscripcion.gestionarJButtonCancelarInscripcionMousePressed(this);
    }//GEN-LAST:event_jButtonCancelarInscripcionMousePressed

    private void jButtonCancelarInscripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarInscripcionKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorCancelarInscripcion.gestionarJButtonCancelarInscripcionMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonCancelarInscripcionKeyPressed

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
            java.util.logging.Logger.getLogger(Aula25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aula25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aula25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aula25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Aula25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonCancelarInscripcion;
    public javax.swing.JButton jButtonConfirmarPago;
    public javax.swing.JButton jButtonIniciarSesion;
    public javax.swing.JButton jButtonRegistrarAlumno;
    public javax.swing.JButton jButtonRegistrarConsulta;
    public javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
