
package Fronts;

import Entidades.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame {

    
    public static HashSet<Producto> listadoProductos = new HashSet();
    
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("DeTodo S.A.");
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame = new javax.swing.JPanel();
        ImageIcon icono= new ImageIcon(getClass().getResource("/Media/super.jpg"));
        Image miImagen = icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent (Graphics g){
                g.drawImage(miImagen, 0,0, getWidth(), getHeight(), this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmRubro = new javax.swing.JMenuItem();
        jmNombre = new javax.swing.JMenuItem();
        jmPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 800));

        jFrame.setLayout(new java.awt.BorderLayout());

        escritorio.setPreferredSize(new java.awt.Dimension(800, 800));
        escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                escritorioComponentResized(evt);
            }
        });

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 509, Short.MAX_VALUE)
        );

        jFrame.add(escritorio, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Administracion");

        jMenuItem4.setText("Productos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jmRubro.setText("Por rubro");
        jmRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRubroActionPerformed(evt);
            }
        });
        jMenu2.add(jmRubro);

        jmNombre.setText("Por nombre");
        jmNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNombreActionPerformed(evt);
            }
        });
        jMenu2.add(jmNombre);

        jmPrecio.setText("Por precio");
        jmPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrecioActionPerformed(evt);
            }
        });
        jMenu2.add(jmPrecio);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jFrame, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormGestionProductos gestion= new FormGestionProductos();
        gestion.setVisible(true);
        escritorio.add(gestion);
        escritorio.moveToFront(gestion);    
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRubroActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       FormRubro rubro = new FormRubro();
       rubro.setVisible(true);
       escritorio.add(rubro);
       escritorio.moveToFront(rubro);
    }//GEN-LAST:event_jmRubroActionPerformed

    private void jmNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNombreActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       FormNombre nombre= new FormNombre();
       nombre.setVisible(true);
       escritorio.add(nombre);
       escritorio.moveToFront(nombre);
    }//GEN-LAST:event_jmNombreActionPerformed

    private void jmPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrecioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormPrecio precio= new FormPrecio();
        precio.setVisible(true);
        escritorio.add(precio);
        escritorio.moveToFront(precio);
    }//GEN-LAST:event_jmPrecioActionPerformed

    private void escritorioComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_escritorioComponentResized
    }//GEN-LAST:event_escritorioComponentResized

    
    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jFrame;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jmNombre;
    private javax.swing.JMenuItem jmPrecio;
    private javax.swing.JMenuItem jmRubro;
    // End of variables declaration//GEN-END:variables
}
