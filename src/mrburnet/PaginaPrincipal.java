/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrburnet;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yls20
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();    
        jLabel3.setVisible(true);
        Volver.setVisible(true);
        Menu.setVisible(true);
        Hamburguesa.setVisible(false);
        Combo.setVisible(false);
        Pago.setVisible(false);
        HT1.setVisible(false);
        HT2.setVisible(false);
        CT1.setVisible(false);
        CT2.setVisible(false);      
        CT3.setVisible(false);
        CT4.setVisible(false);
        HT3.setVisible(false);
        HT4.setVisible(false);
        
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
        Menu = new javax.swing.JButton();
        Hamburguesa = new javax.swing.JButton();
        Combo = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        Pago = new javax.swing.JButton();
        jButtonConf = new javax.swing.JButton();
        HT1 = new javax.swing.JButton();
        HT2 = new javax.swing.JButton();
        CT1 = new javax.swing.JButton();
        CT2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        HT3 = new javax.swing.JButton();
        HT4 = new javax.swing.JButton();
        CT3 = new javax.swing.JButton();
        CT4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(790, 510));
        setResizable(false);
        setSize(new java.awt.Dimension(902, 562));
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 0)), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(788, 440));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(255, 255, 0));
        Menu.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 0));
        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/McDonalds-Logo.png"))); // NOI18N
        Menu.setText("Menú");
        Menu.setToolTipText("Haga click para ver el desplegar el menú");
        Menu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        Menu.setBorderPainted(false);
        Menu.setContentAreaFilled(false);
        Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Menu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 80, 80));

        Hamburguesa.setBackground(new java.awt.Color(255, 255, 0));
        Hamburguesa.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Hamburguesa.setForeground(new java.awt.Color(255, 255, 0));
        Hamburguesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/Hamburguesa.png"))); // NOI18N
        Hamburguesa.setText("Hamburguesa");
        Hamburguesa.setToolTipText("Hamburguesa");
        Hamburguesa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Hamburguesa.setBorderPainted(false);
        Hamburguesa.setContentAreaFilled(false);
        Hamburguesa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Hamburguesa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Hamburguesa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Hamburguesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HamburguesaMouseClicked(evt);
            }
        });
        Hamburguesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HamburguesaActionPerformed(evt);
            }
        });
        jPanel1.add(Hamburguesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 130, 110));

        Combo.setBackground(new java.awt.Color(255, 255, 0));
        Combo.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Combo.setForeground(new java.awt.Color(255, 255, 0));
        Combo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/Combos.png"))); // NOI18N
        Combo.setText("COMBOS");
        Combo.setToolTipText("COMBOS");
        Combo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Combo.setBorderPainted(false);
        Combo.setContentAreaFilled(false);
        Combo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Combo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboMouseClicked(evt);
            }
        });
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });
        jPanel1.add(Combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 150, 120));

        Volver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Volver.setForeground(new java.awt.Color(255, 0, 0));
        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/BTVolverMP1.png"))); // NOI18N
        Volver.setToolTipText("VOLVER");
        Volver.setBorderPainted(false);
        Volver.setContentAreaFilled(false);
        Volver.setFocusPainted(false);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        jPanel1.add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, -1, 60));

        Pago.setBackground(new java.awt.Color(255, 255, 0));
        Pago.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        Pago.setForeground(new java.awt.Color(255, 255, 0));
        Pago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/BTpagar.png"))); // NOI18N
        Pago.setText("REALIZAR PAGO");
        Pago.setBorderPainted(false);
        Pago.setContentAreaFilled(false);
        Pago.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pago.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoActionPerformed(evt);
            }
        });
        jPanel1.add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 130, 80));

        jButtonConf.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButtonConf.setForeground(new java.awt.Color(255, 255, 0));
        jButtonConf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/check-mark2_1.png"))); // NOI18N
        jButtonConf.setText("CONFIRMAR PEDIDO");
        jButtonConf.setToolTipText("CONFIRMAR");
        jButtonConf.setBorderPainted(false);
        jButtonConf.setContentAreaFilled(false);
        jButtonConf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonConfMouseClicked(evt);
            }
        });
        jButtonConf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 170, -1));

        HT1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        HT1.setForeground(new java.awt.Color(255, 255, 0));
        HT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Quarter Pounder1.png"))); // NOI18N
        HT1.setText("Quarter Pounder");
        HT1.setBorderPainted(false);
        HT1.setContentAreaFilled(false);
        HT1.setFocusPainted(false);
        HT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(HT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 151, 180, 140));

        HT2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        HT2.setForeground(new java.awt.Color(255, 255, 0));
        HT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/DoubleQuarter Pounder1_1.png"))); // NOI18N
        HT2.setText("Double Quarter Pounder");
        HT2.setBorderPainted(false);
        HT2.setContentAreaFilled(false);
        HT2.setFocusPainted(false);
        HT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HT2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(HT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        CT1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        CT1.setForeground(new java.awt.Color(255, 255, 0));
        CT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/big mac combo meal1.png"))); // NOI18N
        CT1.setText("big mac combo meal");
        CT1.setBorderPainted(false);
        CT1.setContentAreaFilled(false);
        CT1.setFocusPainted(false);
        CT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(CT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        CT2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        CT2.setForeground(new java.awt.Color(255, 255, 0));
        CT2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Cheeseburger combo meal.png"))); // NOI18N
        CT2.setText("cheeseburger combo meal ");
        CT2.setBorderPainted(false);
        CT2.setContentAreaFilled(false);
        CT2.setFocusPainted(false);
        CT2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CT2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(CT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Menu-word_1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 170, 110));

        HT3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        HT3.setForeground(new java.awt.Color(255, 255, 0));
        HT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/big mc1.png"))); // NOI18N
        HT3.setText("Big MC");
        HT3.setToolTipText("");
        HT3.setBorderPainted(false);
        HT3.setContentAreaFilled(false);
        HT3.setFocusPainted(false);
        HT3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HT3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(HT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 180, -1));

        HT4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        HT4.setForeground(new java.awt.Color(255, 255, 0));
        HT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Sausage Egg & Cheese McGriddles1.png"))); // NOI18N
        HT4.setText("Cheese & McGriddles");
        HT4.setBorderPainted(false);
        HT4.setContentAreaFilled(false);
        HT4.setFocusPainted(false);
        HT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        HT4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        HT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HT4ActionPerformed(evt);
            }
        });
        jPanel1.add(HT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 200, 150));

        CT3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        CT3.setForeground(new java.awt.Color(255, 255, 0));
        CT3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Egg McMuffin Meal1.png"))); // NOI18N
        CT3.setText("Egg McMuffin Meal");
        CT3.setBorderPainted(false);
        CT3.setContentAreaFilled(false);
        CT3.setFocusPainted(false);
        CT3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CT3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(CT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 180, 150));

        CT4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        CT4.setForeground(new java.awt.Color(255, 255, 0));
        CT4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/IFMenu/Buttermilk Crispy Chicken Meal1.png"))); // NOI18N
        CT4.setText("Buttermilk Crispy Meal");
        CT4.setBorderPainted(false);
        CT4.setContentAreaFilled(false);
        CT4.setFocusPainted(false);
        CT4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CT4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(CT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 210, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mrburnet/Recursos/HBWallpaperR.jpg"))); // NOI18N
        jLabel1.setText("Buttermilk Crispy Meal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 890, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    int filtro = 1;
    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        if (Hamburguesa.isVisible()){
        Intecambio();
        OcultarCombos();
        OcultarHamburguesa();    
        }else{
            Intecambio();
        }
  
        
        
    }//GEN-LAST:event_MenuActionPerformed

    private void HamburguesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HamburguesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HamburguesaActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        //InicioSesion is = new InicioSesion();
        //is.setVisible(true);
        FormOpciones formOpciones = new FormOpciones();
        formOpciones.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_VolverActionPerformed

    private void PagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoActionPerformed
        // TODO add your handling code here:
        PANEL panel = new PANEL();
        panel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PagoActionPerformed

    private void HamburguesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HamburguesaMouseClicked
        if (HT1.isVisible()==false){
            OcultarCombos();
            MostrarHamburguesa();   
        }
    }//GEN-LAST:event_HamburguesaMouseClicked

    private void ComboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboMouseClicked
        if (CT1.isVisible()==false){
            OcultarHamburguesa();
            MostrarCombos();
        }
    }//GEN-LAST:event_ComboMouseClicked

    private void jButtonConfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConfMouseClicked
        
            Icon icono = new ImageIcon(getClass().getResource("Recursos//Mensaje2.png"));
            UIManager UI=new UIManager();

            UI.put("OptionPane.background", Color.BLACK);
            UI.put("Panel.background", Color.BLACK);
            UI.put("Button.background", Color.YELLOW);
            UI.put("OptionPane.messagebackground", Color.BLACK);
            UIManager.put("OptionPane.okButtonText","CONFIRMAR");
            JOptionPane.showMessageDialog(rootPane, null,null,JOptionPane.PLAIN_MESSAGE,icono);

        /*
        Icon icono = new ImageIcon(getClass().getResource("Recursos//Mensaje2.png"));
        UIManager UI=new UIManager();
        JOptionPane.showMessageDialog(rootPane, "","",JOptionPane.PLAIN_MESSAGE,icono);
        UI.put("OptionPane.background", Color.BLACK);
        UI.put("Panel.background", Color.BLACK);
        UI.put("Button.background", Color.YELLOW);
        UI.put("OptionPane.messagebackground", Color.BLACK);
        UIManager.put("RootPane.dialogBorder", new LineBorder(Color.BLACK));    
        UIManager.put("RootPane.errorDialogBorder", new LineBorder(Color.BLACK));
        UI.put("OptionPane.okButtonText","Continuar");
        *///JOptionPane.showMessageDialog(null, "Desea confirmar su pedido proceda a la opcion de pago");
        Visibilidad();
    }//GEN-LAST:event_jButtonConfMouseClicked

    private void jButtonConfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jButtonConfActionPerformed

    private void HT4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HT4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HT4ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }
public int Intecambio(){        
    if (Hamburguesa.isVisible()==false){
            Hamburguesa.setVisible(true);
            Combo.setVisible(true);
    }else{  
            Hamburguesa.setVisible(false);
            Combo.setVisible(false);           
    }        
        return 0;
}
    public void Visibilidad(){
        if (Pago.isVisible()== false){
            Pago.setVisible(true);
        }else{
            Pago.setVisible(false);
        }            
        
    }
    
    public void MostrarHamburguesa(){
        if (HT1.isVisible()==false){
            HT1.setVisible(true);
            HT2.setVisible(true);
            HT3.setVisible(true);
            HT4.setVisible(true);
        }
    }
    public void OcultarHamburguesa(){
        if (HT1.isVisible()){
            HT1.setVisible(false);
            HT2.setVisible(false);
            HT3.setVisible(false);
            HT4.setVisible(false);
            
        }
    }
    public void MostrarCombos(){
        if (CT1.isVisible()==false){
            CT1.setVisible(true);
            CT2.setVisible(true);
            CT3.setVisible(true);
            CT4.setVisible(true);
        }
    }
    public void OcultarCombos(){
        if (CT1.isVisible()){
            CT1.setVisible(false);
            CT2.setVisible(false);
            CT3.setVisible(false);
            CT4.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CT1;
    private javax.swing.JButton CT2;
    private javax.swing.JButton CT3;
    private javax.swing.JButton CT4;
    private javax.swing.JButton Combo;
    private javax.swing.JButton HT1;
    private javax.swing.JButton HT2;
    private javax.swing.JButton HT3;
    private javax.swing.JButton HT4;
    private javax.swing.JButton Hamburguesa;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pago;
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButtonConf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}


