/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author javie
 */
public class InquilinosVista extends javax.swing.JFrame {

    /**
     * Creates new form InquilinosVista
     */
    public InquilinosVista() {
        initComponents();
        setSize(383,463);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/TERRA_Inquilinos.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlinqui.getWidth(), jlinqui.getHeight(), Image.SCALE_SMOOTH));
        jlinqui.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InquiID = new javax.swing.JTextField();
        InquiCuit = new javax.swing.JTextField();
        InquiDniG = new javax.swing.JTextField();
        InquiNombre = new javax.swing.JTextField();
        InquiApe = new javax.swing.JTextField();
        InquiLugar = new javax.swing.JTextField();
        InquiNombreG = new javax.swing.JTextField();
        GuardarInqui = new javax.swing.JButton();
        CerrarInqui = new javax.swing.JButton();
        jlinqui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nuevo inquilino");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 150, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cuit");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Lugar de trabajo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DNI de garante");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre de garante");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(InquiID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));
        getContentPane().add(InquiCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));
        getContentPane().add(InquiDniG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 140, -1));
        getContentPane().add(InquiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));
        getContentPane().add(InquiApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));
        getContentPane().add(InquiLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 256, 140, -1));
        getContentPane().add(InquiNombreG, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 140, -1));

        GuardarInqui.setText("Guardar");
        GuardarInqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarInquiActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarInqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 100, 30));

        CerrarInqui.setText("Cerrar");
        getContentPane().add(CerrarInqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, -1));
        getContentPane().add(jlinqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 463));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarInquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarInquiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarInquiActionPerformed

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
            java.util.logging.Logger.getLogger(InquilinosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InquilinosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InquilinosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InquilinosVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InquilinosVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarInqui;
    private javax.swing.JButton GuardarInqui;
    private javax.swing.JTextField InquiApe;
    private javax.swing.JTextField InquiCuit;
    private javax.swing.JTextField InquiDniG;
    private javax.swing.JTextField InquiID;
    private javax.swing.JTextField InquiLugar;
    private javax.swing.JTextField InquiNombre;
    private javax.swing.JTextField InquiNombreG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlinqui;
    // End of variables declaration//GEN-END:variables
}
