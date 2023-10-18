/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.Conexion;
import AccesData.ContratoData;
import AccesData.InmueblesData;
import AccesData.InquilinoData;
import AccesData.PropietarioData;
import Entidades.Contrato;
import Entidades.Inmuebles;
import Entidades.Inquilino;
import Entidades.Propietario;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class ContratosVistas extends javax.swing.JFrame {
 Connection con = Conexion.getConexion();
    ArrayList Ilista;
    ArrayList INlista;
    InquilinoData inquilino = new InquilinoData();
    InmueblesData inmueble = new InmueblesData();
    Inquilino inqui = new Inquilino();
    
    
    
    
    public ContratosVistas() {
        initComponents();
        con = Conexion.getConexion();
        Ilista = new ArrayList();
        INlista = new ArrayList();
        
        
        
        
        setSize(442,435);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/TERRA_Contrato.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlcontra.getWidth(), jlcontra.getHeight(), Image.SCALE_SMOOTH));
        jlcontra.setIcon(icono);
        this.repaint();
    }

  
    
    private void llenarcombo () {
        
       combocontra1.removeAllItems();
       Ilista = (ArrayList) inmueble.ListarInmueble();
       Iterator iterador = Ilista.iterator();
       while(iterador.hasNext()){
           Inmuebles inm = (Inmuebles) iterador.next();
           combocontra1.addItem(inm);   
       }
     }
    
    private void llenarcombo2 () {
       combocontra2.removeAllItems();
       INlista = (ArrayList) inquilino.ListarInquilino();
       Iterator iterador2 = INlista.iterator();
       while(iterador2.hasNext()){
           Inquilino inq = (Inquilino) iterador2.next();
           combocontra2.addItem(inq);   
       }
       
       
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GuardarCont = new javax.swing.JButton();
        CerrarCont = new javax.swing.JButton();
        fechainicio = new com.toedter.calendar.JDateChooser();
        fechafin = new com.toedter.calendar.JDateChooser();
        AlquilerTexto1 = new javax.swing.JTextField();
        combocontra1 = new javax.swing.JComboBox<>();
        combocontra2 = new javax.swing.JComboBox<>();
        Limpiarcont = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jlcontra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nuevo Contrato");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 50));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fecha de finalizacion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fecha de inicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Inmueble");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID inquilino");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        GuardarCont.setText("Guardar");
        GuardarCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarContActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 100, 30));

        CerrarCont.setText("Cerrar");
        CerrarCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarContActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 100, -1));

        fechainicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechainicioKeyTyped(evt);
            }
        });
        getContentPane().add(fechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));
        getContentPane().add(fechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, -1));

        AlquilerTexto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AlquilerTexto1KeyTyped(evt);
            }
        });
        getContentPane().add(AlquilerTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 140, -1));

        combocontra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combocontra1MouseClicked(evt);
            }
        });
        combocontra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocontra1ActionPerformed(evt);
            }
        });
        getContentPane().add(combocontra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 250, -1));

        combocontra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combocontra2MouseClicked(evt);
            }
        });
        getContentPane().add(combocontra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 250, -1));

        Limpiarcont.setText("Limpiar");
        Limpiarcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarcontActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiarcont, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 90, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Alquiler");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));
        getContentPane().add(jlcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarContActionPerformed
        if(fechainicio.getDate() == null || fechafin.getDate() == null|| AlquilerTexto1.getText().length()<=0 ||combocontra1.getSelectedItem()==null || combocontra2.getSelectedItem()==null ){ 
            JOptionPane.showMessageDialog(null, "Por favor ingrese datos en todos los campos antes de guardar" );
        }else{
        
        LocalDate fechaincio= fechainicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fechai = Date.valueOf(fechaincio);
        LocalDate fechafina= fechafin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Date fechaf = Date.valueOf(fechafina);
        Inmuebles inm = (Inmuebles) combocontra1.getSelectedItem();
        Inquilino inq = (Inquilino) combocontra2.getSelectedItem();
        int alquiler = Integer.parseInt(AlquilerTexto1.getText());
        
        Contrato contrato = new Contrato();
        
        contrato.setFechadeinicio(fechaincio);
        contrato.setFechadefinalizacion(fechafina);
        contrato.setInmueble(inm);
        contrato.setInquilino(inq);
        contrato.setAlquiler(alquiler);
        contrato.setVigente(true);
        
        ContratoData con = new ContratoData ();
        con.guardarContrato(contrato);
       
     }       
    }//GEN-LAST:event_GuardarContActionPerformed

    private void combocontra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocontra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocontra1ActionPerformed

    private void CerrarContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarContActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarContActionPerformed

    private void fechainicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechainicioKeyTyped
   
    }//GEN-LAST:event_fechainicioKeyTyped

    private void AlquilerTexto1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AlquilerTexto1KeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)|| Character.isISOControl(c)){ 
            AlquilerTexto1.setEditable(true);
            
        }else{
            AlquilerTexto1.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo Alquiler");
            return;
            
        }
    }//GEN-LAST:event_AlquilerTexto1KeyTyped

    private void combocontra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combocontra1MouseClicked
        llenarcombo();
    }//GEN-LAST:event_combocontra1MouseClicked

    private void combocontra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combocontra2MouseClicked
        llenarcombo2();
    }//GEN-LAST:event_combocontra2MouseClicked

    private void LimpiarcontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarcontActionPerformed
    fechafin.setDate(null);
    fechainicio.setDate(null);
    AlquilerTexto1.setText("");
    
    
    
    }//GEN-LAST:event_LimpiarcontActionPerformed

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
            java.util.logging.Logger.getLogger(ContratosVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratosVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratosVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratosVistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContratosVistas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlquilerTexto1;
    private javax.swing.JButton CerrarCont;
    private javax.swing.JButton GuardarCont;
    private javax.swing.JButton Limpiarcont;
    private javax.swing.JComboBox<Inmuebles> combocontra1;
    private javax.swing.JComboBox<Inquilino> combocontra2;
    private com.toedter.calendar.JDateChooser fechafin;
    private com.toedter.calendar.JDateChooser fechainicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlcontra;
    // End of variables declaration//GEN-END:variables
}
