/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Adicionales.frmBuscarCliente;
import Adicionales.frmBuscarProducto;
import Entidades.Cliente;
import AccesoDatos.ClienteDAO;
import ideosystem.Main;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GenerarComprobante extends javax.swing.JPanel {

    /**
     * Creates new form GenerarComprobante
     */
    private Main ma;
    private float total;
    private Cliente cliente;
    private ClienteDAO clienteDAO;

    public GenerarComprobante(Main ma, String[] datos) {
        initComponents();
        this.ma = ma;
        cliente = new Cliente();
        dcFecha.setDate(new Date());
        int nroServicio = ma.servicio.ultimoNroServicio();
        txtNroServicio.setText("" + nroServicio);
        txtDniRuc.setText(datos[0]);
        txtNombreRazonS.setText(datos[1]);
        txtDireccion.setText(datos[2]);
        calcularPrecioConDescuento();
        CalcularPrecioFinal();

        clienteDAO = new ClienteDAO(ma);

    }

    private String obtenerFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(fecha);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoProducto = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabComprobantes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreRazonS = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtDniRuc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jsDcto = new javax.swing.JSpinner();
        cbComprobante = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNroServicio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtManoObra = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lblprecioDcto = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblPrecioigv = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyReleased(evt);
            }
        });
        add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 159, 176, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, 568, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 568, 10));

        btnEliminar.setText("X");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 354, -1, -1));

        jLabel8.setText("CÃ“DIGO DEL PRODUCTO :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 162, -1, -1));

        tabComprobantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCIÃ“N", "CATEGORÃ�A", "CANTIDAD", "PRECIO", "DESCUENTO", "MONTO"
            }
        ));
        tabComprobantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabComprobantesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabComprobantes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 354, 711, 108));

        jLabel7.setText("DIRECCIÃ“N :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 117, 324, -1));

        jLabel15.setText("SUBTOTAL :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        txtNombreRazonS.setEnabled(false);
        txtNombreRazonS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreRazonSKeyReleased(evt);
            }
        });
        add(txtNombreRazonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 89, 324, -1));

        btnBuscarCliente.setText("...");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 88, -1, -1));

        btnModificar.setText("*");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 388, -1, -1));

        txtDniRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniRucKeyReleased(evt);
            }
        });
        add(txtDniRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 62, 99, -1));

        jLabel6.setText("NOMBRE O RAZÃ“N SOCIAL :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, -1));
        add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 186, 325, -1));

        jLabel9.setText("DESCRIPCIÃ“N :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        jLabel17.setText("TOTAL :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, -1, -1));

        jLabel16.setText("I.G.V. 18%:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 185, -1, -1));

        jLabel10.setText("CATEGORÃ�A:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, -1, -1));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Repuestos" }));
        add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 214, 177, -1));

        jLabel11.setText("CANTIDAD :");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 243, -1, -1));

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(0), null, Integer.valueOf(1)));
        jsCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCantidadStateChanged(evt);
            }
        });
        add(jsCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 240, 48, -1));

        jLabel12.setText("PRECIO :");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, -1, -1));

        txtPrecio.setText("0.0");
        txtPrecio.setEnabled(false);
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 266, 48, -1));

        jLabel13.setText("DESCUENTO :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, -1, -1));

        jLabel1.setText("GENERAR COMPROBANTE");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel5.setText("DNI/RUC CLIENTE :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, -1, -1));

        jsDcto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        jsDcto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsDctoStateChanged(evt);
            }
        });
        add(jsDcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 293, 48, -1));

        cbComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boleta", "Factura"}));
        add(cbComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 31, 200, -1));

        jLabel3.setText("COMPROBANTE :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 34, -1, -1));

        btnAgregar.setText("AGREGAR PRODUCTO");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 292, -1, -1));

        txtNroServicio.setEnabled(false);
        add(txtNroServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 31, 99, -1));

        jLabel14.setText("Precio Dcto:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, 20));

        jLabel2.setText("Nro. Servicio :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 34, -1, -1));

        dcFecha.setEnabled(false);
        add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(626, 5, 144, -1));

        jLabel4.setText("FECHA :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 11, -1, -1));

        btnGenerar.setText("GENERAR SERVICIO");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, -1, -1));

        jLabel18.setText("MONTO POR REPARACIÃ“N O MANTENIMIENTO :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 471, -1, -1));

        txtManoObra.setText("0.0");
        txtManoObra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtManoObraKeyReleased(evt);
            }
        });
        add(txtManoObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 468, 77, -1));

        jLabel19.setText("soles");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 471, -1, -1));

        lblprecioDcto.setText("PRECIO");
        add(lblprecioDcto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, 20));

        lblTotal.setText("PRECIO TOTAL");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, -1, -1));

        lblSubtotal.setText("PRECIOSUB");
        add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        lblPrecioigv.setText("PRECIO IGV");
        add(lblPrecioigv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        new frmBuscarCliente(ma, this);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new frmBuscarProducto(ma, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String productos[] = ma.productos.GetValuesProductoFromServicioByCodigo(txtCodigoProducto.getText());
            if (productos[0].compareTo(" ") != 0) {
                txtDescripcion.setText(productos[0]);
                txtPrecio.setText(productos[1]);
            } else {
                JOptionPane.showMessageDialog(this, "Producto no existente", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCodigoProductoKeyReleased

    private void jsCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCantidadStateChanged
        // TODO add your handling code here:
        calcularPrecioConDescuento();
    }//GEN-LAST:event_jsCantidadStateChanged

    private void jsDctoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsDctoStateChanged
        // TODO add your handling code here:
        calcularPrecioConDescuento();
    }//GEN-LAST:event_jsDctoStateChanged

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea retirar el producto de la venta ?");
        if (confirmacion == 0) {

            DefaultTableModel modelo = (DefaultTableModel) tabComprobantes.getModel();
            modelo.removeRow(tabComprobantes.getSelectedRow());
            CalcularPrecioFinal();

        }
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (validaCamposCliente()) {
            if (!txtDescripcion.getText().isEmpty()) {

                calcularPrecioConDescuento();

                DefaultTableModel modelo = (DefaultTableModel) tabComprobantes.getModel();
                Object obj[] = {txtCodigoProducto.getText(), txtDescripcion.getText(), cbCategoria.getItemAt(0).toString(), jsCantidad.getValue(), txtPrecio.getText(), jsDcto.getValue(), lblprecioDcto.getText()};
                modelo.addRow(obj);

                CalcularPrecioFinal();
                limpiarCamposProducto();
                calcularPrecioConDescuento();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String codigo = tabComprobantes.getValueAt(tabComprobantes.getSelectedRow(), 0).toString();
        txtCodigoProducto.setText(codigo);
        String descripcion = tabComprobantes.getValueAt(tabComprobantes.getSelectedRow(), 1).toString();
        txtDescripcion.setText(descripcion);

        int cantidad = Integer.parseInt(tabComprobantes.getValueAt(tabComprobantes.getSelectedRow(), 3).toString());
        jsCantidad.setValue(cantidad);
        float precio = Float.parseFloat(tabComprobantes.getValueAt(tabComprobantes.getSelectedRow(), 4).toString());
        txtPrecio.setText("" + precio);
        int descuento = Integer.parseInt(tabComprobantes.getValueAt(tabComprobantes.getSelectedRow(), 5).toString());
        jsDcto.setValue(descuento);
        calcularPrecioConDescuento();

        DefaultTableModel modelo = (DefaultTableModel) tabComprobantes.getModel();
        modelo.removeRow(tabComprobantes.getSelectedRow());

        CalcularPrecioFinal();
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtDniRucKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniRucKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cliente = clienteDAO.GetClientesByDniRuc(txtDniRuc.getText());
            if (cliente.getDniRuc() != null) {
                txtNombreRazonS.setText(cliente.getNombreRazonSocial());
                txtDireccion.setText(cliente.getDireccion());
                txtCodigoProducto.requestFocus();
            } else {
                txtNombreRazonS.setEditable(true);
                txtNombreRazonS.requestFocus();
            }
        }
    }//GEN-LAST:event_txtDniRucKeyReleased

    private void txtManoObraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManoObraKeyReleased
        try {
            Float.parseFloat(txtManoObra.getText());
            CalcularPrecioFinal();
        } catch (Exception error) {
            txtManoObra.requestFocus();
            txtManoObra.selectAll();
        }
    }//GEN-LAST:event_txtManoObraKeyReleased

    private void tabComprobantesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabComprobantesMouseReleased
        btnEliminar.setEnabled(true);
        btnModificar.setEnabled(true);
    }//GEN-LAST:event_tabComprobantesMouseReleased

    private void txtNombreRazonSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRazonSKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtNombreRazonSKeyReleased

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        // TODO add your handling code here:

        if (tabComprobantes.getRowCount() > 0) {
            // Actualizamos el servicio
            ma.servicio.actualizarServicio(txtDniRuc.getText(),
                    txtNombreRazonS.getText(), txtDireccion.getText(), obtenerFecha(dcFecha.getDate()), total);
            // Ahora el detalle-servicio
            int idProducto;
            for (int i = 0; i < tabComprobantes.getRowCount(); i++) {
                idProducto = ma.productos.ObtenerUltimoIdProductoByCodigo(tabComprobantes.getValueAt(i, 0).toString());
                ma.servicio.agregarDetallServicio(Integer.parseInt(txtNroServicio.getText()), idProducto,
                        Integer.parseInt(tabComprobantes.getValueAt(i, 3).toString()), Float.parseFloat(tabComprobantes.getValueAt(i, 5).toString()),
                        Float.parseFloat(tabComprobantes.getValueAt(i, 6).toString()));
            }
        }
        ma.impresion();
        limpiarCamposProducto();

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void calcularPrecioConDescuento() {
        float cantidad = Float.parseFloat(jsCantidad.getValue().toString());
        float precioventa = Float.parseFloat(txtPrecio.getText());
        float monto = cantidad * precioventa;
        float dcto = 100 - Integer.parseInt(jsDcto.getValue().toString());
        float preciofinal = dcto * monto / 100;
        lblprecioDcto.setText("" + preciofinal);
    }

    private void limpiarCamposProducto() {
        txtCodigoProducto.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("0.0");
        jsCantidad.setValue(1);
        jsDcto.setValue(0);


    }

    private void CalcularPrecioFinal() {
        if (tabComprobantes.getRowCount() > 0) {
            total = 0;
            for (int i = 0; i < tabComprobantes.getRowCount(); i++) {
                total += Float.parseFloat(tabComprobantes.getValueAt(i, 6).toString());
            }

            float manoObra;
            if (txtManoObra.getText().isEmpty()) {
                manoObra = 0;
            } else {
                manoObra = Float.parseFloat(txtManoObra.getText());
            }

            total += manoObra;
            float igv = 18 * total / 100;
            float subtotal = total - igv;
            lblSubtotal.setText("" + subtotal);
            lblPrecioigv.setText("" + igv);

            lblTotal.setText("" + total);
        } else {
            lblSubtotal.setText("");
            lblPrecioigv.setText("");
            lblTotal.setText("");
        }
    }

    public void SetValoresCliente(String dniruc, String direccion, String nombrerazonsocial) {
        txtDniRuc.setText(dniruc);
        txtNombreRazonS.setText(nombrerazonsocial);
        txtDireccion.setText(direccion);
    }

    public void SetValoresProducto(String codigo, String descripcion, String precioVenta) {
        txtCodigoProducto.setText(codigo);
        txtDescripcion.setText(descripcion);
        txtPrecio.setText(precioVenta);
        calcularPrecioConDescuento();

    }

    private boolean validaCamposCliente() {
        if (txtDniRuc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Revise el campo DNI/Ruc Cliente ", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtDniRuc.requestFocus();
            txtDniRuc.selectAll();
            return false;
        } else if (txtNombreRazonS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Revise el campo Nombre/Razon Social", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            txtNombreRazonS.requestFocus();
            txtNombreRazonS.selectAll();
            return false;
        }
        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbComprobante;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JSpinner jsDcto;
    private javax.swing.JLabel lblPrecioigv;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblprecioDcto;
    private javax.swing.JTable tabComprobantes;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDniRuc;
    private javax.swing.JTextField txtManoObra;
    private javax.swing.JTextField txtNombreRazonS;
    private javax.swing.JTextField txtNroServicio;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
