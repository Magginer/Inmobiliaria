/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import AccesData.Conexion;
import AccesData.ContratoData;
import AccesData.InmueblesData;
import AccesData.PropietarioData;
import Entidades.Contrato;
import Entidades.Inmuebles;
import Entidades.Propietario;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author javieer234
 */
public class BusquedaContratos extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();

    Connection con = null;
    ArrayList Clista;
    InmueblesData inmueble = new InmueblesData();
    ContratoData cont = new ContratoData();
    ArrayList<Contrato> contratos;
    
    
    public BusquedaContratos() {
        initComponents();
        con = Conexion.getConexion();
        Clista = new ArrayList();
        armarTabla();
        llenarTabla();
        armarTabla2();
        llenarTabla2();
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/busquedacontra.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlbuscon.getWidth(), jlbuscon.getHeight(), Image.SCALE_SMOOTH));
        jlbuscon.setIcon(icono);
        this.repaint();
        
        jtablacontra.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_evt){
                JTable table = (JTable) Mouse_evt.getSource();
                Point point = Mouse_evt.getPoint();
                int row = table.rowAtPoint(point);
                if(Mouse_evt.getClickCount()==1){
                    
                }
                 // creamos una variable de tipo LocalDate y le pasamos el dato de la tabla , posteriormente lo convertimos a la fecha actual y final se lo pasamos al jDateChooser1
                LocalDate fechadeInicio= (LocalDate) jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 1); 
                Instant instant = fechadeInicio.atStartOfDay(ZoneId.systemDefault()).toInstant();
                Date fechainicio= Date.from(instant);
                jDateChooser1.setDate(fechainicio);
                
                LocalDate fechadeFin= (LocalDate) jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 2);
                Instant instante = fechadeFin.atStartOfDay(ZoneId.systemDefault()).toInstant();
                Date fechafinal= Date.from(instante);
                jDateChooser2.setDate(fechafinal);
                
                jtalquiler.setText(jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 3).toString());
                jtinquilino.setText(jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 5).toString());
                jtid.setText(jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 6).toString());
                String est = jtablacontra.getValueAt(jtablacontra.getSelectedRow(), 4).toString();
                if(est =="Vigente"){
                    jrbvigencia.setSelected(true);
                }if(est =="Sin Contrato"){
                    jrbvigencia.setSelected(false);
                }
                
                
            }
        });
        
        
        
    }
        private void armarTabla() {

        modelo.addColumn("ID Contrato"); //0
        modelo.addColumn("Fecha Inicio"); //1
        modelo.addColumn("Fecha Finalizacion"); //2
        modelo.addColumn("Alquiler"); //3
        modelo.addColumn("Vigente"); //4
        modelo.addColumn("Inquilino"); //5
        modelo.addColumn("Inmueble"); //6
        

        jtablacontra.setModel(modelo);
    }
    
        private void Borrarfila() {
        int fila = modelo.getRowCount() - 1;
        for (; fila >= 0; fila--) {
            modelo.removeRow(fila);
        }
    }
        
    private void llenarTabla() {
        Borrarfila();
        ContratoData cont = new ContratoData();
        // Propietario pd= new Propietario();     funciona pero me sigue trayendo 0 como id
        contratos = (ArrayList) cont.ListarContrato();

        for (Contrato contrato : contratos) {
            modelo.addRow(new Object[]{contrato.getIdcontrato(), contrato.getFechadeinicio(), contrato.getFechadefinalizacion(),contrato.getAlquiler(), contrato.isVigente()? "Vigente" : "Sin Contrato", contrato.getInquilino().getIdinquilino(), contrato.getInmueble().getIdinmueble()});
    
    } 
    
    } 
      
    private void armarTabla2(){
        modelo2.addColumn("ID Contrato");
        modelo2.addColumn("Vigencia");
        modelo2.addColumn("Inquilino");
        
        jtvigentes.setModel(modelo2);
    }
    
    private void llenarTabla2() {
        Borrarfila2();
        ContratoData cod = new ContratoData();
        
        contratos = (ArrayList) cod.ContratosVigentes();   

        for (Contrato con : contratos) {  
            modelo2.addRow(new Object[]{con.getIdcontrato(),  con.isVigente() ? "Vingente" : "Sin Contrato", con.getInquilino().getNombre()});
        }
        
    }
    
   private void Borrarfila2() {
        int fila = modelo2.getRowCount() - 1;
        for (; fila >= 0; fila--) {
            modelo2.removeRow(fila);
        }
    }         
    
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrbvigencia = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablacontra = new javax.swing.JTable();
        jtalquiler = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtinquilino = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtvigentes = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jlbuscon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbvigencia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jrbvigencia.setText("Vigencia");
        getContentPane().add(jrbvigencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 100, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTRATOS VIGENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 5, -1, -1));

        jtablacontra.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtablacontra);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 720, 150));
        jPanel1.add(jtalquiler, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 90, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Precio Alquiler");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 110, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Inicio de Contrato");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 20));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Fin de Contrato");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 120, 20));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 130, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 30, 20));
        jPanel1.add(jtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 80, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Inquilino");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 80, 20));
        jPanel1.add(jtinquilino, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 80, 30));

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, 90, 40));

        jtvigentes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtvigentes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 540, 100));

        jButton2.setText("Eliminar");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 90, 40));

        jButton1.setText("Modificar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 90, 40));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 610));
        getContentPane().add(jlbuscon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaContratos().setVisible(true);
            }
        });//qweqweasd
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbuscon;
    private javax.swing.JRadioButton jrbvigencia;
    private javax.swing.JTable jtablacontra;
    private javax.swing.JTextField jtalquiler;
    private javax.swing.JTextField jtid;
    private javax.swing.JTextField jtinquilino;
    private javax.swing.JTable jtvigentes;
    // End of variables declaration//GEN-END:variables
}
