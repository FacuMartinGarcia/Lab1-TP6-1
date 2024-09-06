
package Fronts;

import Entidades.Producto;
import static Fronts.MenuPrincipal.listadoProductos;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormGestionProductos extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloA = new DefaultTableModel(); 
        
    
    private String origen;
    
    
    public FormGestionProductos() {
        

        initComponents();
        armarCabecera();

        
        estadoCampos(1);
        this.setTitle("Gestion De Productos");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel3 = new javax.swing.JPanel();
        panPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbCodigo = new javax.swing.JTextField();
        tbDescripcion = new javax.swing.JTextField();
        tbPrecio = new javax.swing.JTextField();
        cbRubro = new javax.swing.JComboBox<>();
        jsStock = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelTabla = new javax.swing.JPanel();
        btActualizar = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btBuscar = new javax.swing.JButton();
        cbBuscarRubro = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panPrincipal.setBackground(new java.awt.Color(36, 82, 105));
        panPrincipal.setAutoscrolls(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Código:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio ($):");

        tbCodigo.setBackground(new java.awt.Color(36, 82, 105));
        tbCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tbDescripcion.setBackground(new java.awt.Color(36, 82, 105));

        tbPrecio.setBackground(new java.awt.Color(36, 82, 105));
        tbPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbRubro.setBackground(new java.awt.Color(36, 82, 105));
        cbRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLES", "PERFUMERIA", "LIMPIEZA" }));
        cbRubro.setSelectedIndex(-1);
        cbRubro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jsStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Descripción:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rubro:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stock:");

        javax.swing.GroupLayout panPrincipalLayout = new javax.swing.GroupLayout(panPrincipal);
        panPrincipal.setLayout(panPrincipalLayout);
        panPrincipalLayout.setHorizontalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPrincipalLayout.createSequentialGroup()
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(panPrincipalLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        panPrincipalLayout.setVerticalGroup(
            panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelTabla.setBackground(new java.awt.Color(36, 82, 105));

        btActualizar.setBackground(new java.awt.Color(217, 237, 247));
        btActualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/ModificarIcon.png"))); // NOI18N
        btActualizar.setText("Modificar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(217, 237, 247));
        btEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Eliminar.png"))); // NOI18N
        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btNuevo.setBackground(new java.awt.Color(217, 237, 247));
        btNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Nuevo.png"))); // NOI18N
        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btGuardar.setBackground(new java.awt.Color(217, 237, 247));
        btGuardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/guardar.png"))); // NOI18N
        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setBackground(new java.awt.Color(217, 237, 247));
        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Cerrar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setMaximumSize(new java.awt.Dimension(124, 56));
        btCancelar.setMinimumSize(new java.awt.Dimension(124, 56));
        btCancelar.setPreferredSize(new java.awt.Dimension(124, 56));
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTablaLayout = new javax.swing.GroupLayout(jPanelTabla);
        jPanelTabla.setLayout(jPanelTablaLayout);
        jPanelTablaLayout.setHorizontalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btNuevo)
                .addGap(18, 18, 18)
                .addComponent(btActualizar)
                .addGap(15, 15, 15)
                .addComponent(btGuardar)
                .addGap(22, 22, 22)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTablaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btActualizar, btEliminar, btGuardar, btNuevo});

        jPanelTablaLayout.setVerticalGroup(
            jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btActualizar)
                    .addComponent(btEliminar)
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanelTablaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btActualizar, btEliminar, btGuardar, btNuevo});

        jPanel2.setBackground(new java.awt.Color(42, 100, 150));

        btBuscar.setBackground(new java.awt.Color(217, 237, 247));
        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Lupa.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cbBuscarRubro.setBackground(new java.awt.Color(42, 100, 150));
        cbBuscarRubro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBuscarRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLES", "LIMPIEZA", "PERFUMERIA" }));
        cbBuscarRubro.setSelectedIndex(-1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Buscar articulos por Rubro:");

        jProductos.setBackground(new java.awt.Color(66, 139, 202));
        jProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jProductos.setForeground(new java.awt.Color(255, 255, 255));
        jProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jProductos.setColumnSelectionAllowed(true);
        jProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        jProductos.setDoubleBuffered(true);
        jProductos.setShowGrid(false);
        jProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jProductos);
        jProductos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(cbBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(36, 82, 105));

        jButton1.setBackground(new java.awt.Color(217, 237, 247));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Cerrar.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestion de Productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed

   
        
        try {
           
            // Controlamos que todos los campos estén completos
           
            if (tbDescripcion.getText().isEmpty() || tbPrecio.getText().isEmpty() || tbCodigo.getText().isEmpty() || cbRubro.getSelectedIndex()== -1) {
                JOptionPane.showMessageDialog(null, "Complete los datos del Producto","Atención", JOptionPane.ERROR_MESSAGE);

            }else{

                Double precio = Double.valueOf(tbPrecio.getText());
                // Analizamos si el precio es cero
                //Si el precio ingresado es 0 le pedimos confirmación al usuario
                if (precio==0){

                    int respuesta = JOptionPane.showConfirmDialog(null
                        ,"¿Está seguro/a de poner un valor de venta en CERO?"
                        ,"Precio 0"
                        ,JOptionPane.YES_NO_OPTION);

                    if (respuesta == JOptionPane.NO_OPTION) {
                        //Aca deberia enforcar en precio, ponerlo en nulo y no continuar
                        tbPrecio.setText("");
                        tbPrecio.requestFocus();
                        return;
                    }

                }

                String descripcion = tbDescripcion.getText();
                String rubro= cbRubro.getSelectedItem().toString();
                int stock= jsStock.getComponentCount();
                int codigo= Integer.parseInt(tbCodigo.getText());
                
                if (origen=="actualizar"){
                    actualizarProducto(codigo, rubro, precio, stock);
                    estadoCampos(1);
                    extraerDatosDeTabla();
                    //jsStock.setValue(0);
                    //jProductos.setEnabled(true);
                    btBuscarActionPerformed(new java.awt.event.ActionEvent(this, ActionEvent.ACTION_PERFORMED, "command"));
                    JOptionPane.showMessageDialog(null, "Se ha actualizado la información del Producto",
                    "Producto Actualizado", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }    
                
                Producto prod = new Producto(codigo, descripcion.toUpperCase(), rubro, precio, stock);

                if (listadoProductos.add(prod)==true){
                    actualizarListadoProductos();
                    jsStock.setValue(0);
                    estadoCampos(1);
                }else{
                    JOptionPane.showMessageDialog(null, "El producto ya se encuentra definido en la lista",
                        "Producto Duplicado", JOptionPane.ERROR_MESSAGE);
                }
                
                
            }
            
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Corrobore la información ingresada",
                "Formato Incorrecto", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btGuardarActionPerformed
    private void estadoCampos(int estado){
    
        switch (estado) {

            case 1: //Inicial, bloqueados
                
                bloquearCampos(panPrincipal);
                btEliminar.setEnabled(false);
                btGuardar.setEnabled(false);
                btActualizar.setEnabled(false);
                btNuevo.setEnabled(true);
                btCancelar.setEnabled(false);    
                btBuscar.setEnabled(true);
                cbBuscarRubro.setEnabled(true);
                cbBuscarRubro.requestFocusInWindow();
                jProductos.setEnabled(false);
                break;

            case 2: //Nuevo
                
                vaciarCampos(panPrincipal);
                btGuardar.setEnabled(true);
                btEliminar.setEnabled(false);
                btActualizar.setEnabled(false);
                btNuevo.setEnabled(false);
                btCancelar.setEnabled(true);   
                btBuscar.setEnabled(false);
                cbBuscarRubro.setEnabled(false);
                jProductos.setEnabled(false);
                tbCodigo.requestFocusInWindow();
                break;
                
            case 3: //Editando (Actualizando)
                
                btGuardar.setEnabled(true);
                btEliminar.setEnabled(false);
                btActualizar.setEnabled(false);
                btNuevo.setEnabled(false);
                btBuscar.setEnabled(false);
                btCancelar.setEnabled(true);   
                cbBuscarRubro.setEnabled(false);
                jProductos.setEnabled(false);
                
                break;
 
        }

        
    }


    private void eliminarProducto(int codigo){

        Iterator<Producto> iterator = listadoProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo() == codigo) {
                iterator.remove(); 
            }
        }

    }  
    
    private void actualizarProducto(int codigo, String rubro, double Precio, int stock){

        Iterator<Producto> iterator = listadoProductos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getCodigo() == codigo) {
                producto.setRubro(rubro);
                producto.setPrecio(Precio); 
                producto.setStock(stock);
            }
        }

    }  
    
    
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        
        origen ="nuevo";
        estadoCampos(2);        
        cbBuscarRubro.setSelectedIndex(-1);
        modeloA.setRowCount(0);

    }//GEN-LAST:event_btNuevoActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed

        origen="actualizar";
        
        if (jProductos.isEnabled()){

            int filaSeleccionada = jProductos.getSelectedRow();
            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada

                int codigo = (int) jProductos.getValueAt(filaSeleccionada, 0);
                estadoCampos(3);
                
                //Al Estar Actualizando, no podemos cambiar ni NI EL CODIGO, NI la DESCRIPCION
               cbRubro.setEnabled(true);
               cbRubro.setBackground(Color.yellow);
               tbPrecio.setEnabled(true);
               tbPrecio.setBackground(Color.yellow);
               jsStock.setEnabled(true);
               jsStock.setBackground(Color.yellow);              
   
           }
        }
 
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed

        if (cbBuscarRubro.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(null, "Seleccione un rubro a buscar","Atención", JOptionPane.ERROR_MESSAGE);
        }else{    
            modeloA.setRowCount(0);
            jProductos.setEnabled(true);
            String rubro= cbBuscarRubro.getSelectedItem().toString();
            for (Producto p : listadoProductos) {
                if (p.getRubro().equalsIgnoreCase(rubro)){
                    Object[] linea = {p.getCodigo(), p.getDescripcion(), p.getRubro(), p.getPrecio(), p.getStock()};
                    modeloA.addRow(linea);
                }
            }
        }    

    }//GEN-LAST:event_btBuscarActionPerformed
    
    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
  
        if (jProductos.isEnabled()){

            int filaSeleccionada = jProductos.getSelectedRow();
            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada

                int codigo = (int) jProductos.getValueAt(filaSeleccionada, 0);
                
                        int respuesta = JOptionPane.showConfirmDialog(null
                        ,"¿Está seguro/a de eliminar el Producto seleccionado?"
                        ,"Eliminar"
                        ,JOptionPane.YES_NO_OPTION);

                    if (respuesta == JOptionPane.NO_OPTION) {
                        return;
                    }
                
                eliminarProducto(codigo);
                estadoCampos(1);
                jsStock.setValue(0);
                btBuscarActionPerformed(new java.awt.event.ActionEvent(this, ActionEvent.ACTION_PERFORMED, "command"));

            }
        }




    }//GEN-LAST:event_btEliminarActionPerformed

    private void extraerDatosDeTabla(){
    
        if (jProductos.isEnabled()){
            int filaSeleccionada = jProductos.getSelectedRow();

            if (filaSeleccionada != -1) { // Controlamos que haya una fila seleccionada

                // si hay una, habilitamos el jPanelTabla
                btEliminar.setEnabled(true);
                btActualizar.setEnabled(true);

                //Cargamos los valores en los Campos

                int codigo = (int) jProductos.getValueAt(filaSeleccionada, 0);
                String code = String.valueOf(codigo);
                tbCodigo.setText(code);
                String descripcion = (String) jProductos.getValueAt(filaSeleccionada, 1);
                tbDescripcion.setText(descripcion);
                String rubro = (String) jProductos.getValueAt(filaSeleccionada, 2);
                cbRubro.setSelectedItem(rubro);
                double precio = (double) jProductos.getValueAt(filaSeleccionada, 3);
                String prec = String.valueOf(precio);
                tbPrecio.setText(prec);
                int stock = (int) jProductos.getValueAt(filaSeleccionada, 4);
                //String stocks = String.valueOf(stock); 
                jsStock.setValue(stock);

            }
        }
    
    }
    
    private void jProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductosMouseClicked
        extraerDatosDeTabla();
    }//GEN-LAST:event_jProductosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        if (origen=="nuevo"){
            estadoCampos(1);
        }else if (origen=="actualizar"){
            estadoCampos(1);
            extraerDatosDeTabla();
            jsStock.setValue(0);
            jProductos.setEnabled(true);
        }
        
 
        
    }//GEN-LAST:event_btCancelarActionPerformed
    
    private void armarCabecera(){

        modeloA.addColumn("Codigo");
        modeloA.addColumn("Descripcion");
        modeloA.addColumn("Rubro");
        modeloA.addColumn("Precio");
        modeloA.addColumn("Stock");

        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = jProductos.getColumnModel();

        //Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(50);   // "Codigo"
        columnModel.getColumn(1).setPreferredWidth(180);  // "Descripcion"
        columnModel.getColumn(2).setPreferredWidth(100);  // "Categoria"
        columnModel.getColumn(3).setPreferredWidth(50);   // "Precio"
        columnModel.getColumn(4).setPreferredWidth(30);   // "Stock"

        jProductos.setModel(modeloA);


    }
   

    public void actualizarListadoProductos(){
           modeloA.setRowCount(0);
           for (Producto p : listadoProductos) {
                Object[] linea = {p.getCodigo(), p.getDescripcion(), p.getRubro(), p.getPrecio(), p.getStock()};
                modeloA.addRow(linea);
           }
    }
    
    
    public void vaciarCampos(JPanel jpanel) {
       JComboBox combo = null;
       JSpinner spinner = null;

       for (Component c : jpanel.getComponents()) {
           if (c instanceof JTextField) {
               JTextField caja = (JTextField) c;
               caja.setEnabled(true);
               caja.setText("");
               caja.setBackground(Color.yellow);
           } else if (c instanceof JComboBox) {
               combo = (JComboBox) c;
               combo.setEnabled(true);
               combo.setSelectedIndex(-1);
               combo.setBackground(Color.yellow);
           } else if (c instanceof JSpinner) {
               spinner = (JSpinner) c;
               spinner.setEnabled(true);
               spinner.setValue(0);  
               spinner.setBackground(Color.yellow);
           }
       }

       for (int i = 0; i < jpanel.getComponents().length; i++) {
           if (jpanel.getComponents()[i] instanceof JTextField) {
               JTextField caja = (JTextField) jpanel.getComponents()[i];
               caja.setText("");
           } else if (jpanel.getComponents()[i] instanceof JComboBox) {
               combo = (JComboBox) jpanel.getComponents()[i];
               combo.setSelectedIndex(-1);
           } else if (jpanel.getComponents()[i] instanceof JSpinner) {
               spinner = (JSpinner) jpanel.getComponents()[i];
               spinner.setValue(spinner.getModel().getValue());
           }
       }
        
    }
    
    
    public void bloquearCampos(JPanel jpanel) {
       
       JComboBox combo = null;
       JSpinner spinner = null;

       
       for (Component c : jpanel.getComponents()) {
           if (c instanceof JTextField) {
               JTextField caja = (JTextField) c;
               caja.setEnabled(false);
               caja.setBackground(Color.GRAY);
           } else if (c instanceof JComboBox) {
               combo = (JComboBox) c;
               combo.setEnabled(false);
               combo.setBackground(Color.GRAY);
           } else if (c instanceof JSpinner) {
               spinner = (JSpinner) c;
               spinner.setEnabled(false);
               spinner.setBackground(Color.GRAY);
           }
       }

       for (int i = 0; i < jpanel.getComponents().length; i++) {
           if (jpanel.getComponents()[i] instanceof JTextField) {
               JTextField caja = (JTextField) jpanel.getComponents()[i];
               caja.setText("");
           } else if (jpanel.getComponents()[i] instanceof JComboBox) {
               combo = (JComboBox) jpanel.getComponents()[i];
               combo.setSelectedIndex(-1);
           } else if (jpanel.getComponents()[i] instanceof JSpinner) {
               spinner = (JSpinner) jpanel.getComponents()[i];
               spinner.setValue(spinner.getModel().getValue());
           }
       }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JComboBox<String> cbBuscarRubro;
    private javax.swing.JComboBox<String> cbRubro;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelTabla;
    private javax.swing.JTable jProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JTextField tbCodigo;
    private javax.swing.JTextField tbDescripcion;
    private javax.swing.JTextField tbPrecio;
    // End of variables declaration//GEN-END:variables
}
