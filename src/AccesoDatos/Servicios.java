/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import ideosystem.MiModelo;
import ideosystem.Main;

/**
 *
 * @author CPerez
 */
public class Servicios {

    private Main ma;
    private String dniruc;
    private String codigo;
    private String tipoServicio;
    private String comentario;
    private String nombreCliente;
    private String direccion;
    private String fechaEntrega;
    private float total;
    private int nroServicio;
    private int idProducto;
    private int cantidad;
    private float descuento;
    private float monto;

    public Servicios(Main ma) {
        this.ma = ma;
    }

    public int ultimoNroServicio() {
        ma.bd.abrir();
        ma.bd.sentencia("select idservicios from servicios order by idservicios desc limit 1");
        ma.bd.cerrarBase();

        int nroServicio;

        try {
            nroServicio = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());
        } catch (Exception e) {
            nroServicio = 0;
        }

        return nroServicio;
    }

    public void AgregarServicio(String dniruc, String codigo, String tipoServicio, String comentario) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into servicios(dniruc, codigoprod, tipoServicio, comentario) values('" + dniruc + "','" + codigo + "','" + tipoServicio + "','" + comentario + "')");
        ma.bd.cerrarBase();
    }

    public MiModelo GetServiciosByNroServicioOrNombCliente(String criterio) {
        ma.bd.abrir();
        ma.bd.sentencia("select idservicios, nombreCliente, codigoproducto, descripcionproducto, tipoServicio, comentario, fechaRecepcion, fechaEntrega, estado "
                + " from servicios "
                + " where idservicios like ('" + criterio + "%') or nombreCliente like ('" + criterio + "%') ");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public String[] GetDatosClienteByServicio(String nombreCliente) {
        ma.bd.abrir();
        ma.bd.sentencia("select dniruc, nombreCliente, direccion from servicios where nombreCliente = '" + nombreCliente + "'");
        ma.bd.cerrarBase();

        String[] datos = new String[3];
        try {
            datos[0] = ma.bd.getTabla().getValueAt(0, 0).toString();
        } catch (Exception e) {
            datos[0] = "Sin Dni";
        }

        try {
            datos[1] = ma.bd.getTabla().getValueAt(0, 1).toString();
        } catch (Exception e) {
            datos[1] = "Sin Nombre";
        }

        try {
            datos[2] = ma.bd.getTabla().getValueAt(0, 2).toString();
        } catch (Exception e) {
            datos[2] = "Sin Direccion";
        }

        return datos;
    }

    public void actualizarServicio(String dniruc, String nombreCliente, String direccion, String fechaEntrega, float total) {
        ma.bd.abrir();
        ma.bd.ingreso("update servicios set dniruc = '" + dniruc + "', nombreCliente = '" + nombreCliente + "', direccion = '" + direccion + "', fechaEntrega = '" + fechaEntrega + "', estado = 1, total = " + total + " "
                + " where nombreCliente = '" + nombreCliente + "'");
        ma.bd.cerrarBase();
    }

    public void agregarDetallServicio(int nroServicio, int idProducto, int cantidad, float descuento, float monto) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into detalleservicio(nroServicio, idProducto, cantidad, descuento, monto) values (" + nroServicio + "," + idProducto + "," + cantidad + "," + descuento + "," + monto + ")");
        ma.bd.cerrarBase();
    }
}
