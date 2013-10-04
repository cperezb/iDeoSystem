package Proveedor;

import Entidades.Proveedor;
import AccesoDatos.ProveedorDAO;
import ideosystem.Main;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo
 */
public class CrearProveedor extends javax.swing.JPanel {

    private Main ma;
    private boolean esNuevo = true;
    private Proveedor proveedor;
    private ProveedorDAO proveedorDAO;

    public CrearProveedor(Main ma) {
        initComponents();
        proveedor = new Proveedor();
        proveedorDAO = new ProveedorDAO(ma);
        this.ma = ma;
        this.setVisible(true);
        esNuevo = true;
        btnGuardar.setEnabled(true);
    }

    public CrearProveedor(Main ma, Proveedor proveedores) {
        initComponents();
        this.ma = ma;
        this.proveedor = proveedores;
        proveedorDAO = new ProveedorDAO(ma);
        esNuevo = false;
        btnGuardar.setEnabled(true);
        txtRazonSocial.setText(proveedor.getRazonSocial());
        txtRuc.setText(proveedor.getRuc());
        txtDireccion.setText(proveedor.getDireccion());
        txtTelefono.setText(proveedor.getTelefono());
        txtEmail.setText(proveedor.getEmail());
    }

    private void LimpiarCasillas() {
        txtRazonSocial.setText("");
        txtRuc.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }

    private void obtenterProveedor(){
        proveedor.setRuc(txtRuc.getText());
        proveedor.setRazonSocial(txtRazonSocial.getText());
        proveedor.setDireccion(txtDireccion.getText());
        proveedor.setEmail(txtEmail.getText());
        proveedor.setTelefono(txtTelefono.getText());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        lblNombresUsuario = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        lblApellidosUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblUsuario2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("REGISTRAR PROVEEDOR");

        lblNombresUsuario.setText("Razón Social:");

        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
        });

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRucKeyReleased(evt);
            }
        });

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        lblApellidosUsuario.setText("RUC :");

        lblUsuario.setText("Dirección:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        lblUsuario1.setText("Teléfono:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblUsuario2.setText("E-mail:");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4568243163_160x159.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombresUsuario)
                            .addComponent(lblApellidosUsuario)
                            .addComponent(lblUsuario)
                            .addComponent(lblUsuario1)
                            .addComponent(lblUsuario2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombresUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidosUsuario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario1)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUsuario2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        obtenterProveedor();
        if (esNuevo) {
            boolean estado = proveedorDAO.VerificarExistencia(txtRuc.getText());
            if (estado) {
                JOptionPane.showMessageDialog(this, "RUC registrado en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
                LimpiarCasillas();
                btnGuardar.setEnabled(false);
            } else {
                proveedorDAO.RegistrarProveedor(proveedor);
                JOptionPane.showMessageDialog(this, "Proveedor Registrado Correctamente", "Registro Correcto", JOptionPane.INFORMATION_MESSAGE);
                LimpiarCasillas();
                btnGuardar.setEnabled(false);
            }

        } else {
            proveedorDAO.ActualizarProveedores(proveedor);
            JOptionPane.showMessageDialog(this, "Proveedor Actualizado Correctamente", "Registro Correcto", JOptionPane.INFORMATION_MESSAGE);
            LimpiarCasillas();
            btnGuardar.setEnabled(false);
            esNuevo = true;
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased
        if (!txtRazonSocial.getText().isEmpty() && !txtRuc.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtRuc.requestFocus();
        }
    }//GEN-LAST:event_txtRazonSocialKeyReleased

    private void txtRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyReleased
        if (!txtRazonSocial.getText().isEmpty() && !txtRuc.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtRucKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (!txtRazonSocial.getText().isEmpty() && !txtRuc.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (!txtRazonSocial.getText().isEmpty() && !txtRuc.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (!txtRazonSocial.getText().isEmpty() && !txtRuc.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblApellidosUsuario;
    private javax.swing.JLabel lblNombresUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
