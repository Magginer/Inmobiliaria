
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PropiID = new javax.swing.JTextField();
        PropiDNI = new javax.swing.JTextField();
        PropiNombre = new javax.swing.JTextField();
        PropiApe = new javax.swing.JTextField();
        PropiDom = new javax.swing.JTextField();
        PropiTel = new javax.swing.JTextField();
        GuardarPropi = new javax.swing.JButton();
        CerrarPropi = new javax.swing.JButton();
        Limpiarpropi = new javax.swing.JButton();
        jlprovista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nuevo Propietario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 170, 50));

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
        jLabel3.setText("DNI");
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
        jLabel5.setText("Domicilio");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Telefono");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        PropiID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiIDKeyTyped(evt);
            }
        });
        getContentPane().add(PropiID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 60, -1));

        PropiDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiDNIKeyTyped(evt);
            }
        });
        getContentPane().add(PropiDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));

        PropiNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiNombreKeyTyped(evt);
            }
        });
        getContentPane().add(PropiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));

        PropiApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiApeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiApeKeyTyped(evt);
            }
        });
        getContentPane().add(PropiApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        PropiDom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiDomKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiDomKeyTyped(evt);
            }
        });
        getContentPane().add(PropiDom, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, -1));

        PropiTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PropiTelKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PropiTelKeyTyped(evt);
            }
        });
        getContentPane().add(PropiTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 140, -1));

        GuardarPropi.setText("Guardar");
        GuardarPropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarPropiActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarPropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 30));

        CerrarPropi.setText("Cerrar");
        CerrarPropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarPropiActionPerformed(evt);
            }
        });
        getContentPane().add(CerrarPropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 100, -1));

        Limpiarpropi.setText("Limpiar");
        Limpiarpropi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarpropiActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiarpropi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));
        getContentPane().add(jlprovista, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void GuardarPropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarPropiActionPerformed
   

    }//GEN-LAST:event_GuardarPropiActionPerformed

    private void CerrarPropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarPropiActionPerformed
        dispose();
    }//GEN-LAST:event_CerrarPropiActionPerformed

    private void PropiIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiIDKeyPressed

    }//GEN-LAST:event_PropiIDKeyPressed

    private void PropiDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiDNIKeyPressed

    }//GEN-LAST:event_PropiDNIKeyPressed

    private void PropiTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiTelKeyPressed

    }//GEN-LAST:event_PropiTelKeyPressed

    private void PropiNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiNombreKeyPressed

    }//GEN-LAST:event_PropiNombreKeyPressed

    private void PropiApeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiApeKeyPressed

    }//GEN-LAST:event_PropiApeKeyPressed

    private void PropiDomKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiDomKeyPressed

    }//GEN-LAST:event_PropiDomKeyPressed

    private void PropiIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiIDKeyTyped
  
    }//GEN-LAST:event_PropiIDKeyTyped

    private void PropiDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiDNIKeyTyped
       
    }//GEN-LAST:event_PropiDNIKeyTyped

    private void PropiNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiNombreKeyTyped
     
    }//GEN-LAST:event_PropiNombreKeyTyped

    private void PropiApeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiApeKeyTyped
       
    }//GEN-LAST:event_PropiApeKeyTyped

    private void PropiDomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiDomKeyTyped
      
    }//GEN-LAST:event_PropiDomKeyTyped

    private void PropiTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PropiTelKeyTyped
        
    }//GEN-LAST:event_PropiTelKeyTyped

    private void LimpiarpropiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarpropiActionPerformed

    }//GEN-LAST:event_LimpiarpropiActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarPropi;
    private javax.swing.JButton GuardarPropi;
    private javax.swing.JButton Limpiarpropi;
    private javax.swing.JTextField PropiApe;
    private javax.swing.JTextField PropiDNI;
    private javax.swing.JTextField PropiDom;
    private javax.swing.JTextField PropiID;
    private javax.swing.JTextField PropiNombre;
    private javax.swing.JTextField PropiTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlprovista;
    // End of variables declaration//GEN-END:variables
}
