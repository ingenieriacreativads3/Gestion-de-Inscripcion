package aula25v01;

import java.util.*;
import java.awt.event.*;

public class FIniciarSecion extends javax.swing.JFrame{

    public FIniciarSecion(){
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAlumno = new javax.swing.JLabel();
        jLabelConstraseña = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jTextFieldAlumno = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAlumno.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelConstraseña.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

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

        jButtonAceptar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAceptarMousePressed(evt);
            }
        });
        jButtonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyPressed(evt);
            }
        });

        jTextFieldAlumno.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldAlumnoMousePressed(evt);
            }
        });
        jTextFieldAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldAlumnoKeyPressed(evt);
            }
        });

        jTextFieldContraseña.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldContraseñaFocusGained(evt);
            }
        });
        jTextFieldContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldContraseñaMousePressed(evt);
            }
        });
        jTextFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaKeyPressed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConstraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConstraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        
        GestorRegistrarListado.gestorJButtonCancelarMousePressed(this);
        
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonAceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMousePressed
        
        GestorRegistrarListado.gestorJButtonAceptarMousePressed(this);
        
    }//GEN-LAST:event_jButtonAceptarMousePressed

    private void jTextFieldAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAlumnoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            
            jTextFieldContraseña.requestFocus();
            jTextFieldContraseña.selectAll();
            
        } 
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldContraseña.requestFocus();
            jTextFieldContraseña.selectAll();
            
        }      
    }//GEN-LAST:event_jTextFieldAlumnoKeyPressed

    private void jTextFieldContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jButtonAceptar.requestFocus();
            
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            
            jButtonAceptar.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldContraseñaKeyPressed

    private void jButtonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorRegistrarListado.gestorJButtonAceptarMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonAceptarKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorRegistrarListado.gestorJButtonCancelarMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jTextFieldAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAlumnoMousePressed
        
        jTextFieldAlumno.selectAll();
        
    }//GEN-LAST:event_jTextFieldAlumnoMousePressed

    private void jTextFieldContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaMousePressed
        
        jTextFieldContraseña.selectAll();
        
    }//GEN-LAST:event_jTextFieldContraseñaMousePressed

    private void jTextFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaFocusGained
        
        jTextFieldContraseña.selectAll();
        
    }//GEN-LAST:event_jTextFieldContraseñaFocusGained

    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ){
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FIniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FIniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FIniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FIniciarSecion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new FIniciarSecion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonAceptar;
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JLabel jLabelAlumno;
    public javax.swing.JLabel jLabelConstraseña;
    public javax.swing.JLabel jLabelTitulo;
    public javax.swing.JTextField jTextFieldAlumno;
    public javax.swing.JTextField jTextFieldContraseña;
    // End of variables declaration//GEN-END:variables
}
