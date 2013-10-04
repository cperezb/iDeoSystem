package Proveedor;

import Entidades.Proveedor;
import AccesoDatos.ProveedorDAO;
import ideosystem.Main;
import ideosystem.Menu;
import javax.swing.JOptionPane;

public final class BuscarProveedor extends javax.swing.JPanel {
    
    private Proveedor proveedor;
    private ProveedorDAO proveedorDAO;
    private Main ma;
    private Menu menu;
    
    public BuscarProveedor(Main ma, Menu menu) {
        initComponents();
        this.ma = ma;
        this.menu = menu;
        proveedor = new Proveedor();
        proveedorDAO = new ProveedorDAO(ma);
        this.setVisible(true);
        tabProveedor.setModel(proveedorDAO.GetProveedores());
        tabProveedor.getColumn("Id").setMinWidth(0);
        tabProveedor.getColumn("Id").setMaxWidth(0);
    }
    
    protected void CargarDatos() {
        tabProveedor.setModel(proveedorDAO.GetProveedores());
        tabProveedor.getColumn("Id").setMinWidth(0);
        tabProveedor.getColumn("Id").setMaxWidth(0);
        tabProveedor.clearSelection();
        btnDeshabilitar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCriterio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProveedor = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("BUSCAR PROVEEDOR ");

        jLabel1.setText("RUC o Razón Social :");

        txtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCriterioKeyReleased(evt);
            }
        });

        tabProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Razón Social", "RUC", "Dirección", "Teléfono", "E-Mail"
            }
        ));
        tabProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabProveedor);
        tabProveedor.getColumnModel().getColumn(0).setPreferredWidth(120);
        tabProveedor.getColumnModel().getColumn(1).setPreferredWidth(15);
        tabProveedor.getColumnModel().getColumn(2).setPreferredWidth(70);
        tabProveedor.getColumnModel().getColumn(3).setPreferredWidth(15);
        tabProveedor.getColumnModel().getColumn(4).setPreferredWidth(25);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDeshabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/001-02-1.png"))); // NOI18N
        btnDeshabilitar.setText("Deshabilitar");
        btnDeshabilitar.setEnabled(false);
        btnDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshabilitarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(294, 294, 294))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeshabilitar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnDeshabilitar)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar el Usuario:\n" + proveedor.getRazonSocial() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //ELIMINA USUARIO+
            proveedorDAO.EliminarProveedor(proveedor.getIdProveedor());
            JOptionPane.showMessageDialog(this, "Proveedor Eliminado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            CargarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea desabilidar el Usuario:\n" + proveedor.getRazonSocial() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //DESHABILITA USUARIO
            proveedorDAO.DeshabilitarProveedor(proveedor.getIdProveedor());
            JOptionPane.showMessageDialog(this, "Usuario Desabilitado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            CargarDatos();
        }
    }//GEN-LAST:event_btnDeshabilitarActionPerformed
    
    private void tabProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProveedorMouseClicked
        btnDeshabilitar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
        
        proveedor.setIdProveedor(Integer.parseInt(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 0).toString()));        
        proveedor.setRuc(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 1).toString());
        proveedor.setRazonSocial(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 2).toString());
        proveedor.setDireccion(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 3).toString());
        proveedor.setTelefono(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 4).toString());
        proveedor.setEmail(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabProveedorMouseClicked
    
    private void txtCriterioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioKeyReleased
        tabProveedor.setModel(proveedorDAO.GetProveedorporCriterio(txtCriterio.getText()));
        tabProveedor.getColumn("Id").setMinWidth(0);
        tabProveedor.getColumn("Id").setMaxWidth(0);
    }//GEN-LAST:event_txtCriterioKeyReleased
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        menu.cambiarPanel(new CrearProveedor(ma, proveedor));
    }//GEN-LAST:event_btnModificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabProveedor;
    private javax.swing.JTextField txtCriterio;
    // End of variables declaration//GEN-END:variables
}
