package AccesoDatos;

import ideosystem.Main;

public class Compras {

    private Main ma;
    private int numerocompra;
    private float total;
    private String fecha;
    private int idproducto;
    private int idproveedor;
    private float stock;
    private float preciocompra;
    private float precioventa;

    public Compras(Main ma) {
        this.ma = ma;
    }

    public int GetNumeroCompras() {
        ma.bd.abrir();
        ma.bd.sentencia("select idcompras from compras order by idcompras desc limit 1");
        ma.bd.cerrarBase();

        int idcompras;
        try {
            idcompras = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());
        } catch (Exception e) {
            idcompras = 0;
        }

        return idcompras;
    }

    public Boolean numeroseries(String codigoProducto) {
        ma.bd.abrir();
        ma.bd.sentencia("select count(idnumeroseries) "
                + " from numeroseries n inner join producto p on p.idproducto = n.idproducto "
                + " where p.codigo = '" + codigoProducto + "'");
        ma.bd.cerrarBase();

        int total = Integer.parseInt(ma.bd.getModelo().getValueAt(0, 0).toString());

        if (total > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void AgregarCompra(int numerocompra, float total, String fecha) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into compras(numerocompra, total, fecha) values (" + numerocompra + ", " + total + ", '" + fecha + "')");
        ma.bd.cerrarBase();
    }

    public void AgregarDetalleCompra(int numerocompra, int idproducto, int idproveedor, float stock, float preciocompra, float precioventa) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into detallecompra(numerocompra, idproducto, idproveedor, stock, preciocompra, precioventa) values (" + numerocompra + ", " + idproducto + ", " + idproveedor + ", " + stock + ", " + preciocompra + ", " + precioventa + ")");
        ma.bd.cerrarBase();
    }
}
