/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;

//lola
public class Prueba2 extends javax.swing.JFrame {
    
    private Timer animationTimer;
    
    public Prueba2() {
        initComponents();
        setSize(672, 575);
        setLocationRelativeTo(null);
        
        ImageIcon wallpaper =new ImageIcon("src/imagenes/LOGOTIPO800x533.png");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jlpadre.getWidth(), jlpadre.getHeight(), Image.SCALE_SMOOTH));
        jlpadre.setIcon(icono);
        this.repaint();
        
        ImageIcon wallpape =new ImageIcon("src/imagenes/titulo.png");
        Icon icon = new ImageIcon(wallpape.getImage().getScaledInstance(jltitulo.getWidth(), jltitulo.getHeight(), Image.SCALE_SMOOTH));
        jltitulo.setIcon(icon);
        this.repaint();
        
        ImageIcon wallpap =new ImageIcon("src/imagenes/menuuu.png");
        Icon ico = new ImageIcon(wallpap.getImage().getScaledInstance(jlmenuentrada.getWidth(), jlmenuentrada.getHeight(), Image.SCALE_SMOOTH));
        jlmenuentrada.setIcon(ico);
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

        jpadre = new javax.swing.JPanel();
        jlpadre = new javax.swing.JLabel();
        menu1entrada = new javax.swing.JPanel();
        jlmenuentrada = new javax.swing.JLabel();
        nuevaentrada = new javax.swing.JPanel();
        jlnuevaentrada = new javax.swing.JLabel();
        jpbotones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jptitulo = new javax.swing.JPanel();
        jltitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(672, 575));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpadre.setBackground(new java.awt.Color(102, 102, 102));
        jpadre.setLayout(new java.awt.CardLayout());
        jpadre.add(jlpadre, "card3");

        menu1entrada.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        menu1entrada.add(jlmenuentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 450));

        jpadre.add(menu1entrada, "card2");

        javax.swing.GroupLayout nuevaentradaLayout = new javax.swing.GroupLayout(nuevaentrada);
        nuevaentrada.setLayout(nuevaentradaLayout);
        nuevaentradaLayout.setHorizontalGroup(
            nuevaentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlnuevaentrada, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        nuevaentradaLayout.setVerticalGroup(
            nuevaentradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlnuevaentrada, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        jpadre.add(nuevaentrada, "card4");

        getContentPane().add(jpadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 520, 450));

        jpbotones.setBackground(new java.awt.Color(69, 125, 88));

        jButton1.setText("Nueva Entrada");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificación");

        jButton3.setText("Eliminar");

        jButton4.setText("Busqueda");

        javax.swing.GroupLayout jpbotonesLayout = new javax.swing.GroupLayout(jpbotones);
        jpbotones.setLayout(jpbotonesLayout);
        jpbotonesLayout.setHorizontalGroup(
            jpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbotonesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpbotonesLayout.setVerticalGroup(
            jpbotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpbotonesLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jButton3)
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        getContentPane().add(jpbotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 550));

        jptitulo.setBackground(new java.awt.Color(153, 255, 51));

        javax.swing.GroupLayout jptituloLayout = new javax.swing.GroupLayout(jptitulo);
        jptitulo.setLayout(jptituloLayout);
        jptituloLayout.setHorizontalGroup(
            jptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        jptituloLayout.setVerticalGroup(
            jptituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jltitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jptitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 0, 520, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       jpadre.removeAll();
       jpadre.add(menu1entrada); 
       jpadre.repaint();
       jpadre.revalidate();
        
        animationTimer = new Timer(3, new ActionListener() {
        private int xPos = -menu1entrada.getWidth();

        @Override
        public void actionPerformed(ActionEvent e) {
            xPos += 10; // Incrementa gradualmente la posición X

            if (xPos >= 0) {
                xPos = 0; // Asegura que no se desplace más allá de la posición final
                ((Timer) e.getSource()).stop(); // Detiene el temporizador
            }

            menu1entrada.setLocation(xPos, menu1entrada.getY());
            menu1entrada.repaint();
        }

    });

    animationTimer.start();
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
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jlmenuentrada;
    private javax.swing.JLabel jlnuevaentrada;
    private javax.swing.JLabel jlpadre;
    private javax.swing.JLabel jltitulo;
    private javax.swing.JPanel jpadre;
    private javax.swing.JPanel jpbotones;
    private javax.swing.JPanel jptitulo;
    private javax.swing.JPanel menu1entrada;
    private javax.swing.JPanel nuevaentrada;
    // End of variables declaration//GEN-END:variables
}