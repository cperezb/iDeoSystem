package Venta;

import Adicionales.frmBuscarCliente;
import Adicionales.frmBuscarProducto;
import Entidades.Cliente;
import AccesoDatos.ClienteDAO;
import ideosystem.Main;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RealizarVenta extends javax.swing.JPanel {

    private Main ma;
    private ArrayList clienteNuevo = new ArrayList<>();
    private ArrayList clienteExistente = new ArrayList<>();
    private ArrayList<ArrayList> numerosSerie = new ArrayList();
    float total;
    private ClienteDAO clienteDAO;
    private Cliente cliente;

    public RealizarVenta(Main ma) {
        initComponents();

        this.ma = ma;

        cliente = new Cliente();
        clienteDAO = new ClienteDAO(ma);
        dcFecha.setDate(new Date()); // Fecha De HOY

        //Trae ultimo nro de ventas y le suma 1
        int nroVenta = ma.ventas.GetNroVenta() + 1;
        txtNroVenta.setText("" + nroVenta);

        //Precios por defecto de 0.0
        calcularPrecioConDescuento();
        calcularPrecioFinal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNroVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbComprobante = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtDniRuc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreRazonS = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDescripcionProducto = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbNroSerie = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jsDescuento = new javax.swing.JSpinner();
        lblDescuento = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVentas = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        btnEliminarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        lblSubTotal = new javax.swing.JLabel();
        lblIgv = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblPrecioFinal = new javax.swing.JLabel();
        lblPrecioSub = new javax.swing.JLabel();
        lblPrecioIgv = new javax.swing.JLabel();
        lblPrecioTotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REALIZAR VENTA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        jLabel2.setText("Nro Venta:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 39, -1, -1));

        txtNroVenta.setEnabled(false);
        add(txtNroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 36, 99, -1));

        jLabel3.setText("Comprobante");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 8, -1, -1));

        cbComprobante.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boleta", "Factura"}));
        add(cbComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 5, 185, -1));

        jLabel4.setText("Fecha:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 8, -1, -1));

        dcFecha.setEnabled(false);
        add(dcFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 5, 144, -1));

        jLabel5.setText("DNI o RUC:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 70, -1, -1));

        txtDniRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniRucKeyReleased(evt);
            }
        });
        add(txtDniRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 67, 99, -1));

        jLabel6.setText("Nombre o Razón Social:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 97, -1, -1));

        txtNombreRazonS.setEditable(false);
        txtNombreRazonS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreRazonSKeyReleased(evt);
            }
        });
        add(txtNombreRazonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 94, 324, -1));

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 93, -1, -1));

        jLabel7.setText("Dirección:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 125, -1, -1));

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 122, 324, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 146, 508, 10));

        jLabel8.setText("Código Producto:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 165, -1, -1));

        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyReleased(evt);
            }
        });
        add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 162, 176, -1));

        jLabel9.setText("Descripción:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 192, -1, -1));
        add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 188, 325, -1));

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 188, -1, -1));

        jLabel10.setText("Nro Serie:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 215, -1, -1));

        cbNroSerie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        add(cbNroSerie, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 212, 177, -1));

        jLabel11.setText("Cantidad:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 241, -1, -1));

        jsCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));
        jsCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsCantidadStateChanged(evt);
            }
        });
        add(jsCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 238, 48, -1));

        jLabel12.setText("Precio:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 267, -1, -1));

        txtPrecio.setText("0.0");
        txtPrecio.setEnabled(false);
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 264, 47, -1));

        jLabel13.setText("Descuento:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 294, -1, -1));

        jsDescuento.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 5));
        jsDescuento.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsDescuentoStateChanged(evt);
            }
        });
        add(jsDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 291, -1, -1));

        lblDescuento.setText("Precio con Dcto:");
        add(lblDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, 20));

        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 304, -1, -1));

        tabVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Cantidad", "Precio", "Descuento", "Monto"
            }
        ));
        jScrollPane1.setViewportView(tabVentas);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 333, 634, 108));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 317, 499, 10));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 333, 32, 26));

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Modify.png"))); // NOI18N
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 365, 32, -1));

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, -1, -1));

        lblSubTotal.setText("SUBTOTAL :");
        add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        lblIgv.setText("I.G.V. 18% :");
        add(lblIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        lblTotal.setText("TOTAL :");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar.png"))); // NOI18N
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 104, 117, -1));

        lblPrecioFinal.setText("PRECIO");
        add(lblPrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, 20));

        lblPrecioSub.setText("PRECIOSUB");
        add(lblPrecioSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        lblPrecioIgv.setText("PRECIOIGV");
        add(lblPrecioIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, -1, -1));

        lblPrecioTotal.setText("PRECIOTOTAL");
        add(lblPrecioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new frmBuscarCliente(ma, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new frmBuscarProducto(ma, this);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCodigoProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String datosProducto[] = ma.productos.GetValuesProductoByCodigo(txtCodigoProducto.getText());
            if (datosProducto.length > 0 && datosProducto[0] != null) {
                txtDescripcionProducto.setText("" + datosProducto[0]);
                txtPrecio.setText("" + datosProducto[1]);
                String[] numeroSerie = ma.productos.GetNumeroSerieFromProductoByDescripcion(datosProducto[0]);
                if (numeroSerie.length > 0) {
                    cbNroSerie.setModel(new DefaultComboBoxModel(numeroSerie));
                    cbNroSerie.setEnabled(true);
                } else {
                    cbNroSerie.setEnabled(false);
                    cbNroSerie.setModel(new DefaultComboBoxModel(new String[]{" "}));
                }
            } else {
                JOptionPane.showMessageDialog(this, "El codigo del producto no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            calcularPrecioConDescuento();
        }
    }//GEN-LAST:event_txtCodigoProductoKeyReleased

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

    private void txtNombreRazonSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRazonSKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtDireccion.requestFocus();
        }
    }//GEN-LAST:event_txtNombreRazonSKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCodigoProducto.requestFocus();
        }
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(this, "Esta seguro que desea retirar el producto de la venta ?");
        if (confirmacion == 0) {
            String codigo = tabVentas.getValueAt(tabVentas.getSelectedRow(), 0).toString();
            for (int i = 0; i < clienteExistente.size(); i++) {
                if (codigo.compareTo(clienteExistente.get(i).toString()) == 0) {
                    clienteExistente.remove(i);
                    break;
                }
            }
            for (int i = 0; i < clienteNuevo.size(); i++) {
                if (codigo.compareTo(clienteNuevo.get(i).toString()) == 0) {
                    clienteNuevo.remove(i);
                    break;
                }
            }
            DefaultTableModel modelo = (DefaultTableModel) tabVentas.getModel();
            modelo.removeRow(tabVentas.getSelectedRow());
            calcularPrecioFinal();
            cbNroSerie.setModel(new DefaultComboBoxModel(new String[]{" "}));
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        if (validaCamposCliente()) {
            if (!txtDescripcionProducto.getText().isEmpty()) {

                calcularPrecioConDescuento();

                DefaultTableModel modelo = (DefaultTableModel) tabVentas.getModel();
                Object obj[] = {txtCodigoProducto.getText(), txtDescripcionProducto.getText(), jsCantidad.getValue(), txtPrecio.getText(), jsDescuento.getValue(), lblPrecioFinal.getText()};
                modelo.addRow(obj);

                if (txtNombreRazonS.isEditable()) {
                    clienteNuevo.add(txtDniRuc.getText());
                    clienteNuevo.add(txtNombreRazonS.getText());
                    clienteNuevo.add(txtDireccion.getText());

                } else {
                    clienteExistente.add(txtDniRuc.getText());
                }

                if (cbNroSerie.getItemAt(0).toString().compareTo(" ") != 0) {
                    ArrayList detalleNroSerie = new ArrayList();
                    numerosSerie.add(detalleNroSerie);
                    detalleNroSerie.add(txtCodigoProducto.getText());
                    detalleNroSerie.add(cbNroSerie.getSelectedItem().toString());
                }
                calcularPrecioFinal();
                limpiarCamposProducto();
                calcularPrecioConDescuento();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void jsDescuentoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsDescuentoStateChanged
        calcularPrecioConDescuento();
    }//GEN-LAST:event_jsDescuentoStateChanged

    private void jsCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsCantidadStateChanged
        calcularPrecioConDescuento();
    }//GEN-LAST:event_jsCantidadStateChanged

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        String codigo = tabVentas.getValueAt(tabVentas.getSelectedRow(), 0).toString();
        txtCodigoProducto.setText(codigo);
        String descripcion = tabVentas.getValueAt(tabVentas.getSelectedRow(), 1).toString();
        txtDescripcionProducto.setText(descripcion);
        for (int i = 0; i < numerosSerie.size(); i++) {
            if (numerosSerie.get(i).get(0).toString().compareTo(codigo) == 0) {
                cbNroSerie.setModel(new DefaultComboBoxModel(new String[]{numerosSerie.get(i).get(1).toString()}));
                numerosSerie.remove(i);
            }
        }
        int cantidad = Integer.parseInt(tabVentas.getValueAt(tabVentas.getSelectedRow(), 2).toString());
        jsCantidad.setValue(cantidad);
        float precio = Float.parseFloat(tabVentas.getValueAt(tabVentas.getSelectedRow(), 3).toString());
        txtPrecio.setText("" + precio);
        int descuento = Integer.parseInt(tabVentas.getValueAt(tabVentas.getSelectedRow(), 4).toString());
        jsDescuento.setValue(descuento);
        calcularPrecioConDescuento();

        DefaultTableModel modelo = (DefaultTableModel) tabVentas.getModel();
        modelo.removeRow(tabVentas.getSelectedRow());
        
        calcularPrecioFinal();

    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed

        //Agregar clientes si hubieran nuevos
        if (clienteNuevo.size() > 0) {
            clienteDAO.agregarCliente(cliente);
        }

        //Agregar la venta
        ma.ventas.AddVenta(total, txtNombreRazonS.getText());
        //Agregar el detalle de ventas
        for (int i = 0; i < tabVentas.getRowCount(); i++) {
            ma.ventas.agregarDetalleVenta(tabVentas.getValueAt(i, 1).toString(), Float.parseFloat(tabVentas.getValueAt(i, 4).toString()), Integer.parseInt(tabVentas.getValueAt(i, 2).toString()));
        }
        //Se imprime el comprobante !!
        ma.impresion();
        JOptionPane.showMessageDialog(this, "IMPRIENDO COMPROBANTE", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        limpiarCamposProducto();
        limpiarCamposCliente();
        DefaultTableModel modelo = (DefaultTableModel)tabVentas.getModel();
        int nroFilas = modelo.getRowCount();
        for (int i = 0; i < nroFilas; i++) {
            modelo.removeRow(0);
        }
        calcularPrecioFinal();
    }//GEN-LAST:event_btnVenderActionPerformed

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

    private void calcularPrecioConDescuento() {
        float cantidad = Float.parseFloat(jsCantidad.getValue().toString());
        float precioVenta = Float.parseFloat(txtPrecio.getText());
        float monto = cantidad * precioVenta;
        float descuento = 100 - Integer.parseInt(jsDescuento.getValue().toString());
        float precioFinal = descuento * monto / 100;
        lblPrecioFinal.setText("" + precioFinal);
    }

    private void calcularPrecioFinal() {
        if (tabVentas.getRowCount() > 0) {
            total = 0;
            for (int i = 0; i < tabVentas.getRowCount(); i++) {
                total += Float.parseFloat(tabVentas.getValueAt(i, 5).toString());
            }
            float igv = 18 * total / 100;
            float subtotal = total - igv;
            lblPrecioSub.setText("" + subtotal);
            lblPrecioIgv.setText("" + igv);
            lblPrecioTotal.setText("" + total);
        } else {
            lblPrecioSub.setText("");
            lblPrecioIgv.setText("");
            lblPrecioTotal.setText("");
        }
    }

    private void limpiarCamposProducto() {
        txtCodigoProducto.setText("");
        txtDescripcionProducto.setText("");
        txtPrecio.setText("0.0");
        jsCantidad.setValue(1);
        jsDescuento.setValue(0);
        cbNroSerie.setEnabled(true);
        cbNroSerie.setModel(new DefaultComboBoxModel(new String[]{" "}));

    }

    public void SetValoresCliente(String dniruc, String direccion, String nombrerazonsocial) {
        txtDniRuc.setText(dniruc);
        txtNombreRazonS.setText(nombrerazonsocial);
        txtDireccion.setText(direccion);
    }

    public void SetValoresProducto(String codigo, String descripcion, String precioVenta) {
        txtCodigoProducto.setText(codigo);
        txtDescripcionProducto.setText(descripcion);
        txtPrecio.setText(precioVenta);
        calcularPrecioConDescuento();
        String[] numeroSerie = ma.productos.GetNumeroSerieFromProductoByDescripcion(descripcion);
        if (numeroSerie.length > 0) {
            cbNroSerie.setModel(new DefaultComboBoxModel(numeroSerie));
            cbNroSerie.setEnabled(true);
        } else {
            cbNroSerie.setEnabled(false);
            cbNroSerie.setModel(new DefaultComboBoxModel(new String[]{" "}));
        }
    }

    public void limpiarCamposCliente() {
        txtDniRuc.setText("");
        txtNombreRazonS.setEditable(false);
        txtNombreRazonS.setText("");
        txtDireccion.setText("");

    }

    public void activarBotonVender() {
        if (tabVentas.getRowCount() > 0) {
            btnVender.setEnabled(true);
        } else {
            btnVender.setEnabled(false);
        }

    }
    
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox cbComprobante;
    private javax.swing.JComboBox cbNroSerie;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JSpinner jsDescuento;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblIgv;
    private javax.swing.JLabel lblPrecioFinal;
    private javax.swing.JLabel lblPrecioIgv;
    private javax.swing.JLabel lblPrecioSub;
    private javax.swing.JLabel lblPrecioTotal;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tabVentas;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescripcionProducto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDniRuc;
    private javax.swing.JTextField txtNombreRazonS;
    private javax.swing.JTextField txtNroVenta;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
