/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrburnet;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author braya
 */
public class RECUPERAR extends javax.swing.JFrame {

    /**
     * Creates new form RECUPERAR
     */
    public RECUPERAR() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtVolver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldnOMBRE = new javax.swing.JTextField();
        jButtonConfir = new javax.swing.JButton();
        jTextFieldCORREO = new javax.swing.JTextField();
        jTextFieldIDENTI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/BTVolverMP1.png"))); // NOI18N
        BtVolver.setToolTipText("VOLVER");
        BtVolver.setBorderPainted(false);
        BtVolver.setContentAreaFilled(false);
        BtVolver.setFocusPainted(false);
        BtVolver.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BtVolverTagBTVolver(evt);
            }
        });
        BtVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtVolverVolverMenuInicio(evt);
            }
        });
        BtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 60));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RECUPERAR CONTRASEÑA");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Nombre de Usuario");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 160, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Tipo Identificación");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 160, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Identificación");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 160, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("Correo Electronico");
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 160, -1));
        getContentPane().add(jTextFieldnOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 117, -1));

        jButtonConfir.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButtonConfir.setForeground(new java.awt.Color(255, 255, 0));
        jButtonConfir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/check-mark2_1.png"))); // NOI18N
        jButtonConfir.setText("CONFIRMAR");
        jButtonConfir.setBorder(null);
        jButtonConfir.setBorderPainted(false);
        jButtonConfir.setContentAreaFilled(false);
        jButtonConfir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConfir.setRequestFocusEnabled(false);
        jButtonConfir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConfir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfirMouseClicked(evt);
            }
        });
        jButtonConfir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 120, 70));

        jTextFieldCORREO.setToolTipText("INGRESE EL CORREO QUE REGISTRO AL MOMENTO DE CREAR LA CUENTA");
        getContentPane().add(jTextFieldCORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 117, -1));
        getContentPane().add(jTextFieldIDENTI, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 117, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/Usser.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 160, 140));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Pasaporte" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 117, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS DE USUARIO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 410, 240));

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/HBWallpaperR.jpg"))); // NOI18N
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtVolverTagBTVolver(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtVolverTagBTVolver
        // TODO add your handling code here:
        BtVolver.setToolTipText("Volver");
    }//GEN-LAST:event_BtVolverTagBTVolver

    private void BtVolverVolverMenuInicio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtVolverVolverMenuInicio
        // TODO add your handling code here:
        InicioSesion inicioSesion = new InicioSesion();
        inicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtVolverVolverMenuInicio

    private void jButtonConfirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfirMouseClicked
        // TODO add your handling code here:

        Icon icono = new ImageIcon(getClass().getResource("Recursos//Mensaje4.png"));
        UIManager UI=new UIManager();
        UI.put("OptionPane.background", Color.BLACK);
        UI.put("Panel.background", Color.BLACK);
        UI.put("Button.background", Color.YELLOW);
        UI.put("OptionPane.messagebackground", Color.BLACK);
        UI.put("OptionPane.okButtonText","REGRESAR");
       JOptionPane.showMessageDialog(rootPane, null,null,JOptionPane.PLAIN_MESSAGE,icono);

       jTextFieldCORREO.setText("");
       jTextFieldIDENTI.setText("");
       jTextFieldnOMBRE.setText("");
       
       
    }//GEN-LAST:event_jButtonConfirMouseClicked

    private void jButtonConfirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConfirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtVolverActionPerformed

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
            java.util.logging.Logger.getLogger(RECUPERAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RECUPERAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RECUPERAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RECUPERAR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RECUPERAR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtVolver;
    private javax.swing.JButton jButtonConfir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCORREO;
    private javax.swing.JTextField jTextFieldIDENTI;
    private javax.swing.JTextField jTextFieldnOMBRE;
    // End of variables declaration//GEN-END:variables
}
