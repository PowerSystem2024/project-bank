package bancouniversidad;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Banco extends javax.swing.JFrame {

    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta = new ArrayList<String>();
    ArrayList<Cuenta> listacuentas = new ArrayList<Cuenta>();
    Cliente cliente;
    Cuenta cuenta;

    //creo el objeto para agregar la tabla
    DefaultTableModel modelMov = new DefaultTableModel();

    public Banco() {
        initComponents();
        this.setTitle("BANCO FatalERROR!");
        Image img = Toolkit.getDefaultToolkit().getImage(getClass().
                getResource("/img/logg.jpeg"));
        lblLogo.setIcon(new ImageIcon(img.getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_SMOOTH)));
        //declaro las cabeceras de la tabla
        modelMov.addColumn("CUENTA");
        modelMov.addColumn("FECHA");
        modelMov.addColumn("TIPO");
        modelMov.addColumn("MONTO");
        tblMovimientos.setModel(modelMov);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblTipoCuenta = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        cmbTipoCuenta = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        btnSuma = new javax.swing.JButton();
        btnAgregarCuenta = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lvlMovimientoCliente = new javax.swing.JLabel();
        cmbConsultaCliente = new javax.swing.JComboBox<>();
        cmbConsultaTipoCuenta = new javax.swing.JComboBox<>();
        lblMovimientoTipoCuenta = new javax.swing.JLabel();
        cmbTipoMovimiento = new javax.swing.JComboBox<>();
        lblTipoMovimiento = new javax.swing.JLabel();
        lblMovimientoMonto = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblTelefonoCliente = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblTipoCuentaCliente = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblMontoCliente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        lblShowSaldo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logg.jpeg"))); // NOI18N
        lblLogo.setText("jLabel2");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 200, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblNombre.setText("Nombre");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 20));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 20));
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 30));

        lblTelefono.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTelefono.setText("Telefono");
        jPanel4.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 40));
        jPanel4.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 30));

        lblDireccion.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblDireccion.setText("Direccion");
        jPanel4.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 40));

        btnAgregarCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/addCliente1.png"))); // NOI18N
        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 180, 30));

        lblNombre1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblNombre1.setText("Nombre");
        jPanel4.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));

        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 160, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 270, 190));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Cuenta"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTipoCuenta.setText("Tipo Cuenta");
        jPanel5.add(lblTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 40));

        lblMonto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblMonto.setText("Monto");
        jPanel5.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 40));

        lblCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblCliente.setText("Cliente");
        jPanel5.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 40));

        cmbTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoCuentaActionPerformed(evt);
            }
        });
        jPanel5.add(cmbTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, 30));

        cmbCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });
        jPanel5.add(cmbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, 30));

        btnSuma.setText("+");
        btnSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 40, 30));

        btnAgregarCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnAgregarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuenta.png"))); // NOI18N
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPanel5.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, 30));

        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel5.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 320, 190));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimientos"));

        lvlMovimientoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lvlMovimientoCliente.setText("Cliente");

        cmbConsultaCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultaClienteActionPerformed(evt);
            }
        });

        cmbConsultaTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbConsultaTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConsultaTipoCuentaActionPerformed(evt);
            }
        });

        lblMovimientoTipoCuenta.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblMovimientoTipoCuenta.setText("TIpo de Cuenta");

        cmbTipoMovimiento.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        cmbTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "EXTRACCION" }));
        cmbTipoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMovimientoActionPerformed(evt);
            }
        });

        lblTipoMovimiento.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblTipoMovimiento.setText("Tipo Movimientos");

        lblMovimientoMonto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lblMovimientoMonto.setText("Monto");

        btnAgregarMovimiento.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnAgregarMovimiento.setText("Agregar Movimiento");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lvlMovimientoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbConsultaTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMovimientoTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(lblMovimientoMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregarMovimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMovimientoMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMovimientoTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lvlMovimientoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbTipoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMontoMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbConsultaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbConsultaTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnAgregarMovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 840, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de Cuenta"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jPanel2.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 200, 30));

        jLabel15.setText("nombre");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 70, 30));

        jLabel16.setText("telefono");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 70, 30));

        lblTelefonoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jPanel2.add(lblTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 200, 30));

        jLabel18.setText("direccion");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 70, 30));

        lblDireccionCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jPanel2.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 200, 30));

        jLabel20.setText("tipo cuenta");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 30));

        lblTipoCuentaCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jPanel2.add(lblTipoCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 200, 30));

        jLabel22.setText("monto inicial");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        lblMontoCliente.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jPanel2.add(lblMontoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 200));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 490, 180));

        lblShowSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lblShowSaldo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/saldo.png"))); // NOI18N
        lblShowSaldo.setText("SALDO");
        getContentPane().add(lblShowSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 140, 30));

        lblSaldo.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 150, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed

    }//GEN-LAST:event_cmbClienteActionPerformed

    private void cmbConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultaClienteActionPerformed
                    refrescarComboCuentas();        
                    verDatos();        
                    verMovimientos();       
        
    }//GEN-LAST:event_cmbConsultaClienteActionPerformed
    
    //para darle formato
    public String aMoneda(double cantidad){
                cantidad = Math.round(cantidad *100.0) / 100.0; //corro la coma 2 lugares a la derecha, luego redondea y deja la coma en su lugar
                DecimalFormat formato = new DecimalFormat("$ #,###.## " ); //solo indico el formato como se va a mostrar
                return formato.format(cantidad); //retorno el objeto redoneado
    }
    
    public void verDatos() {
        cliente = listaClientes.get(cmbConsultaCliente.getSelectedIndex());
        lblNombreCliente.setText(cliente.getNombre());
        lblTelefonoCliente.setText(cliente.getTelefono());
        lblDireccionCliente.setText(cliente.getDireccion());
                        
        //si tiene cuenta vamos a mostrar sus cuentas        
        if(cliente.getMiscuentas().size()>0){
            cuenta = cliente.getMiscuentas().get(cmbConsultaTipoCuenta.getSelectedIndex());
            lblTipoCuentaCliente.setText(cuenta.getTipoCuenta());
            lblMontoCliente.setText(aMoneda(cuenta.getMontoinicial()));
            
        }else{
            lblTipoCuentaCliente.setText("No posee Cuenta");
            lblMontoCliente.setText("No posee Cuenta");
        }
          
    }

    public void verMovimientos() {
           cliente = listaClientes.get(cmbConsultaCliente.getSelectedIndex());
           cuenta= cliente.getMiscuentas().get(cmbConsultaTipoCuenta.getSelectedIndex());
           double saldo = 0;
           while (modelMov.getRowCount()>0){
           modelMov.removeRow(0);
           }
               
           for (Movimiento m : cuenta.getMismovimientos()) {
            Object mov[] = new Object[4];
            mov[0] = cuenta.getTipoCuenta();
            mov[1] = m.getFechaMovimiento();                    
            mov[2] = m.getTipoMovimiento();
            mov[3] = aMoneda(m.getMonto());
            saldo += m.getMonto();
            modelMov.addRow(mov);
        }
            tblMovimientos.setModel(modelMov);
            lblSaldo.setText(aMoneda(saldo));
        }


    private void cmbConsultaTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConsultaTipoCuentaActionPerformed
        verDatos();             
        verMovimientos();
                     
    }//GEN-LAST:event_cmbConsultaTipoCuentaActionPerformed

    private void cmbTipoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoMovimientoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente c = new Cliente();
        c.setNombre(txtNombre.getText());
        c.setTelefono(txtTelefono.getText());
        c.setDireccion(txtDireccion.getText());
        listaClientes.add(c); // con este metodo cargo el array de los clientes
        borrarFormCliente();
        llenarCombosCliente();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
        String tipoCuenta = JOptionPane.showInputDialog(this, "TIPO CUENTA");
        listaTipoCuenta.add(tipoCuenta);
        llenarCombosTipoCuenta();
    }//GEN-LAST:event_btnSumaActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
        //primero creo un cliente global para poder manejarlo dentro del panel
        cliente = listaClientes.get(cmbCliente.getSelectedIndex());
       
        Cuenta cuenta = new Cuenta(); //creo un objeto llamado cuenta
        cuenta.setTipoCuenta(listaTipoCuenta.get(cmbTipoCuenta.getSelectedIndex())); //Obtengo el tipo de cuenta de la lista
        cuenta.setMontoinicial(Double.parseDouble(txtMonto.getText()));
        cliente.addCuenta(cuenta);
        //agrego ahora el primer movimiento, el de apertura de cuenta
        Movimiento m = new Movimiento();
        m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        m.setTipoMovimiento("APERTURA");
        m.setMonto(Double.parseDouble(txtMonto.getText()));
        cuenta.addmovimiento(m);
        borrarFormCuenta();
        refrescarComboCuentas();
        verMovimientos();
        verDatos();
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
            cliente = listaClientes.get(cmbConsultaCliente.getSelectedIndex());
            cuenta= cliente.getMiscuentas().get(cmbConsultaTipoCuenta.getSelectedIndex());
            Movimiento m = new Movimiento();
            m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            m.setTipoMovimiento(cmbTipoMovimiento.getSelectedItem().toString());
           double monto = Double.parseDouble(txtMontoMovimiento.getText().toString());
           monto =  m.getTipoMovimiento().endsWith("DEPOSITO")?monto:(monto *-1);
           m.setMonto(monto);
           cuenta.addmovimiento(m);
            verMovimientos();
       
        
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    private void cmbTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoCuentaActionPerformed

    }//GEN-LAST:event_cmbTipoCuentaActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    public void refrescarComboCuentas() {
        //indentificamos el cliente que tenemos seleccionado
        cliente = listaClientes.get(cmbConsultaCliente.getSelectedIndex());
        int i = 0;
        ArrayList<String> cuentas = new ArrayList<String>();
        for (Cuenta c : cliente.getMiscuentas()) {
            cuentas.add(c.getTipoCuenta());
        }
       cmbConsultaTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray() ));
    }

//Este metodo es muy parecido al otro metodo llenarCombosCliente()
    public void llenarCombosTipoCuenta() {
        Object tipos[] = new Object[listaTipoCuenta.size()];
        int i = 0;
        for (String tipo : listaTipoCuenta) {
            tipos[i] = tipo;
            i++;
        }
        cmbTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
        // cmbConsultaTipoCuenta.setModel( new DefaultComboBoxModel(tipos));     50
    }

    public void llenarCombosCliente() {
        Object clientes[] = new Object[listaClientes.size()];
        int i = 0;
        for (Cliente c : listaClientes) {
            clientes[i] = c.getNombre();
            i++;
        }
        cmbCliente.setModel(new DefaultComboBoxModel(clientes));
        cmbConsultaCliente.setModel(new DefaultComboBoxModel(clientes));
    }

    public void borrarFormCuenta() {
        cmbCliente.setSelectedIndex(0);
        cmbTipoCuenta.setSelectedIndex(0);
        txtMonto.setText("");
    }

    public void borrarFormCliente() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        //Instanacio la libreria de FlatLaf para tener diferentes formatos de IGU
       try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    FlatLightOwlIJTheme.setup();
} catch( Exception ex ) {
    System.err.println( "Fallo el inicio de FlatLaf" );
}
        
        
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Banco banco = new Banco();
                banco.setVisible(true);
                banco.setLocationRelativeTo(null);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnSuma;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbConsultaCliente;
    private javax.swing.JComboBox<String> cmbConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cmbTipoCuenta;
    private javax.swing.JComboBox<String> cmbTipoMovimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblMontoCliente;
    private javax.swing.JLabel lblMovimientoMonto;
    private javax.swing.JLabel lblMovimientoTipoCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblShowSaldo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoCliente;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JLabel lblTipoCuentaCliente;
    private javax.swing.JLabel lblTipoMovimiento;
    private javax.swing.JLabel lvlMovimientoCliente;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
