package AccesoDatos;

import Entidades.Cliente;
import ideosystem.MiModelo;
import ideosystem.Main;

public class ClienteDAO {

    private Main ma;

    public ClienteDAO(Main ma) {
        this.ma = ma;
    }

    //Metodo utilizado en el frm adicional !!
    public MiModelo GetClientesByNombreRazonSocial(String nombreRazonSocial) {
        
        ma.bd.sentencia("select nombrerazonsocial as 'Nombre/Razon Social' from cliente where nombreRazonSocial like ('" + nombreRazonSocial + "%')");
        

        return ma.bd.getModelo();
    }

    //Obtener valores del cliente por razon social - Frm Adicional
    public String[] GetValuesClientesByNombreRazonSocial(String nombreRazonsocial) {
        
        ma.bd.sentencia("select dniruc, direccion, nombrerazonsocial from cliente where nombrerazonsocial = '" + nombreRazonsocial + "'");
        

        String[] camposCliente = new String[3];

        if (ma.bd.getNumeroFilas() > 0) {
            camposCliente[0] = ma.bd.getTabla().getValueAt(0, 0).toString();
            try {
                camposCliente[1] = ma.bd.getTabla().getValueAt(0, 1).toString();
            } catch (Exception error) {
                camposCliente[1] = "Sin Direccion";
            }
            camposCliente[2] = ma.bd.getTabla().getValueAt(0, 2).toString();
        }

        return camposCliente;
    }

    //Metodo utilizado para la busqueda del cliente, por dni-Ruc o nombre - Razon Social
    public MiModelo GetClientesByDniNombreRS(String dniRucNombreRS) {
        
        ma.bd.sentencia("select idcliente, nombrerazonsocial as 'Nombre/Razon Social',dniruc as 'DNI/Ruc'"
                + ",Direccion,Telefono from cliente where"
                + " (nombreRazonSocial like '" + dniRucNombreRS + "%' or dniruc like '" + dniRucNombreRS + "%') "
                + "and estado = 0 ");
        
        return ma.bd.getModelo();
    }

    //Obtener Cliente por DNI - Venta, Servicio
    public Cliente GetClientesByDniRuc(String dniRuc) {
        
        ma.bd.sentencia("select dniruc, direccion, nombrerazonsocial,idcliente from cliente where dniRuc = '" + dniRuc + "'");
        

        Cliente newCliente = new Cliente();

        if (ma.bd.getNumeroFilas() > 0) {
            newCliente.setDniRuc(ma.bd.getTabla().getValueAt(0, 0).toString());
            try {
                newCliente.setDireccion(ma.bd.getTabla().getValueAt(0, 1).toString());
            } catch (Exception error) {
                newCliente.setDireccion("Sin Direccion");
            }
            newCliente.setNombreRazonSocial(ma.bd.getTabla().getValueAt(0, 2).toString());
            newCliente.setIdCliente(Integer.parseInt(ma.bd.getTabla().getValueAt(0, 3).toString()));
        }

        return newCliente;
    }

    //Obtener Valores del cliente por dni o Ruc, Venta y Servicio
    public String[] GetValuesClienteByDniRuc(String dniRuc) {
        
        ma.bd.sentencia("select nombreRazonSocial, direccion from cliente where dniRuc = '" + dniRuc + "'");
        

        String[] camposCliente = new String[2];

        camposCliente[0] = ma.bd.getTabla().getValueAt(0, 0).toString();
        try {
            camposCliente[1] = ma.bd.getTabla().getValueAt(0, 1).toString();
        } catch (Exception error) {
            camposCliente[1] = "Sin Direccion";
        }

        return camposCliente;
    }

    public boolean clienteExistente(String dniRuc) {
        boolean esNuevo;
        
        ma.bd.sentencia("select idcliente from cliente where dniRuc = '" + dniRuc + "'");
        

        if (ma.bd.getNumeroFilas() > 0) {
            esNuevo = false;
        } else {
            esNuevo = true;
        }

        return esNuevo;
    }

    //Agregar Nuevo Cliente
    public void agregarCliente(Cliente cliente) {

        
        ma.bd.ingreso("insert into cliente(nombreRazonSocial, dniRuc, direccion,telefono) "
                + " values('" + cliente.getNombreRazonSocial() + "', '" + cliente.getDniRuc() + "', '" + cliente.getDireccion() + "', '" + cliente.getTelefono() + "')");
        
    }

    //Actualizar Cliente
    public void modificarCliente(Cliente cliente) {
        
        ma.bd.ingreso("update cliente set nombreRazonSocial = '" + cliente.getNombreRazonSocial() + "', dniRuc = '" + cliente.getDniRuc() + "', direccion = '" + cliente.getDireccion() + "',telefono = '" + cliente.getTelefono() + "' "
                + "where idcliente = " + cliente.getIdCliente() + " ");
        
    }

    //Eliminar Cliente
    public void eliminarCliente(int idCliente) {
        
        ma.bd.ingreso("delete from cliente where idcliente = " + idCliente + " ");
        
    }

    //Desactivar Cliente
    public void desactivarCliente(int idCliente) {
        
        ma.bd.ingreso("update cliente set estado = 1 where idcliente = " + idCliente + " ");
        
    }
}
