package mrburnet;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PANEL extends javax.swing.JFrame {

    public PANEL() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        numeros1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numeros2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 255, 51)), "SERVICIO DE PAGO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo Tarjeta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 102, -1));

        jButtonAceptar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 0));
        jButtonAceptar.setText("ACEPTAR");
        jButtonAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        jButtonAceptar.setContentAreaFilled(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 100, 30));

        jButton12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 0));
        jButton12.setText("BORRRAR");
        jButton12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 100, 30));

        jButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 0));
        jButton13.setText("REGRESAR");
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 0), 1, true));
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 100, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cod. Seguridad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        numeros1.setToolTipText("INGRESE EL CÓDIGO SEGURIDAD DE 3 DIGITOS");
        numeros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeros1ActionPerformed(evt);
            }
        });
        jPanel1.add(numeros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Claves-Aumentar-Ventas.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 620, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N° Tarjeta");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 102, -1));

        numeros2.setToolTipText("INGRESE LOS DIGITOS DE SU TARJETA");
        numeros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeros2ActionPerformed(evt);
            }
        });
        jPanel1.add(numeros2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 210, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta Débito", "Tarjeta Crédito" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 210, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
       //Aceptar la compra
       
       Icon icono = new ImageIcon(getClass().getResource("Recursos//Mensaje5.png"));
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.BLACK);
        UI.put("Panel.background", Color.BLACK);
        UI.put("Button.background", Color.YELLOW);
        UI.put("OptionPane.messagebackground", Color.BLACK); 
        UIManager.put("OptionPane.okButtonText","VOLVER AL MENU");
        JOptionPane.showMessageDialog(rootPane, null,null,JOptionPane.PLAIN_MESSAGE,icono);
       this.numeros2.setText("");
       this.numeros1.setText("");
       
       PaginaPrincipal pag = new PaginaPrincipal();
       pag.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      //Regresar al menu del pedido
      
      PaginaPrincipal principal = new PaginaPrincipal();
      principal.setVisible(true);
      this.setVisible(false);
      
      
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
//eliminar
this.numeros2.setText("");
this.numeros1.setText("");

    }//GEN-LAST:event_jButton12ActionPerformed

    private void numeros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeros1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeros1ActionPerformed

    private void numeros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeros2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeros2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PANEL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PANEL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeros1;
    private javax.swing.JTextField numeros2;
    // End of variables declaration//GEN-END:variables
}
