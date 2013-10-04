package Cliente;

import Entidades.Cliente;
import AccesoDatos.ClienteDAO;
import ideosystem.Main;
import ideosystem.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo
 */
public class BuscarCliente extends javax.swing.JPanel {

//    private String Cliente = "";
    public ClienteDAO clienteDAO;
    private Cliente cliente;
    private Main ma;
    private Menu menu;

    public BuscarCliente(Main ma, Menu menu) {
        initComponents();
        this.ma = ma;
        this.menu = menu;

        cliente = new Cliente();
        clienteDAO = new ClienteDAO(ma);

        cargarTabla();
    }

    public void cargarTabla() {
        tabCliente.setModel(clienteDAO.GetClientesByDniNombreRS(txtCriterioBusqueda.getText()));
        tabCliente.getColumn("idcliente").setMinWidth(0);
        tabCliente.getColumn("idcliente").setMaxWidth(0);

        btnDeshabilitar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCriterioBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCliente = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("BUSCAR CLIENTE");

        jLabel1.setText("Nombre / Razón Social / DNI / RUC:");

        txtCriterioBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCriterioBusquedaKeyReleased(evt);
            }
        });

        tabCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre/Razón Social", "DNI/RUC", "Dirección", "Teléfono"
            }
        ));
        tabCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCliente);
        tabCliente.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabCliente.getColumnModel().getColumn(1).setPreferredWidth(15);
        tabCliente.getColumnModel().getColumn(3).setPreferredWidth(15);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
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

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDeshabilitar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnEliminar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnDeshabilitar)
                    .addComponent(btnModificar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea deshabilidar el Usuario:\n" + cliente.getNombreRazonSocial() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //DESABILITA USUARIO
            cliente.setIdCliente(Integer.parseInt(tabCliente.getValueAt(tabCliente.getSelectedRow(), 0).toString()));
            clienteDAO.desactivarCliente(cliente.getIdCliente());
            JOptionPane.showMessageDialog(this, "Usuario Desabilitado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
        }
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar el Usuario:\n" + cliente.getNombreRazonSocial() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //ELIMINA USUARIO
            cliente.setIdCliente(Integer.parseInt(tabCliente.getValueAt(tabCliente.getSelectedRow(), 0).toString()));
            clienteDAO.eliminarCliente(cliente.getIdCliente());
            JOptionPane.showMessageDialog(this, "Usuario Eliminado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tabClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabClienteMouseClicked
        btnModificar.setEnabled(true);
        btnDeshabilitar.setEnabled(true);
        btnEliminar.setEnabled(true);

        cliente.setNombreRazonSocial(tabCliente.getValueAt(tabCliente.getSelectedRow(), 1).toString());  //USUARIO
    }//GEN-LAST:event_tabClienteMouseClicked

    private void txtCriterioBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioBusquedaKeyReleased
        cargarTabla();
    }//GEN-LAST:event_txtCriterioBusquedaKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        cliente.setDniRuc(tabCliente.getValueAt(tabCliente.getSelectedRow(), 2).toString());
        cliente.setNombreRazonSocial(tabCliente.getValueAt(tabCliente.getSelectedRow(), 1).toString());
        cliente.setDireccion(tabCliente.getValueAt(tabCliente.getSelectedRow(), 3).toString());
        cliente.setTelefono(tabCliente.getValueAt(tabCliente.getSelectedRow(), 4).toString());
        cliente.setIdCliente(Integer.parseInt(tabCliente.getValueAt(tabCliente.getSelectedRow(), 0).toString()));

        menu.cambiarPanel(new CrearCliente(ma, cliente));

    }//GEN-LAST:event_btnModificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabCliente;
    private javax.swing.JTextField txtCriterioBusqueda;
    // End of variables declaration//GEN-END:variables
}
