/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Color;

/**
 *
 * @author Monse
 */
public class opciones extends javax.swing.JFrame {

    /**
     * Creates new form opciones
     */
    public opciones() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAlimentacion = new javax.swing.JButton();
        btnControl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlimentacion.setFont(new java.awt.Font("Arial Black", 0, 54)); // NOI18N
        btnAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        btnAlimentacion.setText("ALIMENTO");
        btnAlimentacion.setBorder(null);
        btnAlimentacion.setBorderPainted(false);
        btnAlimentacion.setContentAreaFilled(false);
        btnAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlimentacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 450, 80));

        btnControl.setFont(new java.awt.Font("Arial Black", 0, 54)); // NOI18N
        btnControl.setForeground(new java.awt.Color(255, 255, 255));
        btnControl.setText("CONTROL");
        btnControl.setBorderPainted(false);
        btnControl.setContentAreaFilled(false);
        btnControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnControlMouseEntered(evt);
            }
        });
        btnControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlActionPerformed(evt);
            }
        });
        jPanel1.add(btnControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 360, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opciones_fondo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnControlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnControlMouseEntered
        // TODO add your handling code here:
        btnControl.setBackground(Color.green);
        
    }//GEN-LAST:event_btnControlMouseEntered

    private void btnControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        control cont=new control();
        cont.setVisible(true);
    }//GEN-LAST:event_btnControlActionPerformed

    private void btnAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlimentacionActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        alimento food = new alimento();
        food.setVisible(true);
    }//GEN-LAST:event_btnAlimentacionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlimentacion;
    private javax.swing.JButton btnControl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void setLocationTo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
