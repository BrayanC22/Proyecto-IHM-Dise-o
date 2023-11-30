
package mrburnet;

public class FormOpciones extends javax.swing.JFrame {

    public FormOpciones() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonROBOTSOPERATIVO = new javax.swing.JButton();
        jButtonROBOT = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MENÚ DE OPCIONES");
        setBackground(new java.awt.Color(153, 153, 153));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/BTVolverMP1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AparecerInicio(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 60));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/Agregarmenu.png"))); // NOI18N
        jButton2.setText("AGREGAR MENÚ");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 200, 150));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/EliminarMenu.png"))); // NOI18N
        jButton3.setText("ELIMINAR MENÚ");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 200, 150));

        jButtonROBOTSOPERATIVO.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButtonROBOTSOPERATIVO.setForeground(new java.awt.Color(255, 255, 0));
        jButtonROBOTSOPERATIVO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/Robot.png"))); // NOI18N
        jButtonROBOTSOPERATIVO.setText("ROBOTS OPERATIVOS");
        jButtonROBOTSOPERATIVO.setToolTipText("VISULAZAR ROBOTS OPERATIVOS");
        jButtonROBOTSOPERATIVO.setBorderPainted(false);
        jButtonROBOTSOPERATIVO.setContentAreaFilled(false);
        jButtonROBOTSOPERATIVO.setFocusPainted(false);
        jButtonROBOTSOPERATIVO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonROBOTSOPERATIVO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButtonROBOTSOPERATIVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 200, 150));

        jButtonROBOT.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButtonROBOT.setForeground(new java.awt.Color(255, 255, 0));
        jButtonROBOT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/AgregarRobot1.png"))); // NOI18N
        jButtonROBOT.setText("AGREGAR ROBOT");
        jButtonROBOT.setBorderPainted(false);
        jButtonROBOT.setContentAreaFilled(false);
        jButtonROBOT.setFocusPainted(false);
        jButtonROBOT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonROBOT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonROBOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonROBOTActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonROBOT, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 200, 150));

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/EliminarRobot.png"))); // NOI18N
        jButton6.setText("ELIMINAR ROBOT");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 200, 150));

        jButton10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 0));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMopciones/images12.png"))); // NOI18N
        jButton10.setText("MENÚ");
        jButton10.setToolTipText("Visualizar menu");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 150));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELECCIONAR UNA OPCIÓN");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 960, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/HBWallpaperR.jpg"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 530));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/HBWallpaperR.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        PaginaPrincipal paginaPrincipal = new PaginaPrincipal();
        paginaPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void AparecerInicio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AparecerInicio
        // TODO add your handling code here:
        FormOpciones opcion = new FormOpciones();
        opcion.setVisible(true);
        dispose();
    }//GEN-LAST:event_AparecerInicio

    private void jButtonROBOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonROBOTActionPerformed
           ROBOTOPERATIVO OPE = new ROBOTOPERATIVO();
           OPE.setVisible(true);
           dispose();

    }//GEN-LAST:event_jButtonROBOTActionPerformed

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
            java.util.logging.Logger.getLogger(FormOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormOpciones().setVisible(true);
            }
        });

        
    }
    

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonROBOT;
    private javax.swing.JButton jButtonROBOTSOPERATIVO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
