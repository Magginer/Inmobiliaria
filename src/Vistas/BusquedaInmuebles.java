/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.Conexion;
import AccesData.InmueblesData;
import Entidades.Inmuebles;
import Entidades.Propietario;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import AccesData.InmueblesData;
import AccesData.PropietarioData;
import Entidades.Inmuebles;
import Entidades.Propietario;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javie
 */
public class BusquedaInmuebles extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();

    Connection con = null;
    ArrayList Plista;
    PropietarioData propietario = new PropietarioData();
    InmueblesData inmueble = new InmueblesData();
    Propietario propi = new Propietario();
    ArrayList<Inmuebles> inmuebles;

    
    public BusquedaInmuebles() {
        initComponents();
        llenarCombo();
        
       con = Conexion.getConexion();

       //pepapig la mejor sin duda alguna , el terror de los punteros

        Plista = new ArrayList();
       
        armarTabla();
        armarTabla2();
        //llenartabla2();
        llenarTabla();

        ImageIcon wallpaper = new ImageIcon("src/imagenes/manoca.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlbusinmu.getWidth(), jlbusinmu.getHeight(), Image.SCALE_SMOOTH));
        jlbusinmu.setIcon(icono);
        this.repaint();
        
        jtinmupropietario.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent Mouse_evt){
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if(Mouse_evt.getClickCount()== 1){
                    
                }
                   jtdireccion.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 1).toString());
                   jtaltura.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 2).toString());
                   jttipoinmu.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 3).toString());
                   jtsuperficie.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 4).toString());
                   jtprecio.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 5).toString());
                   jtzona.setText(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 6).toString());
                   String est = jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 7).toString();
                   if (est =="Disponible"){
                       jrbdisponible.setSelected(false);
                       
                   }if (est =="En Uso"){
                       jrbdisponible.setSelected(true);
                       
                   }
                   
            }
        });
        

    }

    private void llenarCombo() {
        jcpropiinmu.removeAllItems(); // borramos todo lo del combo para la carga limpia
        Plista = (ArrayList) propietario.ListarPropietarios();
        Iterator iterador = Plista.iterator();
        while (iterador.hasNext()) {
            Propietario pro = (Propietario) iterador.next();
            jcpropiinmu.addItem(pro);
        }
    }

    private void armarTabla() {

        modelo.addColumn("ID Inmueble");
        modelo.addColumn("Direccion");
        modelo.addColumn("Altura");
        modelo.addColumn("Estado");
        modelo.addColumn("ID Propietario");

        jtinmuactivos.setModel(modelo);
    }

    private void llenarTabla() {
        Borrarfila();
        InmueblesData inmu = new InmueblesData();
        // Propietario pd= new Propietario();     funciona pero me sigue trayendo 0 como id
        inmuebles = (ArrayList) inmu.inmueblesxestado();   //contratos

        for (Inmuebles inmueble : inmuebles) {   // : contratos
            modelo.addRow(new Object[]{inmueble.getIdinmueble(), inmueble.getDireccion(), inmueble.getAltura(), inmueble.isEstado() ? "En Uso" : "Disponible", inmueble.getPropietario().getIdpropietario()});
        }
        
    }

    //pepapig la mejor puntera 
    private void armarTabla2() {
        //ArrayList<Object> columnas = new ArrayList<Object>();
        modelo2.addColumn("ID Inmueble");
        modelo2.addColumn("Direccion");
        modelo2.addColumn("Altura");
        modelo2.addColumn("Tipo");
        modelo2.addColumn("Superficie");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Zona");
        modelo2.addColumn("Estado");
        /* for (Object it : columnas) {
            modelo.addColumn(it);
        }*/
        jtinmupropietario.setModel(modelo2);
    }

    private void Borrarfilatabla1() {
        int fila = modelo.getRowCount() - 1;
        for (; fila >= 0; fila--) {
            modelo.removeRow(fila);
        }
    }
    
    private void Borrarfila() {
        int fila = modelo2.getRowCount() - 1;
        for (; fila >= 0; fila--) {
            modelo2.removeRow(fila);
        }
    }

    //Pepapig la mejor puntera .
    public void llenartabla2() {
        Borrarfila(); // Limpia la tabla
        InmueblesData inmu = new InmueblesData();

        // Obtén el propietario seleccionado en el JComboBox
        Propietario propiselecto = (Propietario) jcpropiinmu.getSelectedItem();

        if (propiselecto != null) {
            // Obtiene el ID del propietario seleccionado
            int idpropietario = propiselecto.getIdpropietario(); // Asegúrate de tener un método getIdPropietario en la clase Propietario

            // Llama al método ListarInmueblesPorPropietario para obtener la lista de inmuebles
            // ArrayList<Inmuebles> 
            inmuebles = (ArrayList) inmu.InmueblesPorPropietarios(idpropietario); // Asume que ListarInmueblesPorPropietario existe y devuelve la lista de inmuebles

            // Llena la JTable con los datos de los inmuebles
            for (Inmuebles inmueble : inmuebles) {
                modelo2.addRow(new Object[]{inmueble.getIdinmueble(), inmueble.getDireccion(), inmueble.getAltura(), inmueble.getTipo(), inmueble.getSuperficie(), inmueble.getPrecio(), inmueble.getZona(), inmueble.isEstado() ? "En Uso" : "Disponible"});
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtprecio = new javax.swing.JTextField();
        jtdireccion = new javax.swing.JTextField();
        jtaltura = new javax.swing.JTextField();
        jttipoinmu = new javax.swing.JTextField();
        jtsuperficie = new javax.swing.JTextField();
        jtzona = new javax.swing.JTextField();
        jrbdisponible = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcpropiinmu = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtinmupropietario = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtinmuactivos = new javax.swing.JTable();
        jlbusinmu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Inmuebles");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 400, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado Disponible / En Uso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 190, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Altura");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Inmueble");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Superficie");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Zona");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 70, 40));

        jtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(jtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 110, -1));

        jtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtdireccionKeyTyped(evt);
            }
        });
        getContentPane().add(jtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 110, -1));

        jtaltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtalturaKeyTyped(evt);
            }
        });
        getContentPane().add(jtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, -1));

        jttipoinmu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jttipoinmuKeyTyped(evt);
            }
        });
        getContentPane().add(jttipoinmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 110, -1));

        jtsuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtsuperficieKeyTyped(evt);
            }
        });
        getContentPane().add(jtsuperficie, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 110, -1));

        jtzona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtzonaKeyTyped(evt);
            }
        });
        getContentPane().add(jtzona, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 110, -1));

        jrbdisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbdisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(jrbdisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 90, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 90, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Propietario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 80, 30));

        jcpropiinmu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcpropiinmuMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcpropiinmuMousePressed(evt);
            }
        });
        jcpropiinmu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcpropiinmuActionPerformed(evt);
            }
        });
        jPanel1.add(jcpropiinmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 180, -1));

        jtinmupropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtinmupropietario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 660, 90));

        jButton4.setText("Cerrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 480, 100, 50));

        jtinmuactivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jtinmuactivos);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 430, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 570));

        jlbusinmu.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jlbusinmu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcpropiinmuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcpropiinmuMouseClicked
   
    }//GEN-LAST:event_jcpropiinmuMouseClicked

    private void jcpropiinmuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcpropiinmuMousePressed
         
    }//GEN-LAST:event_jcpropiinmuMousePressed

    private void jcpropiinmuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcpropiinmuActionPerformed
       llenartabla2();
    }//GEN-LAST:event_jcpropiinmuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //modificar cambios
       
       int idinmueble = Integer.parseInt(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 0).toString());
       String direccion = jtdireccion.getText();
       int altura = Integer.parseInt(jtaltura.getText());
       String tipo = jttipoinmu.getText();
       int superficie = Integer.parseInt(jtsuperficie.getText());
       int precio = Integer.parseInt(jtprecio.getText());
       String zona = jtzona.getText();
       boolean estado = jrbdisponible.isSelected(); //? "En Uso" : "Disponible"
       
       InmueblesData ind = new InmueblesData();
       boolean exito = ind.actualizarInmueble(idinmueble, direccion, altura, tipo, superficie, precio, zona, estado);
       
       if(exito){
           JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente.");
       }else {
           JOptionPane.showMessageDialog(null, "error al guardar los cambios.");
       }
       
       Borrarfilatabla1();
       llenarTabla();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     // deletear inmueble
     
        int idinmueble = Integer.parseInt(jtinmupropietario.getValueAt(jtinmupropietario.getSelectedRow(), 0).toString());
        InmueblesData inmue= new InmueblesData();
        inmue.DeletearInmueble(idinmueble);
        
        JOptionPane.showMessageDialog(null, "Inmueble Eliminado Correctamente");
        
        llenartabla2();
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtdireccionKeyTyped
       char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jtdireccion.setEditable(true);

        } else {
            jtdireccion.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Direccion");
            return;

        }
    }//GEN-LAST:event_jtdireccionKeyTyped

    private void jtalturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtalturaKeyTyped
       char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtaltura.setEditable(true);

        } else {
            jtaltura.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, iingrese solo NUMEROS en campo Altura");
            return;

        }
    }//GEN-LAST:event_jtalturaKeyTyped

    private void jttipoinmuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jttipoinmuKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jttipoinmu.setEditable(true);

        } else {
            jttipoinmu.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Tipo de inmueble");
            return;

        }
    }//GEN-LAST:event_jttipoinmuKeyTyped

    private void jtsuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtsuperficieKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtsuperficie.setEditable(true);

        } else {
            jtsuperficie.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, iingrese solo NUMEROS en campo Superficie");
            return;

        }
    }//GEN-LAST:event_jtsuperficieKeyTyped

    private void jtzonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtzonaKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)) {
            jtzona.setEditable(true);

        } else {
            jtzona.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, ingrese solo LETRAS en campo Zona");
            return;

        }
    }//GEN-LAST:event_jtzonaKeyTyped

    private void jtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtprecioKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c) || Character.isISOControl(c)) {
            jtprecio.setEditable(true);

        } else {
            jtprecio.setEditable(false);
            JOptionPane.showMessageDialog(null, "ERROR: Por favor, iingrese solo NUMEROS en campo Precio");
            return;

        }
    }//GEN-LAST:event_jtprecioKeyTyped

    private void jrbdisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbdisponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbdisponibleActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaInmuebles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaInmuebles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<Propietario> jcpropiinmu;
    private javax.swing.JLabel jlbusinmu;
    private javax.swing.JRadioButton jrbdisponible;
    private javax.swing.JTextField jtaltura;
    private javax.swing.JTextField jtdireccion;
    private javax.swing.JTable jtinmuactivos;
    private javax.swing.JTable jtinmupropietario;
    private javax.swing.JTextField jtprecio;
    private javax.swing.JTextField jtsuperficie;
    private javax.swing.JTextField jttipoinmu;
    private javax.swing.JTextField jtzona;
    // End of variables declaration//GEN-END:variables
}
