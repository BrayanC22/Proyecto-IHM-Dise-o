/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrburnet;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author yls20
 */
public class InicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtLogin = new javax.swing.JButton();
        BtCerrar = new javax.swing.JButton();
        InicioUsuario = new javax.swing.JTextField();
        InicioContraseña = new javax.swing.JPasswordField();
        BtHelp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtQuienessomos = new javax.swing.JButton();
        jButtonCrearCuenta = new javax.swing.JButton();
        jButtoRecuperarCuenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(16, 16, 16));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(51, 51, 51));
        setLocationByPlatform(true);
        setName("FrameInicio"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setBackground(new java.awt.Color(26, 26, 26));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(26, 26, 26));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/Usser.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 150, 160));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("USUARIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 5, 550));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("CONTRASEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        BtLogin.setBackground(new java.awt.Color(255, 255, 0));
        BtLogin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BtLogin.setForeground(new java.awt.Color(255, 255, 153));
        BtLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/loginR.png"))); // NOI18N
        BtLogin.setText("ACCEDER");
        BtLogin.setToolTipText("ACCEDER");
        BtLogin.setBorderPainted(false);
        BtLogin.setContentAreaFilled(false);
        BtLogin.setFocusPainted(false);
        BtLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xd(evt);
            }
        });
        BtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(BtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 70));

        BtCerrar.setForeground(new java.awt.Color(255, 255, 0));
        BtCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/CerrarIcon.png"))); // NOI18N
        BtCerrar.setToolTipText("SALIR");
        BtCerrar.setBorder(null);
        BtCerrar.setContentAreaFilled(false);
        BtCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtCerrar.setFocusPainted(false);
        BtCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtCerrar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MostrarTag(evt);
            }
        });
        BtCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtCerrarMouseClicked(evt);
            }
        });
        BtCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 50, 40));

        InicioUsuario.setBackground(new java.awt.Color(255, 255, 204));
        InicioUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        InicioUsuario.setName(""); // NOI18N
        InicioUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(InicioUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 136, -1));

        InicioContraseña.setBackground(new java.awt.Color(255, 255, 204));
        InicioContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(InicioContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 136, -1));

        BtHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/ImagenesFrameHelp/AcercaNosotros.png"))); // NOI18N
        BtHelp.setToolTipText("¿QUIENES SOMOS?");
        BtHelp.setBorderPainted(false);
        BtHelp.setContentAreaFilled(false);
        BtHelp.setFocusPainted(false);
        BtHelp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TagHelp(evt);
            }
        });
        BtHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CallFrameHelp(evt);
            }
        });
        BtHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHelpActionPerformed(evt);
            }
        });
        jPanel1.add(BtHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(26, 26, 26));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/LogoNombre1.png"))); // NOI18N
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 290, 350));

        BtQuienessomos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/Help.png"))); // NOI18N
        BtQuienessomos.setToolTipText("AYUDA");
        BtQuienessomos.setBorderPainted(false);
        BtQuienessomos.setContentAreaFilled(false);
        BtQuienessomos.setFocusPainted(false);
        BtQuienessomos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BtQuienessomosTagHelp(evt);
            }
        });
        BtQuienessomos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtQuienessomosCallFrameHelp(evt);
            }
        });
        jPanel1.add(BtQuienessomos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButtonCrearCuenta.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButtonCrearCuenta.setForeground(new java.awt.Color(255, 255, 153));
        jButtonCrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/ImagenesFrameHelp/Usser.png"))); // NOI18N
        jButtonCrearCuenta.setText("NUEVO USUARIO");
        jButtonCrearCuenta.setToolTipText("CREAR CUENTA");
        jButtonCrearCuenta.setBorderPainted(false);
        jButtonCrearCuenta.setContentAreaFilled(false);
        jButtonCrearCuenta.setFocusPainted(false);
        jButtonCrearCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCrearCuenta.setVerifyInputWhenFocusTarget(false);
        jButtonCrearCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 170, 70));

        jButtoRecuperarCuenta.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButtoRecuperarCuenta.setForeground(new java.awt.Color(255, 255, 153));
        jButtoRecuperarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/ImagenesFrameHelp/RecKey.png"))); // NOI18N
        jButtoRecuperarCuenta.setText("RECUPERAR CONTRASEÑA");
        jButtoRecuperarCuenta.setToolTipText("RECUPERAR CLAVE");
        jButtoRecuperarCuenta.setBorderPainted(false);
        jButtoRecuperarCuenta.setContentAreaFilled(false);
        jButtoRecuperarCuenta.setFocusPainted(false);
        jButtoRecuperarCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtoRecuperarCuenta.setVerifyInputWhenFocusTarget(false);
        jButtoRecuperarCuenta.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButtoRecuperarCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtoRecuperarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoRecuperarCuentaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtoRecuperarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 330, 2));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/HBWallpaperR.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 490));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 960, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InicioUsuarioActionPerformed

    private void BtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLoginActionPerformed
        // TODO add your handling code here:
        String usuario ="admin";
        String contraseña = "123";
        String User;
        String Contra;

        PaginaPrincipal principal = new PaginaPrincipal();
        FormOpciones formOpciones = new FormOpciones();

        User = InicioUsuario.getText();
        Contra = InicioContraseña.getText();

        if (InicioUsuario.getText().equals(usuario)&&InicioContraseña.getText().equals(contraseña)){

            formOpciones.setVisible(true);        
            //principal.setVisible(true);
            dispose();

        }
        else{
            Icon icono = new ImageIcon(getClass().getResource("Recursos//Mensajes.png"));
            UIManager UI=new UIManager();
            UIManager.put("OptionPane.okButtonText","REINTENTAR");
            UI.put("OptionPane.background", Color.BLACK);
            UI.put("Panel.background", Color.BLACK);
            UI.put("Button.background", Color.YELLOW);
            UI.put("OptionPane.messagebackground", Color.BLACK);
            UIManager.put("OptionPane.okButtonText","REINTENTAR");
            JOptionPane.showMessageDialog(rootPane,null,null,JOptionPane.PLAIN_MESSAGE,icono);

            
            principal.setVisible(false);
            this.setVisible(true);
            InicioUsuario.setText("");
            InicioContraseña.setText("");
           

        }
    }//GEN-LAST:event_BtLoginActionPerformed

    private void xd(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xd
        // TODO add your handling code here:
        BtLogin.setToolTipText("Acceder");
    }//GEN-LAST:event_xd

    private void MostrarTag(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MostrarTag
        // TODO add your handling code here:
        BtCerrar.setToolTipText("Salir");
    }//GEN-LAST:event_MostrarTag

    private void TagHelp(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TagHelp
        // TODO add your handling code here:
        BtHelp.setToolTipText("¿Quienes somos?");
    }//GEN-LAST:event_TagHelp

    private void CallFrameHelp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CallFrameHelp
        // TODO add your handling code here:
        FrameHelp fh = new FrameHelp();
        fh.setVisible(true);
    }//GEN-LAST:event_CallFrameHelp

    private void BtCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCerrarActionPerformed
    }//GEN-LAST:event_BtCerrarActionPerformed

    private void BtQuienessomosTagHelp(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtQuienessomosTagHelp
        // TODO add your handling code here:
    }//GEN-LAST:event_BtQuienessomosTagHelp

    private void BtQuienessomosCallFrameHelp(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtQuienessomosCallFrameHelp
        // TODO add your handling code here:
    }//GEN-LAST:event_BtQuienessomosCallFrameHelp

    private void BtHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtHelpActionPerformed

    private void BtCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtCerrarMouseClicked
        Cerrar();
    }//GEN-LAST:event_BtCerrarMouseClicked

    private void jButtonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCuentaActionPerformed
         CREARCUENTA CREAR = new CREARCUENTA();

            CREAR.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonCrearCuentaActionPerformed

    private void jButtoRecuperarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoRecuperarCuentaActionPerformed
        RECUPERAR recup = new RECUPERAR();
        recup.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtoRecuperarCuentaActionPerformed

    public void Cerrar(){
        dispose();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCerrar;
    private javax.swing.JButton BtHelp;
    private javax.swing.JButton BtLogin;
    private javax.swing.JButton BtQuienessomos;
    private javax.swing.JPasswordField InicioContraseña;
    private javax.swing.JTextField InicioUsuario;
    private javax.swing.JButton jButtoRecuperarCuenta;
    private javax.swing.JButton jButtonCrearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
