/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

/**
 *
 * @author Monse
 */
public class alimento extends javax.swing.JFrame {

    /**
     * Creates new form alimento
     */
    public alimento() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jxbAnimal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbAlimento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALIMENTACIÓN");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONE EL TIPO DE ALIMENTO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 80, 60));

        jxbAnimal.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jxbAnimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porcino", "Bovino" }));
        jxbAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxbAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(jxbAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 570, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECCIONA LA CANTIDAD DE ALIMENTO A PRODUCIR(kg):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 700, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon_al.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 60, 70));

        txtcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 570, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imak.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 70, 90));

        jcbAlimento.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jPanel1.add(jcbAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 570, 40));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECCIONA EL TIPO DE ALIMENTO QUE DESEA PRODUCIR:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 690, -1));

        btnReturn.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(29, 185, 84));
        btnReturn.setText("REGRESAR");
        btnReturn.setBorderPainted(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        jPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 150, 40));

        btnCalcular.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(29, 185, 84));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorderPainted(false);
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_aliment.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        opciones op =new opciones();
        op.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcantidadActionPerformed

    private void jxbAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxbAnimalActionPerformed
        // TODO add your handling code here:
        int x = jcbAlimento.getSelectedIndex();
        jxbAnimal.removeAllItems();
        if(x==0){
        jxbAnimal.addItem("Inicio");
        jxbAnimal.addItem("Destete");
        jxbAnimal.addItem("Crecimiento");
        jxbAnimal.addItem("Engorda");
        jxbAnimal.addItem("Gestación");
        jxbAnimal.addItem("Lactancia");
        }else if(x==1){
        jxbAnimal.addItem("Producción alta");
        jxbAnimal.addItem("Producción media");
        jxbAnimal.addItem("Prodicción baja");
        }
    }//GEN-LAST:event_jxbAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbAlimento;
    private javax.swing.JComboBox<String> jxbAnimal;
    private javax.swing.JTextField txtcantidad;
    // End of variables declaration//GEN-END:variables
}
