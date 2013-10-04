/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import ideosystem.Menu;
import ideosystem.Main;

/**
 *
 * @author Renzo
 */
public class BuscarServicio extends javax.swing.JPanel {

    private Main ma;
    private Menu menu;
    
    public BuscarServicio(Main ma, Menu menu) {
        initComponents();
        this.ma = ma;
        this.menu = menu;
        tabServicios.setModel(ma.servicio.GetServiciosByNroServicioOrNombCliente(txtCriterio.getText()));
        btnGenerarComprobante.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabServicios = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCriterio = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGenerarComprobante = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("BUSCAR SERVICIO");

        tabServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro. Servicio", "DescripciÃ³n", "Servicio", "Comentario", "Fec. RecepciÃ³n", "Fec. Entrega", "Pendiente"
            }
        ));
        tabServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabServiciosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabServicios);

        jLabel2.setText("Nro Servicio / Cliente:");

        txtCriterio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCriterioKeyReleased(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/001-02-1.png"))); // NOI18N
        btnModificar.setText("Modificar");

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminar.setText("Eliminar");

        btnGenerarComprobante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnGenerarComprobante.setText("Generar Comprobante");
        btnGenerarComprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarComprobanteActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGenerarComprobante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnGenerarComprobante))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarComprobanteActionPerformed
        String arreglo[] = ma.servicio.GetDatosClienteByServicio(tabServicios.getValueAt(tabServicios.getSelectedRow(), 1).toString());
        menu.cambiarPanel(new GenerarComprobante(ma, arreglo));
    }//GEN-LAST:event_btnGenerarComprobanteActionPerformed

    private void txtCriterioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCriterioKeyReleased
        // TODO add your handling code here:
        tabServicios.setModel(ma.servicio.GetServiciosByNroServicioOrNombCliente(txtCriterio.getText()));
    }//GEN-LAST:event_txtCriterioKeyReleased

    private void tabServiciosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabServiciosMouseReleased
        // TODO add your handling code here:
        btnGenerarComprobante.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_tabServiciosMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerarComprobante;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabServicios;
    private javax.swing.JTextField txtCriterio;
    // End of variables declaration//GEN-END:variables
}
