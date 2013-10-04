package Adicionales;

import AccesoDatos.ProveedorDAO;
import Compra.RealizarCompra;
import Entidades.Proveedor;
import java.awt.Color;
import ideosystem.Main;

public class frmBuscarProveedor extends javax.swing.JFrame {
   
    private Main ma;
    private RealizarCompra compra;
    private Proveedor proveedor;
    private ProveedorDAO proveedorDAO;
    public frmBuscarProveedor(Main ma, RealizarCompra compra) {
        initComponents();
        this.ma = ma;
        this.compra = compra;
        
        proveedor = new  Proveedor();
        proveedorDAO = new ProveedorDAO(ma);
        
        tabProveedor.setModel(proveedorDAO.GetListaProveedores());
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRazonSocial = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabProveedor = new javax.swing.JTable();
        btnSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BUSCAR PROVEEDOR");

        jLabel1.setText("RazÃ³n Social:");

        txtRazonSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRazonSocialKeyReleased(evt);
            }
        });

        tabProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Distribuciones Oliva S.R.L"},
                {"Panadero"},
                {"Vinos Pura Sangre"}
            },
            new String [] {
                "RazÃ³n Social"
            }
        ));
        tabProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabProveedor);

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setEnabled(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeleccionar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabProveedorMouseClicked
        btnSeleccionar.setEnabled(true);
        proveedor = proveedorDAO.GetValuesProveedorporRazonSocial(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 0).toString());
        if (evt.getClickCount() == 2) {
            compra.setearValores(proveedor.getRuc(), proveedor.getDireccion(), proveedor.getRazonSocial());
            this.dispose();
        }
    }//GEN-LAST:event_tabProveedorMouseClicked

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        proveedor = proveedorDAO.GetValuesProveedorporRazonSocial(tabProveedor.getValueAt(tabProveedor.getSelectedRow(), 0).toString());
        compra.setearValores(proveedor.getRuc(), proveedor.getDireccion(), proveedor.getRazonSocial());
        this.dispose();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void txtRazonSocialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRazonSocialKeyReleased
        tabProveedor.setModel(proveedorDAO.GetProveedorporCriterio(txtRazonSocial.getText()));
    }//GEN-LAST:event_txtRazonSocialKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabProveedor;
    private javax.swing.JTextField txtRazonSocial;
    // End of variables declaration//GEN-END:variables
}
