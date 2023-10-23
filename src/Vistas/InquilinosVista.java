/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.InquilinoData;
import Entidades.Inquilino;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
        setSize(383, 463);
        setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/imagenes/TERRA_Inquilinos.jpg");
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
        jButton1 = new javax.swing.JButton();
        jlinqui = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        InquiID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiIDKeyTyped(evt);
            }
        });
        getContentPane().add(InquiID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        InquiCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiCuitKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiCuitKeyTyped(evt);
            }
        });
        getContentPane().add(InquiCuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));

        InquiDniG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiDniGKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiDniGKeyTyped(evt);
            }
        });
        getContentPane().add(InquiDniG, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 140, -1));

        InquiNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiNombreKeyTyped(evt);
            }
        });
        getContentPane().add(InquiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        InquiApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiApeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiApeKeyTyped(evt);
            }
        });
        getContentPane().add(InquiApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        InquiLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiLugarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiLugarKeyTyped(evt);
            }
        });
        getContentPane().add(InquiLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 256, 140, -1));

        InquiNombreG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                InquiNombreGKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InquiNombreGKeyTyped(evt);
            }
        });
        getContentPane().add(InquiNombreG, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 140, -1));

        GuardarInqui.setText("Guardar");
        GuardarInqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarInquiActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarInqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 30));

        CerrarInqui.setText("Cerrar");
        CerrarInqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarInquiActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarInqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 100, -1));

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));
        getContentPane().add(jlinqui, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 463));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarInquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarInquiActionPerformed
        if (InquiID.getText().length() <= 0 || InquiCuit.getText().length() <= 0 || InquiNombre.getText().length() <= 0 || InquiApe.getText().length() <= 0 || InquiLugar.getText().length() <= 0 || InquiNombreG.getText().length() <= 0 || InquiDniG.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese datos en todos los campos antes de guardar");
        } else {
            int id = Integer.parseInt(InquiID.getText());
            int cuit = Integer.parseInt(InquiCuit.getText());
            String nombre = InquiNombre.getText();
            String apellido = InquiApe.getText();
            String lugar = InquiLugar.getText();
            String nombreg = InquiNombreG.getText();
            int dnig = Integer.parseInt(InquiDniG.getText());

            Inquilino inqui = new Inquilino();

            inqui.setIdinquilino(id);
            inqui.setCuit(cuit);
            inqui.setNombre(nombre);
            inqui.setApellido(apellido);
            inqui.setLtrabajo(lugar);
            inqui.setNgarante(nombreg);
            inqui.setDni(dnig);
            inqui.setEstado(true);

            InquilinoData in = new InquilinoData();
           
            
            in.GuardarInquilino(inqui);
    }//GEN-LAST:event_GuardarInquiActionPerformed
    }
    private void CerrarInquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarInquiActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarInquiActionPerformed

    private void InquiIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiIDKeyPressed
        
    }//GEN-LAST:event_InquiIDKeyPressed

    private void InquiCuitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiCuitKeyPressed
       // TODO add your handling code here:
    }//GEN-LAST:event_InquiCuitKeyPressed

    private void InquiNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiNombreKeyPressed
        
    }//GEN-LAST:event_InquiNombreKeyPressed

    private void InquiApeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiApeKeyPressed
       
    }//GEN-LAST:event_InquiApeKeyPressed

    private void InquiLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiLugarKeyPressed
       
            
    }//GEN-LAST:event_InquiLugarKeyPressed

    private void InquiNombreGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiNombreGKeyPressed
         
    }//GEN-LAST:event_InquiNombreGKeyPressed

    private void InquiDniGKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiDniGKeyPressed
      
    }//GEN-LAST:event_InquiDniGKeyPressed

    private void InquiIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiIDKeyTyped
       char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            InquiID.setEditable(true);

        } else {
            InquiID.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo ID");
            return;

        }
    }//GEN-LAST:event_InquiIDKeyTyped

    private void InquiNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiNombreKeyTyped
       char c = evt.getKeyChar();

        if (Character.isLetter(c)| Character.isWhitespace(c) || Character.isISOControl(c)) {
            InquiNombre.setEditable(true);
            

        } else {
            InquiNombre.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Nombre");
            return;

        }
    }//GEN-LAST:event_InquiNombreKeyTyped

    private void InquiCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiCuitKeyTyped
         char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            InquiCuit.setEditable(true);

        } else {
            InquiCuit.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo CUIT");
            return;

        }
    }//GEN-LAST:event_InquiCuitKeyTyped

    private void InquiApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiApeKeyTyped
         char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) | Character.isWhitespace(c) || Character.isISOControl(c)) {
            InquiApe.setEditable(true);

        } else {
            InquiApe.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Apellido");
            return;

        }
    }//GEN-LAST:event_InquiApeKeyTyped

    private void InquiLugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiLugarKeyTyped
       char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) || Character.isWhitespace(c) || Character.isDigit(c) || Character.isISOControl(c)) {
            InquiLugar.setEditable(true);

        } else {
            InquiLugar.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS y LETRAS en campo Lugar de trabajo");
            return;
            
      }      
    }//GEN-LAST:event_InquiLugarKeyTyped

    private void InquiNombreGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiNombreGKeyTyped
      char c = evt.getKeyChar();

        if (Character.isAlphabetic(c) | Character.isWhitespace(c) || Character.isISOControl(c)) {
            InquiNombreG.setEditable(true);

        } else {
            InquiNombreG.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Nombre de garante");
            return;

        }
    }//GEN-LAST:event_InquiNombreGKeyTyped

    private void InquiDniGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InquiDniGKeyTyped
    char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            InquiDniG.setEditable(true);

        } else {
            InquiDniG.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo DNI del garante");
            return;

        }
    }//GEN-LAST:event_InquiDniGKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   InquiApe.setText("");
   InquiCuit.setText("");
   InquiDniG.setText("");
   InquiID.setText("");
   InquiLugar.setText("");
   InquiNombre.setText("");
   InquiNombreG.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    

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
        //jhksajk
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
    private javax.swing.JButton jButton1;
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
