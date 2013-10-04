package Usuario;

import ideosystem.Main;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Entidades.Usuario;
import AccesoDatos.UsuarioDAO;

public class CrearUsuario extends javax.swing.JPanel {

    private Main ma;
    private boolean esNuevo = true;
    private Usuario usuario;
    private UsuarioDAO usuarioDAO;

    public CrearUsuario(Main ma) {
        this.ma = ma;
        initComponents();
        usuarioDAO = new UsuarioDAO(ma);
        usuario = new Usuario();
        this.setVisible(true);
        esNuevo = true;
        btnGuardar.setEnabled(false);
    }

    public CrearUsuario(Main ma, Usuario usuario) {
        this.ma = ma;
        initComponents();
        this.setVisible(true);
        btnGuardar.setEnabled(true);
        jPassword1.setEnabled(true);
        jPassword2.setEnabled(true);
        this.usuario = usuario;
        usuarioDAO = new UsuarioDAO(ma);
        esNuevo = false;

        txtNombres.setText(usuario.getNombres());
        txtApellidos.setText(usuario.getApellidos());
        txtNick.setText(usuario.getNick());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        lblNombresUsuario = new javax.swing.JLabel();
        lblApellidosUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNick = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        jPassword2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        rbtnAdministrador = new javax.swing.JRadioButton();
        rbtnAsistente = new javax.swing.JRadioButton();
        rbtnVendedor = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(800, 800));

        lblNombresUsuario.setText("Nombres:");

        lblApellidosUsuario.setText("Apellidos:");

        lblUsuario.setText("Nombre Usuario:");

        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombresKeyReleased(evt);
            }
        });

        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidosKeyReleased(evt);
            }
        });

        txtNick.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNickKeyReleased(evt);
            }
        });

        jLabel4.setText("Password:");

        jLabel5.setText("Password:");

        jPassword1.setEnabled(false);
        jPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPassword1KeyReleased(evt);
            }
        });

        jPassword2.setEnabled(false);
        jPassword2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPassword2KeyReleased(evt);
            }
        });

        jLabel6.setText("Privilegios");

        rbtnAdministrador.setBackground(new Color(238, 233, 233));
        btnGroup.add(rbtnAdministrador);
        rbtnAdministrador.setText("Administrador");

        rbtnAsistente.setBackground(new Color(238, 233, 233));
        btnGroup.add(rbtnAsistente);
        rbtnAsistente.setText("Asistente Administrativo");

        rbtnVendedor.setBackground(new Color(238, 233, 233));
        btnGroup.add(rbtnVendedor);
        rbtnVendedor.setText("Vendedor");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1357381066_reg.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 102, 255));
        jLabel8.setText("MODIFICAR USUARIO :");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnVendedor)
                            .addComponent(rbtnAdministrador)
                            .addComponent(rbtnAsistente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidosUsuario)
                                    .addComponent(lblUsuario)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(lblNombresUsuario))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNick, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPassword1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPassword2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombresUsuario)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellidosUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnAdministrador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnAsistente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnVendedor)))
                .addGap(6, 6, 6)
                .addComponent(btnGuardar)
                .addContainerGap(459, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarCasillas() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtNick.setText("");
        jPassword1.setText("");
        jPassword2.setText("");
    }
    
    private void DeshabilitarCasillas() {
        txtNombres.setEditable(false);
        txtApellidos.setEditable(false);
        txtNick.setEditable(false);
        jPassword1.setEditable(false);
        jPassword2.setEditable(false);
    }

    public static boolean validarUsuario(String usuario) {
        //String regex = "/^[a-z\\d_]{4,20}$/i"; // Límite de 4 - 20 carácteres
        String regex = "|^[a-zA-Z]+(\\s*[a-zA-Z]*)*[a-zA-Z]+$|{4,20}$/i";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(usuario);
        return matcher.matches();
    }

    private void validarIngreso() {
        
        @SuppressWarnings("UnusedAssignment")
        boolean esUsuario = false;
        char pass[] = jPassword1.getPassword();
        char passconfirm[] = jPassword2.getPassword();
        @SuppressWarnings("UnusedAssignment")
        String password = "";
        @SuppressWarnings("UnusedAssignment")
        String passwordConfirm = "";

        try {
            usuario.setNick(txtNick.getText());
            usuario.setNombres(txtNombres.getText());
            usuario.setApellidos(txtApellidos.getText());
            
        } catch (Exception e) {
            usuario.setNick("");
            usuario.setNombres("");
            usuario.setApellidos("");
        }

        try {
            password = new String(pass);
            passwordConfirm = new String(passconfirm);
        } catch (Exception e) {
            password = "";
            passwordConfirm = "";
        }

        esUsuario = validarUsuario(usuario.getNick());

        if (esNuevo) {
            if (!usuario.getNick().equals("") && esUsuario) {
                if (password.length() > 0 && passwordConfirm.length() > 0) {
                    if (password.equals(passwordConfirm)) {
                        usuario.setPassword(password);
                        usuarioDAO.ingresarUsuario(usuario);
                        JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                        LimpiarCasillas();
                    } else {
                        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Aviso", JOptionPane.WARNING_MESSAGE);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Campos de contraseña vacio. Revise por favor.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jPassword1.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese nombre usuario válido por favor.", "Aviso", JOptionPane.WARNING_MESSAGE);
                txtNick.requestFocus();
            }
        } else {
            if (password.length() > 0 && passwordConfirm.length() > 0) {
                if (password.equals(passwordConfirm)) {
                    usuario.setPassword(password);
                    usuarioDAO.actualizarUsuario(usuario);
                    JOptionPane.showMessageDialog(this, "Usuario Actualizado Correctamente", "CORRECTO", JOptionPane.INFORMATION_MESSAGE);
                    DeshabilitarCasillas();
                } else {
                    JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Aviso", JOptionPane.WARNING_MESSAGE);
                    jPassword1.requestFocus();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Campos de contraseña vacio. Revise por favor.", "Aviso", JOptionPane.WARNING_MESSAGE);
                jPassword1.requestFocus();
            }
            btnGuardar.setEnabled(false);
            esNuevo = true;
        }


    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        validarIngreso();
        //LimpiarCasillas();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyReleased
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtApellidos.requestFocus();
        }
    }//GEN-LAST:event_txtNombresKeyReleased

    private void txtApellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyReleased
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNick.requestFocus();
        }
    }//GEN-LAST:event_txtApellidosKeyReleased

    private void txtNickKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNickKeyReleased
        // Validar existencia de usuario y activar casillasde password

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            boolean estado = usuarioDAO.usuarioExistente(txtNick.getText());
            if (estado) {
                JOptionPane.showMessageDialog(this, "Nombre de usuario ya registrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                jPassword1.setEnabled(true);
                jPassword2.setEnabled(true);
                jPassword1.requestFocus();
            }
        }
    }//GEN-LAST:event_txtNickKeyReleased

    private void jPassword2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword2KeyReleased
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnGuardar.requestFocus();
        }
    }//GEN-LAST:event_jPassword2KeyReleased

    private void jPassword1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassword1KeyReleased
        if (!txtNombres.getText().isEmpty() && !txtApellidos.getText().isEmpty()) {
            btnGuardar.setEnabled(true);
        } else {
            btnGuardar.setEnabled(false);
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPassword2.requestFocus();
        }
    }//GEN-LAST:event_jPassword1KeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JPasswordField jPassword2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidosUsuario;
    private javax.swing.JLabel lblNombresUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JRadioButton rbtnAdministrador;
    private javax.swing.JRadioButton rbtnAsistente;
    private javax.swing.JRadioButton rbtnVendedor;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
