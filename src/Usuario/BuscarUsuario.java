package Usuario;

import Entidades.Usuario;
import AccesoDatos.UsuarioDAO;
import ideosystem.Main;
import ideosystem.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo
 */
public class BuscarUsuario extends javax.swing.JPanel {

    private Main ma;
    private Menu menu;
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;

    public BuscarUsuario(Main ma, Menu menu) {
        this.ma = ma;
        this.menu = menu;
        usuarioDAO = new UsuarioDAO(ma);
        usuario = new Usuario();
        initComponents();
        this.setVisible(true);
        tabUsuario.setModel(usuarioDAO.getDatosUsuarios());
        tabUsuario.getColumn("Id").setMinWidth(0);
        tabUsuario.getColumn("Id").setMaxWidth(0);
    }

    protected void CargarDatos() {
        tabUsuario.setModel(usuarioDAO.getDatosUsuarios());
        tabUsuario.getColumn("Id").setMinWidth(0);
        tabUsuario.getColumn("Id").setMaxWidth(0);
        tabUsuario.clearSelection();
        btnDeshabilitar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCriterioBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbPrivilegios = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabUsuario = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnDeshabilitar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Nombre o Nick:");

        txtCriterioBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCriterioBusquedaKeyReleased(evt);
            }
        });

        jLabel2.setText("Privilegios:");

        cbPrivilegios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos los Privilegios", "Administrador", "Asistente Administrativo", "Vendedor" }));

        tabUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuarios", "Nombres", "Apellidos", "Privilegios"
            }
        ));
        tabUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabUsuario);

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

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("BUSCAR USUARIO ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ideosystem/Search.png"))); // NOI18N

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCriterioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbPrivilegios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnDeshabilitar)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabUsuarioMouseClicked
        btnModificar.setEnabled(true);
        btnDeshabilitar.setEnabled(true);
        btnEliminar.setEnabled(true);

        usuario.setIdUsuario(Integer.parseInt(tabUsuario.getValueAt(tabUsuario.getSelectedRow(), 0).toString()));
        usuario.setNick(tabUsuario.getValueAt(tabUsuario.getSelectedRow(), 3).toString()); //USUARIO
        usuario.setNombres(tabUsuario.getValueAt(tabUsuario.getSelectedRow(), 1).toString());
        usuario.setApellidos(tabUsuario.getValueAt(tabUsuario.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_tabUsuarioMouseClicked

    private void btnDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshabilitarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea desabilidar el Usuario:\n" + usuario.getNick() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //DESABILITA USUARIO
            usuarioDAO.DeshabilitarUsuario(usuario.getIdUsuario());
            JOptionPane.showMessageDialog(this, "Usuario Desabilitado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            CargarDatos();
        }
    }//GEN-LAST:event_btnDeshabilitarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar el Usuario:\n" + usuario.getNick() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //ELIMINA USUARIO
            usuarioDAO.eliminarUsuario(usuario.getIdUsuario());
            JOptionPane.showMessageDialog(this, "Usuario Eliminado Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            CargarDatos();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtCriterioBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioBusquedaKeyReleased
        tabUsuario.setModel(usuarioDAO.buscarUsuario(txtCriterioBusqueda.getText()));
        tabUsuario.getColumn("Id").setMinWidth(0);
        tabUsuario.getColumn("Id").setMaxWidth(0);
    }//GEN-LAST:event_txtCriterioBusquedaKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        menu.cambiarPanel(new CrearUsuario(ma, usuario));
    }//GEN-LAST:event_btnModificarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeshabilitar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cbPrivilegios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabUsuario;
    private javax.swing.JTextField txtCriterioBusqueda;
    // End of variables declaration//GEN-END:variables
}
