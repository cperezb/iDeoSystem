/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto;

import Adicionales.frmBuscarProveedor;

/**
 *
 * @author Renzo
 */
public class CrearProducto extends javax.swing.JPanel {

    /**
     * Creates new form CrearProducto
     */
    public CrearProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblNombresUsuario = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblNombresUsuario1 = new javax.swing.JLabel();
        lblNombresUsuario2 = new javax.swing.JLabel();
        lblNombresUsuario3 = new javax.swing.JLabel();
        lblNombresUsuario8 = new javax.swing.JLabel();
        chNumSerie = new javax.swing.JCheckBox();
        txtCodigo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtNumSerie = new javax.swing.JTextField();
        cbCategoria = new javax.swing.JComboBox();
        spCantidad = new javax.swing.JSpinner();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("MODIFICAR PRODUCTO");

        lblNombresUsuario.setText("Codigo:");

        txtDescripcion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        lblNombresUsuario1.setText("Descripción:");

        lblNombresUsuario2.setText("Categoría:");

        lblNombresUsuario3.setText("Marca:");

        lblNombresUsuario8.setText("Cantidad:");

        chNumSerie.setText("Nro Serie:");
        chNumSerie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chNumSerieItemStateChanged(evt);
            }
        });

        txtCodigo.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtCodigo.setEnabled(false);

        txtMarca.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        txtNumSerie.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtNumSerie.setEnabled(false);

        cbCategoria.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas las Categorías"}));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sign-Add-icon-150x150.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNombresUsuario2)
                                    .addComponent(lblNombresUsuario3)
                                    .addComponent(lblNombresUsuario)
                                    .addComponent(lblNombresUsuario1)
                                    .addComponent(lblNombresUsuario8)
                                    .addComponent(chNumSerie))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombresUsuario)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario1)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario3)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario2)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario8)
                            .addComponent(spCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chNumSerie)
                    .addComponent(txtNumSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chNumSerieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chNumSerieItemStateChanged
        if (chNumSerie.isSelected()) {
            txtNumSerie.setEnabled(true);
        }else{
            txtNumSerie.setEnabled(false);
        }
    }//GEN-LAST:event_chNumSerieItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JCheckBox chNumSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNombresUsuario;
    private javax.swing.JLabel lblNombresUsuario1;
    private javax.swing.JLabel lblNombresUsuario2;
    private javax.swing.JLabel lblNombresUsuario3;
    private javax.swing.JLabel lblNombresUsuario8;
    private javax.swing.JSpinner spCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNumSerie;
    // End of variables declaration//GEN-END:variables
}
