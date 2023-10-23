/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.Conexion;
import AccesData.InmueblesData;
import AccesData.PropietarioData;
import Entidades.Inmuebles;
import Entidades.Propietario;
import java.awt.Image;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class InmueblesVista extends javax.swing.JFrame {

    Connection con = Conexion.getConexion();
    ArrayList Plista;
    PropietarioData propietario = new PropietarioData();
    InmueblesData inmueble = new InmueblesData();
    Propietario propi = new Propietario();
    int proid;
            
    
    public InmueblesVista(){
        initComponents();
        con = Conexion.getConexion();
        Plista = new ArrayList();
        
        
        
        
        setSize(458, 485);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/TERRA_Inmuebles.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(comboinmu.getWidth(), comboinmu.getHeight(), Image.SCALE_SMOOTH));
        comboinmu.setIcon(icono);
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtinmualtu = new javax.swing.JTextField();
        jtinmutipo = new javax.swing.JTextField();
        jtinmusuper = new javax.swing.JTextField();
        jtinmuprec = new javax.swing.JTextField();
        jtinmuzona = new javax.swing.JTextField();
        jtinmudirec = new javax.swing.JTextField();
        jbinmuguardar = new javax.swing.JButton();
        jbinmucerrar = new javax.swing.JButton();
        jbinmulimpiar = new javax.swing.JButton();
        combopropi = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        comboinmu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inmuebles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 230, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 260, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Superficie");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 80, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 70, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Zona");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Propietario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 80, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 70, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Altura");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, 30));

        jtinmualtu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmualtuKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmualtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, -1));

        jtinmutipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmutipoKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmutipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 130, -1));

        jtinmusuper.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmusuperKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmusuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 180, -1));

        jtinmuprec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmuprecKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmuprec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 120, -1));

        jtinmuzona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmuzonaKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmuzona, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 120, -1));

        jtinmudirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtinmudirecKeyTyped(evt);
            }
        });
        getContentPane().add(jtinmudirec, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, -1));

        jbinmuguardar.setForeground(new java.awt.Color(0, 0, 0));
        jbinmuguardar.setText("Guardar ");
        jbinmuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinmuguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jbinmuguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jbinmucerrar.setForeground(new java.awt.Color(0, 0, 0));
        jbinmucerrar.setText("Cerrar");
        jbinmucerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinmucerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jbinmucerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jbinmulimpiar.setText("Limpiar");
        jbinmulimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbinmulimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jbinmulimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, -1));

        combopropi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combopropiMouseClicked(evt);
            }
        });
        combopropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combopropiActionPerformed(evt);
            }
        });
        getContentPane().add(combopropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 220, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 490));

        comboinmu.setBackground(new java.awt.Color(255, 51, 153));
        getContentPane().add(comboinmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbinmuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinmuguardarActionPerformed
       if(jtinmudirec.getText().length()<=0 || jtinmualtu.getText().length()<=0 || jtinmutipo.getText().length()<=0 || jtinmusuper.getText().length()<=0 || jtinmuprec.getText().length()<=0 || jtinmuzona.getText().length()<=0 || combopropi.getSelectedItem()==null){ 
            JOptionPane.showMessageDialog(null, "Por favor ingrese datos en todos los campos antes de guardar" );
        }else{
       String direccion = jtinmudirec.getText();
       int altura = Integer.parseInt(jtinmualtu.getText());
       String tipo = jtinmutipo.getText();
       int superficie = Integer.parseInt(jtinmusuper.getText());
       int precio = Integer.parseInt(jtinmuprec.getText());
       String zona = jtinmuzona.getText();
       Propietario pro = (Propietario) combopropi.getSelectedItem();
       
       
       
       Inmuebles inmu = new Inmuebles();
       
       inmu.setDireccion(direccion);
       inmu.setAltura(altura);
       inmu.setTipo(tipo);
       inmu.setSuperficie(superficie);
       inmu.setPrecio(precio);
       inmu.setZona(zona);
       inmu.setPropietario(pro);
       inmu.setEstado(false);
       
       inmueble.GuardarInmueble(inmu);
       }
        
    

       
    }//GEN-LAST:event_jbinmuguardarActionPerformed

    private void llenarcombo () {
        
       combopropi.removeAllItems();
       Plista = (ArrayList) propietario.ListarPropietarios();
       Iterator iterador = Plista.iterator();
       while(iterador.hasNext()){
           Propietario pro = (Propietario) iterador.next();
           combopropi.addItem(pro);   
       }
    
    }
    
    private void combopropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combopropiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combopropiActionPerformed

    private void jbinmucerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinmucerrarActionPerformed
        dispose();
    }//GEN-LAST:event_jbinmucerrarActionPerformed

    private void jtinmudirecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmudirecKeyTyped
        char c = evt.getKeyChar();
        
         if(Character.isAlphabetic(c)||Character.isWhitespace(c)|| Character.isISOControl(c)){ 
            jtinmudirec.setEditable(true);
            
        }else{
            jtinmudirec.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo Letras en campo Direccion");
            return;
            
        }
    }//GEN-LAST:event_jtinmudirecKeyTyped

    private void jtinmualtuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmualtuKeyTyped
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)|| Character.isISOControl(c)){ 
            jtinmualtu.setEditable(true);
            
        }else{
            jtinmualtu.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo Altura");
            return;
            
        }
    }//GEN-LAST:event_jtinmualtuKeyTyped

    private void jtinmutipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmutipoKeyTyped
       char c = evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c) || Character.isISOControl(c)){ 
            jtinmutipo.setEditable(true);
            
        }else{
            jtinmutipo.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo Letras en campo Tipo");
            return;
            
        }
    }//GEN-LAST:event_jtinmutipoKeyTyped

    private void jtinmusuperKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmusuperKeyTyped
       char c = evt.getKeyChar();
        
        if(Character.isDigit(c)|| Character.isISOControl(c)){ 
            jtinmusuper.setEditable(true);
            
        }else{
            jtinmusuper.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo Superficie");
            return;
            
        }
    }//GEN-LAST:event_jtinmusuperKeyTyped

    private void jtinmuprecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmuprecKeyTyped
         char c = evt.getKeyChar();
        
        if(Character.isDigit(c)|| Character.isISOControl(c)){ 
            jtinmuprec.setEditable(true);
            
        }else{
            jtinmuprec.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo NUMEROS en campo Precio");
            return;
            
        }
    }//GEN-LAST:event_jtinmuprecKeyTyped

    private void jtinmuzonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtinmuzonaKeyTyped
       char c = evt.getKeyChar();
        
        if(Character.isLetter(c)||Character.isWhitespace(c) || Character.isISOControl(c)){ 
            jtinmuzona.setEditable(true);
            
        }else{
            jtinmuzona.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo Letras en campo Zona");
            return;
            
        }
    }//GEN-LAST:event_jtinmuzonaKeyTyped

    private void combopropiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combopropiMouseClicked
        llenarcombo();
    }//GEN-LAST:event_combopropiMouseClicked

    private void jbinmulimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbinmulimpiarActionPerformed
       
        
     jtinmualtu.setText("");
     jtinmudirec.setText("");
     jtinmuprec.setText("");
     jtinmusuper.setText("");
     jtinmutipo.setText("");
     jtinmuzona.setText("");
     combopropi.removeAllItems();
     
    }//GEN-LAST:event_jbinmulimpiarActionPerformed

    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(InmueblesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InmueblesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InmueblesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InmueblesVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InmueblesVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel comboinmu;
    private javax.swing.JComboBox<Propietario> combopropi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbinmucerrar;
    private javax.swing.JButton jbinmuguardar;
    private javax.swing.JButton jbinmulimpiar;
    private javax.swing.JTextField jtinmualtu;
    private javax.swing.JTextField jtinmudirec;
    private javax.swing.JTextField jtinmuprec;
    private javax.swing.JTextField jtinmusuper;
    private javax.swing.JTextField jtinmutipo;
    private javax.swing.JTextField jtinmuzona;
    // End of variables declaration//GEN-END:variables
}
