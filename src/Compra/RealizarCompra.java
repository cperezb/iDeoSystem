package Compra;

import AccesoDatos.ProveedorDAO;
import Adicionales.frmBuscarProducto;
import Adicionales.frmBuscarProveedor;
import Entidades.Proveedor;
import java.awt.event.KeyEvent;
import ideosystem.Main;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class RealizarCompra extends javax.swing.JPanel {

    private Main ma;
    private int contadorNumeroSeries = 0;
    private ArrayList<ArrayList> productossNuevos = new ArrayList<>();
    private ArrayList<ArrayList> productossExistentes = new ArrayList<>();
    private ArrayList numeroserie = new ArrayList();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private String fecha;
    private int nroCompra;
    private Proveedor proveedor;
    private ProveedorDAO proveedorDAO;

    public RealizarCompra(Main ma) {
        initComponents();
        this.ma = ma;
        lblNumeroSerie.setVisible(false);
        nroCompra = ma.compras.GetNumeroCompras() + 1;
        txtNroCompra.setText("" + nroCompra);
        dcFecha.setDate(new Date());
        jLabel14.setBackground(null);
        
        proveedor = new Proveedor();
        proveedorDAO = new ProveedorDAO(ma);
    }

    public void setearValores(String ruc, String direccion, String razonsocial) {
        txtRucProveedor.setText(ruc);
        txtNombreRazonSocial.setText(razonsocial);
        txtDireccion.setText(direccion);
    }

    private void limpiarTodasCasillas() {
        txtRucProveedor.setText("");
        txtNombreRazonSocial.setText("");
        txtDireccion.setText("");
        txtCodigoProducto.setText("");
        txtDescripcion.setText("");
        txtDescripcion.setEditable(false);
        txtMarca.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Todas las Categorías"}));
        jsCantidad.setValue(1);
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        contadorNumeroSeries = 0;
        lblNumeroSerie.setVisible(false);
        chNumSerie.setSelected(false);
        nroCompra = ma.compras.GetNumeroCompras() + 1;
        txtNroCompra.setText("" + nroCompra);
    }

    private void LimpiadaParcial() {
        txtCodigoProducto.setText("");
        txtDescripcion.setText("");
        txtDescripcion.setEditable(false);
        txtMarca.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Todas las Categorías"}));
        jsCantidad.setValue(1);
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        contadorNumeroSeries = 0;
        lblNumeroSerie.setVisible(false);
        chNumSerie.setSelected(false);
    }

    public void limpiarTabla() {
        try {
            DefaultTableModel temp = (DefaultTableModel) tabCompras.getModel();
            int filas = tabCompras.getRowCount();
            for (int i = 0; filas > i; i++) {
                temp.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    private String obtenerFecha(Date fecha) {
        return sdf.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnBuscarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCompras = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreRazonSocial = new javax.swing.JTextField();
        btnEliminarProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnModificarProducto = new javax.swing.JButton();
        txtRucProveedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtNroVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNroCompra = new javax.swing.JTextField();
        lblNombresUsuario3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblNombresUsuario2 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        txtNumSerie = new javax.swing.JTextField();
        chNumSerie = new javax.swing.JCheckBox();
        jSeparator3 = new javax.swing.JSeparator();
        lblNumeroSerie = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Código Producto:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 324, -1));

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, -1, -1));

        btnBuscarProveedor.setText("...");
        btnBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProveedorActionPerformed(evt);
            }
        });
        add(btnBuscarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        tabCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descripción", "Categoría", "Cantidad", "Precio", "Monto"
            }
        ));
        tabCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabComprasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabCompras);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 469, 738, 108));

        jLabel7.setText("Dirección:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jLabel6.setText("Razón Social:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, 20));

        txtNombreRazonSocial.setEnabled(false);
        add(txtNombreRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 324, -1));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminarProducto.setEnabled(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 469, 32, 28));

        jLabel5.setText("RUC:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 30, 20));

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnModificarProducto.setEnabled(false);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 508, 32, -1));

        txtRucProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRucProveedorKeyReleased(evt);
            }
        });
        add(txtRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 99, 20));

        jLabel9.setText("Descripción:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 224, -1, 30));

        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyReleased(evt);
            }
        });
        add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 176, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
        });
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 325, 23));

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        jLabel11.setText("Cantidad:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 20));

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));
        add(jsCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 48, -1));

        jLabel12.setText("Precio de Compra:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 20));

        txtPrecioCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioCompraKeyReleased(evt);
            }
        });
        add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 48, -1));

        dcFecha.setEnabled(false);
        add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 13, 144, -1));

        jLabel3.setText("Nro. Factura:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));
        add(txtNroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 176, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Realizar Compra");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel4.setText("Fecha:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 18, -1, -1));

        btnComprar.setText("Comprar");
        btnComprar.setEnabled(false);
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 583, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 457, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro_compra.png"))); // NOI18N
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 102, -1, -1));

        jLabel10.setText("Nro. Compra:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        txtNroCompra.setEnabled(false);
        add(txtNroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 108, -1));

        lblNombresUsuario3.setText("Marca:");
        add(lblNombresUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, -1, 30));

        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMarcaKeyReleased(evt);
            }
        });
        add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 175, -1));

        lblNombresUsuario2.setText("Categoría:");
        add(lblNombresUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 30));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas las Categorías"}));
        add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 273, -1));

        jLabel16.setText("Precio de Venta:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, 20));

        txtPrecioVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioVentaKeyReleased(evt);
            }
        });
        add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 48, -1));

        txtNumSerie.setEnabled(false);
        txtNumSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumSerieKeyReleased(evt);
            }
        });
        add(txtNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 273, -1));

        chNumSerie.setText("Nro Serie:");
        chNumSerie.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chNumSerieItemStateChanged(evt);
            }
        });
        add(chNumSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 658, 10));

        lblNumeroSerie.setText("Número de Serie");
        add(lblNumeroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 414, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProveedorActionPerformed
        new frmBuscarProveedor(ma, this);
    }//GEN-LAST:event_btnBuscarProveedorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new frmBuscarProducto();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void chNumSerieItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chNumSerieItemStateChanged

        if (chNumSerie.isSelected()) {

            if (jsCantidad.getValue() == 0) {
                JOptionPane.showMessageDialog(this, "Agrege una cantidad", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                contadorNumeroSeries++;
                lblNumeroSerie.setVisible(true);
                txtNumSerie.setEnabled(true);
                lblNumeroSerie.setText("Ingrese " + contadorNumeroSeries + "° numero Serie");
                txtNumSerie.requestFocus();
//                JOptionPane.showMessageDialog(this, "Ingrese " + contadorNumeroSeries + "° Número de Serie ", "Numero Series", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (!chNumSerie.isSelected()) {
            txtNumSerie.setEnabled(false);
            contadorNumeroSeries = 0;
            lblNumeroSerie.setVisible(false);
        }
    }//GEN-LAST:event_chNumSerieItemStateChanged

    private void txtRucProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucProveedorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Consulta ruc a base de datos y carga los datos de existir
            proveedor = proveedorDAO.GetValuesProveedorByRuc(txtRucProveedor.getText());
            txtNombreRazonSocial.setText(proveedor.getRuc());
            txtDireccion.setText(proveedor.getDireccion());
        }
    }//GEN-LAST:event_txtRucProveedorKeyReleased

    private void txtCodigoProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String datosProducto[] = ma.productos.GetValuesProductoByCodigo(txtCodigoProducto.getText());
            if (datosProducto.length > 0 && datosProducto[0] != null) {
                cbCategoria.setModel(new DefaultComboBoxModel(ma.categoria.GetValuesCategoriasPorCodigoProducto(txtCodigoProducto.getText())));
                cbCategoria.setEnabled(false);
                txtDescripcion.setText(datosProducto[0]);
                txtMarca.setText(datosProducto[1]);
                txtPrecioCompra.setText(datosProducto[2]);
                txtPrecioVenta.setText(datosProducto[3]);
                boolean nroserie = ma.compras.numeroseries(txtCodigoProducto.getText());
                if (!nroserie) {
                    chNumSerie.setEnabled(false);
                }
                jsCantidad.requestFocus();

            } else {
                cbCategoria.setModel(new DefaultComboBoxModel(ma.categoria.GetValuesCategorias()));
                txtDescripcion.setEditable(true);
                txtDescripcion.requestFocus();

            }
        }
    }//GEN-LAST:event_txtCodigoProductoKeyReleased

    private void txtNumSerieKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumSerieKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (contadorNumeroSeries <= Integer.parseInt(jsCantidad.getValue().toString())) {

                lblNumeroSerie.setText("Ingrese " + contadorNumeroSeries + "° numero Serie");
                numeroserie.add(txtNumSerie.getText());
                txtNumSerie.setText("");
                txtNumSerie.requestFocus();
                contadorNumeroSeries++;

            }
        }
    }//GEN-LAST:event_txtNumSerieKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cbCategoria.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyReleased

    private void txtPrecioCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCompraKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (validaPrecio(txtPrecioCompra)) {
                txtPrecioVenta.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un precio correcto (Formato 11.11)", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtPrecioCompraKeyReleased

    private void txtPrecioVentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioVentaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_TAB) {

            if (validaPrecio(txtPrecioVenta)) {
                btnAgregarProducto.requestFocus();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un precio correcto (Formato 11.11)", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtPrecioVentaKeyReleased

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if (!txtNombreRazonSocial.getText().isEmpty()) {
            if (validaCamposProducto()) {

                float cantidad = Float.parseFloat(jsCantidad.getValue().toString());
                float precioCompra = Float.parseFloat(txtPrecioCompra.getText());
                float monto = cantidad * precioCompra;

                DefaultTableModel modelo = (DefaultTableModel) tabCompras.getModel();
                Object obj[] = {txtCodigoProducto.getText(), txtDescripcion.getText(), cbCategoria.getSelectedItem().toString(), jsCantidad.getValue(), txtPrecioCompra.getText(), monto};
                modelo.addRow(obj);

                ArrayList detalleproductos = new ArrayList();
                if (txtDescripcion.isEditable()) {

                    detalleproductos.add(txtCodigoProducto.getText());
                    detalleproductos.add(txtDescripcion.getText());
                    detalleproductos.add(txtMarca.getText());
                    detalleproductos.add(cbCategoria.getSelectedItem());
                    detalleproductos.add(jsCantidad.getValue());
                    detalleproductos.add(txtPrecioCompra.getText());
                    detalleproductos.add(txtPrecioVenta.getText());
                    productossNuevos.add(detalleproductos);

                } else {

                    detalleproductos.add(txtCodigoProducto.getText());
                    detalleproductos.add(jsCantidad.getValue());
                    detalleproductos.add(txtPrecioCompra.getText());
                    detalleproductos.add(txtPrecioVenta.getText());
                    productossExistentes.add(detalleproductos);
                }
            }
            btnComprar.setEnabled(true);
            LimpiadaParcial();
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void tabComprasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabComprasMouseReleased
        btnEliminarProducto.setEnabled(true);
        btnModificarProducto.setEnabled(true);
    }//GEN-LAST:event_tabComprasMouseReleased

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea retirar el productos de la compra ?");
        if (confirmacion == 0) {
            String codigo = tabCompras.getValueAt(tabCompras.getSelectedRow(), 0).toString();
            for (int i = 0; i < productossExistentes.size(); i++) {
                if (codigo.compareTo(productossExistentes.get(i).toString()) == 0) {
                    productossExistentes.remove(i);
                    break;
                }
            }
            for (int i = 0; i < productossNuevos.size(); i++) {
                if (codigo.compareTo(productossNuevos.get(i).toString()) == 0) {
                    productossNuevos.remove(i);
                    break;
                }
            }
            DefaultTableModel modelo = (DefaultTableModel) tabCompras.getModel();
            modelo.removeRow(tabCompras.getSelectedRow());
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        int idProducto = 0;
        if (productossNuevos.size() > 0) {
            for (int i = 0; i < productossNuevos.size(); i++) {
                ma.productos.agregarProducto(productossNuevos.get(i).get(0).toString(), productossNuevos.get(i).get(1).toString(), productossNuevos.get(i).get(2).toString(), productossNuevos.get(i).get(3).toString(), Integer.parseInt(productossNuevos.get(i).get(4).toString()), Float.parseFloat(productossNuevos.get(i).get(5).toString()), Float.parseFloat(productossNuevos.get(i).get(6).toString()));
            }
            idProducto = ma.productos.ObtenerUltimoIdProducto();
            if (numeroserie.size() > 0) {
                for (int i = 0; i < numeroserie.size(); i++) {
                    ma.nroserie.AgregarNroSeries(idProducto, numeroserie.get(i).toString());
                }
            }
        }
        if (productossExistentes.size() > 0) {
            for (int i = 0; i < productossExistentes.size(); i++) {
                ma.productos.actualizarProducto(productossExistentes.get(i).get(0).toString(), Integer.parseInt(productossExistentes.get(i).get(1).toString()), Float.parseFloat(productossExistentes.get(i).get(2).toString()), Float.parseFloat(productossExistentes.get(i).get(3).toString()));
            }
            idProducto = ma.productos.ObtenerUltimoIdProductoByCodigo(productossExistentes.get(0).get(0).toString());
            if (numeroserie.size() > 0) {
                for (int i = 0; i < numeroserie.size(); i++) {
                    ma.nroserie.AgregarNroSeries(idProducto, numeroserie.get(i).toString());
                }
            }
        }

        // Primero creamos la compra
        try {
            fecha = obtenerFecha(dcFecha.getDate());
        } catch (Exception e) {
            fecha = "";
        }
        int nroFilas = tabCompras.getRowCount();
        proveedor.setIdProveedor(0);
        float montototal = 0;
        for (int i = 0; i < nroFilas; i++) {
            montototal += Float.parseFloat(tabCompras.getValueAt(i, 5).toString());
        }
        proveedor.setIdProveedor(proveedorDAO.GetIdProveedorByRuc(txtRucProveedor.getText()));
        ma.compras.AgregarCompra(Integer.parseInt(txtNroCompra.getText()), montototal, fecha);

        // Recorremos la tabla y empezamos a grabar
        for (int i = 0; i < nroFilas; i++) {
            // Ahora el detalle compra
            idProducto = ma.productos.ObtenerUltimoIdProductoByCodigo(tabCompras.getValueAt(i, 0).toString());
            ma.compras.AgregarDetalleCompra(Integer.parseInt(txtNroCompra.getText()), idProducto, proveedor.getIdProveedor(),
                    Float.parseFloat(tabCompras.getValueAt(i, 3).toString()),
                    Float.parseFloat(productossNuevos.get(i).get(5).toString()),
                    Float.parseFloat(productossNuevos.get(i).get(6).toString()));
        }
        limpiarTodasCasillas();
        limpiarTabla();
        
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed

        String codigo = tabCompras.getValueAt(tabCompras.getSelectedRow(), 0).toString();
        for (int i = 0; i < productossExistentes.size(); i++) {
            if (codigo.compareTo(productossExistentes.get(i).toString()) == 0) {
                productossExistentes.remove(i);
                break;
            }
        }
        for (int i = 0; i < productossNuevos.size(); i++) {
            if (codigo.compareTo(productossNuevos.get(i).toString()) == 0) {
                productossNuevos.remove(i);
                break;
            }
        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private boolean validaCamposProducto() {
        if (txtCodigoProducto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Revise el campo codigo productos ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtCodigoProducto.requestFocus();
            txtCodigoProducto.selectAll();
            return false;
        } else if (txtDescripcion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Revise el campo descripcion productos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtDescripcion.requestFocus();
            txtDescripcion.selectAll();
            return false;
        } else if (txtMarca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Revise el campo marca productos ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtMarca.requestFocus();
            txtMarca.selectAll();
            return false;
        }
//        else if (txtPrecioCompra.getText().isEmpty() || validaPrecio(txtPrecioCompra)) {
//            JOptionPane.showMessageDialog(this, "Revise el campo precio compra productos ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
//            txtPrecioCompra.requestFocus();
//            txtPrecioCompra.selectAll();
//            return false;
//        } else if (txtPrecioVenta.getText().isEmpty() || validaPrecio(txtPrecioVenta)) {
//            JOptionPane.showMessageDialog(this, "Revise el campo precio venta productos ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
//            txtPrecioVenta.requestFocus();
//            txtPrecioVenta.selectAll();
//            return false;
//        }
        return true;
    }

    private boolean validaPrecio(JTextField txtPrecio) {
        float precio;
        try {
            precio = Float.parseFloat(txtPrecio.getText().toString());
        } catch (Exception error) {
            precio = 0;
        }

        if (precio > 0) {
            return true;
        } else {
//                JOptionPane.showMessageDialog(this, "Ingrese un precio correcto (Formato 11.11)","ERROR",JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarProveedor;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JCheckBox chNumSerie;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JLabel lblNombresUsuario2;
    private javax.swing.JLabel lblNombresUsuario3;
    private javax.swing.JLabel lblNumeroSerie;
    private javax.swing.JTable tabCompras;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNombreRazonSocial;
    private javax.swing.JTextField txtNroCompra;
    private javax.swing.JTextField txtNroVenta;
    private javax.swing.JTextField txtNumSerie;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtRucProveedor;
    // End of variables declaration//GEN-END:variables
}