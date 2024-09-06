/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Fronts;

import Entidades.Producto;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Rafa
 */
public class FormPrecio extends javax.swing.JInternalFrame {
private DefaultTableModel modeloA= new DefaultTableModel();
    /**
     * Creates new form FormPrecio
     */
    public FormPrecio() {
        initComponents();
        this.setTitle("Listado por Precio");
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tbValor1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tbValor2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        jProductos.setBackground(new java.awt.Color(249, 242, 244));
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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 68, 66));
        jLabel1.setText("Entre $");

        tbValor1.setBackground(new java.awt.Color(249, 242, 244));
        tbValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbValor1ActionPerformed(evt);
            }
        });
        tbValor1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbValor1PropertyChange(evt);
            }
        });
        tbValor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbValor1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 68, 66));
        jLabel2.setText("Y");

        tbValor2.setBackground(new java.awt.Color(249, 242, 244));
        tbValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbValor2ActionPerformed(evt);
            }
        });
        tbValor2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tbValor2PropertyChange(evt);
            }
        });
        tbValor2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbValor2KeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Lupa.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(132, 53, 52));
        jLabel3.setText("Listado por Precios");

        jPanel4.setBackground(new java.awt.Color(192, 192, 192));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 222, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(134, 134, 134))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(tbValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tbValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tbValor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tbValor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbValor1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbValor1PropertyChange
        
    }//GEN-LAST:event_tbValor1PropertyChange

    private void tbValor2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tbValor2PropertyChange
        
    }//GEN-LAST:event_tbValor2PropertyChange

    private void tbValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbValor1ActionPerformed
        
    }//GEN-LAST:event_tbValor1ActionPerformed

    private void tbValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbValor2ActionPerformed
        
    }//GEN-LAST:event_tbValor2ActionPerformed

    private void tbValor1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbValor1KeyReleased
        actualizarTabla();
    }//GEN-LAST:event_tbValor1KeyReleased

    private void tbValor2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbValor2KeyReleased
        actualizarTabla();
    }//GEN-LAST:event_tbValor2KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTable jProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tbValor1;
    private javax.swing.JTextField tbValor2;
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

private void actualizarTabla(){
    
    
    
    if(tbValor1.getText().isEmpty() || tbValor2.getText().isEmpty()){
    
    }else{
        modeloA.setRowCount(0);
        double valor1 = Double.parseDouble(tbValor1.getText());
        double valor2 = Double.parseDouble(tbValor2.getText());
         for (Producto producto : MenuPrincipal.listadoProductos) {
        if (producto.getPrecio()>= valor1 && producto.getPrecio() <= valor2) {
            modeloA.addRow(new Object[]{
                producto.getCodigo(),
                producto.getDescripcion(),
                producto.getRubro(),
                producto.getPrecio(),
                producto.getStock()
            });
        }
    }
    System.out.println("ACTUALIZAR TABLA");
    }
}


}
