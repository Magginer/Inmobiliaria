/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.Conexion;
import AccesData.PropietarioData;
import Entidades.Propietario;
import java.awt.Image;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class PropietarioBusqueda extends javax.swing.JFrame {
    
    Connection con = Conexion.getConexion();
    
   
    public PropietarioBusqueda() {
        initComponents();
        setSize(388, 455);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/TERRA_Propietarios.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlprovista.getWidth(), jlprovista.getHeight(), Image.SCALE_SMOOTH));
        jlprovista.setIcon(icono);
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PorpiID = new javax.swing.JTextField();
        PropiDNI = new javax.swing.JTextField();
        PropiNombre = new javax.swing.JTextField();
        PropiApe = new javax.swing.JTextField();
        PropiDom = new javax.swing.JTextField();
        PropiTel = new javax.swing.JTextField();
        buscarpropi = new javax.swing.JButton();
        CerrarPropi = new javax.swing.JButton();
        buscarpropi2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jlprovista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Propietario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 50));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 20));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Domicilio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        getContentPane().add(PorpiID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));
        getContentPane().add(PropiDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));

        PropiNombre.setEditable(false);
        getContentPane().add(PropiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        PropiApe.setEditable(false);
        getContentPane().add(PropiApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        PropiDom.setEditable(false);
        getContentPane().add(PropiDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, -1));

        PropiTel.setEditable(false);
        getContentPane().add(PropiTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 140, -1));

        buscarpropi.setText("Buscar");
        buscarpropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpropiActionPerformed(evt);
            }
        });
        getContentPane().add(buscarpropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 80, 40));

        CerrarPropi.setText("Cerrar");
        CerrarPropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarPropiActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarPropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 100, -1));

        buscarpropi2.setText("Buscar");
        buscarpropi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarpropi2ActionPerformed(evt);
            }
        });
        getContentPane().add(buscarpropi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 80, 40));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,100));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 460));
        getContentPane().add(jlprovista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean esNumero(String texto){
        try {
            Integer.parseInt((texto));
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    
    private void buscarpropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpropiActionPerformed
        String idtext=PorpiID.getText();
        
        
        if(!esNumero(idtext)){
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese un Numero Valido");
            return;
        }
        
        int id = Integer.parseInt(PorpiID.getText());
        PropietarioData pd = new PropietarioData();
        Propietario propi= pd.BuscarPropietario(id);
        
        if(propi != null){
            PropiDNI.setText(String.valueOf(propi.getDni()));
            PropiNombre.setText(String.valueOf(propi.getNombre()));
            PropiApe.setText(String.valueOf(propi.getApellido()));
            PropiDom.setText(String.valueOf(propi.getDomicilio()));
            PropiTel.setText(String.valueOf(propi.getTelefono()));
        }else{
            JOptionPane.showMessageDialog(null, "ERROR, No existe dicho Propietario");
        }
    }//GEN-LAST:event_buscarpropiActionPerformed

    private void CerrarPropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarPropiActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarPropiActionPerformed

    private void buscarpropi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarpropi2ActionPerformed
        String idtext=PropiDNI.getText();
         
        
        if(!esNumero(idtext)){
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese un Numero Valido");
            return;
        }
        
        
        int dni = Integer.parseInt(PropiDNI.getText());
        PropietarioData pd = new PropietarioData();
        Propietario propi= pd.BuscarPropietariodni(dni);
        
        if(propi != null){
            PorpiID.setText(String.valueOf(propi.getIdpropietario()));
            PropiNombre.setText(String.valueOf(propi.getNombre()));
            PropiApe.setText(String.valueOf(propi.getApellido()));
            PropiDom.setText(String.valueOf(propi.getDomicilio()));
            PropiTel.setText(String.valueOf(propi.getTelefono()));
        }else{
            JOptionPane.showMessageDialog(null, "ERROR, No existe dicho Propietario");
        }
    }//GEN-LAST:event_buscarpropi2ActionPerformed

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
            java.util.logging.Logger.getLogger(PropietarioBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PropietarioBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PropietarioBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PropietarioBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PropietarioBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarPropi;
    private javax.swing.JTextField PorpiID;
    private javax.swing.JTextField PropiApe;
    private javax.swing.JTextField PropiDNI;
    private javax.swing.JTextField PropiDom;
    private javax.swing.JTextField PropiNombre;
    private javax.swing.JTextField PropiTel;
    private javax.swing.JButton buscarpropi;
    private javax.swing.JButton buscarpropi2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlprovista;
    // End of variables declaration//GEN-END:variables
}
