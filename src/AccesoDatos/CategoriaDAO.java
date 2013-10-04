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
        
        ma.bd.sentencia("select idcategorias from categorias where descripcion = '" + categoria + "'");
        

        idCategoria = Integer.parseInt(ma.bd.getModelo().getValueAt(0, 0).toString());

        return idCategoria;
    }

    public String[] GetValuesCategorias() {
        
        ma.bd.sentencia("select descripcion from categorias");
        

        int totalCategorias = ma.bd.getNumeroFilas();

        String categorias[] = new String[totalCategorias];
        for (int i = 0; i < totalCategorias; i++) {
            categorias[i] = ma.bd.getTabla().getValueAt(i, 0).toString();
        }

        return categorias;
    }

    public String[] GetValuesCategoriasPorCodigoProducto(String codigo) {
        
        ma.bd.sentencia("select c.descripcion from categorias as c inner join producto as p on c.idCategorias = p.idCategoria where p.codigo = '" + codigo + "' ");
        

        String categoria[] = new String[1];
        categoria[0] = ma.bd.getTabla().getValueAt(0, 0).toString();


        return categoria;
    }

    public MiModelo GetCategorias() {
        
        ma.bd.sentencia("select idcategorias as 'Id', descripcion as 'Descripcion' from categorias");
        

        return ma.bd.getModelo();
    }

    public void registrarCategoria(Categoria categoria) {
        
        ma.bd.ingreso("insert into categorias(descripcion) values('" + categoria.getDescripcion().toUpperCase() + "')");
        
    }

    public Boolean validarExistencia(String criterio) {
        boolean categoria = false;
        
        ma.bd.sentencia("SELECT descripcion FROM categorias");
        

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
        
        ma.bd.ingreso("update categorias set descripcion = '" + categoria.getDescripcion().toUpperCase() + "' where idcategorias = " + categoria.getIdCategoria());
        
    }

    public void eliminarCategoria(int idCategoria) {
        
        ma.bd.ingreso("delete from categorias where idcategorias = " + idCategoria);
        
    }

    public MiModelo buscarCategoria(String criterio) {

        
        ma.bd.sentencia("SELECT idcategorias as 'Id', descripcion as 'Descripcion' "
                + " from categorias where descripcion like('" + criterio + "%')");
        

        return ma.bd.getModelo();
    }
}
