package ideosystem;

import Entidades.Usuario;
import AccesoDatos.UsuarioDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Renzo
 */
public class Login extends javax.swing.JFrame {

    private Main ma;
    private UsuarioDAO usuarioDAO;
    private Usuario usuario;

    public Login(Main ma) {
        this.ma = ma;
        initComponents();

        usuario = new Usuario();
        usuarioDAO = new UsuarioDAO(ma);

        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    private void validaUsuarioYPassword() {
        char pass[] = txtPass.getPassword();
        String password;
        password = new String(pass);

        if (usuarioDAO.getPasswordByNick(txtUsuario.getText()).getPassword() != null) {
            if (password.compareTo(usuarioDAO.getPasswordByNick(txtUsuario.getText()).getPassword()) == 0) {
                ma.usuarioActual = txtUsuario.getText();

                new Menu(ma);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Password incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);

                txtPass.requestFocus();
                txtPass.selectAll();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Usuario Inexistente", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtUsuario.requestFocus();
            txtUsuario.selectAll();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnIngreso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso");

        txtUsuario.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtUsuario.setText("Usuario");
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        txtPass.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtPass.setText("*******");
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPassKeyReleased(evt);
            }
        });

        btnIngreso.setBackground(new java.awt.Color(255, 255, 255));
        btnIngreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Password1.gif"))); // NOI18N
        btnIngreso.setText("Ingresar");
        btnIngreso.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnIngreso.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator_keys.png"))); // NOI18N
        jLabel1.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngreso, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed

        validaUsuarioYPassword();

    }//GEN-LAST:event_btnIngresoActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtPassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validaUsuarioYPassword();
        }
    }//GEN-LAST:event_txtPassKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
