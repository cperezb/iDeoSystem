/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import Entidades.Cliente;
import AccesoDatos.ClienteDAO;
import ideosystem.Main;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo
 */
public class CrearCliente extends javax.swing.JPanel {

    private boolean esNuevo = true;
    public ClienteDAO clientesDAO;
    private Cliente cliente;
    private Main ma;

    public CrearCliente(Main ma) {
        initComponents();
        this.ma = ma;
        cliente = new Cliente();
        clientesDAO = new ClienteDAO(ma);

        textoCliente.setText("Registrar Cliente");
        esNuevo = true;
        btnGuardar.setEnabled(false);
    }

    public CrearCliente(Main ma, Cliente cliente) {
        initComponents();
        this.ma = ma;
        this.cliente = cliente;
        clientesDAO = new ClienteDAO(ma);
        textoCliente.setText("Modificar Cliente");
        esNuevo = false;
        txtNombreCliente.setText(cliente.getNombreRazonSocial());
        txtDniRuc.setText(cliente.getDniRuc());
        txtDireccion.setText(cliente.getDireccion());
        txtTelefono.setText(cliente.getTelefono());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoCliente = new javax.swing.JLabel();
        lblNombresUsuario = new javax.swing.JLabel();
        lblApellidosUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDniRuc = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        textoCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoCliente.setForeground(new java.awt.Color(51, 102, 255));
        textoCliente.setText("MODIFICAR CLIENTE");

        lblNombresUsuario.setText("Nombre o Razón Social:");

        lblApellidosUsuario.setText("DNI / RUC :");

        lblUsuario.setText("Dirección:");

        lblUsuario1.setText("Teléfono:");

        txtTelefono.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        txtDniRuc.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtDniRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniRucKeyReleased(evt);
            }
        });

        txtNombreCliente.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtNombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreClienteKeyReleased(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/110424rwufolvyouewxmra.jpg.small.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsuario1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombresUsuario)
                                    .addComponent(lblApellidosUsuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(textoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textoCliente)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApellidosUsuario)
                            .addComponent(txtDniRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario1)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        cliente.setDniRuc(txtDniRuc.getText());
        cliente.setNombreRazonSocial(txtNombreCliente.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setTelefono(txtTelefono.getText());


        if (esNuevo) {
            if (clientesDAO.clienteExistente(cliente.getDniRuc())) {
                clientesDAO.agregarCliente(cliente);
                btnGuardar.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Cliente Registrardo Correctamente", "Registro Correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "El DNI/RUC ya existe", "Cliente Existente", JOptionPane.ERROR_MESSAGE);
                txtDniRuc.requestFocus();
                txtDniRuc.selectAll();
            }
        } else {
            clientesDAO.modificarCliente(cliente);
            btnGuardar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Cliente Actualizado Correctamente", "Actualizacion Correcta", JOptionPane.INFORMATION_MESSAGE);
            textoCliente.setText("Registrar Cliente");
            esNuevo = true;
        }

        txtDniRuc.setText("");
        txtNombreCliente.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClienteKeyReleased
        if (txtNombreCliente.getText().compareTo("") != 0 && txtDniRuc.getText().compareTo("") != 0) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
        if (evt.getKeyCode() == 10) {
            txtDniRuc.requestFocus();
        }
    }//GEN-LAST:event_txtNombreClienteKeyReleased

    private void txtDniRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniRucKeyReleased
        if (txtNombreCliente.getText().compareTo("") != 0 && txtDniRuc.getText().compareTo("") != 0) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
        if (evt.getKeyCode() == 10) {
            if (clientesDAO.clienteExistente(txtDniRuc.getText())) {
                txtDireccion.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "El DNI/RUC ya existe", "Cliente Existente", JOptionPane.ERROR_MESSAGE);
                txtDniRuc.requestFocus();
                txtDniRuc.selectAll();
            }

        }
    }//GEN-LAST:event_txtDniRucKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (txtNombreCliente.getText().compareTo("") != 0 && txtDniRuc.getText().compareTo("") != 0) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
        if (evt.getKeyCode() == 10) {
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (txtNombreCliente.getText().compareTo("") != 0 && txtDniRuc.getText().compareTo("") != 0) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }
        if (evt.getKeyCode() == 10) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellidosUsuario;
    private javax.swing.JLabel lblNombresUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel textoCliente;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDniRuc;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
