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
public class Productos {

    private Main ma;
    private String codigo;
    private String descripcion;
    private String marca;
    private String Categoria;
    private int cantidad;
    private float precioVenta;
    private float precioCompra;

    public Productos(Main ma) {
        this.ma = ma;
    }

    public String[] GetValuesProductoByCodigo(String codigo) {

        String producto[] = new String[2];

        
        ma.bd.sentencia("select descripcion,precioVenta from producto where codigo = '" + codigo + "' ");
        

        if (ma.bd.getNumeroFilas() > 0) {
            for (int i = 0; i < producto.length; i++) {
                producto[i] = ma.bd.getTabla().getValueAt(0, i).toString();
            }
        }

        return producto;
    }

//    public MiModelo GetProductosByDescripcion(String descripcion) {
//        
//        ma.bd.sentencia("select descripcion as 'Descripcion' from producto where descripcion like ('" + descripcion + "%')");
//        
//
//        return ma.bd.getModelo();
//    }
    public String[] GetValuesProductosByDescripcion(String descripcion) {
        
        ma.bd.sentencia("select codigo, descripcion, precioVenta from producto where descripcion = '" + descripcion + "'");
        

        String[] camposProducto = new String[3];

        if (ma.bd.getNumeroFilas() > 0) {
            camposProducto[0] = ma.bd.getTabla().getValueAt(0, 0).toString();
            camposProducto[1] = ma.bd.getTabla().getValueAt(0, 1).toString();
            camposProducto[2] = ma.bd.getTabla().getValueAt(0, 2).toString();
        }

        return camposProducto;
    }

    public String[] GetProductoByCodigo(String codigo) {
        
        ma.bd.sentencia("select codigo, descripcion, precioVenta from producto where codigo = '" + codigo + "'");
        

        String[] camposProducto = new String[3];

        if (ma.bd.getNumeroFilas() > 0) {
            camposProducto[0] = ma.bd.getTabla().getValueAt(0, 0).toString();
            camposProducto[1] = ma.bd.getTabla().getValueAt(0, 1).toString();
            camposProducto[2] = ma.bd.getTabla().getValueAt(0, 2).toString();
        }

        return camposProducto;
    }

    public String[] GetNumeroSerieFromProductoByDescripcion(String descripcion) {

        
        ma.bd.sentencia("select ns.numeroserie from numeroseries as ns inner join producto as p on p.idproducto = ns.idproducto where p.descripcion = '" + descripcion + "'");
        


        String[] numeroSeries = new String[ma.bd.getNumeroFilas()];
        if (ma.bd.getNumeroFilas() > 0) {
            for (int i = 0; i < ma.bd.getNumeroFilas(); i++) {
                numeroSeries[i] = ma.bd.getTabla().getValueAt(i, 0).toString();
            }
        }

        return numeroSeries;
    }

//    public String[] GetValuesProductoByCodigo(String codigo) {
//        String producto[] = new String[4];
//
//        
//        ma.bd.sentencia("select descripcion, marca, preciocompra, precioventa from producto where codigo = '" + codigo + "' ");
//        
//
//        if (ma.bd.getNumeroFilas() > 0) {
//            for (int i = 0; i < producto.length; i++) {
//                producto[i] = ma.bd.getTabla().getValueAt(0, i).toString();
//            }
//        }
//
//        return producto;
//    }
    public void agregarProducto(String codigo, String descripcion, String marca, String Categoria, int cantidad, float precioVenta, float precioCompra) {
        int idCategoria = ma.categoria.GetIDCategoria(Categoria);
        
        ma.bd.ingreso("insert into producto(codigo, descripcion, idcategoria, marca, stock, precioventa, preciocompra) "
                + " values('" + codigo + "', '" + descripcion + "', " + idCategoria + ", '" + marca + "', " + cantidad + ", " + precioVenta + ", " + precioCompra + ")");
        
    }

    public void actualizarProducto(String codigo, int cantidad, float precioVenta, float precioCompra) {
        
        ma.bd.sentencia("update producto set stock = (stock + " + cantidad + "), preciocompra = " + precioCompra + ", precioventa = " + precioVenta + " where codigo = '" + codigo + "' ");
        
    }

    public int ObtenerUltimoIdProducto() {
        
        ma.bd.sentencia("select idproducto from producto order by idproducto desc limit 1");
        
        int idProducto = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());

        return idProducto;
    }

    public int ObtenerUltimoIdProductoByCodigo(String codigo) { // para registrar el idproducto con numero de serie si es que tuviese
        
        ma.bd.sentencia("select idproducto from producto where codigo = '" + codigo + "'");
        
        int idProducto = Integer.parseInt(ma.bd.getTabla().getValueAt(0, 0).toString());

        return idProducto;
    }

    public String[] GetValuesProductoFromServicioByCodigo(String codigo) {
        String producto[] = new String[2];

        
        ma.bd.sentencia("select descripcion, precioventa from producto where codigo = '" + codigo + "' and idcategoria = 5 ");
        

        if (ma.bd.getNumeroFilas() > 0) {
            for (int i = 0; i < producto.length; i++) {
                producto[i] = ma.bd.getTabla().getValueAt(0, i).toString();
            }
        } else {
            producto[0] = " ";
        }

        return producto;
    }

    public MiModelo GetProductoByDescripcion(String descripcion) {
        
        ma.bd.sentencia("select descripcion from producto where descripcion like '" + descripcion + "%' or codigo like '" + descripcion + "%'  ");
        

        return ma.bd.getModelo();
    }

    public MiModelo GetProductosRepuestosByDescripcion(String descripcion) {
        
        ma.bd.sentencia("select descripcion from producto where (descripcion like '" + descripcion + "%' or codigo like '" + descripcion + "%') and idcategoria = 5 ");
        

        return ma.bd.getModelo();
    }
}
