package Categoría;

import AccesoDatos.CategoriaDAO;
import Entidades.Categoria;
import ideosystem.Main;
import javax.swing.JOptionPane;

public class CrearBuscarCategoria extends javax.swing.JPanel {

    private CategoriaDAO categoriaDAO;
    private Categoria categoria;
    private Main ma;
    private Boolean esNuevo = false;

    public CrearBuscarCategoria(Main ma) {
        initComponents();
        this.ma = ma;
        categoria = new Categoria();
        categoriaDAO = new CategoriaDAO(ma);
        cargarDatos();
    }

    private void setearDatos() {
        categoria.setDescripcion(txtDescripcion.getText());
    }

    private void cargarDatos() {
        tabCategoria.setModel(categoriaDAO.GetCategorias());
        tabCategoria.getColumn("Id").setMinWidth(0);
        tabCategoria.getColumn("Id").setMaxWidth(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCategoria = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCriterio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnNuevaCategoria = new javax.swing.JButton();
        btnModificarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("CATEGORÍA ");

        tabCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción"
            }
        ));
        tabCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabCategoria);

        jLabel2.setText("Buscar categoría :");

        txtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCriterioKeyReleased(evt);
            }
        });

        jLabel3.setText("Descripción :");

        txtDescripcion.setEnabled(false);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnNuevaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnNuevaCategoria.setText("Nueva categoria");
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });

        btnModificarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnModificarCategoria.setText("Modificar categoría");
        btnModificarCategoria.setEnabled(false);
        btnModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaActionPerformed(evt);
            }
        });

        btnEliminarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminarCategoria.setText("Eliminar categoría");
        btnEliminarCategoria.setEnabled(false);
        btnEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCategoriaActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/001-02-1.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancelar))
                                    .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnModificarCategoria)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEliminarCategoria))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnAgregar)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addGap(13, 13, 13)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaCategoria)
                    .addComponent(btnModificarCategoria)
                    .addComponent(btnEliminarCategoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed
        // TODO add your handling code here:
        txtDescripcion.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtCriterio.setEnabled(false);
        btnNuevaCategoria.setEnabled(false);
        btnModificarCategoria.setEnabled(false);
        btnEliminarCategoria.setEnabled(false);
        esNuevo = true;
    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void tabCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCategoriaMouseClicked
        // TODO add your handling code here:
        btnModificarCategoria.setEnabled(true);
        btnEliminarCategoria.setEnabled(true);

        categoria.setIdCategoria(Integer.parseInt(tabCategoria.getValueAt(tabCategoria.getSelectedRow(), 0).toString()));
        categoria.setDescripcion(tabCategoria.getValueAt(tabCategoria.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tabCategoriaMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if (esNuevo) {
            setearDatos();
            boolean estado = categoriaDAO.validarExistencia(categoria.getDescripcion().toUpperCase());
            if (!estado) {
                categoriaDAO.registrarCategoria(categoria);
            } else {
                JOptionPane.showMessageDialog(this, "Categoría registrada.", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtDescripcion.requestFocus();
            }
        } else {
            setearDatos();
            categoriaDAO.actualizarCategoria(categoria);
            JOptionPane.showMessageDialog(this, "Categoria Actualizada Correctamente", "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
        }
        cargarDatos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaActionPerformed
        // TODO add your handling code here:
        txtDescripcion.setText(categoria.getDescripcion());
        txtCriterio.setEnabled(false);
        txtDescripcion.setEnabled(true);
        btnAgregar.setEnabled(true);
        btnCancelar.setEnabled(true);
        esNuevo = false;
    }//GEN-LAST:event_btnModificarCategoriaActionPerformed

    private void btnEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "Desea eliminar la categoria:\n" + categoria.getDescripcion() + "", "AVISO", JOptionPane.OK_OPTION);
        if (opcion == 0) {
            //ELIMINA CATEGORIA
            categoriaDAO.eliminarCategoria(categoria.getIdCategoria());
            JOptionPane.showMessageDialog(this, "Categoria Eliminada Correctamente", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            cargarDatos();
        }
    }//GEN-LAST:event_btnEliminarCategoriaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        txtCriterio.setEnabled(true);
        txtCriterio.requestFocus();
        txtDescripcion.setEnabled(false);
        btnAgregar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnNuevaCategoria.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCriterioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioKeyReleased
        // TODO add your handling code here:
        tabCategoria.setModel(categoriaDAO.buscarCategoria(txtCriterio.getText()));
        tabCategoria.getColumn("Id").setMinWidth(0);
        tabCategoria.getColumn("Id").setMaxWidth(0);
    }//GEN-LAST:event_txtCriterioKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabCategoria;
    private javax.swing.JTextField txtCriterio;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
