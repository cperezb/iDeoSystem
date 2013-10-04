package ideosystem;

import Categoría.CrearBuscarCategoria;
import Proveedor.BuscarProveedor;

import Usuario.CrearUsuario;
import Usuario.BuscarUsuario;
import Cliente.BuscarCliente;
import Cliente.CrearCliente;
import Compra.BuscarCompra;
import Compra.RealizarCompra;
import Producto.BuscarProducto;
import Producto.CrearProducto;
import Proveedor.CrearProveedor;
import Reportes.PagoSUNAT;
import Reportes.RankingProductos;
import Reportes.RankingProveedores;
import Servicio.BuscarServicio;
import Servicio.CrearServicio;
import Venta.BuscarVenta;
import Venta.RealizarVenta;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Renzo
 */
public class Menu extends javax.swing.JFrame implements ActionListener {

    private JMenu MenuConfigUsuario;
    private JMenuItem ItemCerrarSesion;
    private Container contenedor;
    private JPanel panelUsado = null;
    private Main ma;
    //private final Dimension tamanoContenedorPrincipalInicial;

    public Menu(Main ma) {
        initComponents();
        this.ma = ma;
        Menu.add(Box.createHorizontalGlue());
        contenedor = this.getContentPane();

        MenuConfigUsuario = new javax.swing.JMenu();
        ItemCerrarSesion = new javax.swing.JMenuItem("Cerrar Sesión");
        ItemCerrarSesion.addActionListener(this);

        MenuConfigUsuario.setBackground(new java.awt.Color(255, 255, 255));
        MenuConfigUsuario.setIcon(new javax.swing.ImageIcon("E:\\Imagenes iDeoSystem Version 1.3\\configuracion2.png")); // NOI18N
        MenuConfigUsuario.setText(ma.usuarioActual);
        MenuConfigUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuConfigUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuConfigUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        MenuConfigUsuario.add(ItemCerrarSesion);
        Menu.add(MenuConfigUsuario);

        this.setResizable(false);
        this.setSize(850, 650);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        //this.getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JMenuBar();
        MenuVenta = new javax.swing.JMenu();
        ItemCrearVenta = new javax.swing.JMenuItem();
        ItemBuscarVenta = new javax.swing.JMenuItem();
        MenuCompra = new javax.swing.JMenu();
        ItemRealizarCompra = new javax.swing.JMenuItem();
        ItemBuscarCompra = new javax.swing.JMenuItem();
        MenuProveedor = new javax.swing.JMenu();
        ItemRegistrarProveedor = new javax.swing.JMenuItem();
        ItemBuscarProveedor = new javax.swing.JMenuItem();
        MenuCliente = new javax.swing.JMenu();
        ItemRegistrarCliente = new javax.swing.JMenuItem();
        ItemBuscarCliente = new javax.swing.JMenuItem();
        MenuProducto = new javax.swing.JMenu();
        ItemRegistrarProducto = new javax.swing.JMenuItem();
        ItemBuscarProducto = new javax.swing.JMenuItem();
        ItemCategoria = new javax.swing.JMenuItem();
        MenuUsuario = new javax.swing.JMenu();
        ItemRegistrarUsuario = new javax.swing.JMenuItem();
        ItemBuscarUsuario = new javax.swing.JMenuItem();
        MenuServicio = new javax.swing.JMenu();
        ItemRegistrarServicio = new javax.swing.JMenuItem();
        ItemBuscarServicio = new javax.swing.JMenuItem();
        MenuReporte = new javax.swing.JMenu();
        ItemRankingProd = new javax.swing.JMenuItem();
        ItemRankingProv = new javax.swing.JMenuItem();
        ItemPagoSunat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");
        getContentPane().setLayout(null);

        MenuVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dollar_currency_sign.png"))); // NOI18N
        MenuVenta.setText("Ventas");
        MenuVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemCrearVenta.setText("Realizar Venta");
        ItemCrearVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCrearVentaActionPerformed(evt);
            }
        });
        MenuVenta.add(ItemCrearVenta);

        ItemBuscarVenta.setText("Buscar Venta");
        ItemBuscarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarVentaActionPerformed(evt);
            }
        });
        MenuVenta.add(ItemBuscarVenta);

        Menu.add(MenuVenta);

        MenuCompra.setBackground(new java.awt.Color(255, 255, 255));
        MenuCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_to_shopping_cart.png"))); // NOI18N
        MenuCompra.setText("Compras");
        MenuCompra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRealizarCompra.setText("Realizar Compra");
        ItemRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRealizarCompraActionPerformed(evt);
            }
        });
        MenuCompra.add(ItemRealizarCompra);

        ItemBuscarCompra.setText("Buscar Compra");
        ItemBuscarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarCompraActionPerformed(evt);
            }
        });
        MenuCompra.add(ItemBuscarCompra);

        Menu.add(MenuCompra);

        MenuProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/competitors.png"))); // NOI18N
        MenuProveedor.setText("Proveedores");
        MenuProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuProveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuProveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRegistrarProveedor.setText("Registrar Proveedor");
        ItemRegistrarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarProveedorActionPerformed(evt);
            }
        });
        MenuProveedor.add(ItemRegistrarProveedor);

        ItemBuscarProveedor.setText("Buscar Proveedor");
        ItemBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarProveedorActionPerformed(evt);
            }
        });
        MenuProveedor.add(ItemBuscarProveedor);

        Menu.add(MenuProveedor);

        MenuCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1897.png"))); // NOI18N
        MenuCliente.setText("Clientes");
        MenuCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRegistrarCliente.setText("Registrar Cliente");
        ItemRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(ItemRegistrarCliente);

        ItemBuscarCliente.setText("Buscar Cliente");
        ItemBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarClienteActionPerformed(evt);
            }
        });
        MenuCliente.add(ItemBuscarCliente);

        Menu.add(MenuCliente);

        MenuProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Computer1.png"))); // NOI18N
        MenuProducto.setText("Productos");
        MenuProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuProducto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRegistrarProducto.setText("Registrar Producto");
        ItemRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarProductoActionPerformed(evt);
            }
        });
        MenuProducto.add(ItemRegistrarProducto);

        ItemBuscarProducto.setText("Buscar Producto");
        ItemBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarProductoActionPerformed(evt);
            }
        });
        MenuProducto.add(ItemBuscarProducto);

        ItemCategoria.setText("Registrar / Buscar Categoría");
        ItemCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCategoriaActionPerformed(evt);
            }
        });
        MenuProducto.add(ItemCategoria);

        Menu.add(MenuProducto);

        MenuUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Profile.png"))); // NOI18N
        MenuUsuario.setText("Usuarios");
        MenuUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRegistrarUsuario.setText("Registrar Usuario");
        ItemRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemRegistrarUsuario);

        ItemBuscarUsuario.setText("Buscar Usuario");
        ItemBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarUsuarioActionPerformed(evt);
            }
        });
        MenuUsuario.add(ItemBuscarUsuario);

        Menu.add(MenuUsuario);

        MenuServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PS3 sixaxis.png"))); // NOI18N
        MenuServicio.setText("Servicios");
        MenuServicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuServicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuServicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRegistrarServicio.setText("Registrar Servicio");
        ItemRegistrarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRegistrarServicioActionPerformed(evt);
            }
        });
        MenuServicio.add(ItemRegistrarServicio);

        ItemBuscarServicio.setText("Buscar Servicio");
        ItemBuscarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemBuscarServicioActionPerformed(evt);
            }
        });
        MenuServicio.add(ItemBuscarServicio);

        Menu.add(MenuServicio);

        MenuReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Line Chart.png"))); // NOI18N
        MenuReporte.setText("Reportes");
        MenuReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ItemRankingProd.setText("Ranking Productos");
        ItemRankingProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRankingProdActionPerformed(evt);
            }
        });
        MenuReporte.add(ItemRankingProd);

        ItemRankingProv.setText("Ranking Proveedores");
        ItemRankingProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemRankingProvActionPerformed(evt);
            }
        });
        MenuReporte.add(ItemRankingProv);

        ItemPagoSunat.setText("Pago SUNAT");
        ItemPagoSunat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemPagoSunatActionPerformed(evt);
            }
        });
        MenuReporte.add(ItemPagoSunat);

        Menu.add(MenuReporte);

        setJMenuBar(Menu);
        Menu.getAccessibleContext().setAccessibleParent(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void ItemRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarUsuarioActionPerformed
        
        cambiarPanel(new CrearUsuario(ma));
    }//GEN-LAST:event_ItemRegistrarUsuarioActionPerformed

    private void ItemRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarClienteActionPerformed
        cambiarPanel(new CrearCliente(ma));
    }//GEN-LAST:event_ItemRegistrarClienteActionPerformed

    private void ItemCrearVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCrearVentaActionPerformed
        cambiarPanel(new RealizarVenta(ma));
    }//GEN-LAST:event_ItemCrearVentaActionPerformed

    private void ItemRegistrarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarProveedorActionPerformed
        cambiarPanel(new CrearProveedor(ma));
    }//GEN-LAST:event_ItemRegistrarProveedorActionPerformed

    private void ItemBuscarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarVentaActionPerformed
        cambiarPanel(new BuscarVenta(ma));
    }//GEN-LAST:event_ItemBuscarVentaActionPerformed

    private void ItemPagoSunatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemPagoSunatActionPerformed
        cambiarPanel(new PagoSUNAT());
    }//GEN-LAST:event_ItemPagoSunatActionPerformed

    private void ItemBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarUsuarioActionPerformed
        cambiarPanel(new BuscarUsuario(ma,this));
    }//GEN-LAST:event_ItemBuscarUsuarioActionPerformed

    private void ItemBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarClienteActionPerformed
        cambiarPanel(new BuscarCliente(ma, this));
    }//GEN-LAST:event_ItemBuscarClienteActionPerformed

    private void ItemBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarProveedorActionPerformed
        cambiarPanel(new BuscarProveedor(ma, this));
    }//GEN-LAST:event_ItemBuscarProveedorActionPerformed

    private void ItemRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarProductoActionPerformed
        cambiarPanel(new CrearProducto());
    }//GEN-LAST:event_ItemRegistrarProductoActionPerformed

    private void ItemBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarProductoActionPerformed
        cambiarPanel(new BuscarProducto());
    }//GEN-LAST:event_ItemBuscarProductoActionPerformed

    private void ItemRankingProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRankingProdActionPerformed
        cambiarPanel(new RankingProductos());
    }//GEN-LAST:event_ItemRankingProdActionPerformed

    private void ItemRankingProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRankingProvActionPerformed
        cambiarPanel(new RankingProveedores());
    }//GEN-LAST:event_ItemRankingProvActionPerformed

    private void ItemRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRealizarCompraActionPerformed
        cambiarPanel(new RealizarCompra(ma));
    }//GEN-LAST:event_ItemRealizarCompraActionPerformed

    private void ItemBuscarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarCompraActionPerformed
        cambiarPanel(new BuscarCompra());
    }//GEN-LAST:event_ItemBuscarCompraActionPerformed

    private void ItemRegistrarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemRegistrarServicioActionPerformed
        cambiarPanel(new CrearServicio());
    }//GEN-LAST:event_ItemRegistrarServicioActionPerformed

    private void ItemBuscarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemBuscarServicioActionPerformed
        cambiarPanel(new BuscarServicio(ma, this));
    }//GEN-LAST:event_ItemBuscarServicioActionPerformed

    private void ItemCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCategoriaActionPerformed
        cambiarPanel(new CrearBuscarCategoria(ma));
    }//GEN-LAST:event_ItemCategoriaActionPerformed

    public void cambiarPanel(JPanel panelNuevo) {
        try {
            contenedor.remove(panelUsado);
        } catch (Exception ex) {
        }

        //panelNuevo.setBounds(0, 0, 850, 650);
//        panelNuevo.setSize(panelNuevo.getPreferredSize().getSize().width, panelNuevo.getPreferredSize().getSize().height);
        //panelNuevo.setBackground(new Color(238, 233, 233));
        panelNuevo.setBackground(new Color(238, 233, 233));
//        contenedor.add(panelNuevo);
//        this.setVisible(false);
//        this.setVisible(true);

        panelUsado = panelNuevo;
        this.add(panelUsado, BorderLayout.CENTER);

        //Hacemos que el JFrame tenga el tamaño de todos sus elementos
        this.pack();
//        this.setVisible(false);
//        this.setVisible(true);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemBuscarCliente;
    private javax.swing.JMenuItem ItemBuscarCompra;
    private javax.swing.JMenuItem ItemBuscarProducto;
    private javax.swing.JMenuItem ItemBuscarProveedor;
    private javax.swing.JMenuItem ItemBuscarServicio;
    private javax.swing.JMenuItem ItemBuscarUsuario;
    private javax.swing.JMenuItem ItemBuscarVenta;
    private javax.swing.JMenuItem ItemCategoria;
    private javax.swing.JMenuItem ItemCrearVenta;
    private javax.swing.JMenuItem ItemPagoSunat;
    private javax.swing.JMenuItem ItemRankingProd;
    private javax.swing.JMenuItem ItemRankingProv;
    private javax.swing.JMenuItem ItemRealizarCompra;
    private javax.swing.JMenuItem ItemRegistrarCliente;
    private javax.swing.JMenuItem ItemRegistrarProducto;
    private javax.swing.JMenuItem ItemRegistrarProveedor;
    private javax.swing.JMenuItem ItemRegistrarServicio;
    private javax.swing.JMenuItem ItemRegistrarUsuario;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuCliente;
    private javax.swing.JMenu MenuCompra;
    private javax.swing.JMenu MenuProducto;
    private javax.swing.JMenu MenuProveedor;
    private javax.swing.JMenu MenuReporte;
    private javax.swing.JMenu MenuServicio;
    private javax.swing.JMenu MenuUsuario;
    private javax.swing.JMenu MenuVenta;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ItemCerrarSesion) {
            int opcion = JOptionPane.showConfirmDialog(this, "Está seguro que quiere cerrar la sesión ?", "CERRAR SESIÓN", JOptionPane.OK_OPTION);
            if (opcion == 0) {
                this.dispose();
                new Login(ma);
            }
        }
    }
}
