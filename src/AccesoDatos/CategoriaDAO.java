/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;

import Entidades.Categoria;
import ideosystem.Main;
import ideosystem.MiModelo;

/**
 *
 * @author CPerez
 */
public class CategoriaDAO {

    private Main ma;

    public CategoriaDAO(Main ma) {
        this.ma = ma;
    }

    public int GetIDCategoria(String categoria) {
        int idCategoria = 0;
        ma.bd.abrir();
        ma.bd.sentencia("select idcategorias from categorias where descripcion = '" + categoria + "'");
        ma.bd.cerrarBase();

        idCategoria = Integer.parseInt(ma.bd.getModelo().getValueAt(0, 0).toString());

        return idCategoria;
    }

    public String[] GetValuesCategorias() {
        ma.bd.abrir();
        ma.bd.sentencia("select descripcion from categorias");
        ma.bd.cerrarBase();

        int totalCategorias = ma.bd.getNumeroFilas();

        String categorias[] = new String[totalCategorias];
        for (int i = 0; i < totalCategorias; i++) {
            categorias[i] = ma.bd.getTabla().getValueAt(i, 0).toString();
        }

        return categorias;
    }

    public String[] GetValuesCategoriasPorCodigoProducto(String codigo) {
        ma.bd.abrir();
        ma.bd.sentencia("select c.descripcion from categorias as c inner join producto as p on c.idCategorias = p.idCategoria where p.codigo = '" + codigo + "' ");
        ma.bd.cerrarBase();

        String categoria[] = new String[1];
        categoria[0] = ma.bd.getTabla().getValueAt(0, 0).toString();

        return categoria;
    }

    public MiModelo GetCategorias() {
        ma.bd.abrir();
        ma.bd.sentencia("select idcategorias as 'Id', descripcion as 'Descripcion' from categorias");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }

    public void registrarCategoria(Categoria categoria) {
        ma.bd.abrir();
        ma.bd.ingreso("insert into categorias(descripcion) values('" + categoria.getDescripcion().toUpperCase() + "')");
        ma.bd.cerrarBase();
    }

    public Boolean validarExistencia(String criterio) {
        boolean categoria = false;
        ma.bd.abrir();
        ma.bd.sentencia("SELECT descripcion FROM categorias");
        ma.bd.cerrarBase();

        for (int i = 0; i < ma.bd.getModelo().getRowCount(); i++) {
            if (ma.bd.getTabla().getValueAt(i, 0).toString().compareTo(criterio) == 0) {
                categoria = true;
                break;
            } else {
                categoria = false;
            }
        }

        return categoria;
    }

    public void actualizarCategoria(Categoria categoria) {
        ma.bd.abrir();
        ma.bd.ingreso("update categorias set descripcion = '" + categoria.getDescripcion().toUpperCase() + "' where idcategorias = " + categoria.getIdCategoria());
        ma.bd.cerrarBase();
    }

    public void eliminarCategoria(int idCategoria) {
        ma.bd.abrir();
        ma.bd.ingreso("delete from categorias where idcategorias = " + idCategoria);
        ma.bd.cerrarBase();
    }

    public MiModelo buscarCategoria(String criterio) {

        ma.bd.abrir();
        ma.bd.sentencia("SELECT idcategorias as 'Id', descripcion as 'Descripcion' "
                + " from categorias where descripcion like('" + criterio + "%')");
        ma.bd.cerrarBase();

        return ma.bd.getModelo();
    }
}
