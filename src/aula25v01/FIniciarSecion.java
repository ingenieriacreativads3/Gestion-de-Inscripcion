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
        jLabelPass = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonMorosos = new javax.swing.JButton();
        jTextFieldAlumno = new javax.swing.JTextField();
        jTextFieldPass = new javax.swing.JTextField();
        jButtonSetCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAlumno.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelPass.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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

        jButtonMorosos.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonMorosos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonMorososMousePressed(evt);
            }
        });
        jButtonMorosos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonMorososKeyPressed(evt);
            }
        });

        jTextFieldAlumno.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldAlumnoFocusGained(evt);
            }
        });
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

        jTextFieldPass.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jTextFieldPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldPassFocusGained(evt);
            }
        });
        jTextFieldPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldPassMousePressed(evt);
            }
        });
        jTextFieldPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPassKeyPressed(evt);
            }
        });

        jButtonSetCurso.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jButtonSetCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSetCursoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMorosos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
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
                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSetCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMorosos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        
        GestorIniciarSecion.gestorJButtonCancelarMousePressed(this);
        
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonMorososMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMorososMousePressed
        
        GestorIniciarSecion.gestorjButtonMorososMousePressed(this);
        
    }//GEN-LAST:event_jButtonMorososMousePressed

    private void jTextFieldAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAlumnoKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            
            jTextFieldPass.requestFocus();
            jTextFieldPass.selectAll();
            
        } 
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jTextFieldPass.requestFocus();
            jTextFieldPass.selectAll();
            
        }      
    }//GEN-LAST:event_jTextFieldAlumnoKeyPressed

    private void jTextFieldPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPassKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            jButtonMorosos.requestFocus();
            
        }
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            
            jButtonMorosos.requestFocus();
            
        }
    }//GEN-LAST:event_jTextFieldPassKeyPressed

    private void jButtonMorososKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonMorososKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorIniciarSecion.gestorjButtonMorososMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonMorososKeyPressed

    private void jButtonCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonCancelarKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            GestorIniciarSecion.gestorJButtonCancelarMousePressed(this);
            
        }
    }//GEN-LAST:event_jButtonCancelarKeyPressed

    private void jTextFieldAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldAlumnoMousePressed
        
        jTextFieldAlumno.selectAll();
        
    }//GEN-LAST:event_jTextFieldAlumnoMousePressed

    private void jTextFieldPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPassMousePressed
        
        jTextFieldPass.selectAll();
        
    }//GEN-LAST:event_jTextFieldPassMousePressed

    private void jTextFieldPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldPassFocusGained
        
        jTextFieldPass.selectAll();
        
    }//GEN-LAST:event_jTextFieldPassFocusGained

    private void jTextFieldAlumnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldAlumnoFocusGained
        
        jTextFieldAlumno.selectAll();
        
    }//GEN-LAST:event_jTextFieldAlumnoFocusGained

    private void jButtonSetCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSetCursoMousePressed
        
        GestorSetCurso.gestorJButtonSetCursoMousePressed();
        this.dispose();
        
    }//GEN-LAST:event_jButtonSetCursoMousePressed

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
    public javax.swing.JButton jButtonCancelar;
    public javax.swing.JButton jButtonMorosos;
    public javax.swing.JButton jButtonSetCurso;
    public javax.swing.JLabel jLabelAlumno;
    public javax.swing.JLabel jLabelPass;
    public javax.swing.JLabel jLabelTitulo;
    public javax.swing.JTextField jTextFieldAlumno;
    public javax.swing.JTextField jTextFieldPass;
    // End of variables declaration//GEN-END:variables
}
