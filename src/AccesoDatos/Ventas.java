/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ideosystem.MiModelo;
import ideosystem.Main;

/**
 *
 * @author Renzo
 */
public class Ventas {

    private Main ma;
    private float total;
    private String nombreCliente;
    private String descripcionProducto;
    private float descuento;
    private int cantidad;

    public Ventas(Main ma) {
        this.ma = ma;
    }

    public int GetNroVenta() {
        ma.bd.abrir();
        ma.bd.sentencia("select idventas from ventas order by idventas desc limit 1 ");
        ma.bd.cerrarBase();

        int idVenta;
        try {
            idVenta = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());
        } catch (Exception e) {
            idVenta = 0;
        }

        return idVenta;
    }

    public void agregarDetalleVenta(String descripcionProducto, float descuento, int cantidad) {

        ma.bd.abrir();
        ma.bd.sentencia("select idproducto from producto where descripcion = '" + descripcionProducto + "' ");
        ma.bd.cerrarBase();

        int idProducto = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());

        ma.bd.abrir();
        ma.bd.sentencia("select idVentas from ventas order by idventas desc limit 1");
        ma.bd.cerrarBase();

        int idVenta = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());

        ma.bd.abrir();
        ma.bd.ingreso("insert into detalleventas(nroVenta,idproducto,descuento,cantidad) values(" + idVenta + "," + idProducto + "," + descuento + "," + cantidad + ")");
        ma.bd.cerrarBase();
    }

    public void AddVenta(float total, String nombreCliente) {
        ma.bd.abrir();
        ma.bd.sentencia("select idcliente from cliente where nombreRazonSocial = '" + nombreCliente + "' ");
        ma.bd.cerrarBase();

        int idCliente = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());

        ma.bd.abrir();
        ma.bd.ingreso("insert into ventas(total,fecha,idcliente) values(" + total + ",now()," + idCliente + ")");
        ma.bd.cerrarBase();

    }

    //Procedimientos para buscar una venta !!!
    public MiModelo GetVentaFromVentaByNombreClienteOrNroVenta(String nombreClienteNroVenta) {
        ma.bd.abrir();
        ma.bd.sentencia("SELECT v.idventas,c.nombreRazonSocial,v.fecha,v.total FROM ventas as v inner join cliente as c on v.idCliente = c.idcliente where (c.nombreRazonSocial like '" + nombreClienteNroVenta + "%' or v.idventas like '" + nombreClienteNroVenta + "%') and v.estado = false");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public MiModelo GetAllFromVentas() {
        ma.bd.abrir();
        ma.bd.sentencia("SELECT v.idventas,c.nombreRazonSocial,v.fecha,v.total FROM ventas as v inner join cliente as c on v.idCliente = c.idcliente where v.estado = false");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public void AnularVenta(int idVenta) {
        ma.bd.abrir();
        ma.bd.ingreso("update ventas set estado = 1 where idventas = '" + idVenta + "' ");
        ma.bd.cerrarBase();
    }

    public void EliminarVenta(int idVenta) {
        ma.bd.abrir();
        ma.bd.ingreso("delete from ventas where idventas = '" + idVenta + "' ");
        ma.bd.cerrarBase();
    }
}
