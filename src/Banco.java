
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;



public class Banco extends javax.swing.JFrame {

    public Banco() {
        initComponents();
        this.setTitle("BANCO");
        Image img=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png"));
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDirecciónCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        txtTeléfonoCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cboCuentaCliente = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbpTipoCuenta = new javax.swing.JComboBox<>();
        bcnAgregarTipoCuenta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMontoInicial = new javax.swing.JTextField();
        btnAgregarCuenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cboConsultaCliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cboConsultaTipoCuenta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblDirecciónCliente = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        lblTeléfonoCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(143, 161, 173));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        lblLogo.setText("jLabel1");
        lblLogo.setMaximumSize(new java.awt.Dimension(200, 200));
        lblLogo.setMinimumSize(new java.awt.Dimension(100, 100));
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 280, 280));

        jPanel1.setBackground(new java.awt.Color(198, 206, 211));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NUEVO CLIENTE"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 49, 69, 30));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 93, 69, 30));

        txtDirecciónCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecciónClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtDirecciónCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 138, 250, 30));

        btnAgregarCliente.setBackground(new java.awt.Color(210, 224, 251));
        btnAgregarCliente.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnAgregarCliente.setForeground(new java.awt.Color(60, 60, 60));
        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 206, 140, 36));

        txtTeléfonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeléfonoClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtTeléfonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 94, 250, 30));

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Dirección:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 137, 69, 30));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 50, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 360, 280));

        jPanel2.setBackground(new java.awt.Color(198, 206, 211));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("NUEVA CUENTA"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Cliente:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 47, 69, 30));

        cboCuentaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCuentaClienteActionPerformed(evt);
            }
        });
        jPanel2.add(cboCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 48, 154, 30));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Tipo Cuenta:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 96, 90, 30));

        jPanel2.add(cbpTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 97, 154, 30));

        bcnAgregarTipoCuenta.setText("+");
        bcnAgregarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcnAgregarTipoCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(bcnAgregarTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 98, -1, 30));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("Monto:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 146, 90, 30));

        txtMontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoInicialActionPerformed(evt);
            }
        });
        jPanel2.add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 147, 200, 30));

        btnAgregarCuenta.setBackground(new java.awt.Color(210, 224, 251));
        btnAgregarCuenta.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnAgregarCuenta.setForeground(new java.awt.Color(60, 60, 60));
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 214, 140, 36));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 360, 280));

        jPanel3.setBackground(new java.awt.Color(198, 206, 211));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("MOVIMIENTOS"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setText("Cliente:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 18, 69, 30));

        jPanel3.add(cboConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 58, 154, 30));

        jLabel9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setText("Tipo cuenta:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 18, 90, 30));

        jPanel3.add(cboConsultaTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 58, 154, 30));

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 60, 60));
        jLabel10.setText("Tipo movimiento:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 18, 139, 30));

        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO RETIRO" }));
        jPanel3.add(cboTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 58, 154, 30));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 60, 60));
        jLabel11.setText("Monto:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 18, 90, 30));

        txtMontoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMovimientoActionPerformed(evt);
            }
        });
        jPanel3.add(txtMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 58, 156, 30));

        btnAgregarMovimiento.setBackground(new java.awt.Color(210, 224, 251));
        btnAgregarMovimiento.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        btnAgregarMovimiento.setForeground(new java.awt.Color(60, 60, 60));
        btnAgregarMovimiento.setText("Agregar Movimiento");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 55, -1, 36));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 1020, 120));

        jPanel4.setBackground(new java.awt.Color(198, 206, 211));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE CUENTA"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 60, 60));
        jLabel12.setText("Teléfono:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 69, 30));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 60, 60));
        jLabel13.setText("Dirección:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 69, 30));

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 60, 60));
        jLabel15.setText("Monto Inicial:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 30));

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(60, 60, 60));
        jLabel16.setText("Tipo Cuenta:");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 100, 30));

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(60, 60, 60));
        jLabel17.setText("Nombre:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 69, 30));

        lblCliente.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblCliente.setForeground(new java.awt.Color(60, 60, 60));
        jPanel4.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 69, 30));

        lblDirecciónCliente.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblDirecciónCliente.setForeground(new java.awt.Color(60, 60, 60));
        jPanel4.add(lblDirecciónCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 69, 30));

        lblMontoInicial.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblMontoInicial.setForeground(new java.awt.Color(60, 60, 60));
        jPanel4.add(lblMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 69, 30));

        lblTipoCuenta.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblTipoCuenta.setForeground(new java.awt.Color(60, 60, 60));
        jPanel4.add(lblTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 69, 30));

        lblTeléfonoCliente.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        lblTeléfonoCliente.setForeground(new java.awt.Color(60, 60, 60));
        jPanel4.add(lblTeléfonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 69, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 490, 330));

        tblMovimientos.setBackground(new java.awt.Color(198, 206, 211));
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 520, 230));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setText("SALDO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 680, 200, 70));

        jLabel14.setText("MONTO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 690, 250, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtDirecciónClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecciónClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecciónClienteActionPerformed

    private void txtTeléfonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeléfonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeléfonoClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void bcnAgregarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcnAgregarTipoCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bcnAgregarTipoCuentaActionPerformed

    private void txtMontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoInicialActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void txtMontoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMovimientoActionPerformed

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    private void cboCuentaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCuentaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCuentaClienteActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcnAgregarTipoCuenta;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JComboBox<String> cboConsultaCliente;
    private javax.swing.JComboBox<String> cboConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cboCuentaCliente;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JComboBox<String> cbpTipoCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDirecciónCliente;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblTeléfonoCliente;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtDirecciónCliente;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTeléfonoCliente;
    // End of variables declaration//GEN-END:variables
}
