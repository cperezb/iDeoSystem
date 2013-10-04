/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Proveedor;
import ideosystem.MiModelo;
import ideosystem.Main;

/**
 *
 * @author CPerez
 */
public class ProveedorDAO {

    private Main ma;

    public ProveedorDAO(Main ma) {
        this.ma = ma;
    }

    public MiModelo GetListaProveedores() {
        ma.bd.abrir();
        ma.bd.sentencia("select razonsocial as 'Razon Social' from proveedor where estado <> 1");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public MiModelo GetProveedorporCriterio(String criterio) {
        ma.bd.abrir();
        //ma.bd.sentencia("select razonsocial as 'Razon Social', ruc as 'RUC', direccion as 'Direccion' from proveedor where razonsocial like ('" + criterio + "%')");
        ma.bd.sentencia("select idproveedor as 'Id', ruc as 'RUC', razonsocial as 'Razon Social', direccion as 'Direccion', telefono as 'Telefono', email as 'e-mail' from proveedor where (razonsocial like ('" + criterio + "%') or ruc like ('" + criterio + "%')) and estado <> 1");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public Proveedor GetValuesProveedorByRuc(String rucproveedor) {
        ma.bd.abrir();
        ma.bd.sentencia("select razonsocial, direccion from proveedor where ruc = '" + rucproveedor + "'");
        ma.bd.cerrarBase();

        Proveedor newproveedor = new Proveedor();

        newproveedor.setRazonSocial(ma.bd.getTabla().getValueAt(0, 0).toString());
        try {
            newproveedor.setDireccion(ma.bd.getTabla().getValueAt(0, 1).toString());
        } catch (Exception error) {
            newproveedor.setDireccion("Sin Direccion");
        }

        return newproveedor;
    }

    public Proveedor GetValuesProveedorporRazonSocial(String razonsocial) {
        ma.bd.abrir();
        ma.bd.sentencia("select ruc, direccion, razonsocial from proveedor where razonsocial = '" + razonsocial + "'");
        ma.bd.cerrarBase();

        Proveedor newproveedor = new Proveedor();

        newproveedor.setRuc(ma.bd.getTabla().getValueAt(0, 0).toString());
        try {
            newproveedor.setDireccion(ma.bd.getTabla().getValueAt(0, 1).toString());
        } catch (Exception error) {
            newproveedor.setDireccion("Sin Direccion");
        }
        newproveedor.setRazonSocial(ma.bd.getTabla().getValueAt(0, 2).toString());

        return newproveedor;
    }

    public int GetIdProveedorByRuc(String ruc) {
        int idProveedor;
        ma.bd.abrir();
        ma.bd.sentencia("select idproveedor from proveedor where ruc = '" + ruc + "'");
        ma.bd.cerrarBase();

        try {
            idProveedor = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());
        } catch (Exception e) {
            idProveedor = 0;
        }

        return idProveedor;
    }

    public MiModelo GetProveedores() {
        ma.bd.abrir();
        ma.bd.sentencia("select idproveedor as 'Id', ruc as 'RUC', razonsocial as 'Razon Social', direccion as 'Direccion', telefono as 'Telefono', email as 'e-mail' from proveedor where estado <> 1");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public MiModelo EliminarProveedor(int id) {
        ma.bd.abrir();
        ma.bd.ingreso("delete from proveedor where idproveedor = " + id);
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public MiModelo DeshabilitarProveedor(int id) {
        ma.bd.abrir();
        ma.bd.ingreso("update proveedor set estado = 1 where idproveedor = " + id);
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public Boolean VerificarExistencia(String ruc) {
        boolean estado = false;
        ma.bd.abrir();
        ma.bd.sentencia("select ruc from proveedor");
        ma.bd.cerrarBase();
        for (int i = 0; i < ma.bd.getModelo().getRowCount(); i++) {
            if (ma.bd.getTabla().getValueAt(i, 0).toString().compareTo(ruc) == 0) {
                estado = true;
                break;
            } else {
                estado = false;
            }
        }
        return estado;
    }

    public void RegistrarProveedor(Proveedor proveedor) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into proveedor(ruc, razonsocial, direccion, telefono, email) "
                + "values('" + proveedor.getRuc() + "', '" + proveedor.getRazonSocial() + "', '" + proveedor.getDireccion() + "', '" + proveedor.getTelefono() + "', '" + proveedor.getEmail() + "')");
        ma.bd.cerrarBase();
    }

    public void ActualizarProveedores(Proveedor proveedor) {
        ma.bd.abrir();
        ma.bd.ingreso("update proveedor set ruc='" + proveedor.getRuc() + "', razonsocial='" + proveedor.getRazonSocial() + "', direccion='" + proveedor.getDireccion() + "', telefono='" + proveedor.getTelefono() + "', email='" + proveedor.getEmail() + "' where idproveedor = " + proveedor.getIdProveedor());
        ma.bd.cerrarBase();
    }
}
