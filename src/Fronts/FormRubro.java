
package Fronts;

import Entidades.Producto;
import static Fronts.MenuPrincipal.listadoProductos;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class FormRubro extends javax.swing.JInternalFrame {
private DefaultTableModel modeloA= new DefaultTableModel(){
    
    @Override
    public boolean isCellEditable(int f, int c){
        
        return false;
    }
};
    public FormRubro() {
        initComponents();
        this.setTitle("Listado por Rubro");

        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Jpa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cbBuscarRubro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbValorizacion = new javax.swing.JLabel();

        setClosable(true);

        Jpa.setBackground(new java.awt.Color(245, 245, 245));

        jProductos.setBackground(new java.awt.Color(249, 242, 244));
        jProductos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        ));
        jScrollPane1.setViewportView(jProductos);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 68, 66));
        jLabel2.setText("Rubro:");

        cbBuscarRubro.setBackground(new java.awt.Color(249, 242, 244));
        cbBuscarRubro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbBuscarRubro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMESTIBLES", "LIMPIEZA", "PERFUMERIA" }));
        cbBuscarRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarRubroActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(132, 53, 52));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado por Rubro");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Lupa.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        lbValorizacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbValorizacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValorizacion.setText(".");

        javax.swing.GroupLayout JpaLayout = new javax.swing.GroupLayout(Jpa);
        Jpa.setLayout(JpaLayout);
        JpaLayout.setHorizontalGroup(
            JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpaLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(cbBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(JpaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JpaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpaLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        JpaLayout.setVerticalGroup(
            JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpaLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbBuscarRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(JpaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbValorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBuscarRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarRubroActionPerformed

        if (cbBuscarRubro.getSelectedIndex()== -1){
            JOptionPane.showMessageDialog(null, "Seleccione un rubro a buscar","Atención", JOptionPane.ERROR_MESSAGE);
        }else{    
            double valorizacionStock=0;
            
            modeloA.setRowCount(0);
            jProductos.setEnabled(true);
            String rubro= cbBuscarRubro.getSelectedItem().toString();
            for (Producto p : listadoProductos) {
                if (p.getRubro().equalsIgnoreCase(rubro)){
                    Object[] linea = {p.getCodigo(), p.getDescripcion(), p.getRubro(), p.getPrecio(), p.getStock()};
                    valorizacionStock = valorizacionStock + (p.getPrecio()*  p.getStock());
                    modeloA.addRow(linea);
                }
            }
            DecimalFormat moneda = new DecimalFormat("$#.00");
            String valorizacion = moneda.format(valorizacionStock);
            String texto= "Valorizacion del Stock de " + rubro + " es: " + valorizacion;
            
            lbValorizacion.setText(texto);
        }    
    }//GEN-LAST:event_cbBuscarRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpa;
    private javax.swing.JComboBox<String> cbBuscarRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTable jProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbValorizacion;
    // End of variables declaration//GEN-END:variables

private void armarCabecera(){

        modeloA.addColumn("Codigo");
        modeloA.addColumn("Descripcion");
        modeloA.addColumn("Rubro");
        modeloA.addColumn("Precio");
        modeloA.addColumn("Stock");

        jProductos.setModel(modeloA);

        // Obtener el modelo de columnas de la tabla
        TableColumnModel columnModel = jProductos.getColumnModel();

        // Ancho de las columnas
        columnModel.getColumn(0).setPreferredWidth(50);   // "Codigo"
        columnModel.getColumn(1).setPreferredWidth(180);  // "Descripcion"
        columnModel.getColumn(2).setPreferredWidth(100);  // "Categoria"
        columnModel.getColumn(3).setPreferredWidth(50);   // "Precio"
        columnModel.getColumn(4).setPreferredWidth(30);   // "Stock"



    }
}
